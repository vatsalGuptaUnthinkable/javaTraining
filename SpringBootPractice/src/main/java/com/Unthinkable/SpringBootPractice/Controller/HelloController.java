package com.Unthinkable.SpringBootPractice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(name = "/")
    public String helloDeveloper() {
        String key = "Hey Developer Welcome to this Web Api Platform. \n" +
                "Use /department to use FetchAPI and PostAPI for H2 IN memory Database. \n" +
                "Use /department/id to use FetchAPI using ID. \n" +
                "Use /departmentByName/name to use FetchAPI Data using Name.  \n" +
                "Use /department/id to DeleteAPI using ID.   \n" +
                "Use /department/id to UpdateAPi using ID.    \n" +

                "Use /employee TO Fetch data and Post data to the H2 IN memory Database.                  \n" +
                "Use /employee/id to Fetch data using ID.            \n" +
                "Use /employeeByName/name to use FetchAPI using Name.          \n" +
                "Use /employee/id to use DeleteAPI  using ID.            \n" +
                "Use /employee/id to use UpdateAPI using ID.           \n"   ;
        System.out.println(key);
        return key;
    }
}
