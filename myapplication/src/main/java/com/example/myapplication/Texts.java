package com.example.myapplication;

import android.content.Context;
import android.widget.Toast;

public class Texts {



    public static void toast(Context context, String str){

        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }
}
