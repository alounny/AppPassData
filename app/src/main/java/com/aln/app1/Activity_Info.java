package com.aln.app1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity_Info extends AppCompatActivity {
    TextView tvid,tvname,tvsur,tvsalary,tvemail;

    @Override
    protected void onCreate(@Nullable Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.layout_info);
        tvid =findViewById(R.id.tvid);
        tvname =findViewById(R.id.tvname);
        tvsur =findViewById(R.id.tvsurname);
        tvsalary =findViewById(R.id.tvSalary);
        tvemail =findViewById(R.id.tvemail);
        Bundle bun =getIntent().getExtras();
        tvid.setText(bun.getString("id"));
        tvname.setText(bun.getString("name"));
        tvsur.setText(bun.getString("surname"));
        tvsalary.setText(bun.getString("salary"));
        tvemail.setText(bun.getString("email"));

    }
}
