package admin.comlab.com.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View view) {
        Intent intent = getPackageManager().getLaunchIntentForPackage("akshaygalande.com.sportsfantasyindia.dummyintent");
        startActivity(intent);
    }
}
