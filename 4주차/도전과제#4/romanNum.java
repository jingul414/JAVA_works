package first_project;

import java.util.Scanner;

public class romanNum {
    
    public static void main(String[] args){ 
        int year = 0;
        Scanner sc = new Scanner(System.in);
        String roman_year = "";
        int cnt = 0;
    	System.out.print("연도를 입력하세요: ");
        year = sc.nextInt();
        while(year < 1 || 5000 <= year){
            System.out.println("잘못 입력된 연도");
        	System.out.print("연도를 입력하세요: "); 
        	year = sc.nextInt();         
        }
        
        //1000의 자리
        while(year >= 1000){
            roman_year += "M";
            year -= 1000;
        }
        
        //100의 자리
        if(900 <= year){
            //년도가 x900~x999일때
            roman_year += "CM";
            year -= 900;
        }else if (500 <= year){
            //년도가 x500 ~ x899일때
            roman_year += "D";
            year -= 500;
            while(100 <= year){
                roman_year += "C";
                year -= 100;
            }
        }else if(400 <= year){
            //년도가 x400 ~ x499일때
            roman_year += "CD";
            year -= 400;
        }else{
            //년도가 x100~399일때
            while(100 <= year){
                roman_year += "C";
                year -= 100;
            }
        }
        
        //10의 자리
        if(90 <= year){
            //년도가 xx90~xx99일때
            roman_year += "XC";
            year -= 90;
        }else if (50 <= year){
            //년도가 xx50 ~ xx89일때
            roman_year += "L";
            year -= 50;
            while(10 <= year){
                roman_year += "X";
                year -= 10;
            }
        }else if(40 <= year){
            //년도가 xx40 ~ xx49일때
            roman_year += "XL";
            year -= 40;
        }else{
            //년도가 xx10~xx39일때
            while(10 <= year){
                roman_year += "X";
                year -= 10;
            }
        }
        
        //1의 자리
        if(9 <= year){
            //년도가 xxx9일때
            roman_year += "IX";
            year -= 9;
        }else if (5 <= year){
            //년도가 xxx5 ~ xxx8일때
            roman_year += "V";
            year -= 5;
            while(1 <= year){
                roman_year += "I";
                year -= 1;
            }
        }else if(4 <= year){
            //년도가 xxx4일때
            roman_year += "IV";
            year -= 4;
        }else{
            //년도가 xxx1~xxx3일때
            while(1 <= year){
                roman_year += "I";
                year -= 1;
            }
        }
        
        
        System.out.println("로마 숫자로 표현한 연도 = " + roman_year);
    }
    
}