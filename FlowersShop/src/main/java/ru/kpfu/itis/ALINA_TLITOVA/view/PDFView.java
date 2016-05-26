package ru.kpfu.itis.ALINA_TLITOVA.view;

import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfPCell;
import org.springframework.web.servlet.view.document.AbstractPdfView;
import ru.kpfu.itis.ALINA_TLITOVA.models.Order;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

import static com.lowagie.text.html.HtmlTags.FONT;
import static java.awt.Color.BLACK;
import static java.awt.Color.WHITE;

public class PDFView extends AbstractPdfView {

    @Override
    protected void buildPdfDocument(Map<String, Object> model, com.lowagie.text.Document document,
                                    com.lowagie.text.pdf.PdfWriter pdfWriter, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        document.add(new com.lowagie.text.Paragraph("Login: " + model.get("login")));
        document.add(new com.lowagie.text.Paragraph("Phone: " + model.get("phone")));
        document.add(new com.lowagie.text.Paragraph("Date of order: " + model.get("date")));
        List<Order> ordersList = (List<Order>) model.get("ordersList");

        com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(3);
        table.setWidthPercentage(100.0f);
        table.setWidths(new float[]{3.0f, 2.0f, 2.0f});
        table.setSpacingBefore(10);

        Font font = FontFactory.getFont(FontFactory.HELVETICA);

        font.setColor(WHITE);

        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(BLACK);
        cell.setPadding(5);

        cell.setPhrase(new Phrase("Type", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Quantity", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Summ", font));
        table.addCell(cell);

        for (int i = 0; i < ordersList.size(); i++) {
            table.addCell(ordersList.get(i).getFlower().getCategory());
            table.addCell(ordersList.get(i).getQuantity().toString());
            table.addCell(String.valueOf(ordersList.get(i).getFlower().getPrice() * ordersList.get(i).getQuantity()));
        }

        document.add(table);
    }
}
