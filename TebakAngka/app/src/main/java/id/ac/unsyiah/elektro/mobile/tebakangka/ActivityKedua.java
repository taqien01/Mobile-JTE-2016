package id.ac.unsyiah.elektro.mobile.tebakangka;

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
        int random = pesan.getIntExtra("var1", 0);
        int tebak = pesan.getIntExtra("var2", 0);
        String nilai = Integer.toString(random);
        String hasil2 = Integer.toString(tebak);

        TextView txtLabel = (TextView) findViewById(R.id.jawab);
        TextView txtLabel2 = (TextView) findViewById(R.id.nilai);
        txtLabel2.setText("Nilainya Adalah :"+nilai);


        if(tebak == random){
            txtLabel.setText("Jawaban Anda Benar");

        }else{
            txtLabel.setText("Jawaban Anda Salah");
        }
    }
}

