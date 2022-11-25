import java.util.Scanner;
class powerOfno {
  public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

    System.out.println("enter your base number :");
    int base = sc.nextInt();

    System.out.println("enter exponent number :");
int exponent = sc.nextInt();

    long result = 1;

    while (exponent != 0) {
      result *= base;
      --exponent;
    }

    System.out.println("Answer = " + result);
  }
}