import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class org {
	
	 public static void main(String[] args) throws InterruptedException {
	      
	
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anurag\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

	       
	        WebDriver driver = new ChromeDriver();

	       
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	        // Login
	        
	        Thread.sleep(2000);
	    	
	   WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	   username.sendKeys("Admin");
	      WebElement password =  driver.findElement(By.xpath("//input[@name='password']"));
	    		  password.sendKeys("admin123");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        
	        Thread.sleep(4000);  
	        
	        // My Info
	        driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[6]")).click();
	        
	        Thread.sleep(2000);
	       
		      WebElement name =driver.findElement(By.xpath("//input[@name='firstName']"));
		     name.sendKeys("QRS"); 
		        
		     WebElement middle =driver.findElement(By.xpath("//input[@name='middleName']"));
		    middle.sendKeys("TUV");
		        
		     WebElement last =driver.findElement(By.xpath("//input[@name='lastName']"));
		      last.sendKeys("YZ");
		      
		      driver.findElement(By.xpath("//button[@type='submit']")).click();
	        
	        
	        
	        
	        
	        
	       // driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")).click();
	      //  Thread.sleep(4000); 
	        
	     //   driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
	     //   Thread.sleep(4000);  
	       
	      //  WebElement employeename =driver.findElement(By.xpath("//input[@name='firstName']"));
	     //   employeename.sendKeys("Pratik"); 
	        
	      //  WebElement middlename =driver.findElement(By.xpath("//input[@name='middleName']"));
	     //   middlename.sendKeys("Dattu");
	        
	     //   WebElement lastname =driver.findElement(By.xpath("//input[@name='lastName']"));
	     //   lastname.sendKeys("Mahale");  
	         
	      
	      //  driver.findElement(By.xpath("//button[@type='submit']")).click();
	        
	      //  Thread.sleep(4000);  
	        
	       
	        
	        
	        
	        // Go to Admin > Add User
	      //  driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
	      //  Thread.sleep(4000);
	      //  driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	         
	        // Fill in user details and save
	      //  Thread.sleep(4000);
	      // driver.findElement(By.xpath("(//div[@class = 'oxd-select-text-input'])[1]")).click();
	      // Thread.sleep(4000);
	      // Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
	     //  dropdown.selectByVisibleText("Admin");
	        
	       // driver.findElement(By.xpath("//span[@class='oxd-topbar-body-nav-tab-item']")).click();

	        // Go to Recruitment > Add Candidate
	   //  WebElement Recruitment =   driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item toggle'])[4]"));
	    //		 Recruitment.click();
	      //  driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
	       // driver.findElement(By.id("btnAdd")).click();
	        // Fill in candidate details and save

	        // Go to Recruitment > Add Vacancies
	       // driver.findElement(By.id("menu_recruitment_viewVacancy")).click();
	        // driver.findElement(By.id("btnAdd")).click();
	        // Fill in vacancy details and save

	       

	        // Go to Admin > Edit User
	        // Code for editing user
	        // driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
	        // Go to Admin > Delete User
	        // Code for deleting user

	        // Close the browser
	        
	       Thread.sleep(4000); 
	        driver.quit();
	    }
	}




