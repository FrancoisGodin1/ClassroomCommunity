package iut.paci.classroomcommunity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class FriendsActivity extends AppCompatActivity {

    private static ListView lvFriends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_friends);
        final Intent intent = getIntent();
        final Bundle bundle = intent.getExtras();

        setTitle("t");

       lvFriends = (ListView)findViewById(R.id.listViewFriends);
       final String[] lesAmis = {"Aurelien","Cyril","Barto","Loic","Killian","Nicolas G","Daniel","Ricardo","Jeremy","Noussayr","Yann","Livio","Sebastien","Thomas","Thibault","Amine","Ndombe","Josué","Victorien","Randy"};
       final ArrayAdapter<String> adAmis = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,lesAmis);
        lvFriends.setAdapter(adAmis);

        lvFriends.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),QuizzActivity.class);
                bundle.putString("adversaire",lesAmis[position]);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
