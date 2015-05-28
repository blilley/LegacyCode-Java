import java.util.ArrayList;
import java.util.List;

public class NameManager {
    private List<String> getUniqueNames(List<String> names)
    {
        List<String> uniqueNames = new ArrayList();

        for (String name : names)
            if(!uniqueNames.contains(name))
                uniqueNames.add(name);

        return uniqueNames;
    }

    public List<String> appendTextToNames(List<String> names, String textToAppend)
    {
        if(names == null)
            return new ArrayList();

        List<String> newNames = new ArrayList();

        for (String name : getUniqueNames(names)) {
            newNames.add(name + textToAppend);
        }

        return newNames;
    }
}
