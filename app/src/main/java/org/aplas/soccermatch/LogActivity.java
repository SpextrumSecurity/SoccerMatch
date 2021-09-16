package org.aplas.soccermatch;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class LogActivity extends AppCompatActivity {

    private RecyclerView logView;
    private Button restartBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        logView = (RecyclerView) findViewById(R.id.log);
//        restartBtn = (Button) findViewById(R.id.restartBtn);

        logView.setLayoutManager(new LinearLayoutManager(this));
        logView.setItemAnimator(new DefaultItemAnimator());
        logView.setHasFixedSize(false);
    }
}
