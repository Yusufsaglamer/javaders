import java.util.Scanner;

public class secondClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*System.out.println("Lütfen yaşınızı giriniz:");
        int age=scanner.nextInt();


        System.out.println("Lütfen bütçenizi giriniz:");
        double salary=scanner.nextDouble();



        if (age>18 && salary>=19000){
            System.out.println("Ehliyet alabilirsiniz");


        }else {
            System.out.println("Ehliyet alamazsınız");

        }

        // && (ve) || (veya)
        //
         // bu yöntemde daha kısa yolla if else mekanızması yapılır ama elseif ile olmaz.
        String text=(age>18 && salary>=19000)? "Ehliyet alabilirsiniz":"ehliye alamazsiniz";
        System.out.println(text);*/

       /* System.out.println("lütfen 1-7 arasında bir rakam giriniz:");
        int rakam=scanner.nextInt();*/
        /*if (rakam==1){
            System.out.println("Pazartesi");
        } else if (rakam==2) {
            System.out.println("Salı");

        } else if (rakam==3) {
            System.out.println("Çarşamba");


        }else if (rakam==4) {
            System.out.println("Perşembe");

        } else if (rakam==5) {
            System.out.println("Cuma");

        } else if (rakam==6) {
            System.out.println("Cumartesi");

        } else if (rakam==7) {
            System.out.println("Pazar");
        }else {
            System.out.println("Yanlış Sayı Girdiniz");
        }*/

       // DRY -dont repeat yourself
        //başlangıc. bitiş  artış değeri
       /* for(int i=1;i<=5;i++){
            System.out.println(i);
        }
        for(int i=1;i<=5;i+=2){
            System.out.println(i);
        }

        for (int i=10;i>0;i--){
            System.out.println(i);
        }
        for (int i=10;i>0;i-=2){
            System.out.println(i);
        }*/

       /* for (int i=1;i<20;i++){
            if (i%2==1){
                System.out.println("Tek Sayıdır "+i);
            }else {
                System.out.println("Çift Sayıdır "+i);
            }
        }*/

        // birden fazla veriler var ve bunları çıktı olrak vermek istersek for döngüleri kullanılır.

        // DİZİLER

        String[] meyveler={"Elma","Armut","Kiraz","Kayısı","Portakal","Muz","Kivi"};
       /* System.out.println(meyveler);
        // bu yanlış hatalı çıkar
        System.out.println(meyveler[0]);
        System.out.println(meyveler[1]);
        System.out.println(meyveler[2]);*/

       /* for (int i=0;i<3;i++){
            System.out.println(meyveler[i]);
        }
        for (int i=0;i<meyveler.length;i++){
            System.out.println(meyveler[i]);
        }*/


        // foreach  yapısı dizide indeks ile alakamız yoksa sadece verilerle alakamız varsa bu döngü kullanılır.
      /*  for (String meyve:meyveler){
            System.out.println(meyve);
        }*/

        // continue and break

        // break döbgüyü kırma

       /* for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }


        }*/
        // continue pas geçme için kullanılabilir.
        //

       /* for (int i=1; i <= 20; i++) {

            if (i%2==0) {
                continue;
            }

            // yani sayı cift ise continue aktif olur ve tekrar basa döner sout devreye girmez.
            System.out.println(i);*/


        //While

       /* int i=1;
        while (i<=10) {
            System.out.println(i);
            i++;
        }*/

        int j=25;
        do {
            System.out.println(j);
            j--;
        }while (j>10);







    }
}
