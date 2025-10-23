public class ÇarpımTablosu {
    public static void main(String[] args){
        int carpansayısı = 2 ;
        int son = 10 ;
        System.out.println("--- "  + ("2'nin Çarpım Tablosu (1'den  10' a kadar)  ") + "---");
        for(int i = 1; i <= son; i++){
            int sonuc = carpansayısı * i ;
            System.out.println(carpansayısı + " x " + i + " = " + sonuc);
        }
        System.out.println("-------------------------------------");
    }
}

