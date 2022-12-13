import java.util.ArrayList;
import java.util.Scanner;

public class Day12 {
    static ArrayList<ArrayList<point>> map = new ArrayList<>();
    public static void start(Scanner s){
        map = new ArrayList<>();
        ArrayList<point> start = new ArrayList<>();
        point end = new point(0,0,'z'-'a');
        while (s.hasNextLine()){
            String v = s.nextLine();
            map.add(new ArrayList<>());
            for (int i = 0; i < v.length(); i++) {
                if (v.charAt(i) == 'S' || v.charAt(i) == 'a'){
                    map.get(map.size()-1).add(new point(map.size()-1,map.get(map.size()-1).size(),0));
                    start.add(map.get(map.size()-1).get(map.get(map.size()-1).size()-1));
                    start.get(start.size()-1).min = 0;
                    continue;
                }
                if (v.charAt(i) == 'E'){
                    map.get(map.size()-1).add(new point(map.size()-1,map.get(map.size()-1).size(),'z'-'a'));
                    end = map.get(map.size()-1).get(map.get(map.size()-1).size()-1);
                    continue;
                }
                map.get(map.size()-1).add(new point(map.size()-1,map.get(map.size()-1).size(),v.charAt(i) - 'a'));
            }
        }
        for (point p:
                start) {
            pathfind(p);
        }
        System.out.println(end.min);
    }
    public static void pathfind(point current){
        for (int i = -1; i < 2; i+=2) {
            point x;
            if (i + current.x > -1 && i + current.x <map.size()) {
                x = map.get(i + current.x).get(current.y);
                if (x.height - current.height < 2) {
                    if (x.min == -1 || x.min > current.min + 1) {
                        x.min = current.min + 1;
                        pathfind(x);
                    }
                }
            }
            if (i + current.y > -1 && i + current.y <map.get(0).size()) {
                x = map.get(current.x).get(i + current.y);
                if (x.height - current.height < 2) {
                    if (x.min == -1 || x.min > current.min + 1) {
                        x.min = current.min + 1;
                        pathfind(x);
                    }
                }
            }
        }
    }

    public static class point{
        int x;
        int y;
        int min = -1;
        int height;
        public point(int x, int y, int height){
            this.x=x;
            this.y=y;
            this.height = height;
        }
    }
}
