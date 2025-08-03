package Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAndComparable {

    public static void main(String[] args) {
        Animal a1 = new Animal(4, "Leo", 10);
        Animal a2 = new Animal(1, "Bruno", 6);
        Animal a3 = new Animal(1, "Maxo", 4);
        Animal a4 = new Animal(3, "Don", 3);

        List<Animal> dogs = new ArrayList<>();

        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);

        System.out.println(dogs); 
        
        // we can pass comparator here also as it is functional interface.
        Collections.sort(dogs);
        Collections.sort(dogs, (o1, o2) -> o1.name.compareTo(o2.name));
        
        // Comparing method 
        // Collections.sort(dogs, Comparator.comparing(Animal::getAge).thenComparing(Animal::getName));

        System.out.println(dogs);

        int a[][] = {
            {4,5,2},
            {1,1,2},
            {3,4,7}
        };

        Arrays.sort(a, (arr1,arr2) -> {
            return arr1[0] - arr2[0];
        });

        for(int e[] : a){
            for(int element : e){
                System.out.println(element + " ");
            }
            System.out.println();
        }

    }

}
