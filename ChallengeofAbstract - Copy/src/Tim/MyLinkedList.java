package Tim;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListIten newItem){
        if(this.root == null){
            //the List was empty so this becomes the head of list
            this.root = newItem;
            return true;
        }
        ListItem currentItem =this.root;
        while(currentItem != null){
            int comparision  = (currentItem.compareTo(newItem));
            if(comparision < 0){
                //new item is greater ,move right if possible
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else{
                    //there is no next so insert at the end of list

                    currentItem

                }
            }
        }
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
