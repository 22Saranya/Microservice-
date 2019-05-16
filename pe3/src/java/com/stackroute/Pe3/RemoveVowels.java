package com.stackroute.Pe3;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class RemoveVowels {
    static String remVowel(String str)
    {
        Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};

        List<Character> al = Arrays.asList(vowels);

        StringBuffer sb = new StringBuffer(str);

        for (int i = 0; i < sb.length(); i++) {

            if(al.contains(sb.charAt(i))){
                sb.replace(i, i+1, "") ;
                i--;
            }
        }


        return sb.toString();
    }
    // Driver method to test the above function
    public static void main(String[] args)
    {
        System.out.print("Input:");
        Scanner sc = new Scanner(System.in);
        int vow = sc.nextInt();
        String[] vowellist = new String[vow];
        for(int j = 0; j < vowellist.length;j++)
        {
            System.out.println(j);
            System.out.print("enter the word:");
            Scanner str = new Scanner(System.in);
            vowellist[j] = str.next();
            System.out.println("Place name without vowels :"+j+" "+remVowel(vowellist[j]));
        }
    }
}
