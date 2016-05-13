package id.ac.unsyiah.elektro.mobile.bimbel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by taqien01 on 5/12/2016.
 */
public class PelajarLogin extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_pelajar);
    }

    public void loginPengajar(View view){
        Intent pesan = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(pesan);
    }

    public void pelajar(View view){
        Intent pesan2 = new Intent(getApplicationContext(), BerandaPelajar.class);
        pesan2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(pesan2);
        finish();
    }

    public void daftar(View view){
        Intent daftar = new Intent(getApplicationContext(),PelajarDaftar.class);
        startActivity(daftar);
    }
}
