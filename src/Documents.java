public abstract class Documents {
    private int documentId;
    private String documentPublisher;
    private int numberOfIssues;

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public String getDocumentPublisher() {
        return documentPublisher;
    }

    public void setDocumentPublisher(String documentPublisher) {
        this.documentPublisher = documentPublisher;
    }

    public int getNumberOfIssues() {
        return numberOfIssues;
    }

    public void setNumberOfIssues(int numberOfIssues) {
        this.numberOfIssues = numberOfIssues;
    }


}
