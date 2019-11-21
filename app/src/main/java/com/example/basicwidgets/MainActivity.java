package com.example.basicwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

import static android.graphics.Color.BLUE;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;
import static android.graphics.Color.YELLOW;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private Button button;
    private TextView textoView;
    private TextView textoColoreado;
    private EditText editable;
    private CheckBox cb;
    private String texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb=findViewById(R.id.checkBox);
        cb.setOnCheckedChangeListener(this);
    }

    public void setear(View view) {
        button = findViewById(R.id.hora);
        Date d = new Date();
        CharSequence s = DateFormat.format("dd/MM/yyyy HH:mm:ss", d.getTime());
        button.setBackgroundColor(YELLOW);
        button.setText(s);
    }

    public void copiar(View view) {
        textoView = findViewById(R.id.textView2);
        String st = (String) textoView.getText();
        editable = findViewById(R.id.editText);
        editable.setText(st);
    }

    public void onCheckedChanged(CompoundButton buttonView,
                                 boolean isChecked) {
        if (isChecked) {
            cb.setText("This checkbox is: checked");
        }
        else {
            cb.setText("This checkbox is: unchecked");
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) { }

    public void colorear1(View view){
        textoColoreado = findViewById(R.id.textView3);
        textoColoreado.setBackgroundColor(BLUE);
    }

    public void colorear2(View view){
        textoColoreado = findViewById(R.id.textView3);
        textoColoreado.setBackgroundColor(RED);
    }

    public void colorear3(View view){
        textoColoreado = findViewById(R.id.textView3);
        textoColoreado.setBackgroundColor(GREEN);
    }
}
