import java.util.HashMap;
import java.util.Scanner;

public class Day21 {
    static HashMap<String, monkey> map = new HashMap<>();
    public static void start(Scanner s){
        monkey root = null;
        while (s.hasNextLine()){
            String n = s.next().substring(0,4);
            map.put(n,new monkey());
            if (n.equals("root")){
                root = map.get(n);
            }
            if (n.equals("humn")){
               map.get(n).humn = true;
            }
            if (s.hasNextInt()){
                map.get(n).number = s.nextInt();
            }
            else{
                map.get(n).m1 = s.next();
                map.get(n).symbol = s.next().charAt(0);
                map.get(n).m2 = s.next();
            }
        }
        System.out.println(map.get(root.m2).getTotal());
        System.out.println(map.get(root.m1).getHumn(map.get(root.m2).getTotal()));
    }
    public static class monkey{
        boolean humn = false;
        long number = 0;
        char symbol;
        String m1;
        String m2;

        public long getHumn(long desired){
            if (humn){
                return desired;
            }
            if (map.get(m1).containsHumn()){
                long total = map.get(m2).getTotal();
                return map.get(m1).getHumn(switch (symbol){
                    case '+' -> desired-total;
                    case '-' -> total + desired;
                    case '*' -> desired/total;
                    default -> total * desired;
                });
            }
            else{
                long total = map.get(m1).getTotal();
                return map.get(m2).getHumn(switch (symbol){
                    case '+' -> desired-total;
                    case '-' -> total - desired;
                    case '*' -> desired/total;
                    default -> total/desired;
                });
            }
        }
        public long getTotal(){
            if (number != 0){
                return number;
            }
            long m1 = map.get(this.m1).getTotal();
            long m2 = map.get(this.m2).getTotal();
            return switch (symbol){
                case '+' -> m1+m2;
                case '-' -> m1-m2;
                case '*' -> m1*m2;
                default -> m1/m2;
            };
        }
        public boolean containsHumn(){
            if (humn){
                return true;
            }
            if (number != 0){
                return false;
            }
            return map.get(m1).containsHumn() || map.get(m2).containsHumn();
        }
    }
}
