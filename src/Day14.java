import java.util.ArrayList;
import java.util.Scanner;

public class Day14 {
    public static int min = 0;
    public static int max = 1000;
    public static int top = 0;
    public static int bottom;
    public static void start(Scanner s,int bottom){
        Day14.bottom = bottom;
        int total = 0;
        ArrayList<ArrayList<Boolean>> b = new ArrayList<>();
        for (int i = min; i < max; i++) {
            b.add(new ArrayList<>());
            for (int j = top; j < bottom; j++) {
                b.get(i-min).add(false);
            }
            b.get(i-min).add(true);
        }
        while (s.hasNextLine()){
            Scanner v = new Scanner(s.nextLine());
            point prevPoint = null;
            while (v.hasNext()){
                String x = v.next();
                if (v.hasNext()) {
                    v.next();
                }
                point currentPoint = new point(x.substring(0,x.indexOf(",")),x.substring(x.indexOf(",") + 1));
                if (prevPoint != null){
                    if (currentPoint.x == prevPoint.x){
                        for (int i = Math.min(currentPoint.y, prevPoint.y); i <= Math.max(currentPoint.y, prevPoint.y); i++) {
                            b.get(currentPoint.x).set(i,true);
                        }
                    }
                    else{
                        for (int i = Math.min(currentPoint.x, prevPoint.x); i <= Math.max(currentPoint.x, prevPoint.x); i++) {
                            b.get(i).set(currentPoint.y, true);
                        }
                    }
                }
                prevPoint = currentPoint;
            }
        }
        boolean ss = true;
        while(ss){
            point sand = new point(500,0);
            boolean stationary = false;
            while (!stationary){
                    if (b.get(sand.x).get(sand.y + 1)) {
                        if (b.get(sand.x - 1).get(sand.y + 1)) {
                            if (b.get(sand.x + 1).get(sand.y + 1)) {
                                b.get(sand.x).set(sand.y, true);
                                stationary = true;
                                total++;
                            }
                            else {
                                sand.y++;
                                sand.x++;
                            }
                        } else {
                            sand.y++;
                            sand.x--;
                        }
                    } else {
                        sand.y++;
                    }
            }
            if (sand.x == 500-min && sand.y == 0){
                ss = false;
            }
        }
        System.out.println(total);
    }

    public static class point{
        int x;
        int y;
        public point(int x, int y){
            this.x=x-min;
            this.y=y-top;
        }
        public point(String x, String y){
            this(Integer.parseInt(x),Integer.parseInt(y));
        }
    }
}
