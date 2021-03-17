/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classespessoa2;

import javax.swing.JOptionPane;

public class StartPessoa2 {
    
    public static void imprimirDadosContribuinte(Pessoa2 objeto){
        System.out.println("******* Dados do Contribuinte *******");
        System.out.println("Tipo:            " + objeto.tipoPessoa());
        System.out.println("Nome:            " + objeto.getNome());
        System.out.println("Endereço:        " + objeto.getEndereco());
        System.out.println("Telefone:        " + objeto.getTelefone());
        System.out.println("Email:           " + objeto.getEmail());
        System.out.println("Renda bruta:     " + objeto.getRendaBruta());        
    }
    
    public static void main(String[] args) {
        
        try {
            PessoaFisica contribuinte1 = new PessoaFisica("", 'M', "Rogério Tadeu dos Reis", 
                    "Rua 1", "55-62-98591-5534", "rogerio.rtr46@gmail.com", 1500, "PESSOA FÍSICA");
            imprimirDadosContribuinte(contribuinte1);
            System.out.println(contribuinte1.imprimirDadosPessoaFisica());
           
            
            PessoaJuridica contribuinte2 = new PessoaJuridica("RTR SOLUÇÕES EM SOFTWARE", "RUA 2", 
                    "55-62-3201-0000", "rtr46@gmail.com", 25000, "PESSOA JURÍDICA");
            contribuinte2.setCnpj("00.000.0001/00");
            contribuinte2.setRazaoSocial("Rogério Tadeu dos Reis -  ME");
            
            imprimirDadosContribuinte(contribuinte2);
            System.out.println(contribuinte2.imprimirDadosPessoaJuridica());
            System.out.println("");          
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}
