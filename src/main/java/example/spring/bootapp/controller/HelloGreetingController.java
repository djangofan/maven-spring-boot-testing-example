package example.spring.bootapp.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;

@RestController
public class HelloGreetingController
{
    @RequestMapping(path={"/hello"}, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
	protected HashMap<String, String> displayHelloGreetingMessage()
    {
        HashMap<String, String> model = new HashMap<>();
        String name = "Hello Greeting!!";
        model.put("greeting", name);
        return model;
	}

}