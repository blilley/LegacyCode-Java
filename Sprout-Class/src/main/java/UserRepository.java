import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserRepository {
    public List<String> getAllUserNames() {
        return new ArrayList(Arrays.asList("Bob Smith", "Jimmy Johns"));
    }
}
