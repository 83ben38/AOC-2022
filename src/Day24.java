import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Day24 {
    public static int x;
    public static int y;
    public static ArrayList<blizzard> blizzards;
    public static void start(Scanner s){
        blizzards = new ArrayList<>();
        s.nextLine();
        int i = 0;
        while (s.hasNextLine()){
            String v = s.nextLine().substring(1);
            v = v.substring(0,v.length()-1);
            if (v.charAt(1) == '#'){
                break;
            }
            for (int j = 0; j < v.length(); j++) {
                if (v.charAt(j) == '<'){
                    blizzards.add(new blizzard(j,i,2));
                }
                if (v.charAt(j) == '>'){
                    blizzards.add(new blizzard(j,i,3));
                }
                if (v.charAt(j) == '^'){
                    blizzards.add(new blizzard(j,i,0));

                }
                if (v.charAt(j) == 'v'){
                    blizzards.add(new blizzard(j,i,1));
                }
            }
            i++;
            x = v.length();
        }
        y = i;
        HashMap<Integer,int[]> z = new HashMap<>();
        z.put(-x,new int[]{0,-1});
        getBestTimePart3(z,0);
        System.out.println();
    }
    public static int getBestTimePart1(HashMap<Integer, int[]> currentPosition, int time) {
        HashMap<Integer, int[]> futurePosition = new HashMap<>();
        ArrayList<Integer> blizzard = new ArrayList<>();
        for (blizzard b: blizzards) {
            blizzard.add(b.getPosition(time+1));
        }
        for (int[] pos: currentPosition.values()) {
            if (pos[0] < x-1 && pos[1] > -1){
                if (!blizzard.contains((pos[0]+1) + (pos[1]*x))){
                    futurePosition.put(pos[0]+1 + pos[1]*x, new int[]{pos[0]+1,pos[1]});
                }
            }
            if (pos[1] < y-1){
                if (!blizzard.contains((pos[0]) + ((pos[1]+1)*x))){
                    futurePosition.put(pos[0] + (pos[1]+1)*x, new int[]{pos[0],pos[1]+1});
                }
            }
            if (pos[0] > 0 && pos[1] < y){
                if (!blizzard.contains((pos[0]-1) + (pos[1]*x))){
                    futurePosition.put(pos[0]-1 + pos[1]*x, new int[]{pos[0]-1,pos[1]});
                }
            }
            if (pos[1] > 0){
                if (!blizzard.contains((pos[0]) + ((pos[1]-1)*x))){
                    futurePosition.put(pos[0] + (pos[1]-1)*x, new int[]{pos[0],pos[1]-1});
                }
            }
            if (true){
                if (!blizzard.contains((pos[0]) + ((pos[1])*x))){
                    futurePosition.put(pos[0] + (pos[1])*x, new int[]{pos[0],pos[1]});
                }
            }
        }
        if (futurePosition.containsKey(x-1 + (y-1)*x)){
            System.out.println(time+2);
            return time+1;
        }
        return getBestTimePart1(futurePosition,time+1);
    }
    public static int getBestTimePart2(HashMap<Integer, int[]> currentPosition, int time) {
        HashMap<Integer, int[]> futurePosition = new HashMap<>();
        ArrayList<Integer> blizzard = new ArrayList<>();
        for (blizzard b: blizzards) {
            blizzard.add(b.getPosition(time+1));
        }
        for (int[] pos: currentPosition.values()) {
            if (pos[0] < x-1 && pos[1] > -1){
                if (!blizzard.contains((pos[0]+1) + (pos[1]*x))){
                    futurePosition.put(pos[0]+1 + pos[1]*x, new int[]{pos[0]+1,pos[1]});
                }
            }
            if (pos[1] < y-1){
                if (!blizzard.contains((pos[0]) + ((pos[1]+1)*x))){
                    futurePosition.put(pos[0] + (pos[1]+1)*x, new int[]{pos[0],pos[1]+1});
                }
            }
            if (pos[0] > 0 && pos[1] < y){
                if (!blizzard.contains((pos[0]-1) + (pos[1]*x))){
                    futurePosition.put(pos[0]-1 + pos[1]*x, new int[]{pos[0]-1,pos[1]});
                }
            }
            if (pos[1] > 0){
                if (!blizzard.contains((pos[0]) + ((pos[1]-1)*x))){
                    futurePosition.put(pos[0] + (pos[1]-1)*x, new int[]{pos[0],pos[1]-1});
                }
            }
            if (true){
                if (!blizzard.contains((pos[0]) + ((pos[1])*x))){
                    futurePosition.put(pos[0] + (pos[1])*x, new int[]{pos[0],pos[1]});
                }
            }
        }
        if (futurePosition.containsKey(0)){
            System.out.println(time+2);
            HashMap<Integer,int[]> z = new HashMap<>();
            z.put(-x,new int[]{0,-1});
            return getBestTimePart1(z,time+2);
        }
        return getBestTimePart2(futurePosition,time+1);
    }
    public static int getBestTimePart3(HashMap<Integer, int[]> currentPosition, int time) {
        HashMap<Integer, int[]> futurePosition = new HashMap<>();
        ArrayList<Integer> blizzard = new ArrayList<>();
        for (blizzard b: blizzards) {
            blizzard.add(b.getPosition(time+1));
        }
        for (int[] pos: currentPosition.values()) {
            if (pos[0] < x-1 && pos[1] > -1){
                if (!blizzard.contains((pos[0]+1) + (pos[1]*x))){
                    futurePosition.put(pos[0]+1 + pos[1]*x, new int[]{pos[0]+1,pos[1]});
                }
            }
            if (pos[1] < y-1){
                if (!blizzard.contains((pos[0]) + ((pos[1]+1)*x))){
                    futurePosition.put(pos[0] + (pos[1]+1)*x, new int[]{pos[0],pos[1]+1});
                }
            }
            if (pos[0] > 0 && pos[1] < y){
                if (!blizzard.contains((pos[0]-1) + (pos[1]*x))){
                    futurePosition.put(pos[0]-1 + pos[1]*x, new int[]{pos[0]-1,pos[1]});
                }
            }
            if (pos[1] > 0){
                if (!blizzard.contains((pos[0]) + ((pos[1]-1)*x))){
                    futurePosition.put(pos[0] + (pos[1]-1)*x, new int[]{pos[0],pos[1]-1});
                }
            }
            if (true){
                if (!blizzard.contains((pos[0]) + ((pos[1])*x))){
                    futurePosition.put(pos[0] + (pos[1])*x, new int[]{pos[0],pos[1]});
                }
            }
        }
        if (futurePosition.containsKey(x-1 + (y-1)*x)){
            System.out.println(time+2);
            HashMap<Integer,int[]> z = new HashMap<>();
            z.put(x-1 + (y*x),new int[]{x-1,y});
            return getBestTimePart2(z,time+2);
        }
        return getBestTimePart3(futurePosition,time+1);
    }
    public static void printBlizzard(ArrayList<Integer> blizzards){
        ArrayList<int[]> blizzard = new ArrayList<>();
        for (Integer g: blizzards) {
            blizzard.add(new int[]{g%x,g/x});
        }
        String v = "";
        for (int i = 0; i < y; i++) {
            v += "\n";
            for (int j = 0; j < x; j++) {
                boolean added = false;
                for (int[] s: blizzard) {
                    if (s[0] == j && s[1] == i){
                        v += "#";
                        added =true;
                        break;
                    }
                }
                if (!added) {
                    v += ".";
                }
            }
        }
        System.out.println(v);

    }
    public static class blizzard{
        int x;
        int y;
        int direction;
        public int getPosition(int time){
            if (direction == 0){
                int z = y-time;
                while (z < 0){
                    z += Day24.y;
                }
                return x + z*Day24.x;
            }
            if (direction == 1){
                return x + ((y+time)%Day24.y)*Day24.x;
            }
            if (direction == 2){
                int z = x-time;
                while (z < 0){
                    z += Day24.x;
                }
                return z + y*Day24.x;
            }
            return (x+time)%Day24.x + (Day24.x*y);
        }
        public blizzard(int x, int y, int direction){
            this.x=x;
            this.y=y;
            this.direction=direction;
        }
    }
}
