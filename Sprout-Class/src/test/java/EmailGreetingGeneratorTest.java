import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class EmailGreetingGeneratorTest {

    @Test
    public void generate_WhenCalled_ReturnsEmailGreeting()
    {
        EmailGreetingGenerator greetingGenerator = new EmailGreetingGenerator();

        String actual = greetingGenerator.generate();

        assertThat(actual, is("Attention:<br/>"));
    }

}