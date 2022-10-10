# Parallel Execution Via Cucumber Junit

Execution via maven command : clean package -Dcucumber.filter.tags="@tag1 or @tag2"

Parallel : https://cucumber.io/docs/guides/parallel-execution/?lang=java

Retry/Rerun automatically failed scenario in Junit via surefire plugin  :
<rerunFailingTestsCount>2</rerunFailingTestsCount>

Notes: 
1. Scenario will run at most 3 times for above value 2 
2. Includes flakes param if any screnario passed in rerun                                                                                                                    [ERROR] Tests run: 16, Failures: 1, Errors: 0, Skipped: 0, Flakes: 1
3. Drawback : override the cucumber report (will display only those failed scenario which execute max or last)
