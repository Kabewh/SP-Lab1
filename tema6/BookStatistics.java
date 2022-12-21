package src;

public class BookStatistics implements Visitor {
    int nrImage = 0;
    int nrParagraph = 0;
    int nrTable = 0;

    @Override
    public void visitBook(Book book) {
        for (Element element : book.elements) {
            element.accept(this);
        }
    }

    @Override
    public void visitSection(Section section) {
        for (Element element : section.elements) {
            element.accept(this);
        }
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
        for (Element element : tableOfContents.elements) {
            element.accept(this);
        }
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        nrParagraph++;
        for (Element element : paragraph.elements) {
            element.accept(this);
        }
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        nrImage++;
        for (Element element : imageProxy.getRealimg().elements) {
            element.accept(this);
        }
    }

    @Override
    public void visitImage(Image image) {
        nrImage++;
        for (Element element : image.elements) {
            element.accept(this);
        }
    }

    @Override
    public void visitTable(Table table) {
        nrTable++;
        for (Element element : table.elements) {
            element.accept(this);
        }
    }

    public void printStatistics() {
        System.out.println("Book Statistics:");
        System.out.println("*** Number of images: " + nrImage);
        System.out.println("*** Number of tables: " + nrTable);
        System.out.println("*** Number of paragraphs: " + nrParagraph);
    }
}
