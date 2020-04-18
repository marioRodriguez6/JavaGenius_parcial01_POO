package com.MJRM.x00131819;

import javax.swing.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {


        ArrayList<Empleado> Workers = new ArrayList<>();

        /*ServicioProfesional tempWork = new ServicioProfesional("", "", 0, 0);
        PlazaFija permWork = new PlazaFija("", "", 0, 0);*/


        int opc1;
        do {
            opc1 = Integer.parseInt(JOptionPane.showInputDialog(null, menuPrincipal()));
            switch (opc1){
                case 1:
                    byte opc2 = Byte.parseByte(JOptionPane.showInputDialog(null, "digite el " +
                       "tipo de empleado a ingresar \n (1. Plaza Fija     2. Servicio Profesional)"));

                    if(opc2==1) {
                        String nombre = JOptionPane.showInputDialog(null, "Ingese su nombre: ");
                        String puesto = JOptionPane.showInputDialog(null, "Puesto del trabajador: ");
                        double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"i" +
                                "ngrese el salario del trabajador: "));
                        int extension = Integer.parseInt(JOptionPane.showInputDialog(null,"in" +
                                "grese el numero de Extension: "));

                        Workers.add(new PlazaFija(nombre, puesto, salario, extension));
                    }else if (opc2 == 2)
                       {
                        String nombre = JOptionPane.showInputDialog(null, "Ingese su nombre: ");
                        String puesto = JOptionPane.showInputDialog(null, "Puesto del trabajador: ");
                        double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"i" +
                                "ngrese el salario del trabajador: "));
                        int contractM = Integer.parseInt(JOptionPane.showInputDialog(null,"in" +
                                "grese el numero de Meses contratado: "));

                        Workers.add(new ServicioProfesional(nombre, puesto, salario, contractM));
                    }else
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta.");

                    break;
                case 2:

                    Workers.toString();

                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del menu.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta.");
            }

        }while(opc1!=3);





    }
    static String menuPrincipal() {
        return  "\n 1. Agregar Empleado. \n 2. Ver pago neto y total. \n 3. Salir del menu.";
    }

}
