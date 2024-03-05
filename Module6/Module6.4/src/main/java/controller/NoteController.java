package controller;

public class NoteController {
    private Notebook notebook;

    public NoteController(Notebook notebook) {
        this.notebook = notebook;
    }

    public void addNote(String title, String content) {
        Note note = new Note(title, content);
        this.notebook.addNote(note);
    }

    public List<Note> getNotes() {
        return this.notebook.getNotes();
    }
}