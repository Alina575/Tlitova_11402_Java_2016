package ru.kpfu.itis.alina.task015;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Alina Tlitova
 *         11-402
 *         015
 */

@Controller
@RequestMapping("/result")
public class ResultController {

    @RequestMapping(method = RequestMethod.GET)
    public String resultGet(ModelMap model, String action, String text) {
        Integer res = 0;

        if (action.equals("symbols")) {
            res = text.length();

        } else if (action.equals("words")) {
            char[] str = text.toCharArray();
            for (char aStr : str) {
                if (aStr == ' ') {
                    res++;
                }
            }
            res++;
        } else if (action.equals("sentences")) {
            char[] str = text.toCharArray();
            for (char aStr : str) {
                if (aStr == '.' || aStr == '?' || aStr == '!') {
                    res++;
                }
            }
        } else {
            char[] str = text.toCharArray();
            for (char aStr : str) {
                if (aStr == '\n') {
                    res++;
                }
            }
        }
        model.put("res", res);
        return "result";
    }
}
