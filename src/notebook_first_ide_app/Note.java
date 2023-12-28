package notebook_first_ide_app;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Note {
	private Date buildDate;
	private String matter;

	public Note() {
		buildDate = new Date();
		matter = " ";
	}

	public Note(String matter) {
		buildDate = new Date();
		this.matter = matter;
	}

	public Date getBuildDate() {
		return buildDate;
	}

	public String getMatter() {
		return matter;
	}
}