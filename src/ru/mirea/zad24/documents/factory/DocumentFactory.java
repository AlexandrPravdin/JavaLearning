package ru.mirea.zad24.documents.factory;


import ru.mirea.zad24.documents.document.IDocument;

public class DocumentFactory {
    public IDocument createDocument(AbstractDocumentFactory abstractDocumentFactory){
        System.out.println("creating document");
        return abstractDocumentFactory.createDocument();
    }
    public IDocument openDocument(AbstractDocumentFactory abstractDocumentFactory){
        System.out.println("opening document");
        return abstractDocumentFactory.openDocument();
    }
}
