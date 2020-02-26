package SetPractice;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {
        List<String> list= new ArrayList<String>();
        list.add("nihao");
        list.add("Coding");

        for (String str:list){
            System.out.println(str);
        }

        String[] arr=new String[list.size()];
        list.toArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Iterator<String> ite=list.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }

    }
}
