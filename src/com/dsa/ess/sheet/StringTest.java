package com.dsa.ess.sheet;

import com.dsa.ess.util.Utils;

import java.util.Arrays;

import static com.dsa.ess.util.Utils.println;

public class StringTest {
    static String str = "    root r-x delete-this.xls\n" +
            "   root r-x bug-report.pdf\n" +
            "   root r-- doc.xls\n" +
            "   nik r-- do.xls\n" +
            "   root -w- podcast.flac";

    public static void main(String[] args) {
//        var arr = solution(5);
//        println(Arrays.toString(arr));
//        var res = find_min(arr);
//        println(res);
//        println(str);
        String[] arr = str.split("\n");
        println(Arrays.toString(arr));
        int res = Integer.MAX_VALUE;
        int count = -1;
        for (String s : arr) {
            String[] curr = s.trim().split(" ");
            println(Arrays.toString(curr));
            if (curr[0].equals("root") && curr[1].contains("r")) {
                if (curr[2].contains("pdf") || curr[2].contains("doc") || curr[2].contains("xls")) {
                    res = Math.min(res, curr[2].length());
                    count++;
                }
            }
        }
        if((count==-1)){
            println("NO FILES");
        }
        println("Res is ", res);
    }

    public static int[] solution(int N) {
        int[] array = new int[N];
        Arrays.fill(array, 1);
        return array;
    }


    public static int find_min(int[] A) {
        int ans = 0;
        for (int i = 1; i < A.length; i++) {
            if (ans > A[i])
                ans = A[i];
        }

        return ans;
    }

}
