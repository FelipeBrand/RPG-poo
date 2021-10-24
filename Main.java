import java.util.Scanner;
import java.util.Random;
class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

  
  duelo um = new duelo();
  duelo dois = new duelo();

  System.out.println("qual a vida do primeiro a jogar?");
    um.hp = ler.nextInt();
    System.out.println("qual a classe de armadura?");
    um.armadura = ler.nextInt();
    System.out.println("qual o bonus de acerto?");
    um.bonus = ler.nextInt();
    System.out.println("qual o dano?");
    um.dano = ler.nextInt();

    System.out.println("qual a vida do segundo a jogar?");
    dois.hp = ler.nextInt();
    System.out.println("qual a classe de armadura?");
    dois.armadura = ler.nextInt();
    System.out.println("qual o bonus de acerto?");
    dois.bonus = ler.nextInt();
    System.out.println("qual o dano?");
    dois.dano = ler.nextInt();

    do {
        Random random = new Random();
        int D20 = random.nextInt(20) + um.bonus;
        if (D20 > dois.armadura){
        dois.hp = dois.hp - um.dano;
        System.out.println("acertou");
        System.out.println("HP de 2 caiu para " + dois.hp);
        
        }else {
            System.out.println("errou");
        }
        int d20 = random.nextInt(20 + dois.bonus);
        if (d20 > um.armadura){
        um.hp = um.hp - dois.dano;
        System.out.println("acertou");
        System.out.println("HP de 1 caiu para " + um.hp);

        }else {
            System.out.println("2 errou");
        }
        
    } while(um.hp > 0 && dois.hp > 0);

       if(dois.hp <= 0){
           System.out.println("o vencedor é 1");
       }else {
           System.out.println("o vencedor é 2");
       }

}
}