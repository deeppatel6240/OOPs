package com.deep.creational;

// Abstract Product
interface Document {
    void open();
    void save();
}

// Concrete Products
class TextDocument implements Document {
    public void open() {
        System.out.println("Text document opened");
    }

    public void save() {
        System.out.println("Text document saved");
    }
}

class PDFDocument implements Document {
    public void open() {
        System.out.println("PDF document opened");
    }

    public void save() {
        System.out.println("PDF document saved");
    }
}

// Creator
class Application {
    private Document createDocument;

    public static Document getDocument(String type) {
        if (type.equals("Text")) {
            return new TextDocument();
        } else if (type.equals("PDF")) {
            return new PDFDocument();
        } else {
            System.out.println("Invalid Input!");
            return null;
        }
    }
}


// Client
public class AbstractMethod {
    public static void main(String[] args) {

        Document textDocument = Application.getDocument("Text");
        textDocument.open();
        textDocument.save();

        Document pdfDocument = Application.getDocument("PDF");
        pdfDocument.open();
        pdfDocument.save();

    }
}
