
public class Magazines extends Documents {
    private int releasedId;
    private String releasedMonth;

    public int getReleasedId() {
        return releasedId;
    }

    public void setReleasedId(int releasedId) {
        this.releasedId = releasedId;
    }

    public String getReleasedMonth() {
        return releasedMonth;
    }

    public void setReleasedMonth(String releasedMonth) {
        this.releasedMonth = releasedMonth;
    }

    @Override
    public String toString() {
        return "Magazines{" + "document id= " + super.getDocumentId() +
                ", publisher= " + super.getDocumentPublisher() +
                ", number of issues= " + super.getNumberOfIssues()+
                "releasedId=" + releasedId +
                ", releasedMonth='" + releasedMonth + '\'' +
                '}';
    }
}
