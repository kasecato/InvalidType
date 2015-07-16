import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Optional;

public class InvalidType {

    public static <ENTITY extends WithStatus> Optional<ENTITY> convert(Class<ENTITY> clazz, String key, Object val) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        ENTITY entity = clazz.newInstance();
        Field f = clazz.getField(key);
        f.set(entity, convert(f.getType(), val));
        return Optional.ofNullable(entity);
    }

    public static <M, T extends M> M convert(Class<T> destClass, Object o) {
        if (destClass.isAssignableFrom(BigDecimal.class) || destClass.isAssignableFrom(Integer.class)) {
            BigDecimal b = null;
            if (destClass.isAssignableFrom(BigDecimal.class)) {
                return (M) b;
            }
        }
        return (M) o;
    }
}
