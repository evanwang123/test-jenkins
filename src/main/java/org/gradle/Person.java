package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    private final String name;
    
    private int a = 1;
    private int b = 0;
    
    int f[]=new int[3];


    public Person(String name) {
        this.name = name;
        new GrowthList(); 
    }

    public String getName() {
    	f[0]=f[1]=f[2]=1;
    	System.out.println(f[4]);
    	System.out.println(a/b); 
        return name; 
    }
    
    
}