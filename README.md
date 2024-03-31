This program starts by invoking org.example.Main executable class

The entry to the cron executor system is CronExpressionEvaluator.

CronExpressionEvaluator's getExpressionArguments expects to receive List of 6 Strings
they represent Minute, Hour, Day of Month, Month, Day of Week and the command/program to be executed.
The command or a program can be more than one string to represent it's command line arguments.

Class Structure

Root class = Argument
Program implements Argument --> Program to represent the job which is scheduled 

CronExpression implements Argument

CronExpression is an abstract class and it is inherited by:
AllTimeUnits -> *
Constant -> 2 or 3 or any number
Interval -> 5/2 or */2
Range -> 2-3
SpecificList -> 2,4,6

Factory :
ExpressionFactory takes in type of TemporalEnum like Month, Minute etc and expression.
Depending on the expression any of the CronExpression is used.

CronExpression's getExpression() gives the exact output required like "minute 0 15 30 45"
CronExpression needs TemporalEnum so that it can get starting and the ending values of that particular time type,
for eg, minutes starts at 0 and ends at 59, hour starts at 0 and ends at 23 and day of week 1 to 7.

