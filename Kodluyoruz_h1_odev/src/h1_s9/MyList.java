package h1_s9;

import java.util.Arrays;

public class MyList <T extends String>{
    private String[] list;
    private static final int DEFAULT_CAPACITY=5;
    private static final int NEW_CAPACITY_VALUE_TO_ADD=7;
    private int newCapacity;
    private int index;

    public MyList(){
       this.list = new String[DEFAULT_CAPACITY];
       newCapacity = DEFAULT_CAPACITY;
       index=0;
    }

    public void add(String value){
        if(value.startsWith("C")) {
            if (index == newCapacity)
                resizeList();
            list[index++] = value;
        }
    }

    public void print(){
        for(int i=0;i<list.length;i++)
            System.out.println(this.list[i]);
    }

    private void resizeList(){
        newCapacity =list.length+NEW_CAPACITY_VALUE_TO_ADD;
        list = Arrays.copyOf(list,newCapacity);
    }
}
