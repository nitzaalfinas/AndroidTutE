package com.nitza.tute;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

	EditText elNama,elAlamat;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        elNama = (EditText) findViewById(R.id.editTextNama);
        elAlamat = (EditText) findViewById(R.id.editTextAlamat);
        		
        
    }

    public void diKlik(View v) {
    	switch(v.getId()){
    		case R.id.button1:
    			String nama = elNama.getText().toString();
    			String alamat = elAlamat.getText().toString();
    			
    			Intent intent = new Intent(this,ActivityKedua.class);
    			intent.putExtra("nama", nama);
    			intent.putExtra("alamat", alamat);
    			startActivity(intent);
    			break;
    			
			default:
				break;
    	}
    	
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
