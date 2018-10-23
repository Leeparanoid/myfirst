package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = ((EditText) findViewById(R.id.editText1)).getText().toString();
                String pwd = ((EditText) findViewById(R.id.editText2)).getText().toString();
                if (!"".equals(user) && !"".equals(pwd)) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putCharSequence("user", user);
                    bundle.putCharSequence("password", pwd);
                    intent.putExtras(bundle);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "请输入正确的账号密码", Toast.LENGTH_SHORT).show();
                }
            }
        });
        TextView textview = (TextView) findViewById(R.id.textView4);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, nothing.class);
                startActivity(intent);
            }
        });

    }
}
