package id.ac.unsyiah.elektro.mobile.bimbel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by taqien01 on 5/13/2016.
 */
public class PilihPengajar extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilih_pengajar);
    }
    public void onClickJadwal(View view){
        switch (view.getId()){
            case R.id.tombol1:
                String tulisan1 = getString(R.string.tombol1);
                Intent tombol1 = new Intent(getApplicationContext(), TambahJadwal.class);
                tombol1.putExtra("var1",tulisan1);
                startActivity(tombol1);
                break;
            case R.id.tombol2:
                String tulisan2 = getString(R.string.tombol2);
                Intent tombol2 = new Intent(getApplicationContext(), TambahJadwal.class);
                tombol2.putExtra("var1",tulisan2);
                startActivity(tombol2);
                break;
            case R.id.tombol3:
                String tulisan3 = getString(R.string.tombol3);
                Intent tombol3 = new Intent(getApplicationContext(), TambahJadwal.class);
                tombol3.putExtra("var1",tulisan3);
                startActivity(tombol3);
                break;
        }
    }
}
