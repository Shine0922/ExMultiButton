package com.example.win7.exmultibutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //  宣告全域變數
    private TextView txtShow;
    private Button btnZero,btnOne,btnTwo,btnThree,btnFour;
    private Button btnFive,btnSix,btnSeven,btnEight,btnNine;
    private Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //  取得資源類別檔中的介面原件
        txtShow=(TextView)findViewById(R.id.txtShow);
        btnZero=(Button) findViewById(R.id.btnZero);
        btnTwo=(Button) findViewById(R.id.btnTwo);
        btnThree=(Button) findViewById(R.id.btnThree);
        btnFour=(Button) findViewById(R.id.btnFour);
        btnFive=(Button) findViewById(R.id.btnFive);
        btnSix=(Button) findViewById(R.id.btnSix);
        btnSeven=(Button) findViewById(R.id.btnSeven);
        btnEight=(Button) findViewById(R.id.btnEight);
        btnNine=(Button) findViewById(R.id.btnNine);
        btnOne=(Button) findViewById(R.id.btnOne);
        btnClear=(Button) findViewById(R.id.btnClear);

        //  設定Button 原件 Click 事件共用Listener
        btnZero.setOnClickListener(myListener);
        btnOne.setOnClickListener(myListener);
        btnTwo.setOnClickListener(myListener);
        btnThree.setOnClickListener(myListener);
        btnFour.setOnClickListener(myListener);
        btnFive.setOnClickListener(myListener);
        btnSix.setOnClickListener(myListener);
        btnSeven.setOnClickListener(myListener);
        btnEight.setOnClickListener(myListener);
        btnNine.setOnClickListener(myListener);
        btnClear.setOnClickListener(myListener);

    }
    //  定義OnClick () 方法
    private Button.OnClickListener myListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v){
            String s =txtShow.getText().toString();
            switch (v.getId()){
                case R.id.btnZero:{
                    txtShow.setText(s + "0");
                    break;
                }
                case R.id.btnOne:{
                    txtShow.setText(s + "1");
                    break;
                }
                case R.id.btnTwo:{
                    txtShow.setText(s + "2");
                    break;
                }
                case R.id.btnThree:{
                    txtShow.setText(s + "3");
                    break;
                }
                case R.id.btnFour:{
                    txtShow.setText(s + "4");
                    break;
                }
                case R.id.btnFive:{
                    txtShow.setText(s + "5");
                    break;
                }
                case R.id.btnSix:{
                    txtShow.setText(s + "6");
                    break;
                }
                case R.id.btnSeven:{
                    txtShow.setText(s + "7");
                    break;
                }
                case R.id.btnEight:{
                    txtShow.setText(s + "8");
                    break;
                }
                case R.id.btnNine:{
                    txtShow.setText(s + "9");
                    break;
                }
                case R.id.btnClear:{
                    txtShow.setText("電話號碼 : ");
                    break;
                }
            }
        }
    };
}
