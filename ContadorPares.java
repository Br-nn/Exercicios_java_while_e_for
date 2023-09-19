import java.util.Scanner;
public class ContadorPares {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("(Para parar digite: 0) Digite seu número: ");
    int n = scanner.nextInt();
    int cont = 0;
    int pares = 0;
    int par;

    while(n != 0){
      par = n;
      System.out.print("Próximo: ");
      n = scanner.nextInt();
      cont++;
      if(par%2 == 0){
        pares++;
      }else{}
    }
    if (cont == 0){
      System.out.println("Nenhum número foi digitado");
    }else{
      if (pares == 0){
        System.out.println(cont + " Números");
        System.out.println("0 São pares");
      }else{
        System.out.println(cont + " Números");
        System.out.println(pares + " São pares");
      }
    }
    System.out.print("Tamo junto, até a próxima!");
    scanner.close();
  }
}
