package day02_DriverMrthodlariVeElemenKullanimi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C02_DriverNavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {


        /*
            Bir test otomasyonu için
            ilk yapmamız gereken sey bir WebDriver objesi edinmektir.

            Selenium 4.12 surumu ile kendi Webdriver objesini olusturdu
            Boylece dısardan bir WebDriver tanımlamamıza gerek kalmadan
            Selenium WebDriver objesini kullanabilir ve
            testlerimi yapabiliriz


           Bazı sirketler acık kaynaklı oldugu ıcın
           Selenıum WebDriver kullanmamızı istemeyebilirler
           ve bize kullanmamız i.in bir WebDriver dosyası verebilirler.

           Eger sirkete ozel bir

         */

        //System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


//2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.get("https://www.youtube.com/");

//   ve url'in youtube icerdigini test edin
        String expectedUrlIcerik = "youtube";



//3. Testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
        driver.get("https://www.testotomasyonu.com/");

//   Title'in "Test Otomasyonu" icerdigini test edin
        String expectedTitleIcerik = "Test Otomasyonu";
        String actualTitle = driver.getTitle();
        Thread.sleep(1000);

        if ( actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Test otomasyonu testi PASSED");
        }else System.out.println("Test otomasyonu testi FAILED");

//4. Tekrar YouTube'sayfasina donelim
       // driver.navigate().to(); driver.get() ile aynı işlevi yerine getirir.

        driver.navigate().back();
        Thread.sleep(1000);


//5. Yeniden testotomasyonu sayfasina gidelim);
        driver.navigate().forward();
        Thread.sleep(1000);
//6. Sayfayi Refresh(yenile) yapalim
//7. Sayfayi kapatalim / Tum sayfalari kapatalim


        driver.get("https//wwww.testotomasyonu.com/");


        Thread.sleep(3000);
        driver.quit();
    }
}
