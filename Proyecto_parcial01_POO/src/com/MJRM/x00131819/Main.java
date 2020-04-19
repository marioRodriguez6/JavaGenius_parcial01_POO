package com.MJRM.x00131819;

import javax.swing.*;
import java.text.DecimalFormat;

public class Main {
static DecimalFormat df = new DecimalFormat("#.00");
  public static void main(String[] args) {


    ServicioProfesional tempWork = new ServicioProfesional("", "", 0, 0);
    PlazaFija permWork = new PlazaFija("", "", 0, 0);


     int opc1;
     do {
        opc1 = Integer.parseInt(JOptionPane.showInputDialog(null, menuPrincipal()));

         switch (opc1) {
           case 1:
             byte opc2 = Byte.parseByte(JOptionPane.showInputDialog(null, "digite el " +
             "tipo de empleado a ingresar \n (1. Plaza Fija     2. Servicio Profesional)"));

             if (opc2 == 1) {
                 permWork.nombre = JOptionPane.showInputDialog(null, "Ingese su nombre: ");
                 permWork.puesto = JOptionPane.showInputDialog(null, "Puesto del trabajador: ");
                 permWork.salario = Double.parseDouble(JOptionPane.showInputDialog(null, "ing" +
                 "rese el salario del trabajador: "));
              int extension = Integer.parseInt(JOptionPane.showInputDialog(null, "in" +
              "grese el numero de Extension: "));
              permWork.setExtension(extension);

            } else if (opc2 == 2) {
               tempWork.nombre = JOptionPane.showInputDialog(null, "Ingese su nombre: ");
               tempWork.puesto = JOptionPane.showInputDialog(null, "Puesto del trabajador: ");
               tempWork.salario = Double.parseDouble(JOptionPane.showInputDialog(null, "i" +
               "ngrese el salario del trabajador: "));
               int contractM = Integer.parseInt(JOptionPane.showInputDialog(null, "in" +
               "grese el numero de Meses contratado: "));
               tempWork.setMesesContrato(contractM);

            } else
               JOptionPane.showMessageDialog(null, "Opcion incorrecta.");

              break;

           case 2:
               byte opc3 = Byte.parseByte(JOptionPane.showInputDialog(null, "digite el " +
                       "tipo de empleado que desea que muestre sueldo y total." +
                       " \n (1. Plaza Fija     2. Servicio Profesional)"));

               if (opc3 == 1) {
                  PlazaFija ds = new PlazaFija(permWork.nombre, permWork.puesto, permWork.salario, permWork.getExtension());
                  JOptionPane.showMessageDialog(null, "nombre del trabajador: " + permWork.nombre);
                  JOptionPane.showMessageDialog(null, "salario del trabajador: " + permWork.salario);
                   JOptionPane.showMessageDialog(null, "Extension de trabajador: " + permWork.getExtension());


                   JOptionPane.showMessageDialog(null, "el pago neto de " + ds.getNombre()
                  + "es de: $" + df.format(CalculadoraImpuestos.calcularPago(ds)));

                   JOptionPane.showMessageDialog(null, "Los totales de " + ds.getNombre()
                           + " son " + CalculadoraImpuestos.mostrarTotales());



               } else if (opc3 == 2) {
                   ServicioProfesional as = new ServicioProfesional(tempWork.nombre, tempWork.puesto, tempWork.salario, tempWork.getMesesContrato());
                   JOptionPane.showMessageDialog(null, "nombre del trabajador: " + tempWork.nombre);
                   JOptionPane.showMessageDialog(null, "salario del trabajador: " + tempWork.salario);
                   JOptionPane.showMessageDialog(null, "meses contratado: " + tempWork.getMesesContrato());

                   JOptionPane.showMessageDialog(null, "el pago neto de " + as.getNombre()
                   + " es de: $" + df.format(CalculadoraImpuestos.calcularPago(as)));

                   JOptionPane.showMessageDialog(null, "Los totales de " + as.getNombre()
                           + " son de: $" + CalculadoraImpuestos.mostrarTotales());

               } else
                   JOptionPane.showMessageDialog(null, "Opcion incorrecta.");

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
