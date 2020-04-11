package androidapp.example.dicodingfirstapp.personActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidapp.example.dicodingfirstapp.R;

public class Jeff_Bezzos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeff__bezzos);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
