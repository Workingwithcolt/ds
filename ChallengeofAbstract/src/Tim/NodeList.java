package Tim;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListIten item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
