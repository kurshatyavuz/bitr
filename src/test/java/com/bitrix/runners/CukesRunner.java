package com.bitrix.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin ={"json:target/cucumber.json",
                 "html:target/default-cucumber-reports",
                 "rerun:target/rerun.txt"},

        features = { // to specify where the features are

                "src/test/resources/features/login"
        },


        glue={
                "com/bitrix/step_definitions",


        },

        dryRun = false
)
public class CukesRunner {



}
