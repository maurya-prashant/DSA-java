import java.util.*;

public class list{
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("kiwi");
        fruits.add("apple");
        fruits.add("pineapple");
        fruits.add("banana");
        fruits.add("pear");

    
        for(int i =0; i<fruits.size(); i++){
            System.out.println("fruit is "+ fruits.get(i));
        }

        System.out.println("----------------------------");

        for(String fruit: fruits){
            System.out.println("fruit name is "+ fruit);
        }

        System.out.println("-----------------------------");


        Iterator<String> fe = fruits.iterator();

        while(fe.hasNext()){
            System.out.println("Iterator "+ fe.next());
        }

        System.out.println("--------------------");
        
        List<String> smallList = fruits.subList(1, 3);
        System.out.println(smallList);
    }
}