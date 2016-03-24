package id.ac.unsyiah.elektro.mobile.tugas10_usernamepassword;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by taqien01 on 3/23/2016.
 */
public class ActivityUtama extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");
        String user = pesan.getStringExtra("var2");

        TextView txtLabel = (TextView) findViewById(R.id.textView);
        txtLabel.setText(pesanStr + user);
    }

    public void onUbah(View view){
        Intent pesan = new Intent(getApplicationContext(), ActivityUbahPin.class);
        startActivity(pesan);
    }
}
