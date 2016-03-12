package id.ac.unsyiah.elektro.mobile.counteractivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by taqien01 on 3/12/2016.
 */
public class ActivityKedua extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");

        TextView txtLabel = (TextView) findViewById(R.id.textView);
        txtLabel.setText(pesanStr);
    }
}
