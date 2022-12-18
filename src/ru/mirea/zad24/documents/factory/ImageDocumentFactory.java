package ru.mirea.zad24.documents.factory;

import ru.mirea.zad24.documents.document.IDocument;
import ru.mirea.zad24.documents.document.ImageDocument;

import java.awt.*;

public class ImageDocumentFactory implements AbstractDocumentFactory{
    @Override
    public IDocument createDocument() {
        return new ImageDocument();
    }

    @Override
    public IDocument openDocument() {
        return new ImageDocument();
    }
}
