package tacos;

import lombok.Data;

/**
 * @author ：Timber
 * @date ：Created in 2020/7/1 13:03
 * @modified By：
 */
@Data
public class Order {

    private String name;

    private String street;

    private String city;

    private String state;

    private String zip;

    private String ccNumber;

    private String ccExpiration;

    private String ccCVV;

}

