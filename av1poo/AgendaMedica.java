
package com.mycompany.av1poo;
import java.util.*;

public class AgendaMedica {
    String data;
    ArrayList<MarcacaoHorario> agenda = new ArrayList<>();

    public boolean VerificarHorario(int horario){
        if(agenda.get(horario) == null){
            return false;
        } else {
            return true;
        }
    }
    public void Agendar(String nome, int horario){
        if (VerificarHorario(horario) == false){
           MarcacaoHorario paciente = new MarcacaoHorario();
           paciente.nome = nome;
           paciente.horario = horario;
           agenda.set((horario-13), paciente);
        } else {
            System.out.println("Horário já reservado. ");
        }
    }
    
    public void VerificarPaciente(String nome){
        int retorno = 0;
        for (int i = 0; i < 8; i++){
            MarcacaoHorario indice = agenda.get(i);
            if (indice.nome.equals(nome)){
                System.out.printf("Horário da Consulta: %dh\n", indice.horario);
                retorno = 1;
            }
            if (retorno != 1){
                System.out.println("Não há consulta para esse paciente.");
            }
        }
    }
}
