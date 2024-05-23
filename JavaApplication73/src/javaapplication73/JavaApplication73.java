/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication73;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class JavaApplication73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Digite os dados do Produto 1:");
            double custoBeneficioProduto1 = calcularCustoBeneficio(scanner);
            
            System.out.println("\nDigite os dados do Produto 2:");
            double custoBeneficioProduto2 = calcularCustoBeneficio(scanner);
            
            System.out.printf("\nO valor do produto 1 em ml/g e de: %.3f", custoBeneficioProduto1);
            System.out.printf("\nO valor do produto 2 em ml/g e de: %.3f", custoBeneficioProduto2);
            
            if (custoBeneficioProduto1 < custoBeneficioProduto2) {
                System.out.println("\nO Produto 1 oferece o melhor custo-beneficio." );
            } else if (custoBeneficioProduto1 > custoBeneficioProduto2) {
                System.out.println("\nO Produto 2 oferece o melhor custo-beneficio.");
            } else {
                System.out.println("\nAmbos os produtos oferecem o mesmo custo-beneficio.");
            }
            
            System.out.print("\nDeseja comparar mais produtos? (S/N): ");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("S")) {
                
            }
        }
        
    }
    
    private static double calcularCustoBeneficio(Scanner scanner) {
        System.out.print("Volume ou Massa do produto (em ml/g): ");
        double volumeMassa = scanner.nextDouble();
        
        System.out.print("Preco do produto (em R$): ");
        double preco = scanner.nextDouble();
        
        return preco / volumeMassa;
    }
}
        // TODO code application logic here
    
    

