import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day22 {
    public static void start(Scanner s) {
        ArrayList<ArrayList<Integer>> map = new ArrayList<>();
        ArrayList<ArrayList<tile>> tiles = new ArrayList<>();
        while (s.hasNextLine()) {
            String v = s.nextLine();
            if (v.equalsIgnoreCase("")) {
                break;
            }
            map.add(new ArrayList<>());
            for (int i = 0; i < v.length(); i++) {
                map.get(map.size() - 1).add(v.charAt(i) == ' ' ? 0 : v.charAt(i) == '.' ? 1 : 2);
            }

        }
        for (int i = 0; i < map.size(); i++) {
            tiles.add(new ArrayList<>());
            for (int j = 0; j < map.get(i).size(); j++) {
                if (map.get(i).get(j) != 0) {
                    tile n = new tile(i, j);
                    n.full = map.get(i).get(j) == 2;
                    tiles.get(i).add(n);
                } else {
                    tiles.get(i).add(null);
                }
            }
        }
        for (int i = 0; i < map.size(); i++) {
            for (int j = 0; j < map.get(i).size(); j++) {
                tile n = tiles.get(i).get(j);
                if (n != null) {
                    int north = i - 1;
                    int south = i + 1;
                    int east = j + 1;
                    int west = j - 1;
                    while (north < 0 || j >= tiles.get(north).size() || tiles.get(north).get(j) == null) {
                        if (north < 0) {
                            north = map.size()-1;
                        } else {
                            north--;
                        }
                    }
                    n.north = tiles.get(north).get(j);
                    while (south >= map.size() || j >= map.get(south).size() || map.get(south).get(j) == 0) {
                        if (south >= map.size()) {
                            south = 0;
                        } else {
                            south++;
                        }
                    }
                    n.south = tiles.get(south).get(j);
                    while (west < 0 || tiles.get(i).get(west) == null) {
                        if (west < 0) {
                            west = map.get(i).size()-1;
                        } else {
                            west--;
                        }
                    }
                    n.west = tiles.get(i).get(west);
                    while (east >= map.get(i).size() || map.get(i).get(east) == 0) {
                        if (east >= map.get(i).size()) {
                            east = 0;
                        } else {
                            east++;
                        }
                    }
                    n.east = tiles.get(i).get(east);
                }
            }
        }
        String instructions = s.nextLine();
        int direction = 0;
        tile on = null;
        String currentNum = "";
        for (int i = 0; i < tiles.get(0).size(); i++) {
            if (tiles.get(0).get(i) != null) {
                on = tiles.get(0).get(i);
                break;
            }
        }

        while (instructions.length() > 0) {
            if (instructions.charAt(0) >= '0' && instructions.charAt(0) <= '9') {
                currentNum += instructions.charAt(0);
                instructions = instructions.substring(1);
            } else if (!currentNum.equals("")) {
                tile before = on;
                on = on.getTile(Integer.parseInt(currentNum), direction);
                try {
                    printTilesToFile(tiles);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                currentNum = "";
            } else {
                if (instructions.charAt(0) == 'R') {
                    direction++;
                    if (direction > 3){
                        direction -= 4;
                    }
                } else if (instructions.charAt(0) == 'L') {
                    direction--;
                    if (direction < 0) {
                        direction += 4;
                    }
                }
                instructions = instructions.substring(1);
            }
        }
        System.out.println(on.x + 1);
        System.out.println(on.y + 1);
        System.out.println(direction);
        System.out.println(((on.x + 1) * 1000) + ((on.y + 1) * 4) + (direction));
    }

    public static class tile{
        tile north;
        tile south;
        tile east;
        tile west;
        boolean full;
        String visited = ".";
        int x;
        int y;
        public tile(int x, int y){
            this.x=x;
            this.y=y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }

        public tile getTile(int move, int direction){
            visited = direction == 0 ? ">" : direction == 1 ? "v" : direction == 2 ? "<" : "^";
            if (move == 0){
                return this;
            }
            if (direction == 0){
                if (east.full){
                    return this;
                }
                return east.getTile(move-1,0);
            }
            if (direction == 1){
                if (south.full){
                    return this;
                }
                return south.getTile(move-1,1);
            }
            if (direction == 2){
                if (west.full){
                    return this;
                }
                return west.getTile(move-1,2);
            }
            if(direction == 3) {
                if (north.full) {
                    return this;
                }
                return north.getTile(move - 1, 3);
            }
            return null;
        }
    }

    static void printTilesToFile(ArrayList<ArrayList<tile>> tiles) throws IOException {
        File f = new File("./debug.txt");
        f.delete();
        f.createNewFile();
        FileWriter myWriter = new FileWriter("./debug.txt");
        for (ArrayList<tile> row: tiles) {
            for (tile t : row) {
                myWriter.write(t== null ? " " : t.full ? "#" : t.visited);
            }
            myWriter.write("\n");
        }
        myWriter.close();
    }

}
