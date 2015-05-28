import java.util.*;

public class CachedUserRepository implements Repository<User>
{
    private Map<UUID, User> cachedUsers = new HashMap();
    private UserRepository userRepository;

    public CachedUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        if(cachedUsers.isEmpty())
            for (User user : userRepository.getAll())
                cachedUsers.put(user.getId(), user);

        return new ArrayList(cachedUsers.values());
    }

    @Override
    public User get(UUID id) {
        if(cachedUsers.containsKey(id))
            return cachedUsers.get(id);

        User user = userRepository.get(id);
        cachedUsers.put(id, user);
        return user;
    }

    @Override
    public User create(User user) {
        user = userRepository.create(user);
        cachedUsers.put(user.getId(), user);

        return user;
    }

    @Override
    public void update(User user) {
        userRepository.update(user);
        if(cachedUsers.containsKey(user.getId()))
            cachedUsers.put(user.getId(), user);
    }

    @Override
    public void delete(User user) {
        cachedUsers.remove(user.getId());

        userRepository.delete(user);
    }
}
