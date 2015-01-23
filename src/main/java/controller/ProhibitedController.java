package controller;

/**
 * Created by robert.szostakowski on 2015-01-23.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/secure/admin/shouldBeProhibited")
public class ProhibitedController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        System.out.println("Using mapped method");
        model.addAttribute("message", "This website should be only available for chosen people");
        return "hello";

    }
}
