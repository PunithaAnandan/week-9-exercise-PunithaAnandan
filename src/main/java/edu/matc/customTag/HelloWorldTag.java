package edu.matc.customTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * Created by Punitha Anandan on 3/12/2017.
 */
public class HelloWorldTag extends TagSupport {
    private String date;

    @Override
    public int doStartTag() throws JspException {
        JspWriter out=pageContext.getOut();
        try {
            out.println("Hello Enterprise Java.<br>");
            if (date != null) {
                if (date.startsWith("10/31")) {
                    out.println("Happy Halloween");
                }
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return SKIP_BODY;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
