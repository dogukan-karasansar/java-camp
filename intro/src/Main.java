public class Main {

    public static void main(String[] args) {
        //camelCase
        String subeInternetButton = "İnternet Şubesi";
        double dolarDun = 8.25;
        double dolarBugun = 8.25;
        int vade = 36;
        boolean dustuMu = false;
        System.out.println(subeInternetButton);

        if (dolarBugun < dolarDun) {
            System.out.println("Dolar Düştü Resmi");
        } else if (dolarBugun > dolarDun) {
            System.out.println("Dolar Yükseldi Resmi");
        } else {
            System.out.println("Dolar Eşittir Resmi");
        }

        //foreach
        String[] krediler = {"Hızlı Kredi", "Emekli Kredisi", "Konut Kredisi", "Araç Kredisi"};
        for (String kredi : krediler) {
            System.out.println(kredi);
        }

        //foreach 2.yöntem
        for(int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }

        //value types
        //value tiplerden valueler yer değiştirir
        int s1 = 10;
        int s2 = 20;
        s1 = s2;
        s2 = 100;
        System.out.println(s1);

        //references types
        //referans tiplerde atanan refrerans tipin adresine geçer yapılan tüm değşiklik iki referansıda etkiler
        int[] sayilar1 = {10, 20, 30, 40};
        int[] sayilar2 = {100, 200, 300, 400};
        sayilar1 = sayilar2;
        sayilar2[0] = 100;
        System.out.println(sayilar1[0]);

        String sehir1 = "Ankara";
        String sehir2 = "İstanbul";
        sehir1 = sehir2;
        sehir2 = "İzmir";
        System.out.println(sehir1);
    }
}
