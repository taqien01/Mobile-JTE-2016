package id.ac.unsyiah.elektro.mobile.contohintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by taqien01 on 3/12/2016.
 */
public class ActivityKedua extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("Var1");

        TextView txtLabel = (TextView) findViewById(R.id.textView3);
        txtLabel.setText(pesanStr);
    }
}
