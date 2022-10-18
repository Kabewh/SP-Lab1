import java.util.ArrayList;

public class Book{

    public ArrayList<String> array = new ArrayList<String>();
    public String name;

    public Book (String name) {
        this.name=name;
    }

    public void createNewParagraph(String paragraph) {
        array.add("Paragraph: " + paragraph);
    }

    public void createNewImage(String image) {
        array.add("Paragraph: " + image);
    }

    public void createNewTable(String table) {
        array.add("Table: " + table);
    }

    public void print() {
        for(int i = 0; i< array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}