package bupt.hpcn.onlinestandard.domain;

public class equipDO {
    private int id;
    private String equip_name;
    private String equip_type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquip_name() {
        return equip_name;
    }

    public void setEquip_name(String equip_name) {
        this.equip_name = equip_name;
    }

    public String getEquip_type() {
        return equip_type;
    }

    public void setEquip_type(String equip_type) {
        this.equip_type = equip_type;
    }

    @Override
    public String toString() {
        return "equipDO{" +
                "id=" + id +
                ", equip_name='" + equip_name + '\'' +
                ", equip_type='" + equip_type + '\'' +
                '}';
    }
}
