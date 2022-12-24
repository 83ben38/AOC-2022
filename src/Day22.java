import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day22 {
    public static void start(Scanner s) {
        ArrayList<ArrayList<Integer>> map = new ArrayList<>();
        ArrayList<ArrayList<tile>>[] tiles = new ArrayList[]{new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};
        //read file (init map)
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
        //init tiles
        {
            for (int i = 50; i < 100; i++) {
                tiles[0].add(new ArrayList<>());
                for (int j = 0; j < 50; j++) {
                    tile n = new tile(i, j);
                    n.full = map.get(j).get(i) == 2;
                    tiles[0].get(tiles[0].size() - 1).add(n);
                }
            }
            for (int i = 100; i < 150; i++) {
                tiles[1].add(new ArrayList<>());
                for (int j = 0; j < 50; j++) {
                    tile n = new tile(i, j);
                    n.full = map.get(j).get(i) == 2;
                    tiles[1].get(tiles[1].size() - 1).add(n);
                }
            }
            for (int i = 50; i < 100; i++) {
                tiles[2].add(new ArrayList<>());
                for (int j = 50; j < 100; j++) {
                    tile n = new tile(i, j);
                    n.full = map.get(j).get(i) == 2;
                    tiles[2].get(tiles[2].size() - 1).add(n);
                }
            }
            for (int i = 50; i < 100; i++) {
                tiles[3].add(new ArrayList<>());
                for (int j = 100; j < 150; j++) {
                    tile n = new tile(i, j);
                    n.full = map.get(j).get(i) == 2;
                    tiles[3].get(tiles[3].size() - 1).add(n);
                }
            }
            for (int i = 0; i < 50; i++) {
                tiles[4].add(new ArrayList<>());
                for (int j = 100; j < 150; j++) {
                    tile n = new tile(i, j);
                    n.full = map.get(j).get(i) == 2;
                    tiles[4].get(tiles[4].size() - 1).add(n);
                }
            }
            for (int i = 0; i < 50; i++) {
                tiles[5].add(new ArrayList<>());
                for (int j = 150; j < 200; j++) {
                    tile n = new tile(i, j);
                    n.full = map.get(j).get(i) == 2;
                    tiles[5].get(tiles[5].size() - 1).add(n);
                }
            }
        }

        String instructions = s.nextLine();
        int direction = 1;
        tile on = tiles[0].get(0).get(0);
        String currentNum = "";
        while (instructions.length() > 0) {
            if (instructions.charAt(0) >= '0' && instructions.charAt(0) <= '9') {
                currentNum += instructions.charAt(0);
                instructions = instructions.substring(1);
            } else if (!currentNum.equals("")) {
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
        int[] directions = new int[]{0,1,2,3};
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
                return east.getTile(move-1,directions[0]);
            }
            if (direction == 1){
                if (south.full){
                    return this;
                }
                return south.getTile(move-1,directions[1]);
            }
            if (direction == 2){
                if (west.full){
                    return this;
                }
                return west.getTile(move-1,directions[2]);
            }
            if(direction == 3) {
                if (north.full) {
                    return this;
                }
                return north.getTile(move - 1, directions[3]);
            }
            return null;
        }
    }

    static void printTilesToFile(ArrayList<ArrayList<tile>>[] tiles) throws IOException {
        File f = new File("./debug.txt");
        f.delete();
        f.createNewFile();
        FileWriter myWriter = new FileWriter("./debug.txt");
        for (ArrayList<ArrayList<tile>> d: tiles){
            for (ArrayList<tile> row : d) {
                for (tile t : row) {
                    myWriter.write(t == null ? " " : t.full ? "#" : t.visited);
                }
                myWriter.write("\n");
            }
            myWriter.write("\n");
        }
        myWriter.close();
    }


}
