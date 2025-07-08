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
        RadioButton destino1 = findViewById(R.id.rbDestino1);
        RadioButton destino2 = findViewById(R.id.rbDestino2);
        RadioButton destino3 = findViewById(R.id.rbDestino3);
        if (destino1.isChecked()) destino = "París";
        if (destino2.isChecked()) destino = "Londres";
        if (destino3.isChecked()) destino = "Roma";

        // Obtener el transporte seleccionado
        String transporte = "";
        RadioButton transporte1 = findViewById(R.id.rbTransporte1);
        RadioButton transporte2 = findViewById(R.id.rbTransporte2);
        RadioButton transporte3 = findViewById(R.id.rbTransporte3);
        if (transporte1.isChecked()) transporte = "Coche";
        if (transporte2.isChecked()) transporte = "Tren";
        if (transporte3.isChecked()) transporte = "Avión";

        // Mostrar la información
        Toast.makeText(this, "Me voy a " + destino + " en " + transporte, Toast.LENGTH_LONG).show();

    }
    private void mostrarInfoV2() {

        // Obtener el destino seleccionado
        String destino = "";
        int rbDestino = ((RadioGroup)findViewById(R.id.rgDestino)).getCheckedRadioButtonId();
        if (rbDestino == R.id.rbDestino1) destino = "París";
        if (rbDestino == R.id.rbDestino2) destino = "Londres";
        if (rbDestino == R.id.rbDestino3) destino = "Roma";

        // Obtener el transporte seleccionado
        String transporte = "";
        int rbTransporte = ((RadioGroup)findViewById(R.id.rgTransporte)).getCheckedRadioButtonId();
        if (rbTransporte == R.id.rbTransporte1) transporte = "Coche";
        if (rbTransporte == R.id.rbTransporte2) transporte = "Tren";
        if (rbTransporte == R.id.rbTransporte3) transporte = "Avión";

        // Mostrar la información
        Toast.makeText(this, "Me voy a " + destino + " en " + transporte, Toast.LENGTH_LONG).show();

    }

    private void mostrarInfoV3() {

        // Obtener el destino seleccionado
        int rbDestino = ((RadioGroup)findViewById(R.id.rgDestino)).getCheckedRadioButtonId();
        String destino = ((RadioButton)findViewById(rbDestino)).getText().toString();

        // Obtener el transporte seleccionado
        int rbTransporte = ((RadioGroup)findViewById(R.id.rgTransporte)).getCheckedRadioButtonId();
        String transporte = ((RadioButton)findViewById(rbTransporte)).getText().toString();

        // Mostrar la información
        Toast.makeText(this, "Me voy a " + destino + " en " + transporte, Toast.LENGTH_LONG).show();

    }

}