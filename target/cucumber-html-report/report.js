$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/AGL/smp/git/ArenaSMP-Cucumber/src/main/java/features/TenureRange.feature");
formatter.feature({
  "line": 1,
  "name": "Verifying tenure range page",
  "description": "",
  "id": "verifying-tenure-range-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validating Tenure range",
  "description": "",
  "id": "verifying-tenure-range-page;validating-tenure-range",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User clicks on Explore CTA on the banner",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Verify the Tenure selection default",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Verify Change the tenure",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify Click Next",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify Click Back",
  "keyword": "And "
});
formatter.match({
  "location": "TenureRange.Click_Explore()"
});
formatter.result({
  "duration": 4712974200,
  "status": "passed"
});
formatter.match({
  "location": "TenureRange.Validate_DefaultTenure()"
});
formatter.result({
  "duration": 127503100,
  "error_message": "java.lang.AssertionError: expected [48 Months] but found [Months]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:453)\r\n\tat org.testng.Assert.assertEquals(Assert.java:463)\r\n\tat StepDefinations.TenureRange.Validate_DefaultTenure(TenureRange.java:31)\r\n\tat ✽.And Verify the Tenure selection default(C:/Users/AGL/smp/git/ArenaSMP-Cucumber/src/main/java/features/TenureRange.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TenureRange.change_Tenure()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TenureRange.Click_Next()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TenureRange.Click_Back()"
});
formatter.result({
  "status": "skipped"
});
});