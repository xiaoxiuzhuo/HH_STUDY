package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author ：Timber
 * @date ：Created in 2020/7/1 13:03
 * @modified By：
 */
@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type{
        WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE
    }
}
