package com.example.calc;

import android.graphics.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    boolean mclean;
    int arithmetic;
    float mFloat,mFloat1;
    EditText mEditText;
    Button mnum0,mnum1,mnum2,mnum3,mnum4,mnum5,mnum6,mnum7,mnum8,mnum9;
    Button mbt_div,mbt_mul,mbt_sub,mbt_add,mbt_back,mbt_c,mbt_dot,mbt_sum;
    private String TAG = "log_main";
    private String string1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonRegister();
        mEditText = findViewById(R.id.edt);
        mFloat = 0;
        mFloat1 = 0;

    }

    private void ButtonRegister(){
        mnum0 = findViewById(R.id.num0);
        mnum1 = findViewById(R.id.num1);
        mnum2 = findViewById(R.id.num2);
        mnum3 = findViewById(R.id.num3);
        mnum4 = findViewById(R.id.num4);
        mnum5 = findViewById(R.id.num5);
        mnum6 = findViewById(R.id.num6);
        mnum7 = findViewById(R.id.num7);
        mnum8 = findViewById(R.id.num8);
        mnum9 = findViewById(R.id.num9);
        mbt_add = findViewById(R.id.num_add);
        mbt_sub = findViewById(R.id.num_sub);
        mbt_mul = findViewById(R.id.num_mul);
        mbt_div = findViewById(R.id.num_div);
        mbt_back = findViewById(R.id.num_back);
        mbt_c = findViewById(R.id.numc);
        mbt_dot = findViewById(R.id.num_dot);
        mbt_sum = findViewById(R.id.num_sum);

        mbt_add.setOnClickListener(this);
        mbt_sub.setOnClickListener(this);
        mbt_mul.setOnClickListener(this);
        mbt_div.setOnClickListener(this);
        mbt_back.setOnClickListener(this);
        mbt_c.setOnClickListener(this);
        mbt_dot.setOnClickListener(this);
        mbt_sum.setOnClickListener(this);

        mnum0.setOnClickListener(this);
        mnum1.setOnClickListener(this);
        mnum2.setOnClickListener(this);
        mnum3.setOnClickListener(this);
        mnum4.setOnClickListener(this);
        mnum5.setOnClickListener(this);
        mnum6.setOnClickListener(this);
        mnum7.setOnClickListener(this);
        mnum8.setOnClickListener(this);
        mnum9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String string;
        int action;
        int code;
        KeyEvent event;
        if (mclean) {
            mEditText.setText("");
            mclean = false;
        }
        switch(v.getId()){
            case R.id.num0:
                action = KeyEvent.ACTION_DOWN;
                code = KeyEvent.KEYCODE_0;
                event = new KeyEvent(action,code);
                mEditText.onKeyDown(KeyEvent.KEYCODE_0,event);
                break;
            case R.id.num1:
                action = KeyEvent.ACTION_DOWN;
                code = KeyEvent.KEYCODE_1;
                event = new KeyEvent(action,code);
                mEditText.onKeyDown(KeyEvent.KEYCODE_1,event);
                break;
            case R.id.num2:
                 action = KeyEvent.ACTION_DOWN;
                 code = KeyEvent.KEYCODE_2;
                 event = new KeyEvent(action,code);
                mEditText.onKeyDown(KeyEvent.KEYCODE_2,event);
                break;
            case R.id.num3:
                 action = KeyEvent.ACTION_DOWN;
                 code = KeyEvent.KEYCODE_3;
                 event = new KeyEvent(action,code);
                mEditText.onKeyDown(KeyEvent.KEYCODE_3,event);
                break;
            case R.id.num4:
                 action = KeyEvent.ACTION_DOWN;
                 code = KeyEvent.KEYCODE_4;
                 event = new KeyEvent(action,code);
                mEditText.onKeyDown(KeyEvent.KEYCODE_4,event);
                break;
            case R.id.num5:
                 action = KeyEvent.ACTION_DOWN;
                 code = KeyEvent.KEYCODE_5;
                 event = new KeyEvent(action,code);
                mEditText.onKeyDown(KeyEvent.KEYCODE_5,event);
                break;
            case R.id.num6:
                 action = KeyEvent.ACTION_DOWN;
                 code = KeyEvent.KEYCODE_6;
                 event = new KeyEvent(action,code);
                mEditText.onKeyDown(KeyEvent.KEYCODE_6,event);
                break;
            case R.id.num7:
                 action = KeyEvent.ACTION_DOWN;
                 code = KeyEvent.KEYCODE_7;
                 event = new KeyEvent(action,code);
                mEditText.onKeyDown(KeyEvent.KEYCODE_7,event);
                break;
            case R.id.num8:
                 action = KeyEvent.ACTION_DOWN;
                 code = KeyEvent.KEYCODE_8;
                 event = new KeyEvent(action,code);
                mEditText.onKeyDown(KeyEvent.KEYCODE_8,event);
                break;
            case R.id.num9:
                 action = KeyEvent.ACTION_DOWN;
                 code = KeyEvent.KEYCODE_9;
                 event = new KeyEvent(action,code);
                mEditText.onKeyDown(KeyEvent.KEYCODE_9,event);
                break;
            case R.id.num_dot:
                 action = KeyEvent.ACTION_DOWN;
                 code = KeyEvent.KEYCODE_PERIOD;
                 event = new KeyEvent(action,code);
                mEditText.onKeyDown(KeyEvent.KEYCODE_PERIOD,event);
                break;
            case R.id.num_back:
                 action = KeyEvent.ACTION_DOWN;
                 code = KeyEvent.KEYCODE_DEL;
                 event = new KeyEvent(action,code);
                mEditText.onKeyDown(KeyEvent.KEYCODE_DEL,event);
                break;
            case R.id.numc:
                mEditText.setText("");
                arithmetic = 0;
                break;
            case R.id.num_add:
                string = mEditText.getText().toString();
                if (string.equals("")) {
                    break;
                }
                mFloat1 = Float.valueOf(string);
                Log.d(TAG, "onClick: "+mFloat1);
                mclean = true;
                arithmetic = 1;
                break;
            case R.id.num_sub:
                string = mEditText.getText().toString();
                if (string.equals("")) {
                    break;
                }
                mFloat1 = Float.valueOf(string);
                Log.d(TAG, "onClick: "+mFloat1);
                mclean = true;
                arithmetic = 2;
                break;
            case R.id.num_mul:
                string = mEditText.getText().toString();
                if (string.equals("")) {
                    break;
                }
                mFloat1 = Float.valueOf(string);
                Log.d(TAG, "onClick: "+mFloat1);
                mclean = true;
                arithmetic = 3;
                break;
            case R.id.num_div:
                string = mEditText.getText().toString();
                if (string.equals("")) {
                    break;
                }
                mFloat1 = Float.valueOf(string);
                Log.d(TAG, "onClick: "+mFloat1);
                mclean = true;
                arithmetic = 4;
                break;
            case R.id.num_sum:
                string = mEditText.getText().toString();
                if (string.equals("")) {
                    break;
                }
                mclean = true;
                mFloat = Float.valueOf(string);
                Log.d(TAG, "onClick: mfloat1:"+mFloat1+"  ,mfloat:"+mFloat);
                if (arithmetic == 1)
                    string = String.valueOf(mFloat1 + mFloat);
                else if(arithmetic == 2)
                    string = String.valueOf(mFloat1 - mFloat);
                else if(arithmetic == 3)
                    string = String.valueOf(mFloat1*mFloat);
                else if(arithmetic == 4)
                    string = String.valueOf(mFloat1/mFloat);
                Log.d(TAG, "onClick: "+string+" length:"+string.length());
                if(string.endsWith(".0")) {
                    string1 = string.substring(0,string.length()-2);
                    Log.d(TAG, "onClick+++: "+string1);
                }
                else{
                    string1 = string;
                }
                //Log.d(TAG, "onClick: "+string);
                mEditText.setText(string1);
                mFloat = 0;
                mFloat1 = 0;
                arithmetic = 0;
                break;
            default:
                break;
        }

    }
}
