package androidapp.example.dicodingfirstapp.personActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidapp.example.dicodingfirstapp.R;

public class Charles_Koch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charles__koch);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
