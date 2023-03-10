package com.example.filemanagement;

import java.util.ArrayList;

public class Calc {

    public int var1;
    public int var2;
    public int binaryType;

    public String[] calculationType = {
            "덧셈", "뺄셈", "곱셈", "나눗셈", "거듭제곱", "진수변환"
    };

    private ArrayList<String> history;

    public void saveCalc(String result) {
        history.add(result);
    }

    public String binaryChange(int 진법, int value) {
        return Integer.toString(value, 진법);
    }


    /**
     * @param calctype 0:add 1:sub 2:mul 3:div 4:pow
     * @return
     */
    public double calcuation(int calctype, double arg1, double arg2) {
        double res = 0;

        switch (calctype) {
            case 0:
                res= arg1 + arg2;
            break;
            case 1:
                res= arg1 - arg2;
            break;
            case 2:
                res= arg1 * arg2;
            break;
            case 3:
                try {
                    res= (arg1) / arg2;
                } catch (ArithmeticException e) {
                    System.err.println("0으로 나눌 수 없습니다");
                    e.printStackTrace();
                }
            case 4:
                res= Math.pow(arg1, arg2);
                break;
            default:
                System.err.println("잘못된 구분입니다");
                break;


        }
        return res;
    }

}
