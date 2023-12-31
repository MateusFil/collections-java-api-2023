package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;


public class ConjuntoConvidados {
    //atributo

    private Set<Convidado> convidadoSet;


    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }


    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;

        for (Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
       convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Mateus", 25);
        conjuntoConvidados.adicionarConvidado("Filipe", 15);
        conjuntoConvidados.adicionarConvidado("Juregue", 256);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidados dentro do Set Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(25);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidados dentro do Set Convidados");

        conjuntoConvidados.exibirConvidados();

    }
}




