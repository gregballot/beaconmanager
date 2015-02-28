package eu.epitech.hub.lcl.beaconsetter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navigateToSetBeaconActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), BeaconSetterActivity.class);
        startActivity(intent);
    }

    public void navigateToGetBeaconActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), BeaconGetterActivity.class);
        startActivity(intent);
    }

    public void removeBeacon(View view) {
        Intent intent = new Intent(getApplicationContext(), BeaconEraserActivity.class);
        startActivity(intent);
    }

    public void listBeacons(View view) {
        Intent intent = new Intent(getApplicationContext(), BeaconListActivity.class);
        startActivity(intent);
    }

    public void changeUserName(View view) {
        Intent intent = new Intent(getApplicationContext(), ChangeUsernameActivity.class);
        startActivity(intent);
    }

    public void changeApiUrl(View view) {
        Intent intent = new Intent(getApplicationContext(), ChangeAPIUrlActivity.class);
        startActivity(intent);
    }
}