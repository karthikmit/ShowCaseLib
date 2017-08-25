
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNShowCaseLibModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNShowCaseLibModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNShowCaseLib";
  }

  @ReactMethod
  public void show(final ReadableMap options, final Callback onSuccess, final Callback onFailure) {
    ReadableArray values = options.getArray("values");
    if (values.size() == 0) {
      onFailure.invoke("values array must not be empty");
      return;
    }

    final NumberPicker picker = new NumberPicker(getCurrentActivity());
    picker.setMinValue(0);
    picker.setMaxValue(values.size() -1);

    String[] displayedValues = new String[values.size()];
    for(int i = 0;i<values.size();++i) {
      displayedValues[i] = values.getString(i);
    }

    picker.setDisplayedValues(displayedValues);
    picker.setWrapSelectorWheel(false);
    picker.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);

    new AlertDialog.Builder(getCurrentActivity())
            .setTitle(options.getString("title"))
            .setMessage(options.getString("message"))
            .setView(picker)
            .setPositiveButton(options.getString("positiveButtonLabel"), new DialogInterface.OnClickListener() {
              public void onClick(DialogInterface dialog, int whichButton) {
                onSuccess.invoke(picker.getValue());
              }
            })
            .setNegativeButton(options.getString("negativeButtonLabel"), new DialogInterface.OnClickListener() {
              public void onClick(DialogInterface dialog, int whichButton) {
                onSuccess.invoke(-1);
              }
            })
            .create()
            .show();
  }
}