/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.questao1;

public class Data {

    private int mes;  // 1-12
    private int dia;    // 1-31 based on month
    private int ano;   // any year

    // Constructor: Confirm proper value for month;
    // call method checkDay to confirm proper
    // value for day.
    public Data(int theMonth, int theDay, int theYear) {
        if (theMonth > 0 && theMonth <= 12) // validate month
        {
            mes = theMonth;
        } else {
            mes = 1;
            System.out.println("Mes " + theMonth
                    + " invalido. Definir mes como 1.");
        }

        ano = theYear;                 // could validate year
        dia = checkDay(theDay);       // validate day

    }

    // Utility method to confirm proper day value
    // based on month and year.
    private int checkDay(int testDay) {
        int daysPerMonth[]
                = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // check if day in range for month
        if (testDay > 0 && testDay <= daysPerMonth[mes]) {
            return testDay;
        }

        // check for leap year
        if (mes == 2 && testDay == 29
                && (ano % 400 == 0
                || (ano % 4 == 0 && ano % 100 != 0))) {
            return testDay;
        }

        System.out.println("Dia " + testDay
                + " invalido. Definido dia como 1.");

        return 1;  // leave object in consistent state
    }

    // Create a String of the form month/day/year
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public String incrementaDia() {
        dia += 1;
        if (dia > 31) {
            dia = 1;
            mes += 1;
            if (mes > 12) {
                mes = 1;
                ano += 1;
            }
        }
        if(mes == 2 && dia > 28){
            dia = 1;
            mes += 1;
        }
        return toString();
    }
    
    public String incrementaDias(int numeroDias){
        
        dia += numeroDias;
        if (dia > 31) {
            dia = 1;
            mes += 1;
            if (mes > 12) {
                mes = 1;
                ano += 1;
            }
        }
        if(mes == 2 && dia > 28){
            dia = 1;
            mes += 1;
        }
        return toString();
    }

}  // end class Date

