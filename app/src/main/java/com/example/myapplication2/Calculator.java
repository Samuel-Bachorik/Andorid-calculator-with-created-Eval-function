package com.example.myapplication2;

import java.util.Arrays;
import java.util.List;

public class Calculator {
    public static String eval(String split) {
        List<String> lines = Splitter.split(split);
        List<String> lines2 = BracketSplitter.fromListBrackets(lines);
        return fromList(lines2);
    }

    public static String fromList(List<String> list) {
        int loop = list.size();
        for (int i = 0; i < loop; i++) {
            if(list.get(i).equals("×")) {
                list.set(i,String.valueOf(Double.parseDouble(list.get(i-1))*Double.parseDouble(list.get(i+1))));
                list.remove(i-1);
                list.remove(i);
                i=0;
                loop-=2;
            }
        }

        loop = list.size();
        for (int i = 0; i < loop; i++) {
            if(list.get(i).equals("÷")) {
                if("0".equals(String.valueOf(list.get(i+1)))){
                    return "Zero division";
                }
                list.set(i,String.valueOf(Double.parseDouble(list.get(i-1))/Double.parseDouble(list.get(i+1))));
                System.out.println(list);
                list.remove(i-1);
                list.remove(i);
                i=0;
                loop-=2;
            }
        }

        loop = list.size();
        for (int i = 0; i < loop; i++) {
            if(list.get(i).equals("+")) {
                list.set(i,String.valueOf(Double.parseDouble(list.get(i-1))+Double.parseDouble(list.get(i+1))));
                list.remove(i-1);
                list.remove(i);
                i=0;
                loop-=2;
            }
        }

        loop = list.size();
        for (int i = 0; i < loop; i++) {
            if(list.get(i).equals("-")) {
                list.set(i,String.valueOf(Double.parseDouble(list.get(i-1))-Double.parseDouble(list.get(i+1))));
                list.remove(i-1);
                list.remove(i);
                i=0;
                loop-=2;
            }
        }

        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return Arrays.toString(result).replace("[", "").replace("]", "");
    }
}
