package bupt.hpcn.onlinestandard.domain;

public class PropertyDO {
    private int id;
    private int equip_id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEquip_id() {
        return equip_id;
    }

    public void setEquip_id(int equip_id) {
        this.equip_id = equip_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PropertyDO{" +
                "id=" + id +
                ", equip_id=" + equip_id +
                ", name='" + name + '\'' +
                '}';
    }
}
