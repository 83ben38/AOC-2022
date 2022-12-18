import java.util.ArrayList;
import java.util.Scanner;

public class Day18 {
    public static void start(Scanner s){
        ArrayList<ArrayList<ArrayList<Boolean>>> cube = new ArrayList<>();
        int[] dimensions = new int[]{0,0,0};
        while (s.hasNextLine()){
            String v = s.next();
            int x = Integer.parseInt(v.substring(0,v.indexOf(",")))+1;
            v = v.substring(v.indexOf(",") + 1);
            int y = Integer.parseInt(v.substring(0,v.indexOf(",")))+1;
            int z = Integer.parseInt(v.substring(v.indexOf(",") + 1))+1;
            if (dimensions[0] < x+2){
                dimensions[0] = x+2;
                for (int i = cube.size(); i < dimensions[0]; i++) {
                    cube.add(new ArrayList<>());
                    for (int j = 0; j < dimensions[1]; j++) {
                        cube.get(cube.size()-1).add(new ArrayList<>());
                        for (int k = 0; k < dimensions[2]; k++) {
                            cube.get(cube.size()-1).get(cube.get(cube.size()-1).size()-1).add(false);
                        }
                    }
                }
            }
            if (dimensions[1] < y+2){
                dimensions[1] = y+2;
                for (int i = 0; i < dimensions[0]; i++) {
                    for (int j = cube.get(i).size(); j < dimensions[1]; j++) {
                        cube.get(i).add(new ArrayList<>());
                        for (int k = 0; k < dimensions[2]; k++) {
                            cube.get(i).get(cube.get(i).size()-1).add(false);
                        }
                    }
                }
            }
            if (dimensions[2] < z+2){
                dimensions[2] = z+2;
                for (int i = 0; i < dimensions[0]; i++) {
                    for (int j = 0; j < dimensions[1]; j++) {
                        for (int k = cube.get(i).get(j).size(); k < dimensions[2]; k++) {
                            cube.get(i).get(j).add(false);
                        }
                    }
                }
            }
            cube.get(x).get(y).set(z,true);
        }
        int total = 0;
        /*for (int i = 0; i < dimensions[0]; i++) {
            for (int j = 0; j < dimensions[1]; j++) {
                for (int k = 0; k < dimensions[2]; k++) {
                    if (!cube.get(i).get(j).get(k)){
                        for (int l = -1; l < 2; l+=2) {
                            if (i+l >=0 && i+l < dimensions[0] &&cube.get(i+l).get(j).get(k)){
                                total++;
                                break;
                            }
                            if (j+l >=0 && j+l < dimensions[1] &&cube.get(i).get(j+l).get(k)){
                                total++;
                                break;
                            }
                            if (k+l >=0 && k+l < dimensions[2] &&cube.get(i).get(j).get(k+l)){
                                total++;
                                break;
                            }
                        }
                    }
                }
            }
        }*/
        for (int i = 0; i < dimensions[0]; i++) {
            for (int j = 0; j < dimensions[1]; j++) {
                for (int k = 0; k < dimensions[2]; k++) {
                    if (cube.get(i).get(j).get(k)){
                        for (int l = -1; l < 2; l+=2) {
                            if (!cube.get(i+l).get(j).get(k)){
                                if(!isEnclosed(i+l,j,k,cube,new ArrayList<>())) {
                                    total++;
                                }
                            }
                            if (!cube.get(i).get(j+l).get(k)){
                                if(!isEnclosed(i,j+l,k,cube,new ArrayList<>())) {
                                    total++;
                                }
                            }
                            if (!cube.get(i).get(j).get(k+l)){
                                if(!isEnclosed(i,j,k+l,cube,new ArrayList<>())) {
                                    total++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(total);

    }
    public static boolean isEnclosed(int i, int j, int k, ArrayList<ArrayList<ArrayList<Boolean>>> b, ArrayList<int[]> checked){
        checked.add(new int[]{i,j,k});
        for (int l = -1; l < 2; l+=2) {
            if (i+l < 0 || i+l >= b.size()){
                return false;
            }
            if (!b.get(i+l).get(j).get(k)){
                if (!contains(new int[]{i+l,j,k},checked)){
                    if (!isEnclosed(i+l,j,k,b,checked)){
                        return false;
                    }
                }
            }
            if (j+l < 0 || j+l >= b.get(i).size()){
                return false;
            }
            if (!b.get(i).get(j+l).get(k)){
                if (!contains(new int[]{i,j+l,k},checked)){
                    if (!isEnclosed(i,j+l,k,b,checked)){
                        return false;
                    }
                }
            }
            if (k+l < 0 || k+l >= b.get(i).get(j).size()){
                return false;
            }
            if (!b.get(i).get(j).get(k+l)){
                if (!contains(new int[]{i,j,k+l},checked)){
                    if (!isEnclosed(i,j,k+l,b,checked)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean contains(int[] z, ArrayList<int[]> d){
        for (int i = 0; i < d.size(); i++) {
            boolean contains = true;
            for (int j = 0; j < z.length; j++) {
                if (z[j] != d.get(i)[j]){
                    contains = false;
                    break;
                }
            }
            if (contains){
                return true;
            }
        }
        return false;
    }

}
