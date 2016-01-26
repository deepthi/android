package com.example.deepthi.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PortfolioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showMessage(View view) {
        Context context = getApplicationContext();
        CharSequence text = null;
        int duration = Toast.LENGTH_SHORT;
        switch(view.getId()) {
            case R.id.spotify_button:
                text = getResources().getText(R.string.spotify_toast);
                break;
            case R.id.scores_button:
                text = getResources().getText(R.string.scores_toast);
                break;
            case R.id.library_button:
                text = getResources().getText(R.string.library_toast);
                break;
            case R.id.bigger_button:
                text = getResources().getText(R.string.bigger_toast);
                break;
            case R.id.xyz_button:
                text = getResources().getText(R.string.xyz_toast);
                break;
            case R.id.capstone_button:
                text = getResources().getText(R.string.capstone_toast);
                break;
            default:
                break;
        }
        if (text != null) {
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

    }
}
