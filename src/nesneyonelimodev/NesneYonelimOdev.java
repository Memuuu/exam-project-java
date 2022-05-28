
package nesneyonelimodev;

public class NesneYonelimOdev {
    public static void main(String[] args) {
      double a, m,f,s,t;
      Sinav mami=new Sinav();   
        {
            
            Mat mamiMat=new Mat();
            a=mamiMat.netHesapla(36, 4);
            m=mamiMat.mnet(a);
        }
        {
            
            Fen mamiFen=new Fen();
            a=mamiFen.netHesapla(25,7);
            f=mamiFen.fnet(a);
        }
        {
           
            Sos mamiSos=new Sos();
            a=mamiSos.netHesapla(28,10);
            s=mamiSos.snet(a);
        }
        {
            
            Tr mamiTr=new Tr();
            a=mamiTr.netHesapla(32,7);
            t=mamiTr.tnet(a);
          
        }
        mami.puanHesapla(m,f,s,t);
    }
    
}
