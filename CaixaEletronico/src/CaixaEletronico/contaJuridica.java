

package CaixaEletronico;


public class contaJuridica extends Conta {
    private String cnpj;
    private String nomeFantasia;

   
    public String getCnpj() {
        return cnpj;
    }

   
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
     
    public String getNomeFantasia() {
        return nomeFantasia;
    }

  
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    
    public void extrato(){
            System.out.println("\tEXTRATO");
            System.out.println("Nome do Titular: " + this.getNome());
            System.out.println("Nome Fantasia: " + this.getNomeFantasia());
            System.out.println("Número do CNPJ: " + this.getConta());
            System.out.println("CPF do Titular: " + this.cnpj);
            System.out.println("Saldo atual: " + this.getSaldo());
            System.out.println("Saques realizados hoje em terminais 24Hrs: " + this.getSaques());
        }
    
    public contaJuridica(String nomeTitular, String nomeFantasia, int conta, int senha, String cnpj, double saldo_inicial){
            this.nomeTitular = nomeTitular;
            this.nomeFantasia = nomeFantasia;
            this.conta = conta;
            this.senha = senha;
            this.cnpj = cnpj;
            saldo = saldo_inicial;
            saques = 0;
    }

  
   
    
}
