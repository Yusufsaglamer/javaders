public class secondClassFunction {
    public static void main(String[] args) {
        // Ekrana

        info();
        bilgiYazdir("Yusuf","Sağlamer",28);
        double result=pi();
        System.out.println(result);
        System.out.println(pi());

        System.out.println(toplam(1,3));

        System.out.println(cokluToplam(2,3,5,6,3));


    }


    //Değer üretmeyen-Parametresiz
    public static void  info(){
        System.out.println("Merhaba ben bir Değer döndürmeyen fonksiyon örnğiyim.");
    }
    //Değer üretmeyen-PArametreli
    public static void bilgiYazdir(String name,String surname, int age){
        System.out.println("Ad: "+name);
        System.out.println("Soyad: "+surname);
        System.out.println("Yaş: "+age);
        System.out.println("------------------------");
    }

    // Değer döndürmeyen Soyutlama kod çağırma gibi işlemler için.
    //Değer döndğrmeyen fonk sout içinde kullanılamaz.

    // Değer üreten-Parametresiz
    //static ten sonra üreteceği değer hangi tip ise onu belirtiyoruz.
    public static double pi(){
        return 3.14;

    }

    // Değer üreten-Parametreli
    public static int toplam(int a,int b){
        return a+b;
    }

    // önemli

    public static int cokluToplam(int...sayilar){
        int sum=0;
        /*for (int sayi:sayilar) {
            sum = sum + sayi;
        }*/
        for (int i=0;i<sayilar.length;i++){
            sum+=sayilar[i];
        }
         return sum;
        }

    }




