import java.util.Scanner;
class GradeBot{
    public static void main(){
        float outof, get;
        Scanner scan=new Scanner(System.in);
        System.out.print("What is your test out of?\n");
        outof=scan.nextFloat();
        System.out.print("What did you get?\n");
        get=scan.nextFloat();
        float score=(get/outof)*100;
        int percent=Math.round(score);
        if(percent>100) System.out.print("Wow you got over 100%\n");
        if(percent<=100 && percent>=86) System.out.print("You got "+percent+"%! That's an A, nice work");
        if(percent<86 && percent>=73) System.out.print("You got "+percent+"%! That's a B, you almost got an A");
        if(percent<73 && percent>=67 && percent!=69) System.out.print("You got "+percent+"%! That's a C+, almost OK");
        if(percent==69) System.out.print("Nice you got funny number");
        if(percent<67 && percent>=60) System.out.print("You got "+percent+"%! That's a C, not good enough");
        if(percent<60 && percent>=50) System.out.print("You got "+percent+"%! That's a C-, almost failed");
        if(percent<50) System.out.print("You got "+percent+"%! That's an F! You failed!");
        
    }
}