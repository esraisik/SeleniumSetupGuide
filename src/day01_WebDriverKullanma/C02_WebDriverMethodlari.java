package day01_WebDriverKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_WebDriverMethodlari {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");
        //istenen url'e goturur
        // url yazarken www yazmasak da WebDriver objesi url'e gider
        // ANCAAKKK https yazmazsak kod calismaz

        System.out.println(driver.getTitle()); // Test Otomasyonu - Test Otomasyonu

        System.out.println(driver.getCurrentUrl()); // https://www.testotomasyonu.com/

        System.out.println("===========================");

        System.out.println(driver.getPageSource());

        System.out.println("==========================");

        System.out.println(driver.getWindowHandle()); // 515E99F815071923EFA3C37312948002

        System.out.println(driver.getWindowHandles()); //[515E99F815071923EFA3C37312948002]

        // WebDriver olusturulan her bir objeye
        //benersiz (unique) bir Window Handle Degeri atar
        // bu konu ilerde ayrıca anlatılacak
        // Eger bir class calistırıldıgında birden fazla window acılırsa
        //her birinin ayrı bir Window Handle Değeri olur
        //getWindowHandle() driver'in actığı son window'un window handle degerini getirir
        //getWindowHandles() ise acılan tum windowların window handle degerlerini bir Set olarak verir
        // driver'in acılan Window'lar arasındaa gecis yapabilmesi için
        //gececegi window'un handle degerini bilmesi gerekir.


        Thread.sleep(3000);

        driver.quit(); // Actigimiz driver'i kapatır.
        driver.close(); // Actıgımız driver'i kapatir.
        // Aralarındaki fark; close() sadece bir window kapatır
        // quit() ise test sirasında birden fazla window acilsa da hepsini kapatir.

    }
}
