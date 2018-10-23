package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String user=bundle.getString("user");
        String password=bundle.getString("password");
        TextView tv1=(TextView)findViewById(R.id.textView5);
        TextView tv2=(TextView)findViewById(R.id.textView6);
        tv1.setText(user);
        tv2.setText(password);
        Button button=(Button)findViewById(R.id.fanhui);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
