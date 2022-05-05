
        package org.example;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    /**
     * определение локатора поля ввода логина
     */
    @FindBy(xpath = "/html/body/ng-view/main/section/div[1]/form/div[1]/input")
    private WebElement loginField;

    /**
     * определение локатора поля checkbox
     */

    @FindBy(xpath = "/html/body/ng-view/main/section/div[1]/form/label/input")
    private WebElement checkBox;

    /**
     * определение локатора кнопки входа в аккаунт
     */
    @FindBy(xpath = "/html/body/ng-view/main/section/div[1]/form/div[4]/button")
    private WebElement loginBtn;
    /**
     * определение локатора поля ввода пароля
     */
    @FindBy(xpath = "/html/body/ng-view/main/section/div[1]/form/div[2]/cmp-password/input")
    private WebElement passwdField;
    /**
     * метод для ввода логина
     */
    public void inputLogin(String login) {
        loginField.sendKeys(login); }
    /**
     * метод для ввода пароля
     */
    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd); }

    /**
     * метод для осуществления нажатия кнопки checkbox
     */
    public void clickcheckBox() {
        checkBox.click(); }

    /**
     * метод для осуществления нажатия кнопки входа в аккаунт
     */
    public void clickLoginBtn() {
        loginBtn.click(); } }
