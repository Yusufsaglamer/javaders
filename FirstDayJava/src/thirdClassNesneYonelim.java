public class thirdClassNesneYonelim {
    public static void main(String[] args) {
        //arabayı temsil eden şablon sınıf iken arabyı somutlaştıran özelikkler nesnedir.
        /*
        user
        name
        surname
        email
        username
        kimlikno

        User user=new user(); nesne oluşturma yöntemi.


        nesneler,array  ve string referans tip(string değer tiği gibi çalışan referans tiptir.)
        adresi stack te değeri hip hafızada tutulur.
        hip içind string pool denilen yerde string değerleri tutar.
        ama string ifadeyi nesne olarak çağırırsak yine değer hip te ama string pool dışında olur.


        int boolean ,double değer tipidir.
        Stack yığın hafıza da depolanır.
         */

        //Sisteme kayıt olamk isteyen kullanıcıları simüle ediniz.
        // kayıt olan kullanıcı email i @gmail.com ile bitmeli.
        //kullanıcı adı,isim soyisim alanı boş olmaz,
        //parola alanı min 6 haneli olmalıdır

        String user1Name="Yusuf";
        String user1SurName="Sağlamer";
        String user1Email="yusuf@gmail.com";
        String user1password="123456";

        String user2Name="Yusuf";
        String user2SurName="Sağlamer";
        String user2Email="yusuf@gmail.com";
        String user2password="123456";

        // nesne yönelim kullanılmazsa

        //1.yöntem (Spagetti kod)

        /*if (user1Email.endsWith("@gmail.com")||user2Email.endsWith("@gmail.com")){
            System.out.println("Email formatınfa değil.");
        }

        if (user1Name.equals(null)||user1SurName.equals(null)||user2Name.equals(null)||user2SurName.equals(null)){
            System.out.println("ad ve soyad boş geçilemez."
                    );

        }

        if (user1password.length()<6||user2password.length()<6){
            System.out.println("parola alanı min 6 haneli olmalı.");
        }else {
            System.out.println("Giriş Başarılı");
        }

         */


        // constructor yapı olmaz ise bu şekilde olur.
        // User user1=new User();
        /*user1.name="Yusuf";
        user1.Surname="Sağlamer";
        user1.Email="yusuf@gmail.com";
        user1.Password="123456";
        System.out.println(user1.name);
        System.out.println(user1.Surname);
        System.out.println(user1.Email);
        System.out.println(user1.Password);
        user1.info();
*/

            // consturctor yapılı altta paramere olarak user
      User user1=new User("yusuf","sağlamer","yusuf@gmail.com","12345");
      user1.info();




        //2.Fonksiyon ile Soyutlama

    }
  public static boolean checkEmail(String Email){
        if (!Email.endsWith("@gmail.com")) {
            System.out.println("Email formatında giriniz");
            return false;
        }else {
            return true;
        }
  }





}
