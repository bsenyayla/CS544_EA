package mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = {"/"})
@RestController
public class HomeController {


    @RequestMapping("/")
    public String hello(){
        return "Hello.....";
    }
}


/*
*
* @RestController
public class GreetingController {
@RequestMapping("/greeting")
public String greeting() {
return "Hello World";
}
}
* */