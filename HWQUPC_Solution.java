package edu.neu.coe.info6205.union_find;

public class HWQUPC_Solution {

    public static void main(String args[]) {

        int n = 25;
        for (int i = 0; i < 9; i++) {
            System.out.println("Number of nodes: " + n);
            UF_HWQUPC h = new UF_HWQUPC(n);
            System.out.println("Number of connections:" + count(h, n));
            n = n + 100;
        }
    }

    private static int count(UF_HWQUPC h, int n) {

        int noOfConnections = 0;
        int noOfPairs = 0;

        while (h.components() != 1) {
            int x = (int) (Math.random() * (n));
            int y = (int) (Math.random() * (n));
            noOfPairs += 1;
            if (h.connected(x,y)==false) {
                h.union(x, y);
                noOfConnections++;
            }
        }

        System.out.println("Number of pairs:" + noOfPairs);
        return noOfConnections;
    }
}
