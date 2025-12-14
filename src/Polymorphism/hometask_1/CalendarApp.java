package Polymorphism.hometask_1;

import java.util.ArrayList;


public class CalendarApp implements NoteBook {
    ArrayList<String> notes = new ArrayList<>();

    @Override
    public void addNote(String note) {
        notes.add(note);
        System.out.println("Заметка успешно добавлена!");
    }
    @Override
    public void deleteNote(int index) {
        notes.remove(index);
        System.out.println("Заметка успешно удалена!");
    }
}

