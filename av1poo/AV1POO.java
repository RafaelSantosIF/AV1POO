
package com.mycompany.av1poo;


public class AV1POO {

    public static void main(String[] args) {
        AgendaMedica doutorx = new AgendaMedica();
        doutorx.data = "14-11-2023";
        doutorx.Agendar("Cléber", 14);
        doutorx.Agendar("Capivara", 16);
        doutorx.Agendar("Tim Maia", 20);
        doutorx.Agendar("Machado de Assis", 16);
        
        doutorx.VerificarPaciente("Cléber");
        doutorx.VerificarPaciente("Capivara");
        doutorx.VerificarPaciente("Machado de Assis");
    }
}
