package basic.sample;

import java.util.*;

class HashSetSample {
    public static void main(String[] args) {
        // set decralation
        Set<Integer> integerSet = new HashSet<>();
        // set value to Hash
        integerSet.add(10);
        integerSet.addAll(Arrays.asList(10,20,40,50,60));
        System.out.println(integerSet);
        // remove value from Hash
        integerSet.remove(20);
        System.out.println(integerSet);
        // count value and contains, IsEmpty
        System.out.println(integerSet.size());
        System.out.println(integerSet.contains(10));
        System.out.println(integerSet.contains(20));
        System.out.println(integerSet.isEmpty());
        // Convert from ArrayList
        List<Integer> integerList= new ArrayList<>(Arrays.asList(3,9,1,6,1));
        System.out.println("ArrayList: "+integerList);
        // convert to LinkedHashSet
        Set<Integer> integerLinkedHashSet = new LinkedHashSet<>(integerList);
        System.out.println("LinkedHashSet: "+integerLinkedHashSet);
        // convert to TreeSet(very slow)
        Set<Integer> integerTreeSet = new TreeSet<>(integerList);
        System.out.println("TreeSet: "+integerTreeSet);
    }
}

