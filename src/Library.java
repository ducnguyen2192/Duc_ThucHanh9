import java.util.ArrayList;

public class Library {
    ArrayList<Documents> documents = new ArrayList<>();
    private static final Library instance = new Library();

    private Library(){}

    public static Library getInstance(){
        return instance;
    }

    public ArrayList<Documents> getDocumentList() {
        return documents;
    }

    public void setDocumentList(ArrayList<Documents> documents) {
        this.documents = documents;
    }
}
