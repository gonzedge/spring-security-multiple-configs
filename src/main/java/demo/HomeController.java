package demo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String index() {
        return "home";
    }

    @RequestMapping(value = "/secure", method = RequestMethod.GET)
    public String secure() {
        return "secure";
    }

    @RequestMapping(value = "/api/home", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String indexJson() {
        return "home";
    }

    @RequestMapping(value = "/api/secure", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String secureJson() {
        return "secure";
    }
}
