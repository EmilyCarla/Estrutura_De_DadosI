import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


class Pessoa{
    private String nome;
    private String telefone;
    private String endereco;
    private String cpf;
    private int numero;


    public Pessoa( int numero){
       
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        return nome + " (número " + numero + ")";
    }
}

public class ProblemaJosephus {
    public static void main(String[] args) {

    Random numerosAleatorios  = new Random();
    List<Pessoa> pessoas = new ArrayList<Pessoa>();
    int numeroPessoas = 20;
    int numeroEliminado = 3;


    for(int i=1; i<= numeroPessoas; i++){
        pessoas.add(new Pessoa(i));
    }
    while(pessoas.size()>1){
        int numeroSorteado = numerosAleatorios.nextInt(pessoas.size());
        for(int i=0; i<numeroEliminado-1; i++){
            numeroSorteado = (numeroSorteado+1) % pessoas.size();
        }
        Pessoa pessoaEliminada = pessoas.remove(numeroSorteado);
        System.out.println(" Número da pessoa eliminada: " + pessoaEliminada);
    }
    Pessoa sobrevivente = pessoas.get(numeroEliminado);
    System.out.println("Sobrevivente numero: " + sobrevivente);
    }     
}
