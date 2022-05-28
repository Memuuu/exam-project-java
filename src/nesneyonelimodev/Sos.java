
package nesneyonelimodev;


public class Sos extends Sinav {
     public double netHesapla(double x, double z){
        double net;
        if(x+z>=40){
        System.out.println("Sosyal soru sayisi 40den fazla olamaz");  
        System.exit(0);
        }
        net= x-(z/4);
        System.out.println("Net sayisi:" + net);
        return net;
}
        public double snet(double net){
        if(net<0){
        System.out.println("Sosyal netiniz 0'dan az icin hesaplanmamıstır.");
        System.exit(0);
        }
        double spuan;
        spuan=net*2;
        System.out.println("Sosyal puanın kardesim " + spuan);
        return spuan;
                }
    } 
    
    

