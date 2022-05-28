
package nesneyonelimodev;


public class Fen extends Sinav{
     public double netHesapla(double x, double z){
        double net;
        if(x+z>=40){
        System.out.println("Fen soru sayisi 40den fazla olamaz");  
        System.exit(0);
        }
        net= x-(z/4);
        System.out.println("Net sayisi:" + net);
        return net;
}
        public double fnet(double net){
        if(net<0){
        System.out.println("Fen netiniz 0'dan az icin hesaplanmamıstır.");
        System.exit(0);
        }
        double fpuan;
        fpuan=net*2;
        System.out.println("Fen puanın kardesim " + fpuan);
        return fpuan;
                }
    } 
    
