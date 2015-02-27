package eu.epitech.hub.lcl.beaconsetter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
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

public class BeaconEraserActivity extends ActionBarActivity {

    TextView        resultText;

    EditText        majorText;
    EditText        minorText;

    ProgressBar     progressBar;
    RequestQueue    requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beacon_eraser);
        requestQueue = Volley.newRequestQueue(this);
        resultText = (TextView) findViewById(R.id.RESULT_TEXT_VIEW);
        progressBar = (ProgressBar) findViewById(R.id.PROGRESS_BAR);
        majorText = (EditText) findViewById(R.id.MAJOR_TEXTFIELD);
        minorText = (EditText) findViewById(R.id.MINOR_TEXTFIELD);
        progressBar.setVisibility(View.INVISIBLE);
    }

    public void removeBeacon(View view) {
        progressBar.setVisibility(View.VISIBLE);
        String requestUrl = ApiBridge.getRemoveBeaconUrl(majorText.getText().toString(), minorText.getText().toString());
        requestQueue.add(new StringRequest(Request.Method.GET,
                requestUrl,
                new Response.Listener() {
                    @Override
                    public void onResponse(Object o) {
                        progressBar.setVisibility(View.INVISIBLE);
                        Log.d(this.getClass().getSimpleName(), (String) o);
                        resultText.setText("Beacon has been removed");
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        progressBar.setVisibility(View.INVISIBLE);
                        Log.e(this.getClass().getSimpleName(), "Cannot get Beacon");
                        resultText.setText("Cannot remove Beacon");
                    }
                }
        ));
    }
}
