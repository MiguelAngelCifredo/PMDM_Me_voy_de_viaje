package dam.pmdm.mevoydeviaje;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnInfo).setOnClickListener(v -> mostrarInfo());
    }

    private void mostrarInfo() {

        // Obtener el destino seleccionado
        String destino = "";
        RadioButton destino1 = findViewById(R.id.rbParis);
        RadioButton destino2 = findViewById(R.id.rbLondres);
        RadioButton destino3 = findViewById(R.id.rbRoma);
        if (destino1.isChecked()) destino = "París";
        if (destino2.isChecked()) destino = "Londres";
        if (destino3.isChecked()) destino = "Roma";

        // Obtener el transporte seleccionado
        String transporte = "";
        RadioButton transporte1 = findViewById(R.id.rbCoche);
        RadioButton transporte2 = findViewById(R.id.rbTren);
        RadioButton transporte3 = findViewById(R.id.rbAvion);
        if (transporte1.isChecked()) transporte = "Coche";
        if (transporte2.isChecked()) transporte = "Tren";
        if (transporte3.isChecked()) transporte = "Avión";

        // Mostrar la información
        Toast.makeText(this, "Me voy a " + destino + " en " + transporte, Toast.LENGTH_LONG).show();

    }
    private void mostrarInfoV2() {

        // Obtener el destino seleccionado
        String destino = "";
        int idDestino = ((RadioGroup)findViewById(R.id.rgDestino)).getCheckedRadioButtonId();
        if (idDestino == R.id.rbParis)   destino = "París";
        if (idDestino == R.id.rbLondres) destino = "Londres";
        if (idDestino == R.id.rbRoma)    destino = "Roma";

        // Obtener el transporte seleccionado
        String transporte = "";
        int idTransporte = ((RadioGroup)findViewById(R.id.rgTransporte)).getCheckedRadioButtonId();
        if (idTransporte == R.id.rbCoche) transporte = "Coche";
        if (idTransporte == R.id.rbTren)  transporte = "Tren";
        if (idTransporte == R.id.rbAvion) transporte = "Avión";

        // Mostrar la información
        Toast.makeText(this, "Me voy a " + destino + " en " + transporte, Toast.LENGTH_LONG).show();

    }

    private void mostrarInfoV3() {

        // Obtener el destino seleccionado
        int idDestino = ((RadioGroup)findViewById(R.id.rgDestino)).getCheckedRadioButtonId();
        String destino = ((RadioButton)findViewById(idDestino)).getText().toString();;

        // Obtener el transporte seleccionado
        int idTransporte = ((RadioGroup)findViewById(R.id.rgTransporte)).getCheckedRadioButtonId();
        String transporte = ((RadioButton)findViewById(idDestino)).getText().toString();;

        // Mostrar la información
        Toast.makeText(this, "Me voy a " + destino + " en " + transporte, Toast.LENGTH_LONG).show();

    }

}