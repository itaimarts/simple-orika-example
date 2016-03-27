package br.com.semeru.orika.converter;

import br.com.semeru.orika.mocks.MockInputObject;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.com.semeru.orika.objects.OutputObject;

public class OrikaParserTest {

    MockInputObject inputObject;

    @Before
    public void setUp() {
        inputObject = new MockInputObject();
    }

    @Test
    public void parseObjectInputToObjectOutputTest() {
        OutputObject output = OrikaParser.parseObjectInputToObjectOutput(inputObject.mockInput(), OutputObject.class);
        Assert.assertEquals("Name Test", output.getName());
        Assert.assertEquals("Old City", output.getAddress().getTown());
        Assert.assertTrue(output.getAge() == 21);
    }

    @Test
    public void parserListObjectInputToObjectOutputTest() {
        List<OutputObject> output = OrikaParser.parserListObjectInputToObjectOutput(inputObject.mockInputList(), OutputObject.class);
        Assert.assertEquals("Name Test 2", output.get(0).getName());
        Assert.assertEquals("Old City", output.get(0).getAddress().getTown());
        Assert.assertTrue(output.get(0).getAge() == 22);
    }
}