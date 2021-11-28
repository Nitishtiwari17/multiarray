package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//java program to find the max age and height of a student from a multi dimensional array.
                Scanner sc = new Scanner(System.in);
                int[][] arr1 = new int[3][];
                arr1[0] = new int[3];
                arr1[1] = new int[3];
                for(int i=0;i<arr1.length;i++){
                    arr1[0][i] = sc.nextInt();
                    arr1[1][i] = sc.nextInt();
                    int max = arr1[0][0];
                    int maxHeight = arr1[1][i];
                    if(arr1[0][i]>max){
                        max = arr1[0][i];
                        System.out.println("the max age of the student is:"+max);
                    }
                    if(arr1[1][i]>maxHeight)
                    {
                        maxHeight=arr1[1][i];
                        System.out.println("the nmaxheight is "+maxHeight);
                    }
                }
            }

        }

        // write your code here


