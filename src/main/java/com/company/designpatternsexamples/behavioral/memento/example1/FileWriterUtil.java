package com.company.designpatternsexamples.behavioral.memento.example1;

/**
 * Class that stands for Originator, the object whose state needs to be saved and restored
 *
 * @author eugenia
 */
class FileWriterUtil {

    private String fileName;
    private StringBuilder content;

    FileWriterUtil(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write(String str) {
        content.append(str);
    }

    public Memento save() {
        return new Memento(this.fileName, this.content);
    }

    public void undoToLastSave(Object obj) {
        Memento memento = (Memento) obj;
        this.fileName = memento.fileName;
        this.content = memento.content;
    }


    private class Memento {
        private String fileName;
        private StringBuilder content;

        public Memento(String fileName, StringBuilder content) {
            this.fileName = fileName;
            //notice the deep copy so that Memento and FileWriterUtil content variables don't refer to same object
            this.content = new StringBuilder(content);
        }
    }
}