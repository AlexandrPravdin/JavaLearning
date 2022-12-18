package ru.mirea.zad24.documents.factory;

import ru.mirea.zad24.documents.document.IDocument;
import ru.mirea.zad24.documents.document.TextDocument;

public class TextDocumentFactory implements AbstractDocumentFactory{
    @Override
    public IDocument createDocument() {
        return new TextDocument();
    }

    @Override
    public IDocument openDocument() {
        return new TextDocument();
    }
}
