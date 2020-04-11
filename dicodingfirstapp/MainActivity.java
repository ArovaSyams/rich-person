package androidapp.example.dicodingfirstapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import androidapp.example.dicodingfirstapp.RecyclerView.ListRichestAdapter;
import androidapp.example.dicodingfirstapp.RecyclerView.RichestPerson;
import androidapp.example.dicodingfirstapp.RecyclerView.RichestPersonData;
import androidapp.example.dicodingfirstapp.personActivity.Amancio_Ortega;
import androidapp.example.dicodingfirstapp.personActivity.Bernard_Arnault;
import androidapp.example.dicodingfirstapp.personActivity.Bill_Gates;
import androidapp.example.dicodingfirstapp.personActivity.Carlos_Slim_Helu;
import androidapp.example.dicodingfirstapp.personActivity.Charles_Koch;
import androidapp.example.dicodingfirstapp.personActivity.Jeff_Bezzos;
import androidapp.example.dicodingfirstapp.personActivity.Larry_Ellison;
import androidapp.example.dicodingfirstapp.personActivity.Mark_Zurkerberg;
import androidapp.example.dicodingfirstapp.personActivity.Michael_Bloomberg;
import androidapp.example.dicodingfirstapp.personActivity.Warrent_Buffet;

public class MainActivity extends AppCompatActivity implements ListRichestAdapter.onItemListener {

    private RecyclerView rv1;
    private ArrayList<RichestPerson> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv1 = findViewById(R.id.recyclerv);
        rv1.setHasFixedSize(true);

        list.addAll(RichestPersonData.getListData());
        showRecycleList();

    }

    private void showRecycleList() {
        rv1.setLayoutManager(new LinearLayoutManager(this));
        ListRichestAdapter listRichestAdapter = new ListRichestAdapter(list, this);
        rv1.setAdapter(listRichestAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.profile) {
            Intent intent = new Intent(this, Profile.class);
            startActivity(intent);
        }
        return true;
    }

    @Override
    public void onItemClick(int position) {
        Intent intent;
        switch (position) {
            case 0 :
                intent = new Intent(this, Jeff_Bezzos.class);
                break;
            case 1 :
                intent = new Intent(this, Bill_Gates.class);
                break;
            case 2 :
                intent = new Intent(this, Amancio_Ortega.class);
                break;
            case 3 :
                intent = new Intent(this, Warrent_Buffet.class);
                break;
            case 4 :
                intent = new Intent(this, Mark_Zurkerberg.class);
                break;
            case 5 :
                intent = new Intent(this, Carlos_Slim_Helu.class);
                break;
            case 6 :
                intent = new Intent(this, Larry_Ellison.class);
                break;
            case 7 :
                intent = new Intent(this, Michael_Bloomberg.class);
                break;
            case 8 :
                intent = new Intent(this, Bernard_Arnault.class);
                break;
            case 9 :
                intent = new Intent(this, Charles_Koch.class);
                break;
            default:
                intent = new Intent(this, MainActivity.class);
                break;
        }
        startActivities(new Intent[]{intent});
    }
}
