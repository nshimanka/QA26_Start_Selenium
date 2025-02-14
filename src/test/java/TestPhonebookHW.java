import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPhonebookHW {

    WebDriver wd;


    @BeforeClass

    public void setUp() {
      wd = new ChromeDriver();
        //wd.navigate().to ("https://telranedu.web.app/login");
        wd.get("https://telranedu.web.app/login");
    }

    @Test
     public void homework1 () {

        //by tag name
        WebElement el = wd.findElement(By.tagName("body"));
        WebElement el1 = wd.findElement(By.cssSelector("body"));
        WebElement el2 = wd.findElement(By.tagName("div"));
        WebElement el3 = wd.findElement(By.cssSelector("div"));
        WebElement el4 = wd.findElement (By.tagName("h1"));
       WebElement el5 = wd.findElement (By.cssSelector("h1"));
      WebElement el6 = wd.findElement(By.tagName("a"));
       WebElement el7 = wd.findElement(By.cssSelector ("a"));
       WebElement el8 = wd.findElement(By.tagName("form"));
       WebElement el9 = wd.findElement(By.cssSelector ("form"));
       WebElement el10 = wd.findElement(By.tagName("input"));
        WebElement el11 = wd.findElement(By.cssSelector ("input"));
        WebElement el12 = wd.findElement(By.tagName("button"));
        WebElement el13 = wd.findElement(By.cssSelector ("button"));

        //by class name
       WebElement el14 = wd.findElement(By.className("container"));
       WebElement el15 = wd.findElement(By.cssSelector (".container"));
        WebElement el16 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el17 = wd.findElement(By.cssSelector (".navbar-component_nav__1X_4m"));
        WebElement el18 = wd.findElement(By.className("active"));
        WebElement el19 = wd.findElement(By.cssSelector (".active"));

        //by id
        WebElement el20 = wd.findElement(By.id ("root"));
        WebElement el21 = wd.findElement(By.cssSelector ("#root"));

        //by attribute

        WebElement el22 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement el23 = wd.findElement(By.cssSelector("[name='email']"));
        WebElement el24 = wd.findElement(By.name("email"));

        WebElement el25 = wd.findElement(By.cssSelector ("[placeholder^='Em']"));
        WebElement el26 = wd.findElement(By.cssSelector ("[placeholder='Email']"));
        WebElement el27 = wd.findElement(By.cssSelector ("[placeholder$='ail']"));
        WebElement el28 = wd.findElement(By.cssSelector ("[placeholder*='m']"));

    }

}

