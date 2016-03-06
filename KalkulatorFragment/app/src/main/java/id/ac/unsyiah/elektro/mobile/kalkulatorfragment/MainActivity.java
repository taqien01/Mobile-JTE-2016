package id.ac.unsyiah.elektro.mobile.kalkulatorfragment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
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

    public void insertNum(View view) {

        Button num0 = (Button) findViewById(R.id.nol);

        Button num1 = (Button) findViewById(R.id.satu);

        Button num2 = (Button) findViewById(R.id.dua);

        Button num3 = (Button) findViewById(R.id.tiga);

        Button num4 = (Button) findViewById(R.id.empat);

        Button num5 = (Button) findViewById(R.id.lima);

        Button num6 = (Button) findViewById(R.id.enam);

        Button num7 = (Button) findViewById(R.id.tujuh);

        Button num8 = (Button) findViewById(R.id.delapan);

        Button num9 = (Button) findViewById(R.id.sembilan);

        final TextView hasil = (TextView) findViewById(R.id.textView);





        num1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                hasil.setText(hasil.getText() + "1");

            }

        });



        num2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                hasil.setText(hasil.getText() + "2");

            }

        });



        num3.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                hasil.setText(hasil.getText() + "3");

            }

        });



        num4.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                hasil.setText(hasil.getText() + "4");

            }

        });



        num5.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                hasil.setText(hasil.getText() + "5");

            }

        });



        num6.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                hasil.setText(hasil.getText() + "6");

            }

        });



        num7.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                hasil.setText(hasil.getText() + "7");

            }

        });



        num8.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                hasil.setText(hasil.getText() + "8");

            }

        });



        num9.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                hasil.setText(hasil.getText() + "9");

            }

        });



        num0.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                hasil.setText(hasil.getText() + "0");

            }

        });

    }

}
