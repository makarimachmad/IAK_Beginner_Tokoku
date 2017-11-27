package main.hari1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

public class homesplash extends AppCompatActivity{
    ContactsContract.Groups rb;
    private static int SPLASH=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(homesplash.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        },SPLASH);

    }
}