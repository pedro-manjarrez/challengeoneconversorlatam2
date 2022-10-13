
package PaquetePrincipal;


public class Conversiones {
    
    public double resultpesMdol;
    public double resultpesMdo2;
    public double resultpesTemp1;
    public double resultpesTemp2;
    
    public void pesosMXDolar (double pesMDol1, double pesMDol2){
        resultpesMdol = pesMDol1 / pesMDol2;
    }
    public void dolarPesosM (double dolPesM1, double dolPesM2){
        resultpesMdo2 = dolPesM1 * dolPesM2;
    }
    public void CentFahr (double centigradosToFarhrenheit){
        resultpesTemp1 = (centigradosToFarhrenheit * (9/5)) + 32;
    }
}
    

