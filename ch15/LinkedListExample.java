package ch15;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();

        long startTime;
        long endTime;

        // 순차적 추가, 삭제 | 중간에 추가, 삭제 | 검색
        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 추가시간: " + (endTime - startTime) + " ns");
        
        startTime = System.nanoTime();
        list1.get(5000);
        endTime = System.nanoTime();
        System.out.println("ArrayList 검색시간: " + (endTime - startTime) + " ns");
        
        // startTime = System.nanoTime();
        // for(int i = 0; i < 10000; i++) {
        //     list1.remove(0);
        // }        
        // endTime = System.nanoTime();
        // System.out.println("ArrayList 삭제시간: " + (endTime - startTime) + " ns");


        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린시간: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        list2.get(5000);
        endTime = System.nanoTime();
        System.out.println("LinkedList 검색시간: " + (endTime - startTime) + " ns");
    
        // System.out.println(list2.size());
        // startTime = System.nanoTime();
        // for(int i = 0; i < 10000; i++) {
        //     list2.remove(i);
        // }        
        // endTime = System.nanoTime();
        // System.out.println("LinkedList 삭제시간: " + (endTime - startTime) + " ns");
    }
}
