package day02_DriverMrthodlariVeElemenKullanimi;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverManageMethodlari {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        // HTML kodların daha erişilebilir olması için
        //her class'ın basında mutlaka maximize yaparız.

        // acılısta window size ve konumu yazdırın
        System.out.println("Acılışta boyut : " + driver.manage().window().getSize());
        System.out.println("Acılışta konum : " + driver.manage().window().getPosition());

        Thread.sleep(2000);

        //windowu maximize yapın
        driver.manage().window().maximize();




        //istedigimiz konum ve boyuta getirebilirz

        driver.manage().window().setSize(new Dimension(500,500));
        driver.manage().window().setPosition(new Point(100,100));


        // istediğimiz boyutta iken konumu yazdırın


        driver.get("https://www.testotomasyonu.com/");


        Thread.sleep(3000);
        driver.quit();






    }
}
