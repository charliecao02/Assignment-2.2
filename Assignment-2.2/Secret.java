import java.util.Scanner;
class Secret{
    public static void main(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Password:\n");
        String pass=scan.next();
        if(pass.equals("dragon")) System.out.print("Correct! My secret is: I am Batman\n");
        else System.out.print("Wrong! My secret is safe\n");
        
    }
}