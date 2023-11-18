/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gustavohoresteesantosbarros_atividadeavaliativa2;

/**
 *
 * @author gustavohorestee
 */
public class GustavoHoresteeSantosBarros_AtividadeAvaliativa2 {

    public static void main(String[] args) {
        Telefone telefone1 = new Telefone();
        telefone1.setTipo("Celular");
        telefone1.setDdd("012");
        telefone1.setNumero("987654321");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Residencial");
        telefone2.setDdd("034");
        telefone2.setNumero("123456789");

        Endereco endereco = new Endereco();
        endereco.setRua("Rua Teste");
        endereco.setCidade("Cidade Teste");
        endereco.setEstado("Estado Teste");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Fulano");
        pessoa.setCpf("123.456.789-00");
        pessoa.setEmail("fulano@example.com");
        pessoa.addTelefone(telefone1);
        pessoa.addTelefone(telefone2);
        pessoa.setEndereco(endereco);

        Curso curso = new Curso("Ciência da Computação");

        Professor professor = new Professor();
        professor.setTitulacao("Doutor");
        professor.setSalario(5000.0);
        professor.addCurso(curso);
        

        Aluno aluno = new Aluno();
        aluno.setCurso(curso);

        pessoa.imprimir();
        System.out.println();

        curso.imprimirCurso();
        System.out.println();

        professor.imprimir();
        System.out.println();

        aluno.imprimir();
    }
}




