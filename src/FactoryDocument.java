public class FactoryDocument {
    public Documents getDocument(String type){
        if("book".equals(type)){
            return new Books();
        } else if ("magazine".equals(type)){
            return new Magazines();
        } else {
            return new Newspapers();
        }
    }
}
