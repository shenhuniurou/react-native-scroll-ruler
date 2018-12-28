# react-native-scroll-ruler
ReactNative版滑动刻度尺,兼容Android和iOS。

## GIF
![](https://github.com/shenhuniurou/react-native-scroll-ruler/blob/master/scroll-ruler-ios.gif)
![](https://github.com/shenhuniurou/react-native-scroll-ruler/blob/master/scroll-ruler-android.gif)

# Get Started

## Installation

Step 1:

`npm i react-native-scroll-ruler --save`

or 

`yarn add react-native-scroll-ruler --save`

Step 2:

'react-native link react-native-scroll-ruler'

That's all!

# Usage

## Simple

```
import RNScrollRuler from 'react-native-scroll-ruler';

<RNScrollRuler 
	style={{width: Util.size.width - 20, height: 100, backgroundColor: '#fff'}}
   	ref={(view) => {
   	}}
   	minValue={30}
   	maxValue={180}
   	step={1}
   	num={10}
   	unit={"kg"}
   	defaultValue={this.state.defaultWeight}
   	onSelect={(value) => {
       	this.setState({weight: value});
   	}}
></RNScrollRuler>
```

## Props

|Prop|Description|Type|Required|
|:---|:----|:---|:---|
|minValue|尺子显示的最小值|number|Y|
|maxValue|尺子显示的最大值|number|Y|
|defaultValue|尺子默认值|number|Y|
|step|两个大刻度之间的数值间隔|number|Y|
|num|两个小刻度之间的数值间隔|number|Y|
|unit|单位|string|N|

## Methods

|Method|Description|
|:---|:----|
|onSelect|选中值后的回调方法|


License

[MIT](https://github.com/shenhuniurou/react-native-scroll-ruler/blob/master/LICENSE)
