package com.wcxbk.apower;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class AboutActivity extends Activity {

    protected TextView tvHeaderContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        tvHeaderContent = (TextView) findViewById(R.id.tv_header_content);
        tvHeaderContent.setText(R.string.about);
    }

}
