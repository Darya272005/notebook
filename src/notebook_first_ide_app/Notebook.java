package notebook_first_ide_app;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private List<Note> notes;

    public Notebook() {
        notes = new ArrayList<>();
    }

    public void addNotes(String matter) {
        Note note = new Note(matter);
        notes.add(note);
    }

    public List<Note> SearchByMatter(String keyword) {
        List<Note> results = new ArrayList<>();
        for (Note note : notes) {
            if (note.getMatter().contains(keyword)) {
                results.add(note);
            }
        }
        return results;
    }

    public List<Note> SearchByDate(Date date) {
        List<Note> results = new ArrayList<>();
        for (Note note : notes) {
            if (note.getBuildDate().equals(date)) {
                results.add(note);
            }
        }
        return results;
    }

    public void showNotes() {
        for (Note note : notes) {
            System.out.println("Creation Date: " + note.getBuildDate());
            System.out.println("Matter: " + note.getMatter());
            System.out.println();
        }
    }
}