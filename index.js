import { Platform } from "react-native";
import RNScrollRulerIOS from "./index.ios.js";
import RNScrollRulerAndroid from "./index.android.js";

const RNScrollRuler = Platform.OS === "ios"
  ? RNScrollRulerIOS
  : RNScrollRulerAndroid;

export default RNScrollRuler;
