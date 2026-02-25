package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Oculos;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
        Oculos oculos1 = new Oculos();
        oculos1.lente = "Grau";
        oculos1.preço = 300;
        oculos1.antireflexo = true;	

        // Criando o segundo passageiro (Objeto 2)
        Oculos oculos2 = new Oculos();
        oculos2.lente = "Polarizada";
        oculos2.preço = 400;
        oculos2.antireflexo = false;
        

        // Exibindo os dados no Console	
        System.out.println("A lente do meu óculos 1 é: " + oculos1.lente);
        System.out.println("O preço do meu óculos 1 é: " + oculos1.preço);
        System.out.println("Meu óculos 1 é anti-reflexo?: " + oculos1.antireflexo);
        System.out.println("A lente do meu óculos 2 é: " + oculos2.lente);
        System.out.println("O preço do meu óculos 2 é: " + oculos2.preço);
        System.out.println("Meu óculos 1 é anti-reflexo?: " + oculos2.antireflexo);
        
        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
    }
}