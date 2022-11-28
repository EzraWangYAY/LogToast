package com.example.logtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        monBouton = findViewById(R.id.monBouton);
        textView = findViewById(R.id.textView);
        
        monBouto.setOnClickListener(new view.OnClickListener()
                @Override
                public void onClick(View v){
            log.i("Mon Tag", "Bonjour mon ami");
            Toast.makeText( MainActivity.this, "Bonjour mon ami", Toast.LENTH.SHORT).show();
            


        }
    }
    );
    }
}