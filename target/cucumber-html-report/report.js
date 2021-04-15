$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/AGL/smp/git/ArenaSMP-Cucumber/src/main/java/features/PriceRange.feature");
formatter.feature({
  "line": 1,
  "name": "Verifying Price range page",
  "description": "",
  "id": "verifying-price-range-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validating Price range",
  "description": "",
  "id": "verifying-price-range-page;validating-price-range",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Go to Price Range page and verify it",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Do price range selection",
  "keyword": "And "
});
formatter.match({
  "location": "PriceRange.Click_Explore()"
});
formatter.result({
  "duration": 11892108600,
  "status": "passed"
});
formatter.match({
  "location": "PriceRange.Select_pricerange()"
});
formatter.result({
  "duration": 600088900,
  "status": "passed"
});
});