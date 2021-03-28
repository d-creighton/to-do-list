package edu.ysu.dacreighton.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText textBox;
    ListView listView;
    ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.createButton);
        textBox = findViewById(R.id.textBox);
        listView = findViewById(R.id.listView);
        list = new ArrayList<>();
    }

    public void onClickAdd(View view) {
        String text = textBox.getText().toString();
        if(!text.equals("")) {
            list.add(text);
            ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
            listView.setAdapter(adapter);
            textBox.setText("");
        }
    }
}