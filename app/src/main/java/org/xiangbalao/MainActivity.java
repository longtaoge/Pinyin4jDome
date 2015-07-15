package org.xiangbalao;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

import org.xiangbalao.pinyin.R;
import org.xiangbalao.test.PinYin4JUtils;

public class MainActivity extends Activity
{
    
    TextView mTextView;
    
    TextView mTextView1;
    
    TextView mTextView2;
    
    TextView mTextView3;
    
    TextView mTextView4;
    

    
    @Override
    protected void onCreate(Bundle arg0)
    {
        super.onCreate(arg0);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);


        
        mTextView = (TextView)findViewById(R.id.test);
        mTextView1 = (TextView)findViewById(R.id.test1);
        
        mTextView2 = (TextView)findViewById(R.id.test2);
        mTextView3 = (TextView)findViewById(R.id.test3);
        mTextView4 = (TextView)findViewById(R.id.test4);
        
        PinYin4JUtils mPinYin4 = new PinYin4JUtils();
        
        mTextView.setText("汉字转拼音"+mPinYin4.getPinYin("汉字转拼音").toString());
        mTextView1.setText("汉字转拼音1"+mPinYin4.getPinYin("汉字转拼音1").toString());
        mTextView2.setText("汉字转拼音2"+mPinYin4.getPinYin("汉字转拼音2").toString());
        mTextView3.setText("汉字转拼音3"+mPinYin4.getPinYin("汉字转拼音3").toString());
        mTextView4.setText("汉字转拼音4"+mPinYin4.getPinYin("汉字转拼音4").toString());
        
    }
}
