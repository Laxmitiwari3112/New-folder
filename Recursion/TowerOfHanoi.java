package Recursion;

import java.util.*;

//solve tower of hanoi
//time complexity = O(2^n-1) : O(2^n)
public class TowerOfHanoi {
    public static void towerofHanoi(int n, String src, String helper, String dest) {

        // BASE CASE
        // 1disk then directly transfer from src to dest tower
        if (n == 1) {
            System.out.println("tranfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        // (n-1)disk transfer from src to hlpr using dest as helper
        towerofHanoi(n - 1, src, dest, helper);

        //transfer nth from src to dest
        System.out.println("Transfer disk " + n + " from " + src + " to " + helper);

        // (n-1) disk transfer from helper to dest using src as helper
        towerofHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        // number of disks
        int n = 4;
        towerofHanoi(n, "S", "H", "D");
    }

}
