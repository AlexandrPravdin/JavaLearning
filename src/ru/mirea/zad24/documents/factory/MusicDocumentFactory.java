package ru.mirea.zad24.documents.factory;


import ru.mirea.zad24.documents.document.IDocument;
import ru.mirea.zad24.documents.document.MusicDocument;

public class MusicDocumentFactory implements AbstractDocumentFactory{
    @Override
    public IDocument createDocument() {
        return new MusicDocument();
    }

    @Override
    public IDocument openDocument() {
        return new MusicDocument();
    }
}
