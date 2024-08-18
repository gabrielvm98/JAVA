package Classes;

public class EBook extends Book{
    private String format;

    public EBook(String title, String author, int pageCount, String format) {
        super(title, author, pageCount);
        this.format = format;
    }
}
