import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int a,b,suma;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Podaj liczbe a: ");
    a = scanner.nextInt();
    System.out.println("Podaj liczbe b: ");
    b = scanner.nextInt();
    suma=a+b;
    System.out.println("Wynik dodawania a + b = "+suma);
    
  }
}