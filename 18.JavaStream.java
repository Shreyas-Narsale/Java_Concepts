import java.lang.*;
import java.util.*;



class Main{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.stream().
        filter(n-> n%2==0).
        forEach(n->System.out.println(n));

       list.stream().filter(n->n <3).forEach(n->System.out.println(n));

       list.stream()                  // Source
    .filter(n -> n > 2)       // Intermediate
    .map(n -> n * 2)          // Intermediate
    .forEach(System.out::println); // Terminal


    /*
        . Intermediate Operations (Lazy)
        These return a Stream.
        filter()
        map()
        sorted()
        distinct()
        limit()
    */

    List<Integer> list1 = Arrays.asList(5, 3, 2, 2, 8, 1, 4);

    list1.stream()
        .filter(n -> n > 2)     // remove <=2
        .distinct()             // remove duplicates
        .sorted()               // sort
        .limit(3)               // take first 3
        .map(n -> n * 10)       // transform
        .forEach(System.out::println);
    

    list1.stream().sorted((a,b)-> b-a).forEach(n->System.out.println(n));
    list1.stream().sorted((a,b)-> {
        if (a >= b)return -1;
        else return 1;
    }).
    forEach(n->System.out.println(n));
    //sorted((a,b)-> b-a) if need a first in sorted list return negative
    //if need b first in soretd list then postive return
    // if 0 then mean s equal
    
    /*
    Terminal Operations

    These produce a result.
    forEach()
    collect()
    count()
    reduce()
    */

    String str="abcdefabc";

    str.chars().distinct().mapToObj(c -> (char)c).forEach(ch->System.out.println(ch));

    }
}
