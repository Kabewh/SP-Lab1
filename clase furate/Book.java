import java.util.LinkedHashMap;
import java.util.Map;

public class Book {
    private enum ContentType {PARAGRAPH, IMAGE, TABLE}
    String title;
    LinkedHashMap<String, ContentType> content;
    public Book(String title) {
        this.title = title;
        this.content = new LinkedHashMap<>();
    }

    public void createNewParagraph(String name) {
        content.put(name, ContentType.PARAGRAPH);
    }

    public void createNewImage(String name) {
        content.put(name, ContentType.IMAGE);
    }

    public void createNewTable(String name) {
        content.put(name, ContentType.TABLE);
    }

    public void print() {
        StringBuilder output = new StringBuilder();
        output.append("~~~~~ " + title + " ~~~~~");
        for (Map.Entry<String, ContentType> entry : content.entrySet()) {
            String name = entry.getKey();
            ContentType type = entry.getValue();
            switch (type) {
                case PARAGRAPH -> output.append("\n# " + name);
                case IMAGE -> output.append("\n@ " + name);
                case TABLE -> output.append("\n+ " + name);
                default -> output.append("\n? NONE");
            }
        }
        System.out.print(output);
    }
}
