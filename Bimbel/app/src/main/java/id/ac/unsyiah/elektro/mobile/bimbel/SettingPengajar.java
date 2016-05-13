package id.ac.unsyiah.elektro.mobile.bimbel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by taqien01 on 5/13/2016.
 */
public class SettingPengajar extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_pengajar);
    }

    public void ubahPengajar(View view){
        Intent pesan2 = new Intent(getApplicationContext(), BerandaPengajar.class);
        pesan2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(pesan2);
        finish();
    }
}
