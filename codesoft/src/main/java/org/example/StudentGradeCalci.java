package org.example;

import java.util.Scanner;

public class StudentGradeCalci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("STUDENT GRADE CALCI");
        System.out.println();
        System.out.print("Enter your Java mark : ");
        int java = sc.nextInt();
        System.out.print("Enter your C mark : ");
        int c = sc.nextInt();
        System.out.print("Enter your C++ mark : ");
        int cpp = sc.nextInt();
        System.out.print("Enter your Python mark : ");
        int python = sc.nextInt();
        System.out.print("Enter your C# mark : ");
        int csharp  = sc.nextInt();
        System.out.println();

        System.out.println("**************************************");
        System.out.print("    Your total score is : ");
        System.out.println(total_marks(java,c,cpp,python,csharp));
        System.out.print("    Your average is : ");
        System.out.println(average_marks(java,c,cpp,python,csharp));
        System.out.print("    Your Grade is : ");
        System.out.println(grade_calci(average_marks(java,c,cpp,python,csharp)));
        System.out.println("**************************************");
    }
    public static int total_marks(int a,int b,int c,int d,int e){
        return a+b+c+d+e;
    }
    public static double average_marks(int a,int b,int c,int d,int e){
        int tot = total_marks(a,b,c,d,e);
        return tot/5.0;
    }
    public static String grade_calci(double a){
        String grade = "";
        if(a<=100 && a>=90){
            grade+='O';
        }
        else if(a<90 && a>=80){
            grade+='A';
        }
        else if(a<80 && a>=70){
            grade+='B';
        }
        else if(a<70 && a>=60){
            grade+='C';
        }
        else if(a<60 && a>=45){
            grade+='D';
        }
        else{
            grade+="No grade - Fail";
        }
        return grade;
    }
}
