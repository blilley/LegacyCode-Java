import java.util.List;
import java.util.UUID;

public interface Repository<T> {
    List<T> getAll();
    T get(UUID id);
    T create(T object);
    void update(T object);
    void delete(T object);

}
