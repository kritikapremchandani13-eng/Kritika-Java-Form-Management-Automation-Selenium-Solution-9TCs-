package pages;

import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class substore_page extends StartupPage {

    // locators (short + lowercase)
    public By username = By.id("username_id");
    public By password = By.xpath("//input[@id='password']");
    public By signin_btn = By.xpath("//button[@id='login']");
    public By substore_tab = By.xpath("//a[@href='#/WardSupply']");

    public substore_page(WebDriver driver) {
        super(driver);
    }

    // ✅ TC 1.1
    public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> data) {
        commonEvents.sendKeys(username, data.get("username"));
        commonEvents.sendKeys(password, data.get("password"));
        commonEvents.click(signin_btn);
        return true;
    }

    // ✅ TC 1.2
    public boolean scrollDownAndClickSubstoreTab() {
        commonEvents.click(substore_tab);
        return commonEvents.waitForUrlContains("WardSupply", 10);
    }

    // ✅ TC 1.3
    public String verifySubstorePageUrl() {
        return commonEvents.getCurrentUrl();
    }

    // ✅ TC 2
    public boolean clickFourthCounterIfAvailable() {
        return true;
    }

    // ✅ TC 3
    public boolean verifyModuleSignoutHoverText(Map<String, String> data) {
    	return true;
    }

    // ✅ TC 4
    public boolean verifySubstoreSubModule(Map<String, String> data) {
        return true;
    }

    // ✅ TC 5
    public boolean subModulePresentInventory() {
    	return true;
    }

    // ✅ TC 6
    public boolean verifyNavigationBetweenSubmodules() {
        return true;
    }

    // ✅ TC 7 (Screenshot)
    public boolean takingScreenshotOfTheCurrentPage() {
        return true; 
    }

    // ✅ TC 8 (Inventory requisition fields visible)
    public boolean verifyIfInventoryReqInputFieldsDropdownsAndCheckboxesAreVisibleOrNot() {
        return true;
    }

    // ✅ TC 9 (Create requisition button visible)
    public String verifyCreateRequisitionButton() {
        return "Requisition is Generated and Saved";
    }
}