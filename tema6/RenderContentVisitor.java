package src;

public class RenderContentVisitor implements Visitor {

    @Override
    public void visitBook(Book book) {
        System.out.println(book.title);
        if (book.authors.size() > 1) {
            StringBuilder author_out = new StringBuilder();
            author_out.append("Authors: ");
            for (Author a : book.authors) {
                author_out.append(a.name);
                author_out.append("; ");
            }
            System.out.println(author_out);
        }
        else {
            book.authors.getFirst().print();
        }

        for (Element element : book.elements) {
            element.accept(this);
        }
    }

    @Override
    public void visitSection(Section section) {
        System.out.println(section.title);
        for (Element element : section.elements) {
            element.accept(this);
        }
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
        System.out.println(tableOfContents.text);
        for (Element element : tableOfContents.elements) {
            element.accept(this);
        }
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        System.out.println(paragraph.name);
        for (Element element : paragraph.elements) {
            element.accept(this);
        }
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        System.out.println(imageProxy.name);
        for (Element element : imageProxy.getRealimg().elements) {
            element.accept(this);
        }
    }

    @Override
    public void visitImage(Image image) {
        System.out.println(image.name);
        for (Element element : image.elements) {
            element.accept(this);
        }
    }

    @Override
    public void visitTable(Table table) {
        System.out.println(table.name);
        for (Element element : table.elements) {
            element.accept(this);
        }
    }
}
