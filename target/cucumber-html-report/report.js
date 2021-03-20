$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/AGL/AmitSharma/workspace/ArenaSMP-cucumber/src/main/java/features/WhySubscribe.feature");
formatter.feature({
  "line": 1,
  "name": "Verifying whysubscribe",
  "description": "",
  "id": "verifying-whysubscribe",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validating the whysusbscribe present on the page.",
  "description": "",
  "id": "verifying-whysubscribe;validating-the-whysusbscribe-present-on-the-page.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User should come with whysubscribe section",
  "keyword": "Then "
});
formatter.match({
  "location": "WhySubscribe.Verify_whysubscribe()"
});
formatter.result({
  "duration": 427434300,
  "error_message": "java.lang.AssertionError: expected [Why Subscribes?] but found [Why Subscribe?]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:453)\r\n\tat org.testng.Assert.assertEquals(Assert.java:463)\r\n\tat StepDefinations.WhySubscribe.Verify_whysubscribe(WhySubscribe.java:31)\r\n\tat ✽.Then User should come with whysubscribe section(C:/Users/AGL/AmitSharma/workspace/ArenaSMP-cucumber/src/main/java/features/WhySubscribe.feature:5)\r\n",
  "status": "failed"
});
});