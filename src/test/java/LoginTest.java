import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import static org.junit.jupiter.api.Assertions.*;

class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeEach // Se hace antes de cada test
    void setUp() {
        driver = new ChromeDriver(); // Abre Chrome solo
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @AfterEach // Se hace al terminar
    void tearDown() {
        driver.quit(); // Cierra el navegador
    }

    @Test // Test Correcto
    void loginCorrecto() throws InterruptedException {
        loginPage.login("standard_user", "secret_sauce");
        Thread.sleep(2000); // Pausa para que lo veas
        assertTrue(driver.getCurrentUrl().contains("inventory"));
    }

    @Test // Test Incorrecto (Parte 3)
    void loginIncorrecto() throws InterruptedException {
        loginPage.login("standard_user", "clave_falsa");
        Thread.sleep(2000);
        // Buscamos si sale el error en rojo
        boolean errorVisible = driver.findElement(By.cssSelector("h3[data-test='error']")).isDisplayed();
        assertTrue(errorVisible);
    }
}