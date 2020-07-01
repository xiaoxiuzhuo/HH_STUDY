package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ：Timber
 * @date ：Created in 2020/7/1 13:02
 * @modified By：
 */

//识别为一个组件，自动创建一个bean

//@RequestMapping("/")  对根目录的请求作出响应（调用getmapping注解修饰的方法）
@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }

}
