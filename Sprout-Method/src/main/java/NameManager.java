import java.util.ArrayList;
import java.util.List;

public class NameManager {
    public List<String> appendTextToNames(List<String> names, String textToAppend)
    {
        if(names == null)
            return new ArrayList();

        List<String> newNames = new ArrayList();

        for (String name : names)
            newNames.add(name + textToAppend);

        return newNames;
    }
}
