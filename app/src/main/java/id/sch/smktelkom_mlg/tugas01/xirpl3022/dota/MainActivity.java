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
    private void doClick2() {
        String hasil4="VALIDASI :\n ";
        int startln = hasil4.length();

        if(kd.isChecked()) hasil4+=kd.getText()+"(√) ";
        if(db.isChecked()) hasil4+=db.getText()+"(√) ";
        if(lt.isChecked()) hasil4+=lt.getText()+"(√)";


        if(hasil4.length()==startln) hasil4+="GAGAL  (X)";
        tvhasil4.setText(hasil4);
    }

    private void doClick() {
        String hasil2 = null;
        if(rbCR.isChecked())
        {
            hasil2 = rbCR.getText().toString();
        }
        else if(rbSP.isChecked())
        {
            hasil2 = rbSP.getText().toString();
        }
        if (hasil2 == null)
        {
            tvhasil2.setText("Konten Belum Teriidentifikasi");
        }
        else {
            tvhasil2.setText("Playtime Anda : " + hasil2);
        }

        tvhasil3.setText("Playtime : "+ spplay.getSelectedItem().toString());


    }
    private void doProcess() {
        if(isValid())
        {
            String nama = etNick.getText().toString();
            tvhasil.setText("Identitas Anda : " + nama);
        }
    }

    private boolean isValid() {
        boolean valid = true;
        String nama = etNick.getText().toString();

        if(nama.isEmpty())
        {
            etNick.setError("Nama Belum diisi");
            valid = false;
        }
        else if(nama.length()<3)
        {
            etNick.setError("Nama Minimal 3 Karakter");
            valid = false;
        }
        else
        {
            etNick.setError(null);
        }
        return valid;
    }
}
