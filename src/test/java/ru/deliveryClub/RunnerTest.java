package ru.deliveryClub;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "ru.deliveryClub",
        tags = "@all",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTest {
}