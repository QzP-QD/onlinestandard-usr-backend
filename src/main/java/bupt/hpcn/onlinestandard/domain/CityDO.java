package bupt.hpcn.onlinestandard.domain;

public class CityDO {
    private int id;
    private String name;
    private int prov_id;

    @Override
    public String toString() {
        return "CityDO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prov_id=" + prov_id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProv_id() {
        return prov_id;
    }

    public void setProv_id(int prov_id) {
        this.prov_id = prov_id;
    }
}
