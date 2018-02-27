/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudojava;

/**
 *
 * @author Lucas F.
 */
public class EstudoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Minha primeira Aplicação em Java");
        int idade;
        idade = 15;
        System.out.println(idade);
        
        int idadeAnoQueVem;
        idadeAnoQueVem = idade + 1;
        
        System.out.println(idadeAnoQueVem);
        
        boolean amigoDoDono = false;
        if (idade<18 && !amigoDoDono){
            System.out.println("Não pode entrar");
        } else {
            System.out.println("Entrada Liberada");
        }
        
        while (idade < 18){
            System.out.println(idade);
            idade = idade + 1;
        }
        
        
        for (int i=1; i<1000; i++){
            if (i % 19 == 0){
                System.out.println("Numero divisivel por 19: "+ i);
                break;
            }
        }
        
        for (int i=0; i<100; i++){
            if (i>50 && i<60){
                continue;
            }
            System.out.println(i);
        }
    }
    
}
