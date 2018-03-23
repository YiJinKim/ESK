package com.example.owner.real_final.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.owner.real_final.R;

/**
 * Created by Owner on 2018-03-23.
 */

public class SignUpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button ok = (Button) findViewById(R.id.okButton);
        Button cancel = (Button) findViewById(R.id.cancelButton);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //회원가입 처리
                Intent addIntent = new Intent(SignUpActivity.this, LoginActivity.class);
                setResult(1, addIntent);
                finish();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addIntent = new Intent(SignUpActivity.this, LoginActivity.class);
                setResult(0, addIntent);
                finish();
            }
        });
    }
}

