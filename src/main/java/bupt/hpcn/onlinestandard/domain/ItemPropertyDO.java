package bupt.hpcn.onlinestandard.domain;

public class ItemPropertyDO {
    private int id;
    private int item_id;
    private int property_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public int getProperty_id() {
        return property_id;
    }

    public void setProperty_id(int property_id) {
        this.property_id = property_id;
    }

    @Override
    public String toString() {
        return "ItemPropertyDO{" +
                "id=" + id +
                ", item_id=" + item_id +
                ", property_id=" + property_id +
                '}';
    }
}
