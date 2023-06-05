package br.com.app.tabuada;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText numEditText;
    private TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numEditText = findViewById(R.id.num_edit_text);
        Button calcularButton = findViewById(R.id.calcular_button);
        resultadoTextView = findViewById(R.id.resultado_text_view);

        calcularButton.setOnClickListener(v -> {
            String numStr = numEditText.getText().toString();

            if (TextUtils.isEmpty(numStr)) {
                Toast.makeText(MainActivity.this, "Por favor, insira um número.", Toast.LENGTH_SHORT).show();
                return;
            }

            double num = Double.parseDouble(numStr);

            if (num <= 0) {
                Toast.makeText(MainActivity.this, "Por favor, insira um número positivo.", Toast.LENGTH_SHORT).show();
                return;
            }

            StringBuilder resultado = new StringBuilder();
            for (int i = 1; i <= 10; i++) {
                resultado.append(String.format(getString(R.string.d_x_2f_2f_n), i, num, (i * num)));
            }
            resultadoTextView.setText(resultado.toString());
        });
    }
}