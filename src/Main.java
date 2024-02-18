import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // kullanicidan alacagımız girdiler için degişkeler oluşturduk
    String kAdi , kSifre, yeniSifre, sifreSifirlama;
        //girdi için scanner nesnesi tanımladik
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adını Giriniz: ");
        //kullanicidan isim girdisi aldık
            kAdi=input.nextLine();
        //kullanicidan sifre girdisi aldık
        System.out.print("Şifrenizi Giriniz: ");
            kSifre=input.nextLine();
            //girilen kullanici adi ile bizdekini karşılaştırdık
            if(kAdi.equals("patika")){
                 System.out.println("Kullanici Adınız Dogru");
                 if(kSifre.equals(("java123"))){
                    //girilen şifre billgisi ile bizdekini karşılaştırdık
                    System.out.print("Şifreniz Dogru\n"+"Oturum Açıldı");
                 }
                 else{
                     System.out.print("Şifreniz Yanlış Sıfırlamak istermisiniz! E / H: ");
                        //şifre yanlış olması durumun da kullanıcıya sıfırlama seçenegi sunduk
                         sifreSifirlama=input.nextLine();
                         if (sifreSifirlama.equals("E")){
                            //kabul etmesi durumun da sıfırlama yönergelerine basladık
                            System.out.print("Yeni şifrenizi giriniz: ");
                            yeniSifre= input.nextLine();
                                //girilen yeni şifrenin ilk giridigi hatalı şifre ile karşılaştırdık
                             if (yeniSifre.equals(kSifre)){
                                    //yeni şifre ilk girilen hatalı şifre ile aynı ise
                                    // yeni şifre oluşturma başarısız
                                    System.out.print("Yeni şifreniz hatali girdiginiz şifre ile aynı olamaz");
                                }
                                else {
                                    if(yeniSifre.equals("java123")){
                                        //yeni şifre bizdeki şifre ile  aynı ise şifre oluşturma başarısız
                                        System.out.print("Yeni şifreniz eski şifrenizle aynı olamaz");
                                    }
                                    else {
                                        //şifreler farklı ise şifre oluşturma başarılı
                                        System.out.print("Şifreniz Oluşturuldu\n" + "Oturum Açıldı");
                                    }
                                }
                            }
                            else {
                                //kullanıcı şifre sıfırlamak istemez ise
                                 System.out.println("Oturum Açma Başarısız");
                            }
                 }
            }
            else{
            //kullanıcı adi yanlış ise
            System.out.println("Kullanici Adınız Yanlış");
            }
    }
}