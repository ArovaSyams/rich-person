package androidapp.example.dicodingfirstapp.personActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidapp.example.dicodingfirstapp.R;

public class Bernard_Arnault extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bernard__arnault);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
