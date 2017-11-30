package com.example.jiayuanfa.androidautocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView acTextView;

    private String[] res = {"beijing1","beijing2","shanghai1","shanghai2"};

    private MultiAutoCompleteTextView mcTextView;

    /**
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        第一步：初始化控件
//        第二步：初始化一个Adaper 用来匹配输入之后数据
//        第三步：初始化数据
//        第四步：把Adapter与我们当前的控件进行绑定
//        设置输入第几个字符的时候开始匹配
        acTextView = findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,res);
        acTextView.setAdapter(adapter);


        //        第一步：初始化控件
//        第二步：初始化一个Adaper 用来匹配输入之后数据
//        第三步：初始化数据
//        第四步：把Adapter与我们当前的控件进行绑定
//        设置输入第几个字符的时候开始匹配
//        设置分隔符号  以逗号为分割符号
        mcTextView = findViewById(R.id.multiAutoCompleteTextView);
        mcTextView.setAdapter(adapter);
        mcTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
