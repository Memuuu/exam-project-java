
package nesneyonelimodev;

public class Sinav {
    public double puan;
    public Sinav(){}
    
    public double puanHesapla(double a, double b, double c, double d){
        puan=(a+b+c+d)/4;
        System.out.println("Puanın " + puan + "/100");
        if(puan<50){
        System.out.println("ELENDİN");
        }
        else{
        System.out.println("KAZANDIN");
        }
            
    
        return puan;
    }
    
   
    } 
    
     


