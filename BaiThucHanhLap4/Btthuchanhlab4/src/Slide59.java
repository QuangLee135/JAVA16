import java.util.LinkedHashSet;
import java.util.Set;

public class Slide59 {
    public static void main(String[] args){
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("java");
        linkedHashSet.add("C++");
        linkedHashSet.add("Python");
        linkedHashSet.add("PHP");
        for (String str : linkedHashSet){
            System.out.println(str);
        }

    }
}
