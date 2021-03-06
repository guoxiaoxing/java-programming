package com.guoxiaoxing.java.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.guoxiaoxing.java.demo.annotation.AnnotationActivity;
import com.guoxiaoxing.java.demo.collection.CollectionActivity;
import com.guoxiaoxing.java.demo.jvm.gc.GCActivity;
import com.guoxiaoxing.java.demo.jvm.memory.MemoryActivity;
import com.guoxiaoxing.java.demo.object.ObjectActivity;

public final class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_annotation).setOnClickListener(this);
        findViewById(R.id.btn_object).setOnClickListener(this);
        findViewById(R.id.btn_collection).setOnClickListener(this);
        findViewById(R.id.btn_jvm_memory).setOnClickListener(this);
        findViewById(R.id.btn_jvm_gc).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_annotation:
                startActivity(new Intent(MainActivity.this, AnnotationActivity.class));
                break;
            case R.id.btn_object:
                startActivity(new Intent(MainActivity.this, ObjectActivity.class));
                break;
            case R.id.btn_collection:
                startActivity(new Intent(MainActivity.this, CollectionActivity.class));
                break;
            case R.id.btn_jvm_memory:
                startActivity(new Intent(MainActivity.this, MemoryActivity.class));
                break;
            case R.id.btn_jvm_gc:
                startActivity(new Intent(MainActivity.this, GCActivity.class));
                break;
        }
    }
}
