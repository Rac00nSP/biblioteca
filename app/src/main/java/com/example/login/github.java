package com.example.login;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import Clases.precios;
public class github extends AppCompatActivity {
    private Spinner spinner;
    private TextView valor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);spinner = (Spinner)findViewById(R.id.spinner);
        valor = (TextView)findViewById(R.id.txtValor);
        ArrayList<String> listaLibros = (ArrayList<String>)getIntent().getSerializableExtra("listaLibros");
        SpinnerAdapter adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaLibros);
        spinner.setAdapter(adapt); }
    public void Consultar (View v)
    {   String libros = spinner.getSelectedItem().toString();
        precios libro = new precios();
        libro.setFarenheith(7000);
        libro.setRevival(22000);
        if (libros.equals("Farenheith")) {valor.setText("El precio de farenheith es: " + libro.getFarenheith());}
        if (libros.equals("Revival")) {valor.setText("El precio de Revival es: " + libro.getRevival());}
        if (libros.equals("El Alquimista")) {valor.setText("El precio de El Alquimista es: " + libro.getElAlquimista());}
        if (libros.equals("(Elija un libro)")) {valor.setText("Ningun libro ha sido seleccionado" );}
        if (libros.equals("El Poder")) {valor.setText("El precio de El Poder es: " + libro.getElPoder());}
        if (libros.equals("Despertar")) {valor.setText("El precio de Despertar es: " + libro.getDespertar());}
    }

}
