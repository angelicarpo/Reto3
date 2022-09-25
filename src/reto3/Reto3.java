
package reto3;

import javax.swing.JOptionPane;
import model.Impuesto;

public class Reto3 {

    public static void main(String[] args) {
        String continuar="S";
        while (continuar.equals("S")){
            String tipoImpuesto = JOptionPane.showInputDialog("Tipo impuesto "+
                                                         "\nD - Departamental"+
                                                         "\nM - Municipal").toUpperCase();
            String placa=JOptionPane.showInputDialog("Ingese placa del vehículo");
            String soat=JOptionPane.showInputDialog("SOAT al dia?"+
                                                    "\nS"+"\nN").toUpperCase();
            
            Impuesto impuesto = new Impuesto(tipoImpuesto,placa);
            double vlrImp, vlrDcto1;
            
            if (tipoImpuesto.equals("D")){
                int modelo=Integer.parseInt(JOptionPane.showInputDialog("Digite modelo del vehículo "));
                vlrImp=impuesto.calculaImp(modelo);
                vlrDcto1=impuesto.calculaDcto(modelo, vlrImp);   
            }
            else{
                vlrImp=impuesto.calculaImp();
                vlrDcto1=0;
            }

            double vlrDcto2=impuesto.calculaDcto(soat, vlrImp);
            impuesto.factura(vlrImp, (vlrDcto1+vlrDcto2));
            
            continuar=JOptionPane.showInputDialog("Desea continuar S/N?").toUpperCase();
        }
        
        
        
        
        
    }
    
}
