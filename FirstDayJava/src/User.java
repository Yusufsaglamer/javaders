public class User {
    String name;
    String Surname;
    String Email;
    String Password;
    //burda class oluşturduk

    public User(){
        System.out.println("Kişi oluşturuldu");
    }

// this  class içerisindeki contructır field  , mettodlara erişim sağlar.
    public User(String isim, String soyisim, String email, String sifre) {
        this(email,sifre);
        this.name = isim;
        this.Surname = soyisim;
       /* this.Email = email;
        this.Password = sifre;*/

    }

    public User(String mail, String sifre) {
        this();
        Email = mail;
        Password = sifre;
    }

    //bu classlar için fonksiyon oluşturabiliriz.
    public void info(){
        System.out.println("Name: "+name+"\nSurname:"+Surname+"\nEmail:"+Email+"\nPassword:"+Password);


    }

    public void Validate(){

    }


}
