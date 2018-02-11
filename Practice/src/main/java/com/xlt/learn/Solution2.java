package com.xlt.learn;

/**
 * (编程题) 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * 1.不用String里的函数
 * 
 */
public class Solution2 {
    
    public static String replaceBlank(String str) {
        
        char key = ' ';

        char[] oldArray = str.toCharArray();
        
        int count = 0;

        for(int i=0; i < oldArray.length; i++){
            if(key == oldArray[i]){
                count++;
            }
        }

        int length = oldArray.length+count*2;
        char[] newArray = new char[length];

        for(int oldArrayIndex = oldArray.length - 1, newArrayIndex = newArray.length -1; oldArrayIndex >= 0 && newArrayIndex >= 0; oldArrayIndex--,newArrayIndex--){
            if(oldArray[oldArrayIndex] == ' '){
                newArray[newArrayIndex--] = '0';
                newArray[newArrayIndex--] = '2';
                newArray[newArrayIndex] = '%';
            }else{
                newArray[newArrayIndex]= oldArray[oldArrayIndex];
            }
        }
        str = String.valueOf(newArray);
        return str;
    }

    public static void main(String[] args) {
        System.out.println(replaceBlank("We Are Happy"));
        
    }
}