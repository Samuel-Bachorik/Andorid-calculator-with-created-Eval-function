package com.example.myapplication2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Splitter {

    public static List<String> split(String splitThis){
        int counter = 0;
        String[] array = new String[50];
        Arrays.fill(array, "x");
        char str1;
        char str2;

        for(int i =0 ; i<splitThis.length() ; i++) {
            str1 = splitThis.charAt(i);

            try {
                str2 = splitThis.charAt(i-1);
                //if (String.valueOf(str1).equals("-")&&!Character.isDigit(str2)|| i==0 && String.valueOf(str1).equals("-")){
                if (String.valueOf(str1).equals("-") && !Character.isDigit(str2)){
                    array[counter] = array[counter] + str1;
                    continue;
                }
            }

            catch (Exception k) {
                ;
            }

            if (Character.isDigit(str1)||String.valueOf(str1).equals(".")){
                array[counter] = array[counter] + str1;
            }

            else {
                counter+=1;
                array[counter] = array[counter] + str1;
                counter+=1;
            }
        }
        List<String> list6 = new ArrayList<>(Arrays.asList(array));

        for (int i = 0;i<list6.size();i++){
            if (list6.get(i).equals("x")){
                list6.remove(i);
            }
            if (i >list6.size()-2 && list6.get(list6.size() - 1).equals("x")){
                i =0;
            }
        }

        for (int i =0;i<list6.size();i++){
            list6.set(i,list6.get(i).replaceAll("x", ""));
        }
        return list6;
    }



}

