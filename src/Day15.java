import java.util.ArrayList;
import java.util.Scanner;

public class Day15 {
    public static void start(Scanner s, int goal){
        ArrayList<row> filled = new ArrayList<>();
        ArrayList<Long> beacons = new ArrayList<>();
        while (s.hasNextLine()){
            s.next();
            s.next();
            String sensorX = s.next();
            String sensorY = s.next();
            for (int i = 0; i < 4; i++) {
                s.next();
            }
            String beaconX = s.next();
            String beaconY = s.next();
            sensorX = sensorX.substring(2);
            sensorX = sensorX.substring(0,sensorX.length()-1);
            sensorY = sensorY.substring(2);
            sensorY = sensorY.substring(0,sensorY.length()-1);
            beaconX = beaconX.substring(2);
            beaconX = beaconX.substring(0,beaconX.length()-1);
            beaconY = beaconY.substring(2);
            long x1 = Long.parseLong(sensorX);
            long x2 = Long.parseLong(beaconX);
            long y1 = Long.parseLong(sensorY);
            long y2 = Long.parseLong(beaconY);
            long distance = (Math.abs(x1-x2) + Math.abs(y1-y2));
            long amt = distance - Math.abs(goal-y1);
            if (amt > 0) {
                row z = new row(x1 - amt, x1 + amt);
                filled.add(z);
            }
            if (y2 ==goal && !beacons.contains(x2)){
                beacons.add(x2);
            }
        }

        ArrayList<row> realFilled = new ArrayList<>();
        for (int i = 0; i < filled.size(); i++) {
            boolean add = true;
            row z = filled.get(i);
            for (row d: filled) {
                if (z != d) {
                    if (z.start == d.start && z.end == d.end){
                        continue;
                    }
                    // if z is contained inside of d
                    if (z.start >= d.start && z.end <= d.end) {
                        add = false;
                        break;
                    }
                    // if they overlap partially
                    if (z.start <= d.start && z.end <= d.end && z.end >= d.start) {
                        z.end = d.end;
                    }
                    if (d.start <= z.start  && d.end >= z.start) {
                        z.start = d.start;
                    }
                }
            }
            if (add){
                realFilled.add(z);
            }
        }
        filled = realFilled;
        realFilled = new ArrayList<>();
        for (int i = 0; i < filled.size(); i++) {
            boolean add = true;
            row z = filled.get(i);
            for (row d: filled) {
                if (z != d) {
                    // if z is contained inside of d
                    if (z.start >= d.start && z.end <= d.end) {
                        add = false;
                        break;
                    }
                    // if they overlap partially
                    if (z.start <= d.start && z.end <= d.end && z.end >= d.start) {
                        z.end = d.end;
                    }
                    if (d.start <= z.start  && d.end >= z.start) {
                        z.start = d.start;
                    }
                }
            }
            if (add){
                realFilled.add(z);
            }
        }
        long print = 0;
        while (realFilled.size() > 0) {
            row d = realFilled.remove(0);
            if (realFilled.contains(d)){
                continue;
            }
            System.out.println(d.start + "," + d.end);
            print += (d.end-d.start);
        }
        System.out.println(print);
    }
    public static class row {
        long start;
        long end;
        public row(long st, long ed){
            start = st;
            end = ed;
        }
    }

    public static void start2(Scanner s, int max) {
        ArrayList<scanner> z = new ArrayList<>();
        while (s.hasNextLine()){
            s.next();
            s.next();
            String sensorX = s.next();
            String sensorY = s.next();
            for (int i = 0; i < 4; i++) {
                s.next();
            }
            String beaconX = s.next();
            String beaconY = s.next();
            sensorX = sensorX.substring(2);
            sensorX = sensorX.substring(0,sensorX.length()-1);
            sensorY = sensorY.substring(2);
            sensorY = sensorY.substring(0,sensorY.length()-1);
            beaconX = beaconX.substring(2);
            beaconX = beaconX.substring(0,beaconX.length()-1);
            beaconY = beaconY.substring(2);
            long x1 = Long.parseLong(sensorX);
            long x2 = Long.parseLong(beaconX);
            long y1 = Long.parseLong(sensorY);
            long y2 = Long.parseLong(beaconY);
            long distance = (Math.abs(x1-x2) + Math.abs(y1-y2));
            z.add(new scanner(x1,y1,distance));
        }
        for (int i = 0; i < z.size(); i++) {
            scanner v = z.get(i);
            for (int k = (int) -v.amt; k <= v.amt; k++) {
                for (int j = -1; j < 2; j += 2) {
                    boolean isConnected = false;
                    int x1 = (int) (v.x + (j*(1+v.amt-Math.abs(k))));
                    int y1 = (int) (v.y + k);
                    if (x1 > 0 && x1 < max && y1 > 0 && y1 < max) {
                        for (scanner d : z) {
                            if (Math.abs(x1 - d.x) + Math.abs(y1 - d.y) <= d.amt) {
                                isConnected = true;
                                break;
                            }
                        }
                        if (!isConnected) {
                            System.out.println(x1 + "," + y1);
                            System.out.println(((long)x1 * 4000000) + y1);
                        }
                    }
                }
            }
        }
    }
    public static class scanner{
        long x;
        long y;
        long amt;
        public scanner(long x, long y, long amt){
            this.x=x;
            this.y=y;
            this.amt=amt;
        }
    }
}
