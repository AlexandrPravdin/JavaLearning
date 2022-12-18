package ru.mirea.zad24.documents.factory;


import ru.mirea.zad24.documents.document.IDocument;

public interface AbstractDocumentFactory {
    public IDocument createDocument();
    public IDocument openDocument();
}
