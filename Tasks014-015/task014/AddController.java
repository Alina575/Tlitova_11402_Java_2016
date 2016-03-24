package ru.kpfu.itis.alina.task014;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Alina Tlitova
 *         11-402
 *         014
 */

@Controller
@RequestMapping("/add/{a}/{b}")
public class AddController {

    @RequestMapping(method = RequestMethod.GET)
    public String getDatePage(ModelMap model, @PathVariable Integer a, @PathVariable Integer b) {
        model.put("num1", a);
        model.put("num2", b);
        return "addNumbers";
    }
}
