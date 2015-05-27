import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NameManagerTest
{
    @Test
    public void appendTextToNames_WhenNull_ReturnsEmptyList()
    {
        NameManager nameManager = new NameManager();

        List<String> actual = nameManager.appendTextToNames(null, null);

        assertThat(actual, is(empty()));
    }

    @Test
    public void appendTextToNames_WhenSingleName_ReturnsNameWithAppendedText()
    {
        NameManager nameManager = new NameManager();

        List<String> names = Arrays.asList("Hyrum Graff");

        List<String> actual = nameManager.appendTextToNames(names, "Appended");

        assertThat(actual, is(not(empty())));
        assertThat(actual.get(0), is("Hyrum GraffAppended"));
    }

    @Test
    public void appendTextToNames_WhenTwoNames_ReturnsNamesWithAppendedText()
    {
        NameManager nameManager = new NameManager();

        List<String> names = Arrays.asList("Han Solo", "Indiana Jones");

        List<String> actual = nameManager.appendTextToNames(names, "Appended");

        assertThat(actual, is(not(empty())));
        assertThat(actual.get(0), is("Han SoloAppended"));
        assertThat(actual.get(1), is("Indiana JonesAppended"));
    }

}