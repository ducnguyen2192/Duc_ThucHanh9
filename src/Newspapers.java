
public class Newspapers extends Documents {
    private String releasedDate;

    public String getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(String releasedDate) {
        this.releasedDate = releasedDate;
    }

    @Override
    public String toString() {
        return "Newspapers{" + "document id= " + super.getDocumentId() +
                ", publisher= " + super.getDocumentPublisher() +
                ", number of issues= " + super.getNumberOfIssues()+
                "releasedDate='" + releasedDate + '\'' +
                '}';
    }
}
