# Sistema Acadêmico - FCTE

## Descrição do Projeto

Desenvolvimento de um sistema acadêmico para gerenciar alunos, disciplinas, professores, turmas, avaliações e frequência, utilizando os conceitos de orientação a objetos (herança, polimorfismo e encapsulamento) e persistência de dados em arquivos.

O enunciado do trabalho pode ser encontrado aqui:
- [Trabalho 1 - Sistema Acadêmico](https://github.com/lboaventura25/OO-T06_2025.1_UnB_FCTE/blob/main/trabalhos/ep1/README.md)

## Dados do Aluno

- **Nome completo:** Clarice Gitirana Gusson
- **Matrícula:** 242015791
- **Curso:** Orientação a objetos
- **Turma:** 06

---

## Instruções para Compilação e Execução

1. **Compilação:**  
   javac App.java

2. **Execução:**  
   java App
   - Obs.: caso a compilação e execução não funcione de forma esperada, é possível utilizar a função 'run' já presente no começo da main (pois a versão 21 do java       permite esse "atalho"

4. **Estrutura de Pastas:**  
   - Aluno
   - AlunoEspecial
   - Disciplina
   - Avaliação
   - SalvarDados (para salvar em arquivos)
   - App (main/principal)

3. **Versão do JAVA utilizada:**  
   java 21

---

## Vídeo de Demonstração

- https://drive.google.com/file/d/1WFynHXAtJgZKnJbCwese5023FH_FX83p/view?usp=drive_link

---

## Prints da Execução

1. Menu Principal e Cadastro de Aluno:  
   ![Print 1](print1.png)
   
3. Menu Professor e Cadastro de Disciplina:  
   ![Print 2](print2.png)

4. Lançamento de Notas:  
   ![Print 3](print3.png)

5. Exemplo da Listagem de Disciplinas e Alunos no arquivo .txt:
   ![Print 4](print4.png)

---

## Principais Funcionalidades Implementadas

- [ ] Cadastro, listagem, matrícula e trancamento de alunos (Normais e Especiais)
- [ ] Cadastro de disciplinas e criação de turmas (presenciais e remotas)
- [ ] Matrícula de alunos em turmas
- [ ] Lançamento de notas
- [ ] Cálculo de média final
- [ ] Relatórios de desempenho acadêmico por aluno e disciplina
- [ ] Persistência de dados em arquivos (.txt)
- [ ] Uso de herança, polimorfismo e encapsulamento

---

## Observações (Extras ou Dificuldades)

- Criação de um método para criar as matrículas aleatoriamente, diminuindo o risco de uma matrícula repetida
- Dificuldade em como listar cada aluno matriculado na respectiva disciplina
- Dificuldade em como salvar os dados no formato de arquivo .txt

