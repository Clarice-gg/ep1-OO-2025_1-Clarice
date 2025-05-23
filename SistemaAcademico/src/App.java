import java.util.Scanner;

import Sistema.Aluno;
import Sistema.Disciplina;

public class App {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int escolha;

        while(true){

            //-------------------------MENU PRINCIPAL-------------------------

            System.out.println("------------MENU PRINCIPAL------------\nSeja bem-vindo(a) ao mini Sigaa!");
            System.out.println("Escolha uma das opções abaixo para prosseguir:\n");
            System.out.println("[1]Acessar como aluno");
            System.out.println("[2]Acessar como professor");
            System.out.println("[3]Sair do sistema\n");

            escolha = leitor.nextInt();

            switch(escolha){
                case 1:
                    menuAluno(); //redireciona para o menu aluno
                    break;
            
                case 2:
                    menuProfessor();
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

    public static void menuAluno(){
        Scanner leitor = new Scanner(System.in);
        int escolha;
        Aluno aluno = new Aluno();
        //System.out.println("Ainda em desenvolvimento...\n");
        while(true){
            System.out.println("------------MENU ALUNO------------");
            System.out.println("Olá aluno(a)!\nO que deseja fazer?\n");
            System.out.println("[1] Cadastro no sistema");
            System.out.println("[2] Matrícula em disciplina");
            System.out.println("[3] Trancar disciplina/semestre");
            System.out.println("[4] Salvar dados");
            System.out.println("[5] Retornar ao menu principal\n");
            
            escolha = leitor.nextInt();

            switch(escolha){
                case 1:
                    aluno.cadastrarAluno();
                    System.out.println("Cadastro realizado com sucesso!\n");
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    Disciplina.matriculaEmDisciplina();
                    break;

                case 3:
                    System.out.println("O que deseja realizar?");
                    System.out.println("[1] Trancamento geral");
                    System.out.println("[2] Trancamento em uma disciplina\n");
                    escolha = leitor.nextInt();
                    if(escolha==1){
                        aluno.setTrancarCurso(true);
                        System.out.println("Trancamento realizado!\n");
                        try{
                            Thread.sleep(1000);
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    else if(escolha==2){
                        System.out.println("Qual disciplina deseja trancar?");
                    }
                    break;

                case 4:
                    System.out.println("Desenvolvimento...");
                    break;

                case 5:
                    System.out.println("Retornando ao menu principal, por favor aguarde...\n");
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    //leitor.close();
                    return;

                default:
                    System.out.println("Escolha inválida!\nPor favor, tente novamente");
            }
        }

    }

    //-------------------------MENU DO PROFESSOR-------------------------
    public static void menuProfessor(){
        System.out.println("Ainda em desenvolvimento...\n");

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
