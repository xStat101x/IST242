

public class App {


    public static void main(String[] args) {
        // instantiating a letter object
        Letter L1 = new Letter("Rex", "Bob");
        L1.addLine("line 1");
        L1.addLine("line 2");
        L1.addLine("line 3");
        L1.addLine("line 4");
        System.out.println(L1);
        String fullLetter = L1.getText();
        System.out.println(fullLetter);


    }
}
