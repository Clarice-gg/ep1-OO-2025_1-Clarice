package Sistema;

import static Sistema.Aluno.listaDeAlunos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SalvarDados {

    public static void escreverArquivoAlunos(String caminho){
        try (FileWriter fileWriter = new FileWriter(caminho)) {
            for (Aluno a : listaDeAlunos) {
                fileWriter.write("Nome: "+a.getNome()+" | Curso: "+a.getCuso()+" | Matrícula: "+a.getMatricula());
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar alunos: " + e.getMessage());
        }
    }

    public static void escreverArquivoDisciplinas(String caminho){
        try (FileWriter fileWriter = new FileWriter(caminho)) {
            for (Disciplina d : Disciplina.getListaDisciplinas()) {
                String linha = "Professor responsável: "+d.getProfessorResp()+
                " | Nome da disciplina: "+d.getNomeDaDisciplina()+" | Horário: "+d.getHorario()+
                " | Sala: "+d.getSala()+" | Carga horária: "+d.getCreditos()+" | Presencial: "+d.getMetodo()+
                " | Quantidade de alunos: "+d.getTamanhoTurma();
                fileWriter.write(linha+"\n");

                List<Aluno> alunos = d.getAlunosMatriculados();
                for(Aluno a : alunos){
                    fileWriter.write("Aluno: "+a.getNome()+" | Matrícula: "+a.getMatricula());
                    fileWriter.write("\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar disciplinas: " + e.getMessage());
        }
    }
}
