package com.shenhuniurou.scrollruler;

import android.view.View;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;

import javax.annotation.Nullable;

/**
 * @author shenhuniurou
 * @email shenhuniurou@gmail.com
 * @date 2018/5/23 01:18
 * @description
 */

public class RNScrollRulerManager extends SimpleViewManager {

    public static final String REACT_CLASS = "RNScrollRuler";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected View createViewInstance(final ThemedReactContext reactContext) {
        final RNScrollRuler ruler = new RNScrollRuler(reactContext);
        ruler.setOnChooseResulterListener(new RNScrollRuler.OnChooseResulterListener() {
            @Override
            public void onEndResult(String result) {
                WritableMap event = Arguments.createMap();
                event.putString("value", result);
                reactContext.getJSModule(RCTEventEmitter.class).receiveEvent(ruler.getId(), "topSelect", event);
            }

            @Override
            public void onScrollResult(String result) {

            }
        });
        return ruler;
    }

    @ReactProp(name = "minValue")
    public void setMinValue(RNScrollRuler ruler, @Nullable int minValue) {
        ruler.setMinScale(minValue);
    }

    @ReactProp(name = "maxValue")
    public void setMaxValue(RNScrollRuler ruler, @Nullable int maxValue) {
        ruler.setMaxScale(maxValue);
    }

    @ReactProp(name = "defaultValue")
    public void setDefaultValue(RNScrollRuler ruler, @Nullable int defaultValue) {
        ruler.setFirstScale(defaultValue);
    }

    @ReactProp(name = "unit")
    public void setUnit(RNScrollRuler ruler, @Nullable String unit) {
        ruler.setUnit(unit);
    }

    @ReactProp(name = "step")
    public void setStep(RNScrollRuler ruler, @Nullable int step) {
        ruler.setScaleLimit(step * 10);
    }

    @ReactProp(name = "num")
    public void setNum(RNScrollRuler ruler, @Nullable int num) {
        ruler.setScaleCount(num);
    }

}
