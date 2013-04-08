package com.ieci.tecdoc.common.isicres;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ieci.tecdoc.common.invesicres.ScrPfi;
import com.ieci.tecdoc.common.invesicres.ScrPjur;

/**
 * @author LMVICENTE
 * @creationDate 05-jul-2004 16:41:57
 * @version
 * @since
 */
public class BuscInterResults implements Serializable {

    /*******************************************************************************************************************
     * Attributes
     ******************************************************************************************************************/

    private int size = 0;
    private List content = new ArrayList();

    /*******************************************************************************************************************
     * Constructors
     ******************************************************************************************************************/

    public BuscInterResults() {
    }

    /*******************************************************************************************************************
     * Public methods
     ******************************************************************************************************************/

    public void add(ScrPfi scr) {
        if (scr != null) {
            content.add(scr);
        }
    }

    public void add(ScrPjur scr) {
        if (scr != null) {
            content.add(scr);
        }
    }

    /**
     * @return Returns the content.
     */
    public List getContent() {
        return content;
    }

    /**
     * @param content
     *            The content to set.
     */
    public void setContent(List content) {
        this.content = content;
    }

    /**
     * @return Returns the size.
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size
     *            The size to set.
     */
    public void setSize(int size) {
        this.size = size;
    }

    /*******************************************************************************************************************
     * Protected methods
     ******************************************************************************************************************/

    /*******************************************************************************************************************
     * Private methods
     ******************************************************************************************************************/

    /*******************************************************************************************************************
     * Inner classes
     ******************************************************************************************************************/

    /*******************************************************************************************************************
     * Test brench
     ******************************************************************************************************************/

}
