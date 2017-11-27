package main.hari1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static main.hari1.R.layout.activity_main;
import static main.hari1.R.layout.formulirregistrasi;


public class form extends AppCompatActivity {

    Button a;
    EditText usernam, userpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulirregistrasi);

        a = (Button) findViewById(R.id.register);
        usernam= (EditText) findViewById(R.id.user);
        userpass= (EditText) findViewById(R.id.password);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String jeneng, gembok;

                jeneng = usernam.getText().toString();
                gembok = userpass.getText().toString();

                Toast.makeText(getApplicationContext(),"Username: " + jeneng + "\n" + "password:" + gembok, Toast.LENGTH_SHORT).show();



            }
        });



    }
}