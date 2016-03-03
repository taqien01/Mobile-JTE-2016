package id.ac.unsyiah.elektro.mobile.tugas04_kalkulatorkompleks;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickSamaDengan(View view) {
        //Mengambil variabel pertama
        EditText a1 = (EditText) findViewById(R.id.a1);
        String angka1Str = a1.getText().toString();
        float angka1 = Float.valueOf(angka1Str);

        //Mengambil variabel kedua
        EditText a2 = (EditText) findViewById(R.id.a2);
        String angka2Str = a2.getText().toString();
        float angka2 = Float.valueOf(angka2Str);

        //Mengambil variabel ketiga
        EditText b1 = (EditText) findViewById(R.id.b1);
        String bil1Str = b1.getText().toString();
        float bil1 = Float.valueOf(bil1Str);

        //Mengambil variabel keempat
        EditText b2 = (EditText) findViewById(R.id.b2);
        String bil2Str = b2.getText().toString();
        float bil2 = Float.valueOf(bil2Str);

        //Mengambil variabel spinner
        Spinner spnOperasi = (Spinner) findViewById(R.id.spnOperasi);
        //Mengambil variabel hasil
        TextView txtHasil = (TextView) findViewById(R.id.a3);


        String selectedItem = (String) spnOperasi.getSelectedItem();
        //Kode untuk membaca pilihan +
        if (selectedItem.trim().equals("+")) {

            //rumus penjumlahan bilangan real
            float hasil = Float.valueOf(angka1 + angka2);
            String hasilStr = Float.toString(hasil);

            //rumus penjumlahan bilangan imajiner
            float bil = Float.valueOf(bil1 + bil2);
            String bilStr = Float.toString(bil);

            //memasukkan hasil penjumlahan kedalam txtHasil
            txtHasil.setText(hasilStr + " + "+ bilStr + "i");

            //Kode untuk membaca pilihan -
        } else if (selectedItem.trim().equals("-")) {

            //rumus pengurangan bilangan real
            float hasil = Float.valueOf(angka1 - angka2);
            String hasilStr = Float.toString(hasil);

            //rumus pengurangan bilangan imajiner
            float bil = Float.valueOf(bil1 - bil2);
            String bilStr = Float.toString(bil);

            //memasukkan hasil pengurangan kedalam txtHasil
            txtHasil.setText(hasilStr + " + "+ bilStr + "i");

            //Kode untuk membaca pilihan *
        } else if (selectedItem.trim().equals("*")) {

            //rumus perkalian bilangan real
            float hasil1 = Float.valueOf(angka1 * angka2);
            float hasil2 = Float.valueOf(bil1 * bil2);
            String hasilStr = Float.toString(hasil1 - hasil2);

            //rumus perkalian bilangan imajiner
            float hasilB1 = Float.valueOf(angka1 * bil2);
            float hasilB2 = Float.valueOf(bil1 * angka2);
            String bilStr = Float.toString(hasilB1 + hasilB2);

            //memasukkan hasil perkalian kedalam txtHasil
            txtHasil.setText(hasilStr + " + "+ bilStr + "i");

        }


    }
}
