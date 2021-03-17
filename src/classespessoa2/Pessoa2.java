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
public abstract class Pessoa2 {

    private String nome = "";
    private String endereco = "";
    private String telefone = "";
    private String email = "";
    private float rendaBruta = 1;
    private String tipoPessoa = "";
    
    public abstract String tipoPessoa();
    

    public Pessoa2()throws Exception {
        if (rendaBruta <= 0) {
            throw new Exception("Renda bruta não pode ser menor ou igual a 0;");                    
        }
        this.rendaBruta = 1;
    }

    public Pessoa2(String nome, String endereco, String telefone,
            String email, float rendaBruta, String tipoPessoa)throws Exception {
        this.rendaBruta = 1;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.rendaBruta = rendaBruta;
        this.tipoPessoa = tipoPessoa;
        
        if (rendaBruta <= 0) {
            throw new Exception("Renda bruta não pode ser menor ou igual a 0;");                    
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(float rendaBruta)throws Exception {
        this.rendaBruta = rendaBruta;
        if (rendaBruta <= 0) {
            throw new Exception("Renda bruta não pode ser menor ou igual a 0;");                    
        }
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
    

}
