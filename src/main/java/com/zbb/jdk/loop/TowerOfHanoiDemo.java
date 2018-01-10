package com.zbb.jdk.loop;

/**
 * @Description: 汉诺塔递归
 * @Author: zbb
 * @Date: 2018/1/5 13:50
 */
public class TowerOfHanoiDemo {

    // 移动次数
    private static int number = 0;

    public static void main(String[] args) {
        doTower(3, "A", "B", "C");
    }

    // 将 编号n的盘子 从from移动到to
    private static void move(int num, String from, String to){
        System.out.println("第"+ (++number) + "次移动：把"+"编号为" + num + ":从" + from + "移动到" + to);
    }

    private static void doTower(int topN, String from, String inter, String to){
        if(topN == 1){
            move(topN, from, to);
        }else if(topN < 1){
            System.out.println("无效的盘子数量！");
        }else{
            doTower(topN-1, from, to, inter);
            move(topN, from, to);
            doTower(topN-1, inter, from, to);
        }
    }
}
