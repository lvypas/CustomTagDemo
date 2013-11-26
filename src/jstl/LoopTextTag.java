package jstl;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;


public class LoopTextTag extends BodyTagSupport {

    private int mTimes = 0;
    private BodyContent mBodyContent;

    public void setTimes(int pTimes) {
        mTimes = pTimes;
    }

    
    public void setBodyContent(BodyContent pBodyContent) {
        mBodyContent = pBodyContent;
    }

    
    public int doStartTag() throws JspException {
        if (mTimes > 1) {
            return EVAL_BODY_TAG;
        } else {
            return SKIP_BODY;
        }
    }

    
    public int doAfterBody() throws JspException {
        if (mTimes > 1) {
            mTimes--;
            return EVAL_BODY_TAG;
        } else {
            return SKIP_BODY;
        }
    }

    
    public int doEndTag() throws JspException {
        try {
            if (mBodyContent != null) {
                mBodyContent.writeOut(mBodyContent.getEnclosingWriter());
            }
        } catch (IOException pIOEx) {
            throw new JspException("Error: " + pIOEx.getMessage());
        }
        return EVAL_PAGE;
    }
}