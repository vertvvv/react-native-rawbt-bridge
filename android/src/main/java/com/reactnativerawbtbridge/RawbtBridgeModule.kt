package com.reactnativerawbtbridge

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise

import android.content.Intent

class RawbtBridgeModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    override fun getName(): String {
        return "RawbtBridge"
    }

    // Example method
    // See https://facebook.github.io/react-native/docs/native-modules-android
    @ReactMethod
    fun print(textToPrint: String, promise: Promise) {
       // String textToPrint = "you data"; // plain or base64
       val intent = Intent("ru.a402d.rawbtprinter.action.PRINT_RAWBT"); // action
       intent.putExtra("ru.a402d.rawbtprinter.extra.DATA",textToPrint); // extra
       intent.setPackage("ru.a402d.rawbtprinter");
       reactApplicationContext?.startService(intent);

       promise.resolve(true);

    }


}
