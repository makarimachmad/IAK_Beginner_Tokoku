package main.hari1;

import android.content.Intent;
import android.os.Handler;
import android.support.constraint.solver.LinkedVariables;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static main.hari1.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    EditText user,pass;
    Button blogin;
    TextView bregister;

    private static int SPLASH=3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        user= (EditText) findViewById(R.id.username);
        pass= (EditText) findViewById(R.id.password);


        blogin= (Button) findViewById(R.id.login);
        bregister= (TextView) findViewById(R.id.register);

        /*
        */


        blogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do something
                //String username=user.getText().toString();
                //String password=pass.getText().toString();

                //Toast.makeText(getApplicationContext(), "Nama: " + username + "\n" + "password:" + password, Toast.LENGTH_SHORT).show();

                if((user.getText().toString().equals("makarim")) && (pass.getText().toString().equals("12345"))){

                        Intent intent = new Intent(MainActivity.this,menu.class);
                        startActivity(intent);
                }
                else if((pass.getText().toString() != "12345")){
                    Toast.makeText(getApplicationContext(), "Username/Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,form.class);
                startActivity(intent);

            }
        });

    }




}
