import java.util.Scanner;

public class Day25 {
    public static void start(Scanner s){
        long total = 0;
        while(s.hasNextLine()){
            String d = s.nextLine();
            int z = 0;
            for (int i = d.length()-1; i >=0; i--) {
                int v = d.charAt(i) == '-' ? -1 : d.charAt(i) == '=' ? -2 : d.charAt(i)-'0';
                total += Math.pow(5,z)*v;
                z++;
            }
        }
        System.out.println(total);
        System.out.println(toS(total));
    }
    public static String toS(long v){
        if (v == 0){
            return "";
        }
        if (v%5 < 3){
            return toS((v-v%5)/5) + v%5;
        }
        return v%5 == 3 ? toS((v+2)/5) + '=' : toS((v+1)/5) + '-';
    }
}
