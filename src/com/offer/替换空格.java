package com.offer;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class 替换空格 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We Are Happy");
        String s = replaceSpace(str);
        System.out.println(s);
    }
    public static String replaceSpace(StringBuffer str) {
        char[] strChar = str.toString().toCharArray();
        StringBuffer s = new StringBuffer();
        for(int i = 0; i < strChar.length; i++) {
            if(strChar[i] != ' ') {
                s.append(strChar[i]);
            }
            else{
                s.append("%20");
            }
        }
        return s.toString();
    }
}
