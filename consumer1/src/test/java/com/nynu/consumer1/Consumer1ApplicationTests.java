package com.nynu.consumer1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Arrays;

@SpringBootTest
class Consumer1ApplicationTests {

    @Test
    void contextLoads() {
        String str = "abcdce";
        System.out.println(longestPalindrome(str));
    }

    public String longestPalindrome(String s) {
        int maxLen = 1;
        int start = 0;
        int len = s.length();
        char[] chars = s.toCharArray();
        if (s.length() < 2) {
            return s;
        }

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if ((j - i + 1 > maxLen) && validPalindrome(chars, i, j)) {
                    maxLen = j - i + 1;
                    start = i;
                }
            }
        }
        return s.substring(start, start + maxLen);
    }

    private boolean validPalindrome(char[] chars, int left, int right) {
        while (left <= right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }



    @Test
    public void TEST(){
        String str = "dwfre";
        System.out.println(str.charAt(1));
    }

}




















