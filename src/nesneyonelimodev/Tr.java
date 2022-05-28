
package nesneyonelimodev;

public class Tr extends Sinav{
     public double netHesapla(double x, double z){
        double net;
        if(x+z>=40){
        System.out.println("Turkce soru sayisi 40tan fazla olamaz");  
        System.exit(0);
        }
        net= x-(z/4);
        System.out.println("Net sayisi:" + net);
        return net;
}
        public double tnet(double net){
        if(net<0){
        System.out.println("Turkce netiniz 0'dan az hesaplanmamıstır.");
        System.exit(0);
        }
        double tpuan;
        tpuan=net*3;
        System.out.println("Turkce puanın kardesim " + tpuan);
        return tpuan;
         }
    } 
    
