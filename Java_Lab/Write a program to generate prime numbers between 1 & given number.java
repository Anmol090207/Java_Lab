import java.util.Scanner;
public class Main{
  public static void main(String arg[]){
    int i,n,counter, j;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the n value : ");
    n=s.nextInt();
    System.out.print("Prime numbers between 1 to 20 are ");
    for(j=2;j<=n;j++){
      counter=0;
      for(i=1;i<=j;i++){
        if(j%i==0){
          counter++;
          }
        }
      if(counter==2)

      System.out.print(j+" ");
    }
  }
}
