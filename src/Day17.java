import java.util.ArrayList;

public class Day17 {
    public static void start(String d) {
        ArrayList<rock> rockTypes = new ArrayList<>();
        ArrayList<boolean[]> walls = new ArrayList<>();
        setRockTypes(rockTypes);
        boolean[] instructions = new boolean[d.length()];
        for (int i = 0; i < d.length(); i++) {
            instructions[i] = d.charAt(i) == '<';
            if (d.charAt(i) != '<' && d.charAt(i) != '>'){
                System.out.println(d.charAt(i) + "");
            }
        }
        int current = 0;
        int total = 0;
        int instruction = 0;
        long i;
        for (i = 0; i < 5245+1000; i++) {
            rock type = rockTypes.get(current);
            if (instruction == 27 && current == 0){
                System.out.println(i + "," + total);
            }
            else{
                type.had.add(instruction);
            }
            while (walls.size() < total + 3 + type.ySize){
                walls.add(new boolean[7]);
            }
            type.y = total + 3;
            type.x = 2;
            while (true){
                boolean blocked = false;
                if (instructions[instruction]){
                    for (int j = 0; j < type.ySize; j++) {
                        if (type.x   < 1 || walls.get(type.y + j)[type.x - type.checks[0][j]]){
                            blocked = true;
                            break;
                        }
                    }
                    if(!blocked){
                        type.x--;
                    }
                }
                else{
                    for (int j = 0; j < type.ySize; j++) {
                        if ((type.x + type.xSize) == 7 || walls.get(type.y + j)[type.checks[2][j] + type.x]){
                            blocked = true;
                            break;
                        }
                    }
                    if(!blocked){
                        type.x++;
                    }
                }
                instruction++;
                if (instruction == instructions.length){
                    instruction = 0;
                }
                blocked = false;
                for (int j = 0; j < type.xSize; j++) {
                    if (type.y == 0 || walls.get(type.y - type.checks[1][j])[type.x + j]) {
                        blocked = true;
                        break;
                    }
                }
                if (blocked){
                    break;
                }
                else{
                        type.y--;
                    }
            }
            for (int j = 0; j < type.xSize; j++) {
                for (int k = 0; k < type.ySize; k++) {
                    if(type.full[j][k]) {
                        walls.get(type.y + k)[type.x + j] = type.full[j][k];
                    }
                }
            }

            current++;
            if (current == rockTypes.size()){
                current = 0;
            }
            while (contains(walls.get(total))){
                total++;
            }
            /*for (int p = walls.size()-1; p >= 0; p--) {
                String v = "";
                for (boolean z: walls.get(p)) {
                    v += z ? "#" : ".";
                }
                System.out.println(v);
            }
            System.out.println();*/
        }
        System.out.println(total);
        /*for (int i = walls.size()-1; i >= 0; i--) {
            String v = "";
            for (boolean z: walls.get(i)) {
                v += z ? "#" : ".";
            }
            System.out.println(v);
        }*/
    }
    public static boolean contains(boolean[] b){
        for (int i = 0; i < b.length; i++) {
            if (b[i]){
                return true;
            }
        }
        return false;
    }
    public static void setRockTypes(ArrayList<rock> types){
        rock r = new rock(4,1);
        for (int i = 0; i < 4; i++) {
            r.full[i][0] = true;
        }
        r.checks = new int[][]{{1},{1,1,1,1},{4}};
        types.add(r);
        r = new rock(3,3);
        r.full = new boolean[][]{{false,true,false},{true,true,true},{false,true,false}};
        r.checks = new int[][]{{0,1,0},{0,1,0},{2,3,2}};
        types.add(r);
        r = new rock(3,3);
        r.full = new boolean[][]{{true,false,false},{true,false,false},{true,true,true}};
        r.checks = new int[][]{{1,-1,-1},{1,1,1},{3,3,3}};
        types.add(r);
        r = new rock(1,4);
        for (int i = 0; i < 4; i++) {
            r.full[0][i] = true;
        }
        r.checks = new int[][]{{1,1,1,1},{1},{1,1,1,1}};
        types.add(r);
        r = new rock(2,2);
        r.full = new boolean[][]{{true, true}, {true, true}};
        r.checks = new int[][]{{1,1},{1,1},{2,2}};
        types.add(r);
    }

    public static class rock{
        public int xSize, ySize;
        public boolean[][] full;
        int[][] checks;

        public ArrayList<Integer> had = new ArrayList<>();
        int x,y;
        public rock(int xSize, int ySize){
            this.xSize = xSize;
            this.ySize = ySize;
            full = new boolean[xSize][ySize];
        }
    }
}
