/*
This program is craeted by---
Mridudeep Pathak
Roll no- 150103006
6th semister, CSE
GUIST,GU
*/

import java.util.*;

public class CountAndCapitalize {

	public static void count_no(String str)
	{
		 char[] abc = new char[50];
		 int[] def = new int[50];

		 int ghi = 0;
		 int index_jkl = -1;


		 int[] lt_Count = new int[26];

         char ch = 'a';
         int base_a = 'a';
         int space_Count = 0;

         for(int i=0;i<26;i++)
         {
            lt_Count[i] = 0;
         }

         str = str.toLowerCase();

         int len = str.length();

         char[] st = new char[len];
         for(int i=0;i<len;i++)
         {
             st[i] = str.charAt(i);
         }

         for(int i=0;i<len;i++)
         {
        	 if(st[i] == ' ')
        	 {
        		 space_Count++;
        	 }
        	 else
        	 {
        		 if((st[i]>= 65 && st[i]<=91) || (st[i]>= 97 && st[i]<=123))
        		 {
        			 lt_Count[st[i] - base_a]++;
        		 }
        		 else
        		 {
        			 for(int j=0;j<ghi;j++)
        			 {
        				 if(abc[j] == st[i])
        				 {
        					 index_jkl = j;
        					 break;
        				 }
        				 index_jkl = -1;
        			 }
        			 if(index_jkl >= 0)
        			 {
        				 def[index_jkl]++;
        			 }
        			 else
        			 {
        				 abc[ghi] = st[i];
        				 def[ghi] = 1;
        				 ghi++;
        			 }
        		 }
        	 }
         }


         for(int i=0;i<26;i++)
         {
             if(lt_Count[i] != 0)
             {
                 System.out.println(ch + "-" + lt_Count[i]);
             }
              ch += 1;
         }
         for(int i=0;i<ghi;i++)
         {

        	 System.out.println(abc[i] + "-" + def[i]);
         }
         System.out.println("spaces" + "-" + space_Count);
	}

	public static void capitalize_string(String str)
	{
		   str = str.toLowerCase();
		   int j = 0;

		   char[] st = new char[str.length()];

	       for(int i=0;i<str.length();i++)
	       {
	           st[i] = str.charAt(i);
	       }

		for(int i=0;i<str.length();i++)
		{
			if(st[i] == ' ')
			{
				j=0;
			}
			else
			{
				if(j%2 == 0)
				{
					if((st[i]>= 65 && st[i]<=91) || (st[i]>= 97 && st[i]<=123))
					{
						st[i] -= 32;
					}
				}
				j++;
			}
		}

		for(int i=0;i<str.length();i++)
		{
			System.out.print(st[i]);
		}
	}

 public static void main(String args[]){

	 System.out.println("Input string:");
         Scanner s = new Scanner(System.in);

         String str = s.next();

         str += s.nextLine();

	 System.out.println("\nThe character count result is----\n");
         count_no(str);
	 System.out.println("\nThe converted string into string with alternate capitalize characters is----\n");
	 capitalize_string(str);
     }
}
