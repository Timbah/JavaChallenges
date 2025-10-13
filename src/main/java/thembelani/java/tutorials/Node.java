package thembelani.java.tutorials;

public class Node extends ListItem {


    public Node(Integer value) {
        super(value);
    }

    @Override
    protected ListItem next() {
        return rightLink;
    }

    @Override
    protected ListItem setNext(ListItem listItem) {
        rightLink = listItem;
        return rightLink;
    }

    @Override
    protected ListItem previous() {
        return leftLink;
    }

    @Override
    protected ListItem setPrevious(ListItem listItem) {
        leftLink = listItem;
        return leftLink;
    }

    @Override
    protected int compareTo(ListItem listItem) {
        return this.value > listItem.value ? 1 : -1;
    }
}
