package Academy.main.model;

public class customers {

    private Long ced;
    private String fullName;
    private String lastName;
    private Long numberPhone;
    private String address;

    public customers(Long ced, String fullName, String lastName, Long numberPhone, String address) {
        this.ced = ced;
        this.fullName = fullName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.address = address;
    }

    public Long getCed() {
        return ced;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getNumberPhone() {
        return numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setNumberPhone(Long numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setAddress(String address) {
        this.address = address;
    };

}
