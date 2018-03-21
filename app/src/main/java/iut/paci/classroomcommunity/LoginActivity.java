package iut.paci.classroomcommunity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {

    private static EditText username;
    private static EditText password;
    private static Button login_button;
    private static TextView attempt;
    int attempt_counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginButton();
    }

    public void LoginButton(){
        username = (EditText)findViewById(R.id.login);
        password = (EditText)findViewById(R.id.password);
        login_button = (Button)findViewById(R.id.button_login);
        attempt = (TextView)findViewById(R.id.attempt);

        attempt.setText(Integer.toString(attempt_counter));

        login_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (username.getText().toString().equals("godin")&& password.getText().toString().equals("admin")){
                            Toast.makeText(LoginActivity.this,"Username and password is correct",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putString("key",username.getText().toString());
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(LoginActivity.this,"Username and password is NOT correct",
                                    Toast.LENGTH_SHORT).show();
                            attempt_counter--;
                            attempt.setText(Integer.toString(attempt_counter));
                            if(attempt_counter==0)
                                login_button.setEnabled(false);
                        }
                    }
                }
        );
    }
}
