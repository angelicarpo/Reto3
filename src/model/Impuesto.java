
package model;

public class Impuesto extends Transito {
    String tipoImpuesto;

    public Impuesto(String tipoImpuesto, String placa) {
        super(placa);
        this.tipoImpuesto = tipoImpuesto;
    }
    
    //IMPTO MUNICIPAL
    public double calculaImp(){
        return smlv;
    }
    
    //IMPTO DPTAL
    public double calculaImp(int modelo){
        if (modelo<=2010){
            return smlv*1.1;
        }
        else{
            return smlv*1.2;
        }
    }
    
    //DCTO DPTAL
    public double calculaDcto(int modelo,double vlrImp){
  
            if (modelo>=2010 && modelo<=2015){
               return vlrImp*0.05;
            }
            else{
                if(modelo>2015){
                   return vlrImp*0.1;
                }
            }
    
        return 0;
    }
    
    //DCTO D Y M
    public double calculaDcto(String soat,double vlrImp){
        if (soat.equals("S")){
            return vlrImp*0.05;
        }
        return 0;
    }
    
}
