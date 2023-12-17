package observer;


public class Main {

    public static void main(String[] args){

        Document doc1 = new Document("Doc 1", new Object());
        Document doc2 = new Document("Doc 2", new Object());
        Document doc3 = new Document("Doc 3", new Object());

        DocumentBackupHandler handler = DocumentBackupHandler.getInstance();

        handler.add(doc1);
        handler.add(doc2);
        handler.add(doc3);

        handler.backupFiles();
    }
}
