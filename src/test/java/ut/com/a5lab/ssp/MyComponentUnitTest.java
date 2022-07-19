package ut.com.a5lab.ssp;

import org.junit.Test;
import com.a5lab.ssp.api.MyPluginComponent;
import com.a5lab.ssp.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}