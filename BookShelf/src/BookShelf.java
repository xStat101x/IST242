import com.sun.source.tree.LambdaExpressionTree;

import java.util.ArrayList;

public class BookShelf {

    private ArrayList<Book> BookShelf;

    public BookShelf(){
        BookShelf = new ArrayList<>();
    }

    public boolean isSorted(){
        for(int i = 1 ; i < BookShelf.size() ; i++) {
            if (!(BookShelf.get(i).getPageCount() > BookShelf.get(i - 1).getPageCount())){
                return false;
            }
        }
        return true;
    }

    public void addBook(Book o) {
        this.BookShelf.add(o);
    }

    public String toString() {
        String output = "";
        for (int i = 0 ; i < BookShelf.size() ; i++) {
            output += BookShelf.get(i) + "\n";
        }
        return output;
    }
}
