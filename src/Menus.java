import java.util.Scanner;

public class Menus {
    Scanner input = new Scanner(System.in);
    public Documents addDocument(){
        System.out.println("input document type (book, magazine or newspaper): ");
        String documentType = input.nextLine();
        System.out.println("input document id: ");
        int documentId = Integer.parseInt(input.nextLine());
        System.out.println("input document publisher: ");
        String publisher = input.nextLine();
        System.out.println("input document number of released issues: ");
        int numberOfIssues = Integer.parseInt(input.nextLine());

        FactoryDocument factoryDocument = new FactoryDocument();
        Documents d1 = factoryDocument.getDocument(documentType);

        d1.setDocumentId(documentId);
        d1.setDocumentPublisher(publisher);
        d1.setNumberOfIssues(numberOfIssues);
        if(d1 instanceof Books){
            System.out.println("input author name: ");
            String authorName = input.nextLine();
            System.out.println("input number of pages: ");
            int numberOfPages = Integer.parseInt(input.nextLine());
            Books d2 = (Books) d1;
            d2.setAuthorName(authorName);
            d2.setNumberOfPages(numberOfPages);
        }else if(d1 instanceof Magazines){
            System.out.println("input released id: ");
            int releasedId = Integer.parseInt(input.nextLine());
            System.out.println("input released month: ");
            String releasedMonth = input.nextLine();
            Magazines d2 = (Magazines) d1;
            d2.setReleasedId(releasedId);
            d2.setReleasedMonth(releasedMonth);
        } else{
            System.out.println("input released date: ");
            String releasedDate = input.nextLine();
            Newspapers d2 = (Newspapers) d1;
            d2.setReleasedDate(releasedDate);
        }
        return d1;
    }


}
