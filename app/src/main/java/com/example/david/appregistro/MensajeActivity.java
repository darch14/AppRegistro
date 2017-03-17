package com.example.david.appregistro;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MensajeActivity extends AppCompatActivity {

    private TextView mensaje;
    private Bundle b;
    private String aux,pnomb,snomb,papell,sapell,edad,sexo;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);

        mensaje = (TextView)findViewById(R.id.txtMensaje);
        b = getIntent().getExtras();
        pnomb = b.getString("Primer Nombre");
        snomb = b.getString("Segundo Nombre");
        papell = b.getString("Primer Apellido");
        sapell = b.getString("Segundo Apellido");
        edad = b.getString("Edad");
        sexo = b.getString("Sexo");
        res = this.getResources();

        aux = res.getString(R.string.mensaje_1)+" "+pnomb+" "+snomb+" "+papell+" "+sapell+" "
                +res.getString(R.string.mensaje_2)+" "+edad+" "+ res.getString(R.string.mensaje_3)+" "+sexo;
        mensaje.setText(aux);
    }
}
