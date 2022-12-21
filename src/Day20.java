import java.util.ArrayList;
import java.util.Scanner;

public class Day20 {
    public static void start(Scanner s){
        node begin = null;
        node end = null;
        int length = -1;
        while (s.hasNextInt()){
            node n = new node(s.nextInt());
            node z = new node(n.data);
            n.connected = z;
            z.connected = n;
            if (begin == null){
                begin = n;
            }
            if (end != null){
                n.prev = end;
                end.next = n;
            }
            end = n;
            length++;
        }
        begin.prev = end;
        end.next = begin;
        begin.chainConnect(end);
        for (int i = 0; i < 10; i++) {
            begin.moveChain(end,length);
        }
        begin = begin.connected.findZero();
        int total = 0;
        for (int i = 1; i <= 3; i++) {
            total += begin.get(i*1000);
        }
        System.out.println(total*811589153L);
    }
    public static class node{
        public node prev;
        public node next;
        public long data;
        public node connected;
        public node(long i){
            data = i;
        }
        public void chainConnect(node start){
            connected.prev = prev.connected;
            connected.next = next.connected;
            if (this != start){
                next.chainConnect(start);
            }
        }

        public void moveChain(node start, int length){
            if (data >= 0) {
                for (int i = 0; i < (data*811589153)%length; i++) {
                    node node0 = connected.prev;
                    node node1 = connected;
                    node node2 = connected.next;
                    node node3 = node2.next;
                    node0.next = node2;
                    node1.prev = node2;
                    node1.next = node3;
                    node2.prev = node0;
                    node2.next = node1;
                    node3.prev = node1;
                }
            }
            else{
                for (int i = 0; i < (data*-811589153)%length; i++) {
                    node node0 = connected.prev.prev;
                    node node1 = connected.prev;
                    node node2 = connected;
                    node node3 = connected.next;
                    node0.next = node2;
                    node1.prev = node2;
                    node1.next = node3;
                    node2.prev = node0;
                    node2.next = node1;
                    node3.prev = node1;
                }
            }
            if (start != this){
                next.moveChain(start,length);
            }
        }

        public node findZero(){
            if (data == 0){
                return this;
            }
            else{
                return next.findZero();
            }
        }

        public long get(int z){
            if (z == 0){
                return data;
            }
            else{
                return next.get(z-1);
            }
        }
        /*native
        non-sealed
        sealed
        synchronized
        strictfp
        transient
        volatile*/

    }
}
