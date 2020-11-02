import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library lib = Library.getInstance();
        Menus m = new Menus();

        do{
            System.out.println("========== Menu ==========");
            System.out.println("1. Add new document");
            System.out.println("2. Search document by type");
            System.out.println("3. Search document by id");
            System.out.println("4. Show all documents");
            int choice = Integer.parseInt(input.nextLine());

            switch(choice){
                case 1:
                    Documents d = m.addDocument();
                    lib.getDocumentList().add(d);
                    break;
                case 2:
                    System.out.println("choose document type");
                    System.out.println("1. Books");
                    System.out.println("2. Magazine");
                    System.out.println("3. Newspaper");
                    int typeChoice = Integer.parseInt(input.nextLine());

                    switch (typeChoice){
                        case 1:
                            for (Documents d1: lib.getDocumentList()) {
                            if(d1 instanceof Books){
                                Books d3 = (Books) d1;
                                System.out.println(d3);
                                }
                            }
                            break;
                        case 2:
                            for (Documents d1: lib.getDocumentList()) {
                                if(d1 instanceof Magazines){
                                    Magazines d3 = (Magazines) d1;
                                    System.out.println(d3);
                                }
                            }
                            break;
                        case 3:
                            for (Documents d1: lib.getDocumentList()) {
                                if(d1 instanceof Newspapers){
                                    Newspapers d3 = (Newspapers) d1;
                                    System.out.println(d3);
                                }
                            }
                            break;
                        default:
                            System.out.println("not a valid option");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("input document id: ");
                    int Id = Integer.parseInt(input.nextLine());
                    for (Documents d1: lib.getDocumentList()) {
                        if(d1.getDocumentId() == Id){
                            System.out.println(d1);
                        }
                    }
                    break;
                case 4:
                    for (Documents d1: lib.getDocumentList()) {
                        System.out.println(d1);
                    }
                    break;
                default:
                    System.out.println("not a valid option");
                    break;

            }
        }while(true);

    }
}
