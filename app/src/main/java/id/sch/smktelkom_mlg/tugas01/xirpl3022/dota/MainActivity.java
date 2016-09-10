package id.sch.smktelkom_mlg.tugas01.xirpl3022.dota;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNick;
    TextView tvhasil, tvhasil2, tvhasil3, tvhasil4;
    Button bok, bv;
    RadioButton rbCR, rbSP;
    Spinner spplay;
    CheckBox kd, db, lt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rbCR = (RadioButton) findViewById(R.id.radioButtonCR);
        rbSP = (RadioButton) findViewById(R.id.radioButtonSP);
        kd = (CheckBox) findViewById(R.id.checkBox2000);
        db = (CheckBox) findViewById(R.id.checkBox2000x);
        lt = (CheckBox) findViewById(R.id.checkBox3000);
        bv = (Button) findViewById(R.id.validasi);
        etNick = (EditText) findViewById(R.id.nick);
        tvhasil = (TextView) findViewById(R.id.hasil);
        bok = (Button) findViewById(R.id.ok);
        tvhasil2 = (TextView) findViewById(R.id.hasil2);
        tvhasil3 = (TextView) findViewById(R.id.hasil3);
        spplay = (Spinner) findViewById(R.id.playtime);
        tvhasil4 = (TextView) findViewById(R.id.hasil4);

        bv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick2();
            }
        });

        bok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                doProcess();
                doClick();

            }
        });

    }
}
