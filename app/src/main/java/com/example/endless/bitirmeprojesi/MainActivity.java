package com.example.endless.bitirmeprojesi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button btnMap;

     public String[] iller={"HATAY"};
     public String[] ilceler={"İSKENDERUN","ANTAKYA"};

    public Spinner spinnerIller;
    public Spinner spinnerIlceler;

    public ArrayAdapter<String> dataAdapterForIller;
    public ArrayAdapter<String> dataAdapterForIlceler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listeDoldur();

        spinnerIller=(Spinner)findViewById(R.id.spnil);
        spinnerIlceler=(Spinner)findViewById(R.id.spnilce);

        dataAdapterForIller=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,iller);
        dataAdapterForIlceler=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,ilceler);

        dataAdapterForIller.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapterForIlceler.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerIller.setAdapter(dataAdapterForIller);
        spinnerIlceler.setAdapter(dataAdapterForIlceler);







        btnMap=(Button)findViewById(R.id.btnMap);
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iMap=new Intent(getBaseContext(),MapsActivity.class);
                startActivity(iMap);
                finish();
            }
        });

    }
    public void listeDoldur(){

        //Veri Tabanından İller Çekişip doldurulacak

    }
}
