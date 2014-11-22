

package CaixaEletronico;

import java.util.Scanner;
import java.util.Random;


public class Caixa {
    
        public static void main(String[] args){
        
            //Declaração das variáveis Scanner e Random
            Scanner dadoEntrada = new Scanner(System.in);
            int contaAcessar, senhaAcessar;
            
            Conta[] vetorConta;
            vetorConta = new Conta[4];
            
            //Criando a conta de um cliente
            Conta minhaConta4 = new contaFisica("Wallace Eduardo", 1325, 3096, "111.850.698.32", 2000);
            Conta minhaConta3 = new contaFisica("Flávio de Paula", 5897, 4285, "085.745.136.82", 250);
            Conta minhaConta2 = new contaJuridica("Andre Juan","Star Horn Royal Club", 2435, 8928, "68.913.711/5860-98", 10.500);
            Conta minhaConta1 = new contaJuridica("Jonatas Lopes","Radical Online Xtremists", 9999, 633, "10.612.738/0633-322", 10.500);
            
            vetorConta[0] = minhaConta1;
            vetorConta[1] = minhaConta2;
            vetorConta[2] = minhaConta3;
            vetorConta[3] = minhaConta4;
            
            System.out.println("Numero da conta a acessar: ");
            contaAcessar = dadoEntrada.nextInt();
            System.out.println("Senha: ");
            senhaAcessar = dadoEntrada.nextInt();
            for(int x = 0; x<4; x++){
                if(contaAcessar == vetorConta[x].conta && senhaAcessar == vetorConta[x].senha){
                    System.out.println("Conta autenticada com sucesso!\n\n");
                    vetorConta[x].iniciar();
                }
            }
            
            
            
            
            
            
        
        
        
        
    
        
    }
    
}
