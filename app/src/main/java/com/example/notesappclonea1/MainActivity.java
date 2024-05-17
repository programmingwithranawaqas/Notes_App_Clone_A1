package com.example.notesappclonea1;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


    ArrayList<Note> notes;
    MyNoteAdapter adapter;
    ListView lvNotes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        notes = new ArrayList<>();
        // public Note(String title, String description, Date dateAndTime, Date reminderDateTime, boolean isFav) {
        //
        Date date = new Date();
        notes.add(new Note("Note 1", "This is description of Note 1", date, null, false));
        notes.add(new Note("Note 2", "Description of Note 1", date, null, false));
        notes.add(new Note("Note 3", "This description is for Note 1", date, null, false));

        adapter = new MyNoteAdapter(this, 0, notes);
        lvNotes = findViewById(R.id.lvNotes);
        lvNotes.setAdapter(adapter);


    }
}