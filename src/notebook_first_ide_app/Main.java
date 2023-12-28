package notebook_first_ide_app;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Notebook notebook = new Notebook();
		notebook.addNotes("First note");
		notebook.addNotes("Second note");
		notebook.addNotes("Third note");

		List<Note> searchResults = notebook.SearchByMatter("note");
		System.out.println("Search Results:");
		for (Note note : searchResults) {
			System.out.println("Creation Date: " + note.getBuildDate());
			System.out.println("Matter: " + note.getMatter());
			System.out.println();
		}
		notebook.showNotes();
	}
}