package tacos;

import lombok.Data;

import java.util.List;

/**
 * @author ：Timber
 * @date ：Created in 2020/7/1 13:03
 * @modified By：
 */
@Data
public class Taco {
    private String name;
    private List<String> ingredients;
}
