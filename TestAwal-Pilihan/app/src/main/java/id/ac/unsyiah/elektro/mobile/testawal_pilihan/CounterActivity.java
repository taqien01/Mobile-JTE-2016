package id.ac.unsyiah.elektro.mobile.testawal_pilihan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by taqien01 on 3/19/2016.
 */
public class CounterActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        Intent pesan = getIntent();
        String pesan1 = pesan.getStringExtra("var1");
        String pesan2 = pesan.getStringExtra("tulis");

        TextView txtLabel = (TextView) findViewById(R.id.textView);
        txtLabel.setText("Anda Memilih "+pesan2+" Sebanyak "+pesan1+" Kali");
    }
}
