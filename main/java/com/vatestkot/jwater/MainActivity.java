package com.vatestkot.jwater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.textView);
    }
    public void onClickDec(View view) {
        if ( Float.parseFloat(mTextView.getText().toString()) > 0.2 ) {
            mTextView.setText(Float.toString(Float.parseFloat(mTextView.getText().toString()) - 0.2f));
        } else {
            mTextView.setText("0");
        }
    }
    public void onClickInc(View view) {
        if ( Float.parseFloat(mTextView.getText().toString()) < 3 ) {
            mTextView.setText(Float.toString(Float.parseFloat(mTextView.getText().toString()) + 0.2f));
        }
    }
}