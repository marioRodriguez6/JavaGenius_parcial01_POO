package com.MJRM.x00131819;


public final class CalculadoraImpuestos {

    private double totalRenta, totalISS, totalAFP;

    private CalculadoraImpuestos(){

    }

   public double calcularPago(Empleado empleado){
        double pagoEmployee = 0;
        double sueldo = empleado.getSalario();

        if (empleado instanceof ServicioProfesional){
            double rentaS = (sueldo * 0.1);
            totalRenta += rentaS;
            pagoEmployee = (sueldo - rentaS);
            }
        else if (empleado instanceof PlazaFija){
            double rentaP = 0;
            double AFP = (sueldo * 0.0625);
            double ISS = (sueldo * 0.03);
            double restante = (sueldo - AFP - ISS);

            if (restante >= 0.1 && restante <= 472.00)
                rentaP = 0;
            else if (restante >= 472.01 && restante <= 895.24)
                rentaP = (0.1*(restante - 472)+17.67);
            else if (restante >= 895.25 && restante <= 2038.10)
                rentaP = (0.2*(restante - 895.24) +60);
            else if (restante >= 2038.11)
                rentaP = (0.3*(restante - 2038.10) + 288.57);

                totalAFP += AFP;
                totalISS+= ISS;
                totalRenta += rentaP;

                pagoEmployee = (restante - rentaP);
        }

        return pagoEmployee ;
    }

    public String mostrarTotales(){

        System.out.println("total de renta: " + totalRenta);
        System.out.println("total de ISS: " + totalISS);
        System.out.println("total de AFP: " + totalAFP);


        return null;
    }

}
