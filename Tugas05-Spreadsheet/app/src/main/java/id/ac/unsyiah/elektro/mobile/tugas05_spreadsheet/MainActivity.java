package id.ac.unsyiah.elektro.mobile.tugas05_spreadsheet;

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

    public void onClickSamaDengan(View view){
        //Mengambil data EditText a11
        EditText numAngka11 = (EditText) findViewById(R.id.a11);
        String angkaStr = numAngka11.getText().toString();
        int angka11 = Integer.valueOf(angkaStr);

        //Mengambil data EditText a12
        EditText numAngka12 = (EditText) findViewById(R.id.a12);
        String angkaStr12 = numAngka12.getText().toString();
        int angka12 = Integer.valueOf(angkaStr12);

        //Mengambil data EditText a21
        EditText numAngka21 = (EditText) findViewById(R.id.a21);
        String angkaStr21 = numAngka21.getText().toString();
        int angka21 = Integer.valueOf(angkaStr21);

        //Mengambil data EditText a22
        EditText numAngka22 = (EditText) findViewById(R.id.a22);
        String angkaStr22 = numAngka22.getText().toString();
        int angka22 = Integer.valueOf(angkaStr22);

        //Mengambil date TextView a13,a23,a31,a32
        TextView hasil13Tampil = (TextView) findViewById(R.id.a13);
        TextView hasil23Tampil = (TextView) findViewById(R.id.a23);
        TextView hasil31Tampil = (TextView) findViewById(R.id.a31);
        TextView hasil32Tampil = (TextView) findViewById(R.id.a32);


                //Kode untuk penjumlahan
                //Penjumlahan untuk baris 1
                long hasil13 = angka11 + angka12;
                String hasil13Str = Long.toString(hasil13);
                hasil13Tampil.setText(hasil13Str);

                //Penjumlahan untuk baris 2
                long hasil23 = angka21 + angka22;
                String hasil23Str = Long.toString(hasil23);
                hasil23Tampil.setText(hasil23Str);

                //Penjumlahan untuk kolom 1
                long hasil31 = angka11 + angka21;
                String hasil31Str = Long.toString(hasil31);
                hasil31Tampil.setText(hasil31Str);

                //Penjumlahan untuk kolom 2
                long hasil32 = angka12 + angka22;
                String hasil32Str = Long.toString(hasil32);
                hasil32Tampil.setText(hasil32Str);


            /*
            case selectedItem.trim().equals("-"):
                //Kode untuk pengurangan
                //Pengurangan untuk baris 1
                long hasil132 = angka11 - angka12;
                String hasil132Str = Long.toString(hasil132);
                hasil13Tampil.setText(hasil132Str);

                //Pengurangan untuk baris 2
                long hasil232 = angka21 - angka22;
                String hasil232Str = Long.toString(hasil232);
                hasil23Tampil.setText(hasil232Str);

                //Pengurangan untuk kolom 1
                long hasil312 = angka11 - angka21;
                String hasil312Str = Long.toString(hasil312);
                hasil31Tampil.setText(hasil312Str);

                //Pengurangan untuk kolom 2
                long hasil322 = angka12 - angka22;
                String hasil322Str = Long.toString(hasil322);
                hasil32Tampil.setText(hasil322Str);
                break;

            case "*":
                //Kode untuk pengurangan
                //Perkalian untuk baris 1
                long hasil133 = angka11 * angka12;
                String hasil133Str = Long.toString(hasil133);
                hasil13Tampil.setText(hasil133Str);

                //Perkalian untuk baris 2
                long hasil233 = angka21 * angka22;
                String hasil233Str = Long.toString(hasil233);
                hasil23Tampil.setText(hasil233Str);

                //Perkalian untuk kolom 1
                long hasil313 = angka11 * angka21;
                String hasil313Str = Long.toString(hasil313);
                hasil31Tampil.setText(hasil313Str);

                //Perkalian untuk kolom 2
                long hasil323 = angka12 * angka22;
                String hasil323Str = Long.toString(hasil323);
                hasil32Tampil.setText(hasil323Str);
                break;
        }
        */
    }
}
