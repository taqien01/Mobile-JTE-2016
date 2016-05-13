package id.ac.unsyiah.elektro.mobile.bimbel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by taqien01 on 5/13/2016.
 */
public class SettingPelajar extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_pelajar);
    }

    public void ubahPelajar(View view){
        Intent pesan2 = new Intent(getApplicationContext(), BerandaPelajar.class);
        pesan2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(pesan2);
        finish();
    }
}
