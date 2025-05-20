import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int escolha;

        while(true){

            //-------------------------MENU PRINCIPAL-------------------------

            System.out.println("------------MENU------------\nSeja bem-vindo(a) ao mini Sigaa!");
            System.out.println("Escolha uma das opções abaixo para prosseguir:\n");
            System.out.println("[1]Acessar como aluno");
            System.out.println("[2]Acessar como professor");
            System.out.println("[3]Sair do sistema\n");

            escolha = leitor.nextInt();

            switch(escolha){
                case 1:
                    MenuAluno(); //redireciona para o menu aluno
                    break;
            
                case 2:
                    MenuProfessor();
                    break;

                case 3:
                    System.out.println("Fechando sistema...\n");
                    leitor.close();
                    return;

                default:
                    System.out.println("Escolha inválida!\nPor favor, tente novamente\n");
                    //O programa espera 1 segundo para continuar
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    break;
                
            }
        }
    }
    
    //-------------------------MENU DO ALUNO-------------------------
    public static void MenuAluno(){
        System.out.println("Ainda em desenvolvimento...\n");

        //Essa parte faz com que o programa espere 1 segundo para continuar a funcionar
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    //-------------------------MENU DO PROFESSOR-------------------------
    public static void MenuProfessor(){
        System.out.println("Ainda em desenvolvimento...\n");

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
