

package CaixaEletronico;


public class contaFisica extends Conta {
    private String cpf;

   
    public String getCpf() {
        return cpf;
    }

    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void extrato(){
            System.out.println("\tEXTRATO");
            System.out.println("Nome: " + this.getNome());
            System.out.println("Número da conta: " + this.getConta());
            System.out.println("CPF do Titular: " + this.cpf);
            System.out.println("Saldo atual: " + this.getSaldo());
            System.out.println("Saques realizados hoje em terminais 24Hrs: " + this.getSaques());
        }
    public contaFisica(String nomeTitular, int conta, int senha, String cpf, double saldo_inicial){
            this.nomeTitular = nomeTitular;
            this.conta = conta;
            this.senha = senha;
            this.cpf = cpf;
            saldo = saldo_inicial;
            saques = 0;
    }
    
}
