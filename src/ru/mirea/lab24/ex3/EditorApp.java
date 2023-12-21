package ru.mirea.lab24.ex3;

public class EditorApp {
    private IDocument document;
    private ICreateDocument documentFactory;

    public EditorApp(ICreateDocument documentFactory) {
        this.documentFactory = documentFactory;
        this.document = documentFactory.createNew();
    }

    public void openDocument() {
        document.open();
    }

    public void saveDocument() {
        document.save();
    }

    public static void main(String[] args) {
        ICreateDocument textDocumentFactory = new CreateTextDocument();

        EditorApp textEditor = new EditorApp(textDocumentFactory);

        textEditor.openDocument();
        textEditor.saveDocument();
    }
}

