package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> m1= new HashMap<>();
        //i used here hashmap because it have 2 type of arguments,
        //here for second string were values of cost we can't use non-integers
        m1.put("John", "1200");//there are employees of your company
        m1.put("Mike","1000");
        m1.put("Pall", "1500");
        m1.put("Jacab", "1200");
        m1.put("Micheal", "1300");
        m1.put("Cain", "900");
        m1.put("Bain", "1600");
        m1.put("Karl", "2000");
        String[] s={"Mike","Pall","Cain"};//there you put employees that you need
        System.out.println(getTheTotalCostOfEmployees(m1,s));//print totalcost of chosen employees
    }
    public static float getTheTotalCostOfEmployees(HashMap<String,String> m1,String[] s) {
        //here we pass the data to this function
        Float f=(float) 0;//in this part of code (string to float)
        Iterator<String> i=m1.keySet().iterator();
        while(i.hasNext()){
            String s1=(String) i.next();
            Float f1=Float.parseFloat(m1.get(s1));
            for(int j=0;j<s.length;j++)
                if(s[j].equals(s1))
                    f+=f1; }//calculate totalcost
        return f;
    }}
