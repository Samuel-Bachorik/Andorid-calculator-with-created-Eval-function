package com.example.myapplication2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BracketSplitter {
    public static List<String> fromListBrackets(List<String> list1) {
        int loop = list1.size();
        String ifNum;

        for (int i=0;i<loop;i++) {
            try {
                ifNum = list1.get(i+1);
            }

            catch (Exception e) {
                break;
            }
            char k = ifNum.charAt(0);

            if (list1.get(i).equals("(") && Character.isDigit(k)||list1.get(i).equals("(") && NumChecker.isNumeric(ifNum)) {
                List<String> list3 = new ArrayList<String>();
                list3.add(list1.get(i+1));

                for (int q=i+2 ; q < loop ; q++) {
                    if(list1.get(q).equals(")")) {

                        String neww = Calculator.fromList(list3);
                        list1.set(i,neww);
                        int kokot = i;

                        for(int e = i; e<q+25; e++) {
                            if(list1.get(kokot+1).equals(")")) {
                                list1.remove(kokot+1);

                                for (String s : list1) {
                                    if (s.equals("(")) {
                                        i = 0;
                                        break;
                                    }
                                }
                                break;
                            }
                            list1.remove(kokot+1);
                        }
                        break;
                    }
                    else {
                        list3.add(list1.get(q));
                    }
                }
            }
        }
        return list1;
    }
}