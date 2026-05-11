import java.lang.*;
import java.util.*;


class Main{
    public static void main(String[] args) {

        List <Integer> list = new ArrayList<>();
        List <String> slist= new Vector<>();
        slist.add("10");
        slist.remove("10");

        for (String ele: slist){
            
        }

        list.get(0);


        Set <Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.remove(20);

        if( set.contains(10)){

        }

        Queue <Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        q.add(10);
        q.add(20);
        q.remove(10);

        q.poll();


        Map <Integer, String> mp = new HashMap<>();

        mp.put(10,"hello");
        mp.put(20,"demo");


        mp.remove(10);
        mp.get(20);
        
    }
}
