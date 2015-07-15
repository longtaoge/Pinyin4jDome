package org.xiangbalao.test;


import android.test.AndroidTestCase;
import android.util.Log;


public class TestPinyin extends AndroidTestCase
{
    
    public void testPinyin()
    {
        
        String TAG = "pinyin";
        String string = PinYin4JUtils.getPinYin("测试");
        
        Log.i(TAG, string);
        
    }
    
}
