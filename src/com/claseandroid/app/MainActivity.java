package com.claseandroid.app;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.claseandroid.app.MENSAJE";
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void EjcutarFuncion(View view){
    	Intent intent = new Intent(this, MiMensaje.class);
    	EditText editText = (EditText) findViewById(R.id.mensaje);
    	String mensaje = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, mensaje);
    	startActivity(intent);
    }

    
}
