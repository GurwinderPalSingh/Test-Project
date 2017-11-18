import static org.junit.Assert.*;

import org.junit.Test;
import static java.lang.System.out;
public class AppTest 
{
	@Test
	public void testApp()
    {
        assertEquals(0,new App().calculateSomething());
        out.println("First maven project is here :-)");
    }
}
