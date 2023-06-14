/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.menu;
import java.util.Scanner;

/**
 *
 * @author allan
 */
public class OrdenacaoVetores {
    
    Scanner ler = new Scanner(System.in);

    private int escolha; 
    private int[] numeros = new int[0];
    private int[] numerosOrig = new int[0];
    
    public void Vetores(){
        
        System.out.println("Quantos numeros você quer? ");
        escolha = ler.nextInt();
        numeros = new int[escolha];
        numerosOrig = new int[escolha];

        System.out.println("Quais números você quer adicionar? ");
        for (int i = 0; i < escolha; i++) {
            numeros[i] = ler.nextInt();
            numerosOrig[i] = numeros[i];
        }   
    }
     
    public void OrdenacaoInsercao() {
  
        long inicioContagem = System.nanoTime();
        int chave, j;
        for (int i = 1; i < numeros.length; i++) {
            chave = numeros[i];
            for (j = i - 1; (j >= 0 && numeros[j] > chave); j--) {
                numeros[j + 1] = numeros[j];
            }
            numeros[j + 1] = chave;
        }
        System.out.println("Vetor Ordenado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\nVetor Original");
        for (int i = 0; i < numerosOrig.length; i++) {
            System.out.print(numerosOrig[i] + " ");
        }
        long finalContagem = System.nanoTime();
        long duracao = (finalContagem - inicioContagem) / 1000000;
        System.out.println("\nTempo de execução do método de Inserção: " + duracao + " ms");
    
    }
    
    public void OrdenacaoSelecao(){
        
        long inicioContagem = System.nanoTime();
        for(int i = 0; i < numeros.length-1; i++){
            int posicaoMenor = i;
            for(int j = i+1; j < numeros.length; j++){
                if(numeros[j] < numeros[posicaoMenor]){
                    posicaoMenor = j;
                }
            }
            if(posicaoMenor != i){
                int aux = numeros[i];
                numeros[i] = numeros[posicaoMenor];
                numeros[posicaoMenor] = aux;
            }
        }
         System.out.println("Vetor Ordenado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\nVetor Original");
        for (int i = 0; i < numerosOrig.length; i++) {
            System.out.print(numerosOrig[i] + " ");
        }
        long finalContagem = System.nanoTime();
        long duracao = (finalContagem - inicioContagem) / 1000000;
        System.out.println("\nTempo de execução do método de Inserção: " + duracao + " ms");
    }   
    
    public void OrdenacaoBolha() {
        
        long inicioContagem = System.nanoTime();
        boolean houveTroca = true;
        while (houveTroca) {
            houveTroca = false;
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = aux;
                    houveTroca = true;
                }
            }
        }
        System.out.println("Vetor Ordenado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\nVetor Original");
        for (int i = 0; i < numerosOrig.length; i++) {
            System.out.print(numerosOrig[i] + " ");
        }
        long finalContagem = System.nanoTime();
        long duracao = (finalContagem - inicioContagem) / 1000000;
        System.out.println("\nTempo de execução do método de Inserção: " + duracao + " ms");
    }
    
    public void OpcaoBinaria(){
       
        
        int numeroPesquisa = 0;
        System.out.println("Informe o numero a ser pesquisado: ");
            numeroPesquisa = ler.nextInt();            
        int posicao = PesquisaBinaria(numeroPesquisa, numeros);
        
        if(posicao >= 0){
            System.out.println("O Elemento "+numeroPesquisa+" está localizado na "
                + "posição: "+posicao);
        }else{
            System.out.println(
                    "O Elemento "+numeroPesquisa+" não foi localizado na lista");
        }   
    }
    public static int PesquisaBinaria(int chave, int[]vet){
        int esquerda, meio, direita;
        esquerda = 0;
        direita = vet.length -1; 
        while(esquerda <= direita){
            meio = (esquerda + direita) / 2;
            if(chave == vet[meio]){
                return meio;
            }
            if(chave > vet[meio]){
                esquerda = meio +1;
            }else{
                direita = meio -1;
            }    
        }
        return -1;
    }
    
    public void OpcaoLinear(){
        int numeroPesquisa =0; 
        System.out.println("Informe o numero a ser pesquisado");
        numeroPesquisa = ler.nextInt();
        int posicao = pesquisaLinear(numeroPesquisa,numeros);
        if(posicao >= 0){
           System.out.println("O Elemento "+numeroPesquisa+" esta localizado na posição: "+posicao); 
        }else{
            System.out.println("O elemento "+numeroPesquisa+" não foi localizado na lista");
        }   
    }
    public static int pesquisaLinear(int chave, int[] vet){
        for(int i=0;i<vet.length;i++){
            if(chave == vet[i])
                return i;
        }
        return -1;
    }
}

