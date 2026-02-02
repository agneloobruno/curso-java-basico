package main.java.com.bruno.cursojava.aula39;

import com.sun.jdi.request.StepRequest;

public class Teste {

    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("João das Neves");
        //contato.setEndereco("Castelo Negro");
        //contato.setTelefone("11 99999-9999");

        //criar o objeto endereco
        Endereco end = new Endereco();
        end.setNomeRua("Rua dos finais ruins");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("A Muralha");
        end.setEstado("O Norte");
        end.setCep("99999-999");

        contato.setEndereco(end);

        //criando o objeto telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("12");
        telefone.setNumero("99999-9999");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Casa");
        telefone2.setDdd("12");
        telefone2.setNumero("3000-0000");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        //contato.setTelefone(telefone);
        contato.setTelefones(telefones);

        System.out.println(contato.getNome());
        //System.out.println(contato.getTelefone());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

/*
        if (contato != null && contato.getTelefone() != null) {
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        }
*/
        if (contato != null &&  contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }

    }
}
