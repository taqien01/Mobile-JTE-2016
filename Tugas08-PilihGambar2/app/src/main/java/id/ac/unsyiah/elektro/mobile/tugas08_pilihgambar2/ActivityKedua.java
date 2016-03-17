package id.ac.unsyiah.elektro.mobile.tugas08_pilihgambar2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by taqien01 on 3/15/2016.
 */
public class ActivityKedua extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        int posisi = pesan.getIntExtra("posisi", 0);

        ImageView tampil = (ImageView) findViewById(R.id.imageView);
        TextView tulis = (TextView) findViewById(R.id.textView);
        String [] nama={"","Mobil","Sepeda Motor","Becak Motor","Becak Dayung","Sepeda"};
        int [] gambar= {0,R.drawable.mobil,R.drawable.motor,R.drawable.becakmotor,R.drawable.becakdayung,R.drawable.sepeda};

        tampil.setImageResource(gambar[posisi]);
        tulis.setText("Anda Memilih Gambar "+nama[posisi]);
    }

    }
