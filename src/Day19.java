import java.util.ArrayList;
import java.util.Scanner;

public class Day19 {

    public static void start(Scanner s){
        ArrayList<blueprint> blueprints = new ArrayList<>();
        while (s.hasNext()){
            blueprint current = new blueprint();
            s.next();
            String n = s.next();
            current.blueprintNumber = Integer.parseInt(n.substring(0,n.length()-1));
            next(s,4);
            current.oreCost = s.nextInt();
            next(s,5);
            current.clayCost = s.nextInt();
            next(s,5);
            current.obsCost1 = s.nextInt();
            next(s,2);
            current.obsCost2 = s.nextInt();
            next(s,5);
            current.geoCost1 = s.nextInt();
            next(s,2);
            current.geoCost2 = s.nextInt();
            s.next();
            blueprints.add(current);
        }
        int total = 1;
        for (int i = 0; i < blueprints.size(); i++) {
            total *= blueprints.get(i).getNumber();
            total /= blueprints.get(i).blueprintNumber;
            //System.out.println(blueprints.get(i).getNumber());
        }
        System.out.println(total);
    }
    public static void next(Scanner s, int times){
        for (int i = 0; i < times; i++) {
            s.next();
        }
    }

    public static class blueprint{
        int blueprintNumber;
        int oreCost;
        int clayCost;
        int obsCost1, obsCost2;
        int geoCost1, geoCost2;
        public int getNumber(){
            return getBest(1,0,0,0,1,0,0,0)*blueprintNumber;
        }
        public int getBest(int minute, int ore, int clay, int obsidian, int oreBot, int clayBot, int obsBot, int geoBot){
            if (minute == 32){
                return geoBot;
            }
            int best = 0;
            /*int aOre = ore/oreCost;
            for (int i = 0; i <= aOre; i++) {
                int tempOre1 = ore - i * oreCost;
                int aClay = tempOre1 / clayCost;
                for (int j = 0; j <= aClay; j++) {
                    int tempOre2 = tempOre1 - j * clayCost;
                    int aObs = Math.min(tempOre2 / obsCost1, clay / obsCost2);
                    for (int k = 0; k <= aObs; k++) {
                        int tempOre3 = tempOre2 - k * obsCost1;
                        int tempClay = clay - k * obsCost2;
                        int aGeo = Math.min(tempOre3 / geoCost1, obsidian / geoCost2);
                        for (int l = 0; l <= aGeo; l++) {
                            int tempObs = obsidian - l * geoCost2;
                            int tempOre4 = tempOre3 - l * geoCost1;
                            int best2 = getBest(minute + 1, tempOre4+oreBot, tempClay+clayBot, tempObs+obsBot, oreBot + i, clayBot + j, obsBot + k, geoBot + l);
                            if (best2 > best) {
                                            best = best2;
                                        }
                        }

                    }

                }
            }*/
            boolean aOre = ore >= oreCost && (oreBot < clayCost || (oreBot*(geoCost2-obsBot) + ore < obsCost1*(geoCost2-obsBot)) || (oreBot*(32-minute) + ore < geoCost1*(32-minute)));
            boolean aClay = ore >= clayCost && (clayBot < obsCost2) && (obsBot*(32-minute) + obsidian < geoCost2*(32-minute)) && (clayBot*(geoCost2-obsBot) + clay < obsCost2*(geoCost2-obsBot));
            boolean aObs = ore >= obsCost1 && clay >= obsCost2 && (obsBot*(32-minute) + obsidian < geoCost2*(32-minute));
            boolean aGeo = ore >= geoCost1 && obsidian >= geoCost2;
            if (aGeo){
                return getBest(minute+1,ore-geoCost1+oreBot,clay+clayBot,obsidian-geoCost2+obsBot,oreBot,clayBot,obsBot,geoBot+1)+geoBot;
            }
            if (aOre){
                int best2 = getBest(minute+1,ore-oreCost+oreBot,clay+clayBot,obsidian+obsBot,oreBot+1,clayBot,obsBot,geoBot);
                if (best2 > best){
                    best = best2;
                }
            }
            if (aClay){
                int best2 = getBest(minute+1,ore-clayCost+oreBot,clay+clayBot,obsidian+obsBot,oreBot,clayBot+1,obsBot,geoBot);
                if (best2 > best){
                    best = best2;
                }
            }
            if (aObs){
                int best2 = getBest(minute+1,ore-obsCost1+oreBot,clay-obsCost2+clayBot,obsidian+obsBot,oreBot,clayBot,obsBot+1,geoBot);
                if (best2 > best){
                    best = best2;
                }
            }

            int best2 = getBest(minute + 1, ore + oreBot, clay + clayBot, obsidian + obsBot, oreBot, clayBot, obsBot, geoBot);
            if (best2 > best){
                best = best2;
            }
            return best + geoBot;
        }
    }
}
