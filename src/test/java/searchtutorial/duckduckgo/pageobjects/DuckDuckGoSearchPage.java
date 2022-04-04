package searchtutorial.duckduckgo.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

@DefaultUrl("https://duckduckgo.com")
public class DuckDuckGoSearchPage extends PageObject {

    @FindBy(id = "search_form_input_homepage")
    WebElementFacade searchField;

    @Step
    public void enterSearchTerms(String keyword) {
        searchField.type(keyword);
    }

    @FindBy(id = "search_button_homepage")
    WebElementFacade submitSearchButton;

    @Step
    public void submitSearch() {
        submitSearchButton.click();
    }
}
