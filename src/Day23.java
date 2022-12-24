import java.util.ArrayList;
import java.util.Scanner;

public class Day23 {

    public static boolean elfMoved = true;
    public static void start(Scanner s){
        ArrayList<space> elves = new ArrayList<>();
        int i = 0;
        while (s.hasNextLine()){
            String v = s.nextLine();
            for (int j = 0; j < v.length(); j++) {
                if (v.charAt(j) == '#') {
                    elves.add(new space(j, i));
                }
            }
            i++;
        }
        int priority = 0;
        for (i = 0; true; i++) {
            boolean moved = false;
            for (space elf: elves) {
                elf.setMoving(priority,elves);
            }
            for (space elf: elves) {
                if (elf.move(elves)){
                    moved = true;
                }
            }
            priority++;
            if (priority == 4){
                priority = 0;
            }
            if (!moved) {
                break;
            }
        }
        System.out.println(i);
        int minX = 100;
        int maxX = 0;
        int minY = 100;
        int maxY = 0;
        for (space elf: elves) {
            if (elf.x < minX){
                minX = elf.x;
            }
            if (elf.x > maxX){
                maxX = elf.x;
            }
            if (elf.y < minY){
                minY = elf.y;
            }
            if (elf.y > maxY){
                maxY = elf.y;
            }
        }
        System.out.println(minX + "," + maxX + "," + minY + "," + maxY);
        maxX++;
        maxY++;
        int total = (maxX-minX)*(maxY-minY)-elves.size();
        System.out.println(total);
    }
    public static void printSquare(ArrayList<space> elves){
        int minX = 100;
        int maxX = 0;
        int minY = 100;
        int maxY = 0;
        for (space elf: elves) {
            if (elf.x < minX){
                minX = elf.x;
            }
            if (elf.x > maxX){
                maxX = elf.x;
            }
            if (elf.y < minY){
                minY = elf.y;
            }
            if (elf.y > maxY){
                maxY = elf.y;
            }
        }
        ArrayList<StringBuilder> v = new ArrayList<>();
        for (int i = minY; i <= maxY; i++) {
            v.add(new StringBuilder(""));
            for (int j = minX; j <= maxX; j++) {
                v.set(v.size()-1,v.get(v.size()-1).append("."));
            }
        }
        for (space elf: elves) {
            v.get(elf.y-minY).setCharAt(elf.x-minX,elf.moving[0]-elf.x == 1 ? '>' : elf.moving[0]-elf.x == -1 ? '<' : elf.moving[1]-elf.y == 1 ? '!' : elf.moving[1]-elf.y == -1 ? '^': '#');
        }
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
        System.out.println();
    }
    public static class space{
        int[] moving;
        int x;
        int y;
        public space(int x, int y){
            this.x=x;
            this.y=y;
        }



        public void setMoving(int priority, ArrayList<space> elves){
            moving = new int[]{x,y};
            boolean north = true;
            boolean south = true;
            boolean west = true;
            boolean east = true;
            for (int i = 0; i < elves.size(); i++) {
                space t = elves.get(i);
                if (t != this){
                    if (y-t.y==1 && Math.abs(x-t.x) < 2){
                        north = false;
                    }
                    if (t.y-y==1 && Math.abs(x-t.x) < 2){
                        south = false;
                    }
                    if (x-t.x==1 && Math.abs(y-t.y) < 2){
                        west = false;
                    }
                    if (t.x-x==1 && Math.abs(y-t.y) < 2){
                        east = false;
                    }
                }
            }
            if (north && south && west && east){
                return;
            }
            for (int i = priority; i < 4; i++) {
                if (i==0 && north){
                    moving = new int[]{x,y-1};
                    return;
                }
                if (i==1 && south){
                    moving = new int[]{x,y+1};
                    return;
                }
                if (i==2 && west){
                    moving = new int[]{x-1,y};
                    return;
                }
                if (i==3 && east){
                    moving = new int[]{x+1,y};
                    return;
                }
            }
            for (int i = 0; i < priority; i++) {
                if (i==0 && north){
                    moving = new int[]{x,y-1};
                    return;
                }
                if (i==1 && south){
                    moving = new int[]{x,y+1};
                    return;
                }
                if (i==2 && west){
                    moving = new int[]{x-1,y};
                    return;
                }
                if (i==3 && east){
                    moving = new int[]{x+1,y};
                    return;
                }
            }
        }

        public boolean move(ArrayList<space> elves){
            for (space elf: elves) {
                if (elf != this && elf.moving[0] == moving[0] && elf.moving[1] == moving[1]){
                    return false;
                }
            }
            if (x == moving[0] && y == moving[1]){
                return false;
            }
            x = moving[0];
            y = moving[1];
            return true;
        }
    }
}
