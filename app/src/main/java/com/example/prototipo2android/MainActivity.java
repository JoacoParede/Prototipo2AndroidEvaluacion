package com.example.prototipo2android;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declaración de botones
    Button btnWeb, btnLlamar, btnMapa, btnAyuda, btnCorreo, btnFoto, btnDetalle, btnConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Enlazar botones con el diseño XML
        btnWeb = findViewById(R.id.btnWeb);
        btnLlamar = findViewById(R.id.btnLlamar);
        btnMapa = findViewById(R.id.btnMapa);
        btnAyuda = findViewById(R.id.btnAyuda);

        btnCorreo = findViewById(R.id.btnCorreo);
        btnFoto = findViewById(R.id.btnFoto);
        btnDetalle = findViewById(R.id.btnDetalle);
        btnConfig = findViewById(R.id.btnConfig);


        // 1. Intent implícito pa abrir Web
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.santotomas.cl"));
                    startActivity(intentWeb);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(MainActivity.this, "No hay navegador instalado", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // 2. Intent implícito pa marcar teléfono
        btnLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intentLlamar = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+56912345678"));
                    startActivity(intentLlamar);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(MainActivity.this, "No hay aplicación de llamadas", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // 3. Intent implícito para abrir mapa en coordenadas
        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intentMapa = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:-33.4569,-70.6483?q=Santo+Tomas"));
                    startActivity(intentMapa);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(MainActivity.this, "No hay aplicación de mapas instalada", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // 4. Intent explícito para abrir pantalla de ayuda
        btnAyuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intentAyuda = new Intent(MainActivity.this, AyudaActivity.class);
                    startActivity(intentAyuda);
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Error al abrir Ayuda", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // 5. Intent implícito para enviar correo
        btnCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intentCorreo = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:Example@santotomas.cl"
                            + "?subject=" + Uri.encode("Asunto de prueba") +
                            "&body=" + Uri.encode("Este es el cuerpo del mensaje.")));
                    startActivity(intentCorreo);
                } catch (Exception E) {
                    Toast.makeText(MainActivity.this, "Error al enviar correo", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // 6. Intent implícito para tomar foto
        btnFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intentFoto = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivity(intentFoto);
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Error al tomar foto", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnDetalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intentDetalle = new Intent(MainActivity.this, DetalleActivity.class);
                    intentDetalle.putExtra("Nombre", "Rodrigo");
                    intentDetalle.putExtra("Edad", "25");
                    startActivity(intentDetalle);

                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Error al ver detalle", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intentConfig = new Intent(MainActivity.this, ConfigActivity.class);
                    startActivity(intentConfig);
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Error al ver configuración", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}