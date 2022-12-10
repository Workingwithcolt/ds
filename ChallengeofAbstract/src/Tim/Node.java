package Tim;

public class Node extends Item {
    public Node(Object value){
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext() {
        this.right = item;
        return this.rightLink
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious() {
        this.leftLink = item;
        return this.leftLink
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null){
            return ((String) super.getValue()).compareTo((String)) item.getValue());
        }else{
            return -1;
        }
    }
}
