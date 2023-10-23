package com.zds.zhouyi;

import java.util.HashMap;

/**
 * @Author: ZDS
 * @Date:2023/10/23
 * @Desc:
 */
public class Const {
    public static int[] one = {1, 1, 1};
    public static int[] two = {0, 1, 1};
    public static int[] three = {1, 0, 1};
    public static int[] four = {0, 0, 1};
    public static int[] five = {1, 1, 0};
    public static int[] six = {0, 1, 0};
    public static int[] seven = {1, 0, 0};
    public static int[] eight = {0, 0, 0};

    public static HashMap<int[], Integer> eightDiagramsMap = new HashMap<int[], Integer>() {
        {
            put(one, 1);
            put(two, 2);
            put(three, 3);
            put(four, 4);
            put(five, 5);
            put(six, 6);
            put(seven, 7);
            put(eight, 8);
        }
    };
}
