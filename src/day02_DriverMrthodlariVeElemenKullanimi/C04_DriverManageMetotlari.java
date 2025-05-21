package day02_DriverMrthodlariVeElemenKullanimi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_DriverManageMetotlari {

    public static void main(String[] args) {


        /*
            Test otomasyonu bizim kodlarımızın
            bizim yerimize internette
            Web sayfalarında işlem yapmasıdır.

            Bizim yazdığımız Java kodlarının hızı

            1- bilgisayarımız
            2-interneimiz
            3-ve ulasmaya calsıtıgımız sayfanın
            hızları arasında fark olur.

            Bu hızlar arasındaki fark
            kodlarımızın calısamamasına veya
            testin failed olmasına sebep olur.

         */

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        /*
            Thread.sleep() Java'dan gelir ve mutlak bir bekleme süresidir.
            içine yazılan süre boyunca kodları bekletir
            ve alt satıra gecmez.

            implicitlyWait(Duration.ofSeconds(10)) ise
            Selenium'dan gelir ve dinamiktir.
            Yani 10 saniyeyi sonuna kadar kullanmaz.
            asıl amac sayfanın açılması veya
            sayfada kullanacagımız herhangi bir webelementin kullanılır hale gelmesini beklemektir.

            10 saniye içerisinde sayfanın acılmasını
            veya kullanacagı webelementi bulmayı bekler.

            10 saniye içerisinde ne zaman işlemi yapabilirse
            daha fazla beklemez yoluna devam eder.

            10 saniye beklemesine ragmen sayfa acılmazsa
            veya aradıgı webelementi bulamazsa
            exception firlatir ve calısmayı durdurur.



         */





    }
}
