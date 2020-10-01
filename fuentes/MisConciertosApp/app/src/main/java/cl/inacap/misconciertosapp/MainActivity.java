package cl.inacap.misconciertosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText artistaTxt;
    private EditText valorTxt;
    private Button registrarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.artistaTxt = findViewById(R.id.artistaTxt);
        this.valorTxt = findViewById(R.id.valorTxt);
        this.registrarBtn = findViewById(R.id.registrarBtn);

        this.registrarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });

    }
}