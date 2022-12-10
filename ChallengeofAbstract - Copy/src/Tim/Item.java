package Tim;

import java.util.LinkedList;
import java.util.ListIterator;

public abstract class Item {
    protected ListItem rightLink =  null;
    protected ListItem leftLink = null;
    protected Object value;

    public ListItem(Object value){
        this.value = value;
    }
    abstract ListItem next();
    abstract ListItem setNext();
    abstract ListItem previous();
    abstract ListItem setPrevious();

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    abstract ListItem setprevious;

    abstract int compareTo(ListItem item);


}
