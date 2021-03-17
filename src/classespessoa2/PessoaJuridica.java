/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classespessoa2;

/**
 *
 * @author roger
 */
public class PessoaJuridica extends Pessoa2 implements Ipessoa2{
    
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica() throws Exception {
    }

    public PessoaJuridica(String nome, String endereco, String telefone,
            String email, float rendaBruta, String tipoPessoa) throws Exception {
        super(nome, endereco, telefone, email, rendaBruta, tipoPessoa);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public float calcularImpostoDeRenda() {
        float renda = this.getRendaBruta();
        float imposto = (float)(renda * 0.1);        
        return imposto;
    }
    
    public String imprimirDadosPessoaJuridica(){
        String saida = "Razão Social:    " + getRazaoSocial() + "\n";
        saida += "CNPJ:            " + getCnpj() + "\n";
        saida += "Imposto a pagar  " + calcularImpostoDeRenda() + "\n";        
        return saida;
    }

    @Override
    public String tipoPessoa() {
        return "PESSOA JURÍDICA";
    }
    
    
    
    
    
    

}
