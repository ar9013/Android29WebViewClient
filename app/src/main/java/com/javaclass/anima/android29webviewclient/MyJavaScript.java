package com.javaclass.anima.android29webviewclient;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by anima on 2016/8/7.
 */
public class MyJavaScript {

    private Context c;

    MyJavaScript(Context c){
        this.c = c;
    }

    public void alert(String data){
        Toast.makeText(c,data,Toast.LENGTH_SHORT).show();
    }
}
