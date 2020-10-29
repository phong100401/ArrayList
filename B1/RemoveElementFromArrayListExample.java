package B1;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementFromArrayListExample {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List: "+programmingLanguages);

        //Remove the element at index '5'
        programmingLanguages.remove(5);
        System.out.println("After remove(5): "+programmingLanguages);

        //Remove the first occuurrentce of the given element from the ArrayList
        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\"): " +programmingLanguages);

        //Remove all the element that exist in a given collection
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Per1");

        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguague): "+programmingLanguages);

        //Remove all the element that satisfy the given predicate
        programmingLanguages.removeIf(s -> (s.startsWith("C")));

        System.out.println("After Removing all elements that start with \"C\": "+programmingLanguages);

        //Remove all element from the ArrayList
        programmingLanguages.clear();
        System.out.println("After clear(): "+programmingLanguages);
    }
}
