package powtorka.tagi;

public class Tag {


    private String title;

    public Tag(String title){
        this.title = title;
    }


    @Override
    public String toString() {
        return "Tag{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }
}
