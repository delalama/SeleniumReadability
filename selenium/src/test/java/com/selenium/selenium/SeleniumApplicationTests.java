package com.selenium.selenium;

import com.selenium.selenium.fullWeb.Base;
import com.selenium.selenium.fullWeb.Music;
import com.selenium.selenium.fullWeb.music.Composition;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SeleniumApplicationTests {

	private final String mainURL = "http://www.delalama.es";
	private Base basePage ;
	private Music music ;
	private Composition composition;

	@Test
	public void contextLoads() {

	}

	@Test
	public void mainPageLoad() {
		System.setProperty("webdriver.gecko.driver", "/home/jesus/share/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to(mainURL);
	}

	@Test
	public void goToMusic() {
		System.setProperty("webdriver.gecko.driver", "/home/jesus/share/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to(mainURL);
		driver.findElement(By.cssSelector(".img1")).click();
		WebElement elem = driver.findElement(By.cssSelector("div.card-row:nth-child(2) > div:nth-child(1)"));

		elem.click();
	}

	@Test
	public void goToMusic2() {
		// instantiate driver and needed pages
		System.setProperty("webdriver.gecko.driver", "/home/jesus/share/geckodriver");
		WebDriver driver = new FirefoxDriver();
		// actions
		goToBase( driver );
		basePage = PageFactory.initElements( driver, Base.class );
		basePage.music.click();
	}

	@Test
	public void reproduceIndianMusic() {
		// instantiate driver
		System.setProperty("webdriver.gecko.driver", "/home/jesus/share/geckodriver");
		WebDriver driver = new FirefoxDriver();
		// actions
		goToBase( driver );

		basePage = PageFactory.initElements( driver, Base.class );
		basePage.music.click();

		music= PageFactory.initElements( driver, Music.class );
		music.composition.click();

		composition= PageFactory.initElements( driver, Composition.class );
		composition.indianSong.click();

	}

	void goToBase( WebDriver driver ){
		driver.navigate().to(mainURL);
	}


}
