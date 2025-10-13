package thembelani.java.tutorials;

public class Node extends ListItem {


    public Node(Integer value) {
        super(value);
    }

    @Override
    protected ListItem next() {
        return this.rightLink;
    }

    @Override
    protected ListItem setNext(ListItem listItem) {
        this.rightLink = listItem;
        return this.rightLink;
    }

    @Override
    protected ListItem previous() {
        return leftLink;
    }

    @Override
    protected ListItem setPrevious(ListItem listItem) {
        this.leftLink = listItem;
        return this.leftLink;
    }

    @Override
    protected int compareTo(ListItem listItem) {

        if (listItem != null) {
            return ((String) super.getValue()).compareTo((String) listItem.getValue());
        }
        return -1;
    }
}
