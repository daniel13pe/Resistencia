package com.daniel13pe.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView pantalla;
    String stsigno="";
    Button eraser;
    int digit1=0,digit2=0,result=0,signo=0,etapa=0,borrado=0,enable=0,numneg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla = findViewById(R.id.tpantalla);
        eraser = findViewById(R.id.delete);
    }

    public void Onclicknumber(View view) {
        int id = view.getId();
        pantalla.setTextSize(60);
        if(id == R.id.delete && etapa==0){
            digit1 = digit1/10;
            if(digit1==0){pantalla.setText("");}
            else{pantalla.setText(String.valueOf(digit1));}
        }if(id == R.id.delete && etapa==1){
            stsigno = ""; signo = 0 ; etapa = 0;
            pantalla.setText(String.valueOf(digit1)+stsigno);
        }if(id == R.id.delete && etapa>=2){
            digit2 = digit2/10 ; etapa--;
            if(digit2==0){pantalla.setText(String.valueOf(digit1)+stsigno);}
            else{pantalla.setText(String.valueOf(digit1)+stsigno+String.valueOf(digit2));}
        }if(id == R.id.delete && borrado==3){
            digit2=0;digit1=0;result=0;stsigno="";signo=0;etapa=0; borrado=0;enable=0;
            pantalla.setText("");
        }

        if(id == R.id.num9 && etapa==0 && enable==0){
            digit1 = digit1*10+9;
            pantalla.setText(String.valueOf(digit1));
        }else if(id == R.id.num9 && etapa>=1 && enable==0){
            digit2 = digit2*10+9;
            etapa++;
            pantalla.setText(String.valueOf(digit1)+stsigno+String.valueOf(digit2));
        }
        if(id == R.id.num8 && etapa==0 && enable==0){
            digit1 = digit1*10+8;

            pantalla.setText(String.valueOf(digit1));
        }else if(id == R.id.num8 && etapa>=1 && enable==0){
            digit2 = digit2*10+8;
            etapa++;
            pantalla.setText(String.valueOf(digit1)+stsigno+String.valueOf(digit2));
        }
        if(id == R.id.num7 && etapa==0 && enable==0){
            digit1 = digit1*10+7;
            pantalla.setText(String.valueOf(digit1));
        }else if(id == R.id.num7 && etapa>=1 && enable==0){
            digit2 = digit2*10+7;
            etapa++;
            pantalla.setText(String.valueOf(digit1)+stsigno+String.valueOf(digit2));
        }
        if(id == R.id.num6 && etapa==0 && enable==0){
            digit1 = digit1*10+6;
            pantalla.setText(String.valueOf(digit1));
        }else if(id == R.id.num6 && etapa>=1 && enable==0){
            digit2 = digit2*10+6;
            etapa++;
            pantalla.setText(String.valueOf(digit1)+stsigno+String.valueOf(digit2));
        }
        if(id == R.id.num5 && etapa==0 && enable==0){
            digit1 = digit1*10+5;
            pantalla.setText(String.valueOf(digit1));
        }else if(id == R.id.num5 && etapa>=1 && enable==0){
            digit2 = digit2*10+5;
            etapa++;
            pantalla.setText(String.valueOf(digit1)+stsigno+String.valueOf(digit2));
        }
        if(id == R.id.num4 && etapa==0 && enable==0){
            digit1 = digit1*10+4;
            pantalla.setText(String.valueOf(digit1));
        }else if(id == R.id.num4 && etapa>=1 && enable==0){
            digit2 = digit2*10+4;
            etapa++;
            pantalla.setText(String.valueOf(digit1)+stsigno+String.valueOf(digit2));
        }
        if(id == R.id.num3 && etapa==0 && enable==0){
            digit1 = digit1*10+3;
            pantalla.setText(String.valueOf(digit1));
        }else if(id == R.id.num3 && etapa>=1 && enable==0){
            digit2 = digit2*10+3;
            etapa++;
            pantalla.setText(String.valueOf(digit1)+stsigno+String.valueOf(digit2));
        }
        if(id == R.id.num2 && etapa==0 && enable==0){
            digit1 = digit1*10+2;
            pantalla.setText(String.valueOf(digit1));
        }else if(id == R.id.num2 && etapa>=1 && enable==0){
            digit2 = digit2*10+2;
            etapa++;
            pantalla.setText(String.valueOf(digit1)+stsigno+String.valueOf(digit2));
        }
        if(id == R.id.num1 && etapa==0 && enable==0){
            digit1 = digit1*10+1;
            pantalla.setText(String.valueOf(digit1));
        }else if(id == R.id.num1 && etapa>=1 && enable==0){
            digit2 = digit2*10+1;
            etapa++;
            pantalla.setText(String.valueOf(digit1)+stsigno+String.valueOf(digit2));
        }
        if(id == R.id.num0 && etapa==0 && enable==0){
            digit1 = digit1*10;
            pantalla.setText(String.valueOf(digit1));
        }else if(id == R.id.num0 && etapa>=1 && enable==0){
            digit2 = digit2*10;
            etapa++;
            pantalla.setText(String.valueOf(digit1)+stsigno+String.valueOf(digit2));
        }
        //******************************************************************************************
        if(id == R.id.divide){
            if(digit1!=0 && enable!=1){
                signo = 4;
                stsigno = "/";
                etapa++;
                pantalla.setText(String.valueOf(digit1)+stsigno);
            }
        }
        if(id == R.id.times){
            if(digit1!=0 && enable!=1){
                signo = 3;
                stsigno = "×";
                etapa++;
                pantalla.setText(String.valueOf(digit1)+stsigno);
            }
        }
        if(id == R.id.minus){
            if(digit1!=0 && enable!=1){
                signo = 2;
                stsigno = "-";
                etapa++;
                pantalla.setText(String.valueOf(digit1)+stsigno);
            }
        }
        if(id == R.id.plus){
            if(digit1!=0 && enable!=1){
                signo = 1;
                stsigno = "+";
                etapa++;
                pantalla.setText(String.valueOf(digit1)+stsigno);
            }
        }
        //******************************************************************************************
        if(id == R.id.equal){

             if(etapa!=0){
               borrado = 3;
               enable = 1;
             }
            if(signo == 4 && digit2==0){
                 pantalla.setTextSize(30);
                 pantalla.setText("Division por Cero!");
            }
            if(signo == 4 && digit2!=0){
               result = digit1/digit2;
               pantalla.setText("= "+String.valueOf(result));
            } else if(signo == 3){
                result = digit1*digit2;
                pantalla.setText("= "+String.valueOf(result));
            } else if(signo == 2){
                result = digit1-digit2;
                pantalla.setText("= "+String.valueOf(result));
            } else if(signo == 1){
                result = digit1+digit2;
                pantalla.setText("= "+String.valueOf(result));
            }


        }
    }
}
