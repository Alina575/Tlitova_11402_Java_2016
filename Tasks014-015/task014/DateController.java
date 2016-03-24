package ru.kpfu.itis.alina.task014;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Alina Tlitova
 *         11-402
 *         014
 */

@Controller
@RequestMapping("/getdate")
public class DateController {

    @RequestMapping(method = RequestMethod.GET)
    public String getDatePage(ModelMap model) {
        model.put("date", new SimpleDateFormat("dd.MM.yy - HH:mm:ss").format(new Date()));
        return "date";
    }
}
