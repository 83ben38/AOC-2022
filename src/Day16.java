import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Day16 {
    static HashMap<String, valve> map = new HashMap<>();
    static int time = 1;
    public static void start(Scanner s){
        time = 1;
        map = new HashMap<>();
        int total = 0;
        while (s.hasNextLine()){
            s.next();
            String v = s.next();
            s.next();
            s.next();
            String t = s.next();
            valve m = new valve(Integer.parseInt(t.substring(5,t.length()-1)),v);
            for (int i = 0; i < 4; i++) {
                s.next();
            }
            String p = s.nextLine().substring(1);
            while (p.length() > 2){
                m.tunnels.add(p.substring(0,2));
                p = p.substring(4);
            }
            m.tunnels.add(p.substring(0,2));
            map.put(m.name,m);
        }
        valve current = map.get("AA");
        while (time <= 30){
            if (current.findBest(current) != "") {
                valve v = map.get(current.findBest(current));
                time += v.distance + 1;
                total += (31 - time) * v.flowRate;
                v.open = true;
                current = v;
            }
            else{
                time = 31;
            }
        }
        ArrayList<valve> possible = new ArrayList<>();
        for (valve v: map.values()) {
            if (v.flowRate > 0){
                possible.add(v);
                v.open = false;
            }
        }
        System.out.println(getBestTime(0,possible,map.get("AA")));
        System.out.println(total);
    }

    public static int getBestTime(int time, ArrayList<valve> possible, valve prev){
        if (time > 26){
            return 0;
        }
        int best = 0;
        for (valve v : possible) {
            if (!v.open) {
                v.open = true;
                for (valve d: map.values()) {
                    d.distance = 999;
                }
                prev.distance(-1);
                int futureTime = (v.distance+time + 1);
                int d = ((26-futureTime)*v.flowRate) + getBestTime(futureTime, possible, v);
                if (d > best){
                    best = d;
                }
                v.open = false;
            }
        }
        return best;
    }
    public static class valve{
        String name;
        int flowRate;
        boolean open = false;
        boolean checking = false;
        int distance;
        ArrayList<String> tunnels = new ArrayList<>();
        public valve(int rate, String word){
            name = word;
            flowRate = rate;
        }
        public void distance(int distanceC){
            if (distanceC+1 < distance) {
                distance = distanceC + 1;
                for (String d : tunnels) {
                    map.get(d).distance(distance);
                }
            }
        }
        public String findBest(valve v){
            for (valve d: map.values()) {
                d.distance = 999;
            }
            v.distance(-1);
            int best = 0;
            String bestvalve = "";
            for (valve d: map.values()) {
                if (!d.open && (31-(d.distance+time + 1))*d.flowRate > best){
                    best = (31-(d.distance+time + 1))*d.flowRate;
                    bestvalve = d.name;
                }
            }
            return bestvalve;
        }
    }
}
