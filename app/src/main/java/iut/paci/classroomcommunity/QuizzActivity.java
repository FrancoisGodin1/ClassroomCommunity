package iut.paci.classroomcommunity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class QuizzActivity extends AppCompatActivity {

    private static TextView versus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        setContentView(R.layout.activity_quizz);
        versus = (TextView) findViewById(R.id.versus);
        versus.setText(bundle.getString("key")+" vs "+ bundle.getString("adversaire"));
    }
}
