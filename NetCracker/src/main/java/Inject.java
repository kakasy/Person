import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * annotation for setting fields
 * @author Никита
 */
@Target(ElementType.FIELD)  //только для атрибутов(переменных) класса;
@Retention(RetentionPolicy.RUNTIME)  //можно сохранять нашу аннотацию JVM во время выполнения -> использовать reflection
public @interface Inject {}