package main.hari1;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class BelanjaMain extends AppCompatActivity {

    private ListView daftar;
    private List<String> alumnus;
    private ArrayAdapter<String>daftaradapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftarbelanja);

        alumnus=new ArrayList<>();
        daftaradapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,alumnus);
        daftar=(ListView)findViewById(R.id.daftar);

        //adapter
        daftar.setAdapter(daftaradapter);
        //item clicked
        daftar.setOnItemClickListener(alumnusItemClicked);

        daftar.setAdapter(daftaradapter);

        loadDataAlumnus();

    }
    private void loadDataAlumnus(){
        alumnus.add("Pohon Mangga");
        alumnus.add("Sayur Bayam");
        alumnus.add("Bibit Padi");
        alumnus.add("Daun Bawang");

        daftaradapter.notifyDataSetChanged();
    }
    private AdapterView.OnItemClickListener alumnusItemClicked=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            String selectedAlumnus=alumnus.get(position);
            Toast.makeText(BelanjaMain.this,selectedAlumnus, Toast.LENGTH_SHORT).show();
        }
    };
}
