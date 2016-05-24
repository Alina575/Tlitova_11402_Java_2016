package ru.kpfu.itis.ALINA_TLITOVA.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.document.AbstractPdfView;
import ru.kpfu.itis.ALINA_TLITOVA.models.Delivery;

import java.math.BigInteger;
import java.util.*;

/**
 * @author Alina Tlitova
 *         11-402
 *         07.05.2016
 */

@Controller
public class PDFController {

    /*
    @RequestMapping(value = "/generate/pdf.htm", method = RequestMethod.GET)
    ModelAndView generatePdf(Map<String, Object> map) throws Exception {

        List rants = (List) map.get("delivery");
        Table rantTable = new Table(6);
        rantTable.setWidth(102);
        rantTable.setBorderWidth(1);
        rantTable.addCell("Фамилия");
        rantTable.addCell("Имя");
        rantTable.addCell("Очество");
        rantTable.addCell("Телефон");
        rantTable.addCell("Дата заказа");
        rantTable.addCell("Подпись");
        for (Iterator iter = rants.iterator(); iter.hasNext(); ) {
            Delivery delivery = (Delivery) iter.next();
            rantTable.addCell(delivery.getSecondname());
            rantTable.addCell(delivery.getName());
            rantTable.addCell(delivery.getLastname());
            rantTable.addCell(delivery.getPhone());
            rantTable.addCell(String.valueOf(new Date()));
            rantTable.addCell("   ");
        }

        ModelAndView modelAndView = new ModelAndView("pdfView", "rantTable", rantTable);
        modelAndView.addObject("rent", "PDF Cocument Some String");

        return modelAndView;
    }
    */

}

