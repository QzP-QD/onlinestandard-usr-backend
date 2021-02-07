package bupt.hpcn.onlinestandard.domain;

public class ItemDO {
    private int id;
    private int second_level_id;
    private int first_level_id;
    private String short_cut;
    private boolean property_related;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSecond_level_id() {
        return second_level_id;
    }

    public void setSecond_level_id(int second_level_id) {
        this.second_level_id = second_level_id;
    }

    public int getFirst_level_id() {
        return first_level_id;
    }

    public void setFirst_level_id(int first_level_id) {
        this.first_level_id = first_level_id;
    }

    public String getShort_cut() {
        return short_cut;
    }

    public void setShort_cut(String short_cut) {
        this.short_cut = short_cut;
    }

    public boolean isProperty_related() {
        return property_related;
    }

    public void setProperty_related(boolean property_related) {
        this.property_related = property_related;
    }

    @Override
    public String toString() {
        return "ItemDO{" +
                "id=" + id +
                ", second_level_id=" + second_level_id +
                ", first_level_id=" + first_level_id +
                ", short_cut='" + short_cut + '\'' +
                ", property_related=" + property_related +
                '}';
    }
}
