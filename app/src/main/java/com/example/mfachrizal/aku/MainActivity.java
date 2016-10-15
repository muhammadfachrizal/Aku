package com.example.mfachrizal.aku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.text.Html;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    // private static final String TAG = "Main Activity"
    // private ViewGroup rootView;
//    private Button buttonSquare, buttonCC, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11,
//    button12, button13, button14, button15, button16, button17, button18, button19, button20;
    EditText textMasuk;
    float i;
    float temp;
    float temp2;
    Character operasi = 'q';
    public String str = "";
    // boolean tambah,kurang,kali,bagi,persen,kuadrat;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textMasuk = (EditText) findViewById(R.id.editText);
        Button buttonSquare = (Button) findViewById(R.id.kuadrat);
        buttonSquare.setText(Html.fromHtml("x<sup>2</sup"));
        // Button buttonCC = (Button) findViewById(R.id.buttonCC);
    }

    public void button0click(View v) {
        masukan(0);
    }

    public void button1click(View v) {
        masukan(1);
    }

    public void button2click(View v) {
        masukan(2);
    }

    public void button3click(View v) {
        masukan(3);
    }

    public void button4click(View v) {
        masukan(4);
    }

    public void button5click(View v) {
        masukan(5);
    }

    public void button6click(View v) {
        masukan(6);
    }

    public void button7click(View v) {
        masukan(7);
    }

    public void button8click(View v) {
        masukan(8);
    }

    public void button9click(View v) {
        masukan(9);
    }

    public void tambahclick(View v) {
        perform();
        operasi = '+';
    }

    public void kurangclick(View v) {
        perform();
        operasi = '-';
    }

    public void kaliclick(View v) {
        perform();
        operasi = '*';
    }

    public void bagiclick(View v) {
        perform();
        operasi = '/';
    }

    public void persenclick(View v) {
        perform();
        operasi = '%';
    }

    public void titikclick(View v) {
        masukan('.');
    }

    public void backspaceclick(View v) {
        hps();
    }

    public void buttonCCclick(View v) {
        rst();
    }

    public void akarclick(View v) {
        perform();
        operasi = 'a';
    }

    public void kuadratclick(View v) {
        perform();
        operasi = '^';
    }

    public void kurung1click(View v) {
        masukan('(');
    }

    public void kurung2click(View v) {
        masukan(')');
    }

    public void samadenganclick(View v) {
        hitung();
    }


    private void masukan(int j) {
        str = str + Integer.toString(j);
        temp = Integer.valueOf(str).intValue();
        textMasuk.setText(str);
    }


    private void perform() {
        str = "";
        hitung();
        temp2 = temp;

    }

    private void hitung() {
        if (operasi == '+')
            temp = temp2 + temp;
        else if (operasi == '-')
            temp = temp2 - temp;
        else if (operasi == '/')
            temp = temp2 / temp;
        else if (operasi == '*')
            temp = temp2 * temp;
        else if (operasi == '%')
            temp = temp2/100;
        else if (operasi == '^')
            temp = (float) Math.pow(temp2, 2);
        else if (operasi == 'a')
            temp = (float) Math.sqrt(temp2);
        textMasuk.setText(""+temp);

    }

    public void rst() {
        textMasuk.setText("0");
        str = "";
        operasi = 'q';
        temp = 0;
        temp2 = 0;

    }
    private void hps() {
        str = "";
        operasi = 'q';
        temp = 0;
        temp2 = 0;
        textMasuk.setText("");
    }


    }