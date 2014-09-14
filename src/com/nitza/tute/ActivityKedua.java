package com.nitza.tute;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityKedua extends Activity {

	TextView tView;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);
        tView = (TextView) findViewById(R.id.textView1);
        
        Intent intent = getIntent();
        String nama = intent.getStringExtra("nama");
        tView.setText(nama);
        
    }
	
}
