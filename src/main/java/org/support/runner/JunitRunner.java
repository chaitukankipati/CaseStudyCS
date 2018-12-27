package org.support.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.support.browser.Browser;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles.sample", glue = "org.support")
public class JunitRunner{

}