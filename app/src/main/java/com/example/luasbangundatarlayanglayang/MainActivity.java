package com.example.luasbangundatarlayanglayang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Diagonal1, Diagonal2;
    Button Btn_hasil;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Diagonal1 = (EditText)findViewById(R.id.d1);
        Diagonal2 = (EditText)findViewById(R.id.d2);
        Hasil = (TextView) findViewById(R.id.txt_hasil);
        Btn_hasil = (Button) findViewById(R.id.hasil);

        Btn_hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Diagonal1.length()==0 && Diagonal2.length()==0){
                    Toast.makeText(getApplication(),"Diagonal 1 dan Diagonal 2 Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else if(Diagonal1.length()==0){
                    Toast.makeText(getApplication(),"Diagonal 1 Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else if(Diagonal2.length()==0){
                    Toast.makeText(getApplication(),"Diagonal 2 Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else{
                    String isid1 = Diagonal1.getText().toString();
                    String isid2 = Diagonal2.getText().toString();

                    double Diagonal1 = Double.parseDouble(isid1);
                    double Diagonal2 = Double.parseDouble(isid2);
                    double LuasLayang = LuasLayangLayang(Diagonal1,Diagonal2);

                    String output = String.valueOf(LuasLayang);
                    Hasil.setText(output.toString());
                }
            }
        });
    }
    public double LuasLayangLayang(double Diagonal1, double Diagonal2){
        return (Diagonal1*Diagonal2)/2;
    }
}
