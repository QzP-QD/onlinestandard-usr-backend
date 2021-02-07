package bupt.hpcn.onlinestandard.domain;

public class StandardItemDO {
    private int id;
    private int standard_id;
    private int item_id;
    private boolean property_related;
    private int property_type;
    private int value1;
    private int value2;
    private boolean required;
    private ItemDO item;

    public ItemDO getItem() {
        return item;
    }

    public void setItem(ItemDO item) {
        this.item = item;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStandard_id() {
        return standard_id;
    }

    public void setStandard_id(int standard_id) {
        this.standard_id = standard_id;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public boolean isProperty_related() {
        return property_related;
    }

    public void setProperty_related(boolean property_related) {
        this.property_related = property_related;
    }

    public int getProperty_type() {
        return property_type;
    }

    public void setProperty_type(int property_type) {
        this.property_type = property_type;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    @Override
    public String toString() {
        return "StandardItemDO{" +
                "id=" + id +
                ", standard_id=" + standard_id +
                ", item_id=" + item_id +
                ", property_related=" + property_related +
                ", property_type=" + property_type +
                ", value1=" + value1 +
                ", value2=" + value2 +
                ", required=" + required +
                '}';
    }
}
