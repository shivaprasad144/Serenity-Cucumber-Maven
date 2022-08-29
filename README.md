# Serenity-Cucumber-Maven
Serenity-Cucumber-Maven

This framework is designed with customized serenity-cucumber-maven.

To run the scripts through maven, we need to pass below commands.
Clean install test -Dtags=@ValidCredentials

If you want to run scenarios parallel, you need to pass the commands as below.
Clean install test -DforkCount=2 -Dtags=@ValidCredentials

Issue# After updating to latest cucumber version facing below issue.

Scripts are executing twice, I mean based on the number of feature files count that many times the scripts are executing.

To generate the runner class at runtime, we are using cucumber-jvm-parallel-plugin. 

With the latest updates, Duplicate Runner classes are generating for each feature file because of that scripts are executing twice.
Since I am using serenity reports with aggregate option, reports will show correctly. But the time is getting wasted.

Please help and resolve the issue. 

Please refer console log.txt for better understanding.
