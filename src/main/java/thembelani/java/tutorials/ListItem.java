package thembelani.java.tutorials;

public abstract class ListItem {

    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Integer value;

    public ListItem(Integer value) {
        this.value = value;
    }

    protected abstract ListItem next();

    protected abstract ListItem setNext(ListItem listItem);

    protected abstract ListItem previous();

    protected abstract ListItem setPrevious(ListItem listItem);

    protected abstract int compareTo(ListItem listItem);

    public Integer getValue() {

        return this.value;
    }

    public void setValue(Integer object) {
        this.value = object;
    }

}
