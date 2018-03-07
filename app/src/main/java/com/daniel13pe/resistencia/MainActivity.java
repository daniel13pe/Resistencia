package com.daniel13pe.resistencia;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    TextView datos1, datos2, datos3, datos4;
    LinearLayout unoR, dosR, tresR, cuatroR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datos1 = (TextView) findViewById(R.id.valort);
        datos2 = (TextView) findViewById(R.id.digit2);
        datos3 = (TextView) findViewById(R.id.digit3);
        datos4 = (TextView) findViewById(R.id.digit4);

        unoR = (LinearLayout) findViewById(R.id.primera);
        dosR = (LinearLayout) findViewById(R.id.segunda);
        tresR = (LinearLayout) findViewById(R.id.tercera);
        cuatroR = (LinearLayout) findViewById(R.id.cuarta);
    }
//************* Banda de color Numero 1 *************************************************************
    public void c1press(View view){
        int id = view.getId();
        if(id == R.id.c1){
            datos1.setText("1");
            unoR.setBackgroundColor(Color.parseColor("#8b4513"));
        }
    }
    public void r1press(View view){
        int id = view.getId();
        if(id == R.id.r1){
            datos1.setText("2");
            unoR.setBackgroundColor(Color.parseColor("#ff0000"));
        }
    }
    public void n1press(View view){
        int id = view.getId();
        if(id == R.id.n1){
            datos1.setText("3");
            unoR.setBackgroundColor(Color.parseColor("#ff8c00"));
        }
    }
    public void am1press(View view){
        int id = view.getId();
        if(id == R.id.am1){
            datos1.setText("4");
            unoR.setBackgroundColor(Color.parseColor("#ffff00"));
        }
    }
    public void v1press(View view){
        int id = view.getId();
        if(id == R.id.v1){
            datos1.setText("5");
            unoR.setBackgroundColor(Color.parseColor("#32cd32"));
        }
    }
    public void az1press(View view){
        int id = view.getId();
        if(id == R.id.az1){
            datos1.setText("6");
            unoR.setBackgroundColor(Color.parseColor("#0000ff"));
        }
    }
    public void p1press(View view){
        int id = view.getId();
        if(id == R.id.p1){
            datos1.setText("7");
            unoR.setBackgroundColor(Color.parseColor("#800080"));
        }
    }
    public void g1press(View view){
        int id = view.getId();
        if(id == R.id.g1){
            datos1.setText("8");
            unoR.setBackgroundColor(Color.parseColor("#808080"));
        }
    }
    public void b1press(View view){
        int id = view.getId();
        if(id == R.id.b1){
            datos1.setText("9");
            unoR.setBackgroundColor(Color.parseColor("#dcdcdc"));
        }
    }
//************* Banda de color Numero 2 ************************************************************
    public void neg2press(View view){
        int id = view.getId();
        if(!datos1.getText().equals("")) {
            if (id == R.id.neg2) {
                datos2.setText("0");
                dosR.setBackgroundColor(Color.parseColor("#000000"));
            }
        }
    }
    public void c2press(View view) {
        int id = view.getId();
        if (!datos1.getText().equals("")) {
            if (id == R.id.c2) {
                datos2.setText("1");
                dosR.setBackgroundColor(Color.parseColor("#8b4513"));
            }
        }
    }

    public void r2press(View view){
        int id = view.getId();
        if(!datos1.getText().equals("")){
            if(id == R.id.r2){
                datos2.setText("2");
                dosR.setBackgroundColor(Color.parseColor("#ff0000"));
            }
        }
    }
    public void n2press(View view){
        int id = view.getId();
        if(!datos1.getText().equals("")) {
            if (id == R.id.n2) {
                datos2.setText("3");
                dosR.setBackgroundColor(Color.parseColor("#ff8c00"));
            }
        }
    }
    public void am2press(View view){
        int id = view.getId();
        if(!datos1.getText().equals("")) {
            if (id == R.id.am2) {
                datos2.setText("4");
                dosR.setBackgroundColor(Color.parseColor("#ffff00"));
            }
        }
    }
    public void v2press(View view){
        int id = view.getId();
        if(!datos1.getText().equals("")) {
            if (id == R.id.v2) {
                datos2.setText("5");
                dosR.setBackgroundColor(Color.parseColor("#32cd32"));
            }
        }
    }
    public void az2press(View view){
        int id = view.getId();
        if(!datos1.getText().equals("")) {
            if (id == R.id.az2) {
                datos2.setText("6");
                dosR.setBackgroundColor(Color.parseColor("#0000ff"));
            }
        }
    }
    public void p2press(View view){
        int id = view.getId();
        if(!datos1.getText().equals("")) {
            if (id == R.id.p2) {
                datos2.setText("7");
                dosR.setBackgroundColor(Color.parseColor("#800080"));
            }
        }
    }
    public void g2press(View view){
        int id = view.getId();
        if(!datos1.getText().equals("")) {
            if (id == R.id.g2) {
                datos2.setText("8");
                dosR.setBackgroundColor(Color.parseColor("#808080"));
            }
        }
    }
    public void b2press(View view){
        int id = view.getId();
        if(!datos1.getText().equals("")) {
            if (id == R.id.b2) {
                datos2.setText("9");
                dosR.setBackgroundColor(Color.parseColor("#dcdcdc"));
            }
        }
    }
//************* Banda de color Numero 3 ************************************************************
    public void neg3press(View view){
        int id = view.getId();
        if(!datos2.getText().equals("")) {
            if (id == R.id.neg3) {
                datos3.setText(" Ω");
                tresR.setBackgroundColor(Color.parseColor("#000000"));
            }
        }
    }
    public void c3press(View view){
        int id = view.getId();
        if(!datos2.getText().equals("")) {
            if (id == R.id.c3) {
                datos3.setText("0 Ω");
                tresR.setBackgroundColor(Color.parseColor("#8b4513"));
            }
        }
    }
    public void r3press(View view){
        int id = view.getId();
        if(!datos2.getText().equals("")) {
            if (id == R.id.r3) {
                datos3.setText("00 Ω");
                tresR.setBackgroundColor(Color.parseColor("#ff0000"));
            }
        }
    }
    public void n3press(View view){
        int id = view.getId();
        if(!datos2.getText().equals("")) {
            if (id == R.id.n3) {
                datos3.setText("K Ω");
                tresR.setBackgroundColor(Color.parseColor("#ff8c00"));
            }
        }
    }
    public void am3press(View view){
        int id = view.getId();
        if(!datos2.getText().equals("")) {
            if (id == R.id.am3) {
                datos3.setText("0K Ω");
                tresR.setBackgroundColor(Color.parseColor("#ffff00"));
            }
        }
    }
    public void v3press(View view){
        int id = view.getId();
        if(!datos2.getText().equals("")) {
            if (id == R.id.v3) {
                datos3.setText("00K Ω");
                tresR.setBackgroundColor(Color.parseColor("#33cd33"));
            }
        }
    }
    public void az3press(View view){
        int id = view.getId();
        if(!datos2.getText().equals("")) {
            if (id == R.id.az3) {
                datos3.setText("M Ω");
                tresR.setBackgroundColor(Color.parseColor("#0000ff"));
            }
        }
    }
    public void p3press(View view){
        int id = view.getId();
        if(!datos2.getText().equals("")) {
            if (id == R.id.p3) {
                datos3.setText("0M Ω");
                tresR.setBackgroundColor(Color.parseColor("#800080"));
            }
        }
    }
    public void g3press(View view){
        int id = view.getId();
        if(!datos2.getText().equals("")) {
            if (id == R.id.g3) {
                datos3.setText("00M Ω");
                tresR.setBackgroundColor(Color.parseColor("#808080"));
            }
        }
    }
    public void b3press(View view){
        int id = view.getId();
        if(!datos2.getText().equals("")) {
            if (id == R.id.b3) {
                datos3.setText("G Ω");
                tresR.setBackgroundColor(Color.parseColor("#dcdcdc"));
            }
        }
    }
    public void gold3press(View view){
        int id = view.getId();
        if(!datos2.getText().equals("")) {
            if (id == R.id.gold3) {
                datos3.setText("/10 Ω");
                tresR.setBackgroundColor(Color.parseColor("#b8860b"));
            }
        }
    }
    public void plat3press(View view){
        int id = view.getId();
        if(!datos2.getText().equals("")) {
            if (id == R.id.plat3) {
                datos3.setText("/100 Ω");
                tresR.setBackgroundColor(Color.parseColor("#2f4f4f"));
            }
        }
    }
//************* Banda de color Numero 4 ************************************************************
    public void c4press(View view){
        int id = view.getId();
        if(!datos3.getText().equals("")) {
            if (id == R.id.c4) {
                datos4.setText(" ±1%");
                cuatroR.setBackgroundColor(Color.parseColor("#8b4513"));
            }
        }
    }
    public void r4press(View view){
        int id = view.getId();
        if(!datos3.getText().equals("")) {
            if (id == R.id.r4) {
                datos4.setText(" ±2%");
                cuatroR.setBackgroundColor(Color.parseColor("#ff0000"));
            }
        }
    }
    public void v4press(View view){
        int id = view.getId();
        if(!datos3.getText().equals("")) {
            if (id == R.id.v4) {
                datos4.setText(" ±0.5%");
                cuatroR.setBackgroundColor(Color.parseColor("#32cd32"));
            }
        }
    }
    public void gold4press(View view){
        int id = view.getId();
        if(!datos3.getText().equals("")) {
            if (id == R.id.gold4) {
                datos4.setText(" ±5%");
                cuatroR.setBackgroundColor(Color.parseColor("#b8860b"));
            }
        }
    }
    public void plat4press(View view){
        int id = view.getId();
        if(!datos3.getText().equals("")) {
            if (id == R.id.plat4) {
                datos4.setText(" ±10%");
                cuatroR.setBackgroundColor(Color.parseColor("#2f4f4f"));
            }
        }
    }
}
