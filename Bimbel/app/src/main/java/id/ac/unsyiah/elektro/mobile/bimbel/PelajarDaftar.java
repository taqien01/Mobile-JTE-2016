package id.ac.unsyiah.elektro.mobile.bimbel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by taqien01 on 5/13/2016.
 */
public class PelajarDaftar extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pelajar_daftar);
    }

    public void simpanDaftar(View view){
        Intent simpan = new Intent(getApplicationContext(), PelajarLogin.class);
        simpan.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(simpan);
    }
}
