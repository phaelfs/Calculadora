package br.senac.es.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String visor ="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textVisor = (TextView)findViewById(R.id.txtVisor);

        final Button butn1 = (Button) findViewById(R.id.btn1);
        final Button butn2 = (Button) findViewById(R.id.btn2);
        final Button butn3 = (Button) findViewById(R.id.btn3);
        final Button butn4 = (Button) findViewById(R.id.btn4);
        final Button butn5 = (Button) findViewById(R.id.btn5);
        final Button butn6 = (Button) findViewById(R.id.btn6);
        final Button butn7 = (Button) findViewById(R.id.btn7);
        final Button butn8 = (Button) findViewById(R.id.btn8);
        final Button butn9 = (Button) findViewById(R.id.btn9);
        final Button butn0 = (Button) findViewById(R.id.btn0);
        final Button butnSoma = (Button) findViewById(R.id.btnSoma);
        final Button butnSub = (Button) findViewById(R.id.btnSub);
        final Button butnMult = (Button) findViewById(R.id.btnMult);
        final Button butnDiv = (Button) findViewById(R.id.btnDiv);
        final Button butnC = (Button) findViewById(R.id.btnC);
        final Button butnP = (Button) findViewById(R.id.btnP);
        final Button butnI = (Button) findViewById(R.id.btnI);
        final Button butnPC = (Button) findViewById(R.id.btnPc);
        final Button butnNeg = (Button) findViewById(R.id.btnNeg);
        final Button butnIgual = (Button) findViewById(R.id.btnIgual);
        final Button butnDel = (Button) findViewById(R.id.btnDel);


        //botão igual
        butnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        butnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visor = visor + "+";
            textVisor.setText(visor);}
        });

        butnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visor = visor + "-";
                textVisor.setText(visor);}
        });

        butnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visor = visor + "x";
                textVisor.setText(visor);}
        });

        butnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor +"÷";
                textVisor.setText(visor);
            }
        });

        butn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor +"0";
                textVisor.setText(visor);
            }
        });

        butn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor +"1";
                textVisor.setText(visor);
            }
        });

        butn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor +"2";
                textVisor.setText(visor);
            }
        });

        butn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor +"3";
                textVisor.setText(visor);
            }
        });

        butn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor +"4";
                textVisor.setText(visor);
            }
        });

        butn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor +"5";
                textVisor.setText(visor);
            }
        });

        butn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor +"6";
                textVisor.setText(visor);
            }
        });

        butn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor +"7";
                textVisor.setText(visor);
            }
        });

        butn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor +"8";
                textVisor.setText(visor);
            }
        });

        butn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = visor +"9";
                textVisor.setText(visor);
            }
        });

        butnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor = "";
                textVisor.setText(visor);
            }
        });

        butnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (visor.length() > 0) {
                    visor = visor.substring (0, visor.length() - 1);
                    textVisor.setText(visor);
                }
            }
        });


    }
}
