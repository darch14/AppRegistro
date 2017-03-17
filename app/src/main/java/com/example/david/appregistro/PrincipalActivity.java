package com.example.david.appregistro;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PrincipalActivity extends AppCompatActivity {

    private EditText cajaPNombre;
    private EditText cajaSNombre;
    private EditText cajaPApellido;
    private EditText cajaSApellido;
    private EditText cajaEdad;
    private EditText cajaSexo;
    private Intent i;
    private Bundle b;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cajaPNombre = (EditText)findViewById(R.id.txtPrimerNombre);
        cajaSNombre = (EditText)findViewById(R.id.txtSegundoNombre);
        cajaPApellido = (EditText)findViewById(R.id.txtPrimerApellido);
        cajaSApellido = (EditText)findViewById(R.id.txtSegundoApellido);
        cajaEdad = (EditText)findViewById(R.id.txtEdad);
        cajaSexo = (EditText)findViewById(R.id.txtSexo);
        i = new Intent(this,MensajeActivity.class);
        b = new Bundle();
        res = this.getResources();
    }

    public void mostrar(View v){
        if (validar()){
            String pnomb,snomb,papell,sapell,edad,sexo;
            pnomb = cajaPNombre.getText().toString();
            snomb = cajaSNombre.getText().toString();
            papell = cajaPApellido.getText().toString();
            sapell = cajaSApellido.getText().toString();
            edad = cajaEdad.getText().toString();
            sexo = cajaSexo.getText().toString();
            b.putString("Primer Nombre",pnomb);
            b.putString("Segundo Nombre", snomb);
            b.putString("Primer Apellido", papell);
            b.putString("Segundo Apellido", sapell);
            b.putString("Edad", edad);
            b.putString("Sexo", sexo);

            i.putExtras(b);
            startActivity(i);
        }
    }

    public boolean validar(){
        if (cajaPNombre.getText().toString().isEmpty()){
            cajaPNombre.setError(res.getString(R.string.error_1));
            return false;
        }
        if (cajaSNombre.getText().toString().isEmpty()){
            cajaSNombre.setError(res.getString(R.string.error_2));
            return false;
        }
        if (cajaPApellido.getText().toString().isEmpty()){
            cajaPApellido.setError(res.getString(R.string.error_3));
            return false;
        }
        if (cajaSApellido.getText().toString().isEmpty()){
            cajaSApellido.setError(res.getString(R.string.error_4));
            return false;
        }
        if (cajaEdad.getText().toString().isEmpty()){
            cajaEdad.setError(res.getString(R.string.error_5));
            return false;
        }
        if (cajaSexo.getText().toString().isEmpty()){
            cajaSexo.setError(res.getString(R.string.error_6));
            return false;
        }
        return true;
    }

    public void limpiar(View v){
        cajaPNombre.setText("");
        cajaSNombre.setText("");
        cajaPApellido.setText("");
        cajaSApellido.setText("");
        cajaEdad.setText("");
        cajaSexo.setText("");
    }
}
