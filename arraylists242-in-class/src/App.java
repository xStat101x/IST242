public class App {
    public static void main(String[] args) {

        IST242List myList = new ArrayBackedImpl();
        myList.append("a");
        System.out.println(myList);

        myList.append("b");
        System.out.println(myList);

        myList.append("c");
        System.out.println(myList);

        myList.append("d");
        myList.append("e");

        myList.append("f");
        System.out.println(myList);
    }
}
