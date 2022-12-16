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
        for (valve r: map.values()) {
            for (valve d : map.values()) {
                d.distance = 999;
            }
            r.distance(-1);
            for (valve d: map.values()) {
                d.distances.put(r.name,d.distance);
            }
        }
        ArrayList<valve> possible = new ArrayList<>();
        for (valve v: map.values()) {
            if (v.flowRate > 0){
                possible.add(v);
                v.open = false;
            }
        }
        System.out.println(getBestTime(0,0,possible,map.get("AA"), map.get("AA")));
    }

    public static int getBestTime(int time, int time2, ArrayList<valve> possible, valve prev, valve prev2){
        if (time > 26 && time2 > 26){
            return 0;
        }
        if (time2 > 26) {
            int best = 0;
            for (valve v : possible) {
                if (!v.open) {
                    v.open = true;
                    int futureTime = (v.distances.get(prev.name) + time + 1);
                    int d = ((26 - futureTime) * v.flowRate) + getBestTime(futureTime, time2, possible, v, prev2);
                    if (d > best) {
                        best = d;
                    }
                    v.open = false;
                }
            }
            return best;
        }
        else if (time > 26) {
            int best = 0;
            for (valve v : possible) {
                if (!v.open) {
                    v.open = true;
                    int futureTime = (v.distances.get(prev2.name) + time2 + 1);
                    int d = ((26 - futureTime) * v.flowRate) + getBestTime(time, futureTime, possible, prev, v);
                    if (d > best) {
                        best = d;
                    }
                    v.open = false;
                }
            }
            return best;
        }
        else{
            int best = 0;
            for (valve v: possible) {
                if (!v.open) {
                    v.open = true;
                    for (valve d : possible) {
                        if (!d.open){
                            d.open = true;
                            int futureTime1 = (v.distances.get(prev.name) + time + 1);
                            int futureTime2 = (d.distances.get(prev2.name) + time2 + 1);
                            int p = ((26 - futureTime1) * v.flowRate) + ((26 - futureTime2) * d.flowRate) + getBestTime(futureTime1,futureTime2,possible,v,d);
                            if (p > best){
                                best = p;
                            }
                            d.open = false;
                        }
                    }
                    v.open = false;
                }
            }
            return best;
        }
    }
    public static class valve{
        String name;
        int flowRate;
        boolean open = false;
        int distance;
        HashMap<String, Integer> distances = new HashMap<>();
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
