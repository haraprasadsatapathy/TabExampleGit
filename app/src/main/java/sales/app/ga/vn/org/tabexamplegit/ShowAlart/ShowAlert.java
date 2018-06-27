package sales.app.ga.vn.org.tabexamplegit.ShowAlart;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import sales.app.ga.vn.org.tabexamplegit.R;


public class ShowAlert extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        startService(new Intent(ShowAlert.this,MyService.class));

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopService(new Intent(ShowAlert.this,MyService.class));
    }
}
