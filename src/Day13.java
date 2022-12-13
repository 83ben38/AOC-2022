import java.util.ArrayList;
import java.util.Scanner;

public class Day13 {
    public static void start(Scanner s){
        int total = 0;
        int i = 1;
        list divider1 = toList("[[2]]");
        list divider2 = toList("[[6]]");
        ArrayList<list> v = new ArrayList<>();
        while (s.hasNextLine()){
            v.add(toList(s.nextLine()));
            v.add(toList(s.nextLine()));
            s.nextLine();
        }
        v.add(divider1);
        v.add(divider2);
        v.sort((o1, o2) -> compareTo(o2, o1));
        System.out.println((v.indexOf(divider1)+1)*(v.indexOf(divider2)+1));
    }

    public static int compareTo(list v1, list v2){
        if (!v1.big && !v2.big){
            return Integer.compare(v2.item, v1.item);
        }
        if (v1.big && v2.big){
            for (int i = 0; i < v1.lists.size(); i++) {
                if (v2.lists.size() == i){
                    return -1;
                }
                if (compareTo(v1.lists.get(i),v2.lists.get(i)) != 0){
                    return compareTo(v1.lists.get(i),v2.lists.get(i));
                }
            }
            if (v2.lists.size() > v1.lists.size()){
                return 1;
            }
            return 0;
        }
        if (v1.big){
            list l = new list();
            l.big = true;
            l.lists.add(v2);
            return compareTo(v1,l);
        }
        list l = new list();
        l.big = true;
        l.lists.add(v1);
        return compareTo(l,v2);
    }
    public static list toList(String v){
        if (!v.contains("[")){
            list p = new list();
            if (v.isBlank()){
                p.big = true;
            }
            else{
                p.item = Integer.parseInt(v);
            }
            return p;
        }
        v = v.substring(1,v.length()-1);
        if (!v.contains(",")){
            list p = new list();
            p.big = true;
            p.lists.add(toList(v));
            return p;
        }
        else {
            list p = new list();
            p.big = true;
            while (v.contains(",")){
                int open = 0;
                int z = -1;
                for (int i = 0; i < v.length(); i++) {
                    if(v.charAt(i) == ',' && open == 0){
                        z = i;
                        break;
                    }
                    if (v.charAt(i) == '['){
                        open++;
                    }
                    if (v.charAt(i) == ']'){
                        open--;
                    }
                }
                if (z == -1){
                    break;
                }
                p.lists.add(toList(v.substring(0, z)));
                v = v.substring(z + 1);

            }
            p.lists.add(toList(v));
            return p;
        }
    }

    public static class list{
        boolean big = false;
        ArrayList<list> lists = new ArrayList<>();
        int item;
    }
}
