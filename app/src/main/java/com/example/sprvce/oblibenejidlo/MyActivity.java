package com.example.sprvce.oblibenejidlo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MyActivity extends Activity {
    String text;//deklarace promenne uz tady,
                // aby se s ni dalo pracovat i
                // v casti kodu "onClick (po kliknuti)"
    EditText jidlo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        Button tlacitko; //deklarace promenne tlacitko
        tlacitko = (Button)findViewById(R.id.tlacitko);//ulozeni tlacitka z layoutu do promenne tlacitko
        tlacitko.setText("Ja jsem tlacitko"); //nataveni textu tlacitka

        jidlo = (EditText)findViewById(R.id.oblibeneJidlo);

        tlacitko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = jidlo.getText().toString(); //ulozeni textu v "jidlo" do promenne text
                //vypsani promenne "text" na obrazovku
                Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG).show();
            }
        });
    }
}