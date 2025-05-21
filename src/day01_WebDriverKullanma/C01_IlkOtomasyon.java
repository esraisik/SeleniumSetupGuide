package day01_WebDriverKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkOtomasyon {

    public static void main(String[] args) throws InterruptedException {


        // Bir test'e baslamadan önce MUTLAKA
        // bir WebDriver edinmeliyiz

        // EN ILKEL haliyle WebDriver edinmek için
        // Java'dan yardım alacagız


        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.testotomasyonu.com");

        Thread.sleep(3000);
        driver.quit();

    }
}
