package id.sch.smktelkom_mlg.tugas01.xirpl3022.dota;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    }
}
