package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _02_ExplicitWait extends BaseDriver {

    //Elemente özel bekletme....

    /*
      İnterview Sorusu :  Implicit ve Explicit

     Implicitli  : Bütün elemanlar için geçerli,Bir kere tanımlanır. (HTML de verilen locator var mı?)
     Explicit    : Tek bir elemana özel Kriter olarak tanımlanır sadece ilgili elemanda geçerli olur

     ExpectedConditions
alert is present

                                      .titleIs -> title bu olana kadar bekle
                                      .titleContains -> title ın da bu kelime geçene kadar bekle
                                      .urlToBe -> url bu olana kadar bekle
                                      .urlContains -> url de bu kelime geçene kadar bekle
                                      .visibilityOfElementLocated -> eleman DOM da var ve gözükür olana kadar bekle
                                      .visibilityOfTheElement -> eleman gözükene kadar bekle
                                      .InvisibilityOfTheElement -> eleman kaybolana kadar bekle
                                      .elementToBeClickable -> eleman tıklanabilir olana kadra bekle
                                      .elementToBeSelected -> eleman seçilebilir olana kadra bekle
                                      .textToBe -> elemanda verilen txt gözükene kadar bekle.
                                      .alertIsPresent()  -> alert çıkana kadar bekle.
                                      .visibilityOfAllElementsLocatedBy -> locator ile bütün elemanlari gözükene kadar bekle
                                      .visibilityOfAllElements -> Verilen elemanların listesindeki tüm elemanlar gözrünür olana kadar bekle
                                      .numberOfElementsToBe  -> verilen locatora sahip elemanların sayısı bu olana kadar bekle
                                      .numberOfElementsToBeLessThan -> verilen locatora sahip elemanların sayısı verilenden az olana kadar bekle
                                      .numberOfElementsToBeMoreThan -> verilen locatora sahip elemanların sayısı verilenden fazla olana kadar bekle
                                      .elementStaleness -> verilen element bayatlaması geçene kadar bekle


  */

    //sender_email
    @Test
    public void Test(){
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        WebElement btn= driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();

//        Duration muhlet=Duration.ofSeconds(30);
//        WebDriverWait bekle=new WebDriverWait(driver, muhlet); aşağıdaki ile aynı şey demek.

        WebDriverWait bekle=new WebDriverWait(driver, Duration.ofSeconds(30));
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
        //locator görünene kadar bekle demek.
        //Beklenen kriterlerden -> ExpectedConditions
        //Verilen LOcatordaki element gözükür hale -> visibilityOfElementLocated
        //gelene kadar bekle -> bekle.until

        System.out.println("bitti");
    }
}
