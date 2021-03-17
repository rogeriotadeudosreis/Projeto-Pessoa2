package classespessoa2;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class PessoaFisica extends Pessoa2 implements Ipessoa2 {

    private String cpf;
    private char sexo;

    public PessoaFisica() throws Exception {

    }

    public PessoaFisica(String cpf, char sexo) throws Exception {
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public PessoaFisica(String cpf, char sexo, String nome, String endereco,
            String telefone, String email, float rendaBruta, String tipoPessoa) throws Exception {
        super(nome, endereco, telefone, email, rendaBruta, tipoPessoa);
        if (isCPF(cpf) != true) {
            JOptionPane.showMessageDialog(null, "CPF inválido.\n");
        }
        
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public float calcularImpostoDeRenda() {
        float renda = this.getRendaBruta();
        float imposto = 0;
        String impostoIsento = "ISENTO";

        if (renda <= 1400) {
            return imposto;            
        }
        else if (renda > 1400 && renda <= 2100) {
            imposto = (float) (renda * 0.1);
        }
        else if (renda > 2100 && renda <= 2800) {
            imposto = (float) (renda * 0.15);
        }
        else if (renda > 2800 && renda <= 3600) {
            imposto = (float) (renda * 0.25);
        } else {
            imposto = (float) (renda * 0.30);
        }

        return imposto;
    }

    public boolean isCPF(String CPF) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000")
                || CPF.equals("11111111111")
                || CPF.equals("22222222222") || CPF.equals("33333333333")
                || CPF.equals("44444444444") || CPF.equals("55555555555")
                || CPF.equals("66666666666") || CPF.equals("77777777777")
                || CPF.equals("88888888888") || CPF.equals("99999999999")
                || (CPF.length() != 11)) {
            return (false);
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

        try {

            // Calculando o primeiro digito
            sm = 0;
            peso = 10;

            for (i = 0; i < 9; i++) {
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;

            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48);
            }

            //Calculando o segundo digito
            sm = 0;
            peso = 11;

            for (i = 0; i < 10; i++) {
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;

            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

            //Verificando se os dígitos calculados são iguais os fornecidos pelo usuário
            if ((dig10 == CPF.charAt(9)) && dig11 == CPF.charAt(10)) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException e) {
            return (false);
        }
    }

    public String imprimirDadosPessoaFisica() {
        String saida = "CPF:             " + getCpf() + "\n";
        saida += "Status do CPF:   " + isCPF(cpf) + "\n";
        saida += "Sexo:            " + getSexo()+ "\n";
         if(calcularImpostoDeRenda() == 0){            
        saida += "Imposto a pagar: " + "ISENTO" + "\n";
        }else {
        saida += "Imposto a pagar: " + calcularImpostoDeRenda() + "\n";
         }
        return saida;
    }

    @Override
    public String tipoPessoa() {
        return "PESSOA FÍSICA";
    }

}
