import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    System.out.println("Enter the limit");
    int n = in.nextInt();
    int sum = 0,a;
    for(int i =1;i<=n;i++){
      System.out.println("Enter the number:"+i+":");
      a = in.nextInt();
      sum+=a; // sum = sum+a
    }
    System.out.println("The sum of numbers:"+sum);
    System.out.println("The average of numbers:"+sum/n);
  }
}
