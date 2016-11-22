package com.example.hukazawa.calculartor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one,two,three,four,five,six,seven,eight,nine,zero/*,doublezero*/;
    private Button division,subtration,multi,plus,equal;
    private Button /*floatt,percent,dutyfree,*/clear;
    //private Button update,change;
    private TextView textView/*,textView2*/;
    private boolean flag = false;
    private boolean coti0per = false;
    private char last0perate;
    private int lastNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    private Button.OnClickListener buli = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){

                case R.id.button21:
                    if(textView.getText().toString().length()==1){
                        textView.setText("0");
                    }else
                    {
                        textView.setText(textView.getText().toString().substring(0,textView.getText().toString().length()-1));
                    }
                    break;
                case R.id.button35:
                    textView.setText("0");
                    break;

                case R.id.button24:
                    if(coti0per){
                        int result = 0;
                        switch (last0perate){

                            case '+':
                                result = lastNum + Integer.parseInt(textView.getText().toString());
                                break;

                            case '-':
                                result = lastNum - Integer.parseInt(textView.getText().toString());
                                break;

                            case '×':
                                result = lastNum * Integer.parseInt(textView.getText().toString());
                                break;

                            case '÷':
                                result = lastNum / Integer.parseInt(textView.getText().toString());
                                break;

                            default:
                                break;

                        }
                        lastNum = result;
                        textView.setText(String.valueOf(result));
                        coti0per = false;
                    }else {

                        coti0per = true;
                        lastNum = Integer.parseInt(textView.getText().toString());
                        textView.setText("0");
                    }
                    last0perate = '+';
                    flag = true;
                    break;

                case R.id.button32:
                    if(coti0per){
                        int result = 0;
                        switch (last0perate){

                            case '+':
                                result = lastNum + Integer.parseInt(textView.getText().toString());
                                break;

                            case '-':
                                result = lastNum - Integer.parseInt(textView.getText().toString());
                                break;

                            case '×':
                                result = lastNum * Integer.parseInt(textView.getText().toString());
                                break;

                            case '÷':
                                result = lastNum / Integer.parseInt(textView.getText().toString());
                                break;

                            default:
                                break;

                        }
                        lastNum = result;
                        textView.setText(String.valueOf(result));
                        coti0per = false;
                    }else {

                        coti0per = true;
                        lastNum = Integer.parseInt(textView.getText().toString());
                        textView.setText("0");
                    }
                    last0perate = '-';
                    flag = true;
                    break;

                case R.id.button28:
                    if(coti0per){
                        int result = 0;
                        switch (last0perate){

                            case '+':
                                result = lastNum + Integer.parseInt(textView.getText().toString());
                                break;

                            case '-':
                                result = lastNum - Integer.parseInt(textView.getText().toString());
                                break;

                            case '×':
                                result = lastNum * Integer.parseInt(textView.getText().toString());
                                break;

                            case '÷':
                                result = lastNum / Integer.parseInt(textView.getText().toString());
                                break;

                            default:
                                break;

                        }
                        lastNum = result;
                        textView.setText(String.valueOf(result));
                        coti0per = false;
                    }else {

                        coti0per = true;
                        lastNum = Integer.parseInt(textView.getText().toString());
                        textView.setText("0");
                    }
                    last0perate = '×';
                    flag = true;
                    break;

                case R.id.button36:
                    if(coti0per){
                        int result = 0;
                        switch (last0perate){

                            case '+':
                                result = lastNum + Integer.parseInt(textView.getText().toString());
                                break;

                            case '-':
                                result = lastNum - Integer.parseInt(textView.getText().toString());
                                break;

                            case '×':
                                result = lastNum * Integer.parseInt(textView.getText().toString());
                                break;

                            case '÷':
                                result = lastNum / Integer.parseInt(textView.getText().toString());
                                break;

                            default:
                                break;

                        }
                        lastNum = result;
                        textView.setText(String.valueOf(result));
                        coti0per = false;
                    }else {

                        coti0per = true;
                        lastNum = Integer.parseInt(textView.getText().toString());
                        textView.setText("0");
                    }
                    last0perate = '÷';
                    flag = true;
                    break;

                case R.id.button19:
                    if(flag){
                        int result = 0;
                        switch (last0perate){
                            case '+':
                                result = lastNum + Integer.parseInt(textView.getText().toString());
                                break;

                            case '-':
                                result = lastNum - Integer.parseInt(textView.getText().toString());
                                break;

                            case '×':
                                result = lastNum * Integer.parseInt(textView.getText().toString());
                                break;

                            case '÷':
                                result = lastNum / Integer.parseInt(textView.getText().toString());
                                break;

                            default:
                                break;
                        }
                        textView.setText(String.valueOf(result));

                    }
                    coti0per = false;
                    flag = false;
                    break;
                default:

                    if(textView.getText().toString().equals("0")){
                        textView.setText(((Button)v).getText().toString());
                    }
            }


        }
    };

    private void findView(){

        textView = (TextView) findViewById(R.id.textView);
        one = (Button)findViewById(R.id.button23);
        two = (Button)findViewById(R.id.button26);
        three = (Button)findViewById(R.id.button25);
        four = (Button)findViewById(R.id.button27);
        five = (Button)findViewById(R.id.button30);
        six = (Button)findViewById(R.id.button29);
        seven = (Button)findViewById(R.id.button31);
        eight = (Button)findViewById(R.id.button34);
        nine = (Button)findViewById(R.id.button33);
        zero = (Button)findViewById(R.id.button21);
        plus = (Button)findViewById(R.id.button24);
        subtration = (Button)findViewById(R.id.button32);
        multi = (Button)findViewById(R.id.button28);
        division = (Button)findViewById(R.id.button36);
        equal = (Button)findViewById(R.id.button19);
        clear = (Button)findViewById(R.id.button35);

        one.setOnClickListener(buli);
        two.setOnClickListener(buli);
        three.setOnClickListener(buli);
        four.setOnClickListener(buli);
        five.setOnClickListener(buli);
        six.setOnClickListener(buli);
        seven.setOnClickListener(buli);
        eight.setOnClickListener(buli);
        nine.setOnClickListener(buli);
        zero.setOnClickListener(buli);
        plus.setOnClickListener(buli);
        subtration.setOnClickListener(buli);
        multi.setOnClickListener(buli);
        division.setOnClickListener(buli);
        equal.setOnClickListener(buli);
        clear.setOnClickListener(buli);
    }

}
