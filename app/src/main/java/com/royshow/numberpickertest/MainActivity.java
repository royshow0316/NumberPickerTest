package com.royshow.numberpickertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    private NumberPicker numberPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberPicker = (NumberPicker) findViewById(R.id.showNumberPicker);

        String[] items = {"test1", "test2", "test3", "test4"};
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(items.length - 1);
        numberPicker.setDisplayedValues(items);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
    }
}
