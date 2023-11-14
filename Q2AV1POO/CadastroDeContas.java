
package com.mycompany.av1poo.Q2AV1POO;
import java.util.*;

public class CadastroDeContas {
    ArrayList<Conta> lista = new ArrayList<>();
    
    public boolean Cadastrar(String nome, int numero){
        Conta cliente = new Conta();
        cliente.numero = numero;
        cliente.titular = nome;
        lista.add(cliente);
        return true;
    }
    
    public void Procurar(int numero){
        for (int i = 0; i < lista.size(); i++){
            int retorno = 0;
            Conta indice = lista.get(i);
            if (indice.numero == numero){
                System.out.printf("Titular: %s \nNúmero: %d \nSaldo: %.2lf", indice.titular, indice.numero, indice.saldo);
                retorno = 1;
            }
            if (retorno != 1){
                System.out.println("Conta Inexistente.");
            } 
        }
    }
    
    public boolean Excluir(int numero){
        for (int i = 0; i < lista.size(); i++){
            int retorno = 0;
            Conta indice = lista.get(i);
            if (indice.numero == numero){
                lista.remove(i);
                retorno = 1;
                return true;
            }
            if (retorno != 1){
                return false;
            } 
        }
    }
    
    public int QtdCadastradas(){
        return lista.size();
    }
}
