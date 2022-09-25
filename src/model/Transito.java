
package model;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Transito {
    String placa;
    double smlv=1000000,netoPagar;

    public Transito(String placa) {
        this.placa = placa;
    }
    
    public void factura(double vlrImp,double vlrDcto){
        netoPagar=vlrImp-vlrDcto;
        JOptionPane.showMessageDialog(null,"Placa vehículo: "+placa+
                                           "\nValor Impuesto: "+vlrImp+
                                      "\nValor Descuento: "+vlrDcto+
                                      "\nValor Neto: "+netoPagar);
        
    }
   
    public void factura(double vlrImp,double vlrDcto,
                        JLabel lblImpuesto, JLabel lblDescuento,JLabel lblNeto){
        netoPagar=vlrImp-vlrDcto;
        lblImpuesto.setText(""+vlrImp);
        lblDescuento.setText(""+vlrDcto);
        lblNeto.setText(""+netoPagar);
    }
}
