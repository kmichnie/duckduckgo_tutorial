package searchtutorial.duckduckgo;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import searchtutorial.duckduckgo.steps.DuckDuckGoSearcher;

@RunWith(SerenityRunner.class)
public class WhenSearchingForKeyword {

    @Steps
    DuckDuckGoSearcher sam;

    @Managed
    WebDriver driver;

    @Test
    public void should_see_relevant_search_results() {
        sam.opens_duckduckgo_search_hompage();

        sam.searches_by_keyword_for("Cucumber Recipies");

        sam.should_see_only_results_containing("Cucumber");
    }
}
