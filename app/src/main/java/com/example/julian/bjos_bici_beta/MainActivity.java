package com.example.julian.bjos_bici_beta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText editUsuario;
    EditText editContraseña;
    Button buttonIngresar;
    Button buttonRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRegistrar = (Button) findViewById(R.id.buttonRegistrar);
        buttonRegistrar.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonRegistrar:
                Toast.makeText(getApplicationContext(),"¡Te vas a registrar!",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
