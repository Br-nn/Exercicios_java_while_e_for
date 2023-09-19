import java.util.Scanner;
public class IntervaloDecrescente {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o menor número: ");
    int inicio = scanner.nextInt();
    System.out.print("Digite o maior número: ");
    int fim = scanner.nextInt();
    int cont = fim;
    while(cont >= inicio){
      System.out.print(cont + " ");
      cont = cont - 1;
    }
    scanner.close();
  }
}
