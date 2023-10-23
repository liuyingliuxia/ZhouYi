package com.zds.zhouyi;

import java.util.ArrayList;
import java.util.Arrays;
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
    public static ArrayList<Gua> sixtyFourDiagramsMap = new ArrayList<Gua>(Arrays.asList(
            new Gua(11, "乾", 1, "乾上乾下"), new Gua(88, "坤", 2, "坤上坤下"),
            new Gua(64, "屯", 3, "坎上震下"), new Gua(76, "蒙", 4, "艮上坎下"),
            new Gua(61, "需", 5, "坎上乾下"), new Gua(16, "讼", 6, "乾上坎下"),
            new Gua(86, "师", 7, "坤上坎下"), new Gua(68, "比", 8, "坎上坤下"),
            new Gua(51, "小畜", 9, "巽上乾下"), new Gua(12, "履", 10, "乾上兑下"),
            new Gua(81, "泰", 11, "坤上乾下"), new Gua(18, "否", 12, "乾上坤下"),
            new Gua(13, "同人", 13, "乾上离下"), new Gua(31, "大有", 14, "离上乾下"),
            new Gua(87, "谦", 15, "坤上艮下"), new Gua(48, "豫", 16, "震上坤下"),
            new Gua(24, "随", 17, "兑上震下"), new Gua(75, "蛊", 18, "艮上巽下"),
            new Gua(82, "临", 19, "坤上兑下"), new Gua(58, "观", 20, "巽上坤下"),
            new Gua(34, "噬嗑", 21, "离上震下"), new Gua(73, "贲", 22, "艮上离下"),
            new Gua(78, "剥", 23, "艮上坤下"), new Gua(84, "复", 24, "坤上震下"),
            new Gua(14, "无妄", 25, "乾上震下"), new Gua(71, "大畜", 26, "艮上乾下"),
            new Gua(74, "颐", 27, "艮上震下"), new Gua(25, "大过", 28, "兑上巽下"),
            new Gua(66, "坎", 29, "坎上坎下"), new Gua(33, "离", 30, "离上离下"),
            new Gua(27, "咸", 31, "兑上艮下"), new Gua(45, "恒", 32, "震上巽下"),
            new Gua(17, "遁", 33, "乾上艮下"), new Gua(41, "大壮", 34, "震上乾下"),
            new Gua(38, "晋", 35, "离上坤下"), new Gua(83, "明夷", 36, "坤上离下"),
            new Gua(53, "家人", 37, "巽上离下"), new Gua(32, "睽", 38, "离上兑下"),
            new Gua(67, "蹇", 39, "坎上艮下"), new Gua(46, "解", 40, "震上坎下"),
            new Gua(72, "损", 41, "艮上兑下"), new Gua(54, "益", 42, "巽上震下"),
            new Gua(21, "夬", 43, "兑上乾下"), new Gua(15, "姤", 44, "乾上巽下"),
            new Gua(28, "萃", 45, "兑上坤下"), new Gua(85, "升", 46, "坤上巽下"),
            new Gua(26, "困", 47, "兑上坎下"), new Gua(65, "井", 48, "坎上巽下"),
            new Gua(23, "革", 49, "兑上离下"), new Gua(35, "鼎", 50, "离上巽下"),
            new Gua(44, "震", 51, "震上震下"), new Gua(77, "艮", 52, "艮上艮下"),
            new Gua(57, "渐", 53, "巽上艮下"), new Gua(42, "归妹", 54, "震上兑下"),
            new Gua(43, "丰", 55, "震上离下"), new Gua(37, "旅", 56, "离上艮下"),
            new Gua(55, "巽", 57, "巽上巽下"), new Gua(22, "兑", 58, "兑上兑下"),
            new Gua(56, "涣", 59, "巽上坎下"), new Gua(62, "节", 60, "坎上兑下"),
            new Gua(52, "中孚", 61, "巽上兑下"), new Gua(47, "小过", 62, "震上艮下"),
            new Gua(63, "既济", 63, "坎上离下"), new Gua(36, "未济", 64, "离上坎下")
    ));

}
