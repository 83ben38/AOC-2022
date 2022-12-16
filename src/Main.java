import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Day16.start(new Scanner("Valve AA has flow rate=0; tunnels lead to valves DD, II, BB\n" +
                "Valve BB has flow rate=13; tunnels lead to valves CC, AA\n" +
                "Valve CC has flow rate=2; tunnels lead to valves DD, BB\n" +
                "Valve DD has flow rate=20; tunnels lead to valves CC, AA, EE\n" +
                "Valve EE has flow rate=3; tunnels lead to valves FF, DD\n" +
                "Valve FF has flow rate=0; tunnels lead to valves EE, GG\n" +
                "Valve GG has flow rate=0; tunnels lead to valves FF, HH\n" +
                "Valve HH has flow rate=22; tunnel leads to valve GG\n" +
                "Valve II has flow rate=0; tunnels lead to valves AA, JJ\n" +
                "Valve JJ has flow rate=21; tunnel leads to valve II\n"));
        Day16.start(new Scanner("Valve OJ has flow rate=0; tunnels lead to valves EW, IG\n" +
                "Valve BN has flow rate=0; tunnels lead to valves SA, AA\n" +
                "Valve SA has flow rate=5; tunnels lead to valves QK, LP, ZP, BN, VH\n" +
                "Valve RL has flow rate=21; tunnel leads to valve AM\n" +
                "Valve LR has flow rate=19; tunnel leads to valve XZ\n" +
                "Valve VQ has flow rate=0; tunnels lead to valves OW, IG\n" +
                "Valve ZK has flow rate=0; tunnels lead to valves EW, WC\n" +
                "Valve IG has flow rate=16; tunnels lead to valves OJ, VQ\n" +
                "Valve WC has flow rate=22; tunnels lead to valves VD, ZK\n" +
                "Valve EW has flow rate=18; tunnels lead to valves OJ, ZK\n" +
                "Valve FP has flow rate=8; tunnel leads to valve GB\n" +
                "Valve JF has flow rate=23; tunnel leads to valve VD\n" +
                "Valve BL has flow rate=0; tunnels lead to valves AA, ZD\n" +
                "Valve BZ has flow rate=0; tunnels lead to valves QK, JA\n" +
                "Valve KH has flow rate=0; tunnels lead to valves SJ, FC\n" +
                "Valve FU has flow rate=0; tunnels lead to valves FC, MH\n" +
                "Valve ZP has flow rate=0; tunnels lead to valves SA, FC\n" +
                "Valve DZ has flow rate=0; tunnels lead to valves AA, MH\n" +
                "Valve RI has flow rate=0; tunnels lead to valves LP, MH\n" +
                "Valve AE has flow rate=0; tunnels lead to valves FC, AA\n" +
                "Valve JA has flow rate=4; tunnels lead to valves MM, BZ, JR, ZI, QO\n" +
                "Valve XP has flow rate=0; tunnels lead to valves ZD, ZI\n" +
                "Valve GB has flow rate=0; tunnels lead to valves FP, SJ\n" +
                "Valve AM has flow rate=0; tunnels lead to valves ZD, RL\n" +
                "Valve MH has flow rate=3; tunnels lead to valves VJ, DZ, JR, FU, RI\n" +
                "Valve QK has flow rate=0; tunnels lead to valves BZ, SA\n" +
                "Valve AA has flow rate=0; tunnels lead to valves DZ, CZ, BL, AE, BN\n" +
                "Valve MJ has flow rate=0; tunnels lead to valves VN, VH\n" +
                "Valve QO has flow rate=0; tunnels lead to valves CZ, JA\n" +
                "Valve MM has flow rate=0; tunnels lead to valves FC, JA\n" +
                "Valve VN has flow rate=17; tunnels lead to valves FV, MJ\n" +
                "Valve OW has flow rate=0; tunnels lead to valves SJ, VQ\n" +
                "Valve ZI has flow rate=0; tunnels lead to valves XP, JA\n" +
                "Valve VJ has flow rate=0; tunnels lead to valves KJ, MH\n" +
                "Valve KQ has flow rate=0; tunnels lead to valves XZ, KJ\n" +
                "Valve FC has flow rate=12; tunnels lead to valves ZP, MM, KH, AE, FU\n" +
                "Valve LP has flow rate=0; tunnels lead to valves SA, RI\n" +
                "Valve VD has flow rate=0; tunnels lead to valves WC, JF\n" +
                "Valve JR has flow rate=0; tunnels lead to valves MH, JA\n" +
                "Valve VH has flow rate=0; tunnels lead to valves SA, MJ\n" +
                "Valve CZ has flow rate=0; tunnels lead to valves AA, QO\n" +
                "Valve SJ has flow rate=15; tunnels lead to valves KH, FV, GB, OW\n" +
                "Valve FV has flow rate=0; tunnels lead to valves VN, SJ\n" +
                "Valve XZ has flow rate=0; tunnels lead to valves LR, KQ\n" +
                "Valve KJ has flow rate=9; tunnels lead to valves KQ, VJ\n" +
                "Valve ZD has flow rate=13; tunnels lead to valves XP, BL, AM"));
    }

}