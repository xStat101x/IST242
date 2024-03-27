import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public SetPractice() {}

    public boolean hasUniqueCharacters(ArrayList<String> strs) {
        Set<String> S = new HashSet<>();
        for (String x : strs) {
            if (S.contains(x)) {
                return false;
            }
            S.add(x);
        }
        return true; // all were unique
    }

    public ArrayList<Integer> findCommonElements(ArrayList<Integer> a1,
                                                 ArrayList<Integer> a2) {
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < a1.size(); i++) {
            if (a2.contains(a1.get(i))) {
                output.add(a1.get(i));
            }
        }
        return output;
    }

    public ArrayList<Integer> symmetricDifference(ArrayList<Integer> a1,
                                                  ArrayList<Integer> a2) {
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < a1.size(); i++) {
            if (!a2.contains(a1.get(i))) {
                output.add(a1.get(i));
            }
        }
        return output;
    }

    public String firstRepeatedElement(ArrayList<String> str) {
        Set<String> S = new HashSet<>();
        for (String s : str) {
            S.add(s);
        }
    }
}
