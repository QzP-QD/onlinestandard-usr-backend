package bupt.hpcn.onlinestandard.domain;

public class StandardDO {
    private int id;
    private int business_id;
    private int class_id;
    private String name;
    private String file;
    private int province_id;
    private int city_id;
    private String date;

    @Override
    public String toString() {
        return "StandardDO{" +
                "id=" + id +
                ", business_id=" + business_id +
                ", class_id=" + class_id +
                ", name='" + name + '\'' +
                ", file='" + file + '\'' +
                ", province_id=" + province_id +
                ", city_id=" + city_id +
                ", date='" + date + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBusiness_id() {
        return business_id;
    }

    public void setBusiness_id(int business_id) {
        this.business_id = business_id;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public int getProvince_id() {
        return province_id;
    }

    public void setProvince_id(int province_id) {
        this.province_id = province_id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
