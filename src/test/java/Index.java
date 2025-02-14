import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/Nastya/Downloads/21.index.html");
        //wd.navigate().to("https://telranedu.web.app/home");

    }
@Test
    public void cssLocators(){
        //by tagName
    WebElement button = wd.findElement(By.tagName("button"));
//WebElement button1 = wd.findElement(By.cssSelector("button"));
List<WebElement> a = wd.findElements(By.tagName("a"));
//List<WebElement> list = wd.findElements(By.cssSelector("a"));
    //a.size();
    WebElement input = wd.findElement(By.tagName("input"));
//WebElement input1 = wd.findElement(By.cssSelector("input"));

//by Class

    WebElement divContainer = wd.findElement(By.className("container"));
    //WebElement divContainer1 = wd.findElement(By.cssSelector(".container"));

    List <WebElement> navlist = wd.findElements(By.className("nav-item"));
    //List <WebElement> navlist1 = wd.findElements(By.cssSelector(".nav-item"));

    //by Id

    WebElement nav = wd.findElement(By.id("nav"));
    //WebElement nav1 = wd.findElement(By.cssSelector("#nav"));

    //by attribute

    WebElement inputName = wd.findElement(By.cssSelector ("[placeholder='Type your name']"));
    //WebElement a2 = wd.findElement(By.cssSelector(("[href='#item3']"));


    //by name

   WebElement inputS = wd.findElement((By.name("surname")));
    WebElement buttonS = wd.findElement((By.cssSelector("[name='surname']")));

    //By.linkText & By.partialLinkText
    //WebElement a3 = wd.findElement(By.linkText("Item 1"));
    //WebElement a4 = wd.findElement(By.partialLinkText("em 1"));
    }

}
