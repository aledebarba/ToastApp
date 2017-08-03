package br.com.alemacedo.toastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (BuildConfig.REPORT_CRASH)
            Toast.makeText(this, "CRASH REPORT", Toast.LENGTH_LONG);
        else
            Toast.makeText( this, "NO CRASH REPORT", Toast.LENGTH_LONG);

    }
}
