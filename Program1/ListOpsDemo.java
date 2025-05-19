package lab_1;
import java.util.*;

public class ListOpsDemo {
    public static void main(String[] args) {
        // Initial elements
        List<String> initialFruits = Arrays.asList("Apple", "Banana", "Orange");

        // 1. Create ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>(initialFruits);
        List<String> linkedList = new LinkedList<>(initialFruits);

        System.out.println("Initial ArrayList: " + arrayList);
        System.out.println("Initial LinkedList: " + linkedList);

        // 2. Add element at specific index
        arrayList.add(1, "Mango");
        linkedList.add(1, "Mango");

        // 3. Add multiple elements
        List<String> moreFruits = Arrays.asList("Grapes", "Pineapple");
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);

        // 4. Access elements
        System.out.println("Accessed from ArrayList: " + arrayList.get(2));
        System.out.println("Accessed from LinkedList: " + linkedList.get(2));

        // 5. Update elements
        arrayList.set(2, "Kiwi");
        linkedList.set(2, "Kiwi");

        // 6. Remove elements
        arrayList.remove("Banana");
        linkedList.remove("Banana");

        // 7. Search elements
        boolean hasApple = arrayList.contains("Apple");
        System.out.println("ArrayList contains Apple: " + hasApple);

        // 8. List size
        System.out.println("ArrayList size: " + arrayList.size());

        // 9. Iterate over list
        System.out.println("Iterating ArrayList with for-each:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // 10. Using Iterator
        System.out.println("Iterating LinkedList with Iterator:");
        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        Collections.sort((LinkedList<String>) linkedList); // LinkedList needs casting
        System.out.println("Sorted ArrayList: " + arrayList);
        System.out.println("Sorted LinkedList: " + linkedList);

        // 12. Sublist
        List<String> arraySublist = arrayList.subList(1, 3);
        System.out.println("Sublist of ArrayList (1-3): " + arraySublist);

        // 13. Clearing list
        arrayList.clear();
        linkedList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}
