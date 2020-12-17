package com.cmsr.sicp.custom.controller;

import java.util.Scanner;

/**
 * TODO
 *
 * @author gongzunhao
 * @version 1.0
 * @date 2020/12/10 10:35
 */
public class JavaTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("请输入身高(m):");
        float v = scanner.nextFloat();

        System.out.print("请输入体重(kg):");
        float v2 = scanner.nextFloat();

        float BMI=v2/(v*v);
        System.out.println("你当前的BMI是："+BMI);
        System.out.print("身体状态是:");
        if (BMI < 18.5) {
            System.out.println("体重过轻");
        }else if (BMI >= 18.5 && BMI<24){
            System.out.println("正常范围");
        }else if (BMI >= 24 && BMI<27){
            System.out.println("体重过胖");
        }else if (BMI >= 27 && BMI<30){
            System.out.println("轻度肥胖");
        }else if (BMI >= 30 && BMI<35){
            System.out.println("中度肥胖");
        }else if (BMI >= 35){
            System.out.println("重度肥胖");
        }

    }
}
