import java.util.Scanner;

public class atm{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
      int balance = 10000, deposit,withdraw;

      while(true){
           System.out.println( "choose 1 for deposit :");
           System.out.println( "choose 2 for withdraw :");
           System.out.println("choose 3 for balance inquiry :");
           System.out.println( "choose 4 for exit :");
           System.out.println( "choose correct operation to perform :");
