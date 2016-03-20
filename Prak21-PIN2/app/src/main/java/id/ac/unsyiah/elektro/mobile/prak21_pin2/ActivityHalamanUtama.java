package id.ac.unsyiah.elektro.mobile.prak21_pin2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by taqien01 on 3/20/2016.
 */
public class ActivityHalamanUtama extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halamanutama);


        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");

        TextView txtLabel = (TextView) findViewById(R.id.textView);
        txtLabel.setText(pesanStr);

    }

    public void OnClick2(View view){
        Intent pesan1 = new Intent(getApplicationContext(), ActivityUbahPin.class);
        startActivity(pesan1);
        finish();
    }
}
