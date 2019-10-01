import java.util.Scanner;
class Magic8Ball{
    public static void main(){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int rng=(int)(Math.random()*20)+1;
        if(rng==1) System.out.println("It is certain.");
        if(rng==2)System.out.println("It is decidedly so.");
        if(rng==3)System.out.println("Without a doubt.");
        if(rng==4)System.out.println("Yes - definitely.");
        if(rng==5)System.out.println("You may rely on it.");            
        if(rng==6)System.out.println("As I see it, yes.");
        if(rng==7)System.out.println("Most likely.");
        if(rng==8)System.out.println("Outlook good.");
        if(rng==9)System.out.println("Yes.");
        if(rng==10)System.out.println("Signs point to yes.");
        if(rng==11)System.out.println("Reply hazy, try again.");
        if(rng==12)System.out.println("Ask again later.");
        if(rng==13)System.out.println("Better not tell you now.");
        if(rng==14)System.out.println("Cannot predict now.");
        if(rng==15)System.out.println("Concentrate and ask again.");
        if(rng==16)System.out.println("Don't count on it.");
        if(rng==17)System.out.println("My reply is no.");
        if(rng==18)System.out.println("My sources say no.");
        if(rng==19)System.out.println("Outlook not so good.");
        if(rng==20)System.out.println("Very doubtful.");
    }
}