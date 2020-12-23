package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.exam.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginscreen);
    }

    public void auth(View view) {
        Intent intent1 = new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(intent1);
    }

    public void ggg(View view) {
        Intent intent0 = new Intent(getApplicationContext(),Main2Activity.class);
    startActivity(intent0);}

    public void forgot(View view) {
        Intent iga = new Intent(getApplicationContext(), com.example.exam.Main4Activity.class);
    startActivity(iga);}



}
