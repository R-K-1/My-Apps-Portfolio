package com.example.ray.myapplicationportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.default_theme) {
            Utils.changeToTheme(this, Utils.THEME_DEFAULT);
            return true;
        }

        if (id == R.id.day_theme) {
            Utils.changeToTheme(this, Utils.THEME_DAY);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onAppLauncherButtonClicked(View v){
        // do whatever needs to be done. For example:
        Toast.makeText(getApplicationContext(), ((Button) v).getText() + " launcher clicked", Toast.LENGTH_SHORT).show();
    }

}
