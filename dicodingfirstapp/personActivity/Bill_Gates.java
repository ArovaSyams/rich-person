package androidapp.example.dicodingfirstapp.personActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidapp.example.dicodingfirstapp.R;

public class Bill_Gates extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill__gates);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
