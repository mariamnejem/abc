package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etA, etB, etC;
    Button btnCAL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectComponents();
    }

    private void connectComponents() {

        etA= findViewById(R.id.etA_TextMain);
        etB= findViewById(R.id.etB_TextMain);
        etC= findViewById(R.id.etC_TextMain);
        btnCAL= findViewById(R.id.btnCAL_Main);

    }

    public void calcelate(View view) {
        String A = etA.getText().toString();
        String B = etB.getText().toString();
        String C = etC.getText().toString();

        if (A.isEmpty() || A.isEmpty() ) {
            Toast.makeText(this, "افحص مدخلاتك", Toast.LENGTH_LONG).show();
            return;
        }
        if (B.isEmpty() || B.isEmpty() ) {
            Toast.makeText(this, "افحص مدخلاتك", Toast.LENGTH_LONG).show();
            return;
        }
        if (C.isEmpty() || C.isEmpty() ) {
            Toast.makeText(this, "افحص مدخلاتك", Toast.LENGTH_LONG).show();
            return;
        }

        double a, b, c, cal1, cal2;
        a = Double.parseDouble(A);
        b = Double.parseDouble(B);
        c = Double.parseDouble(C);
        double dlta = ((b * b) - (4 * a * c));

        if (dlta < 0) {
            Toast.makeText(this, "لا يوجد حلول", Toast.LENGTH_LONG).show();
            return;
        }

        if (dlta == 0) {
            cal1= (-1*b)/2*a;
            Toast.makeText(this, "يوجد حل واحد:"+ cal1, Toast.LENGTH_LONG).show();
            return;
        }
        else {
            cal1 = ((-b)+Math.sqrt(dlta)/(2*a));
            cal2 = ((-b)-Math.sqrt(dlta)/(2*a));
            Toast.makeText(this, "يوجد حلّان:"+ cal1, Toast.LENGTH_LONG).show();
            Toast.makeText(this, ""+ cal2, Toast.LENGTH_LONG).show();

        }
    }
}