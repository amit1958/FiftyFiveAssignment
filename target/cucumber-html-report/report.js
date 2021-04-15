$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/AGL/smp/git/ArenaSMP-Cucumber/src/main/java/features/Sprint2_VehicleListing.feature");
formatter.feature({
  "line": 2,
  "name": "Verifying Vehicle listing page",
  "description": "",
  "id": "verifying-vehicle-listing-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Vehicle listing page check",
  "description": "",
  "id": "verifying-vehicle-listing-page;vehicle-listing-page-check",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user do explores",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User select the preference",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should move to the Listing page",
  "keyword": "Then "
});
formatter.match({
  "location": "Sprint2_VehicleListing.user_do_explores()"
});
formatter.result({
  "duration": 6117295500,
  "status": "passed"
});
formatter.match({
  "location": "Sprint2_VehicleListing.Select_Preferences()"
});
formatter.result({
  "duration": 6727381400,
  "status": "passed"
});
formatter.match({
  "location": "Sprint2_VehicleListing.Validate_Vehiclelisting()"
});
formatter.result({
  "duration": 98125500,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: //a[contains(text(),\u0027All Car Models\u0027)]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-9VF53AB\u0027, ip: \u0027192.168.1.103\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 86.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20210222142601, moz:geckodriverVersion: 0.23.0, moz:headless: false, moz:processID: 9816, moz:profile: C:\\Users\\AGL\\AppData\\Local\\..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: c5081bb1-e60e-47c7-8e75-54cc8e4a0e90\n*** Element info: {Using\u003dxpath, value\u003d//a[contains(text(),\u0027All Car Models\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat StepDefinations.Sprint2_VehicleListing.Validate_Vehiclelisting(Sprint2_VehicleListing.java:60)\r\n\tat ✽.Then User should move to the Listing page(C:/Users/AGL/smp/git/ArenaSMP-Cucumber/src/main/java/features/Sprint2_VehicleListing.feature:7)\r\n",
  "status": "failed"
});
});