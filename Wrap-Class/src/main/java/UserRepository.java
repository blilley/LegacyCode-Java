import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserRepository implements Repository<User> {
    @Override
    public List<User> getAll() {
        //do hibernate things
        return new ArrayList<User>();
    }

    @Override
    public User get(UUID id) {
        //do hibernate things
        return new User(UUID.randomUUID());
    }

    @Override
    public User create(User object) {
        //do hibernate things
        return new User(UUID.randomUUID());
    }

    @Override
    public void update(User object) {
        //do hibernate things
    }

    @Override
    public void delete(User object) {
        //do hibernate things
    }
}
