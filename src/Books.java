
public class Books extends Documents{
    private String authorName;
    private int numberOfPages;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Books{" + "document id= " + super.getDocumentId() +
                ", publisher= " + super.getDocumentPublisher() +
                ", number of issues= " + super.getNumberOfIssues() +
                ", authorName='" + authorName + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
