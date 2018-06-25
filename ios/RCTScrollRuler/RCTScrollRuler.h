//
//  RCTScrollRuler.h
//  RCTScrollRuler
//
//  Created by shenhuniurou on 2018/5/11.
//  Copyright © 2018年 shenhuniurou. All rights reserved.
//

#import <UIKit/UIKit.h>
#import <React/RCTComponent.h>

@class RCTScrollRuler;
@protocol RCTScrollRulerDelegate <NSObject>

/*
 *  游标卡尺滑动，对应value回调
 *  滑动视图
 *  当前滑动的值
 */
-(void)dyScrollRulerView:(RCTScrollRuler *)rulerView valueChange:(float)value;

@end
@interface RCTScrollRuler : UIView

@property (nonatomic, copy) RCTBubblingEventBlock onSelect;

@property(nonatomic,weak)id<RCTScrollRulerDelegate> delegate;

//滑动时是否改变textfield值
@property(nonatomic, assign)BOOL scrollByHand;

//三角形颜色
@property(nonatomic,strong)UIColor *triangleColor;
//背景颜色
@property(nonatomic,strong)UIColor *bgColor;

-(instancetype)initWithFrame:(CGRect)frame theMinValue:(float)minValue theMaxValue:(float)maxValue theStep:(float)step theNum:(NSInteger)betweenNum theUnit:unit;

-(void)setRealValue:(float)realValue animated:(BOOL)animated;

+(CGFloat)rulerViewHeight;

@end

