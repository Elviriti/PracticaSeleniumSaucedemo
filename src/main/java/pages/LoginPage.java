package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // Localizamos los campos de la web por su ID
    private By userField = By.id("user-name");
    private By passField = By.id("password");
    private By loginBtn = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarUsuario(String user) {
        driver.findElement(userField).sendKeys(user); // Escribe usuario
    }

    public void ingresarPassword(String pass) {
        driver.findElement(passField).sendKeys(pass); // Escribe clave
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click(); // Pulsa el botón
    }

    // Parte 5: Todo en uno
    public void login(String user, String pass) {
        ingresarUsuario(user);
        ingresarPassword(pass);
        clickLogin();
    }
}