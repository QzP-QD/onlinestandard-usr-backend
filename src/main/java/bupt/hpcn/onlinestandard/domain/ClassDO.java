package bupt.hpcn.onlinestandard.domain;

public class ClassDO {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "ClassDO{" +
                "id=" + id +
                ", name='" + name + '\'' +
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
}
