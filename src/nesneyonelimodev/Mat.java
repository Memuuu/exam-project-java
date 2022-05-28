
package nesneyonelimodev;


public class Mat extends Sinav {
     public double netHesapla(double x, double z){
        double net;
        if(x+z<=40){   
        net= x-(z/4);
        System.out.println("Net sayisi:" + net);
        return net;
     }
        System.out.println("Mat soru sayisi 40tan fazla olamaz"); 
        System.exit(0);
        return 0;
     }
        public double mnet(double net){
        if(net<0){
        System.out.println("Matematik netiniz 0'dan az icin hesaplanmamıstır.");
        System.exit(0);
        }
        double mpuan;
        mpuan=net*3;
        System.out.println("Mat puanın kardesim " + mpuan);
        return mpuan;
                }
    
}
