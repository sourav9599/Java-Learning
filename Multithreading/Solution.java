package Multithreading;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static boolean wordPattern(String pattern, String s) {
        int startIndex=0;
        int patternIndex = 0;
        Map<Character, String> charMap = new HashMap<>();
        for(int i=0;i<s.length(); i++){
            if(s.charAt(i) == ' '){
                System.out.println(charMap);
                if(charMap.containsKey(pattern.charAt(patternIndex))){
                    if(!charMap.get(pattern.charAt(patternIndex)).equals(s.substring(startIndex, i))) return false;
                }
                else{
                    charMap.put(pattern.charAt(patternIndex), s.substring(startIndex, i));
                }
                startIndex = i+1;
                patternIndex++;
            }
            else if (i == s.length()-1){
                if(charMap.containsKey(pattern.charAt(patternIndex))){
                    if(!charMap.get(pattern.charAt(patternIndex)).equals(s.substring(startIndex, i+1))) return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args){

        // Thread Class Implementation
        MultiThreadClassEx multiThreadClassEx = new MultiThreadClassEx();
        multiThreadClassEx.start();

        // Using Runnable Functional Interface along With Monitor Lock on object
        MultiThreadRunnableEx multiThreadRunnableEx = new MultiThreadRunnableEx();
        MultiThreadRunnableEx multiThreadRunnableEx2 = new MultiThreadRunnableEx();
        Thread t1 = new Thread(multiThreadRunnableEx);
        Thread t2 = new Thread(() -> {
            multiThreadRunnableEx.test2();});
        Thread t3 = new Thread(multiThreadRunnableEx::test3);
        t1.start();
        t2.start();
        t3.start();
    }
}