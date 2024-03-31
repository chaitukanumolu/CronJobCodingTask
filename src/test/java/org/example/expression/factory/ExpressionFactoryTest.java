package org.example.expression.factory;

import org.example.arguments.temporal.TemporalEnum.TemporalEnum;
import org.example.expression.*;
import org.example.expression.util.CronExpression;
import org.junit.Assert;
import org.junit.Test;

public class ExpressionFactoryTest {
    @Test
    public void testSpecificList(){
        CronExpression expression = ExpressionFactory.getCronExpression(TemporalEnum.MONTH, "1,2,5");
        Assert.assertTrue(expression instanceof SpecificList);
    }

    @Test
    public void testRangeList(){
        CronExpression expression = ExpressionFactory.getCronExpression(TemporalEnum.MONTH, "1-5");
        Assert.assertTrue(expression instanceof Range);
    }

    @Test
    public void testAllTimeUnitsList(){
        CronExpression expression = ExpressionFactory.getCronExpression(TemporalEnum.MONTH, "*");
        Assert.assertTrue(expression instanceof AllTimeUnits);
    }

    @Test
    public void testIntervalList(){
        CronExpression expression = ExpressionFactory.getCronExpression(TemporalEnum.MONTH, "1/5");
        Assert.assertTrue(expression instanceof Interval);
    }

    @Test
    public void testIntervalWildcardList(){
        CronExpression expression = ExpressionFactory.getCronExpression(TemporalEnum.MONTH, "*/5");
        Assert.assertTrue(expression instanceof Interval);
    }

    @Test
    public void testConstantList(){
        CronExpression expression = ExpressionFactory.getCronExpression(TemporalEnum.MONTH, "9");
        Assert.assertTrue(expression instanceof Constant);
    }
}
