public class Customer {
    private String name;
    private String phone;
    private String carNo;
    private String carModel;

    public Customer(String name, String phone, String carNo, String carModel) {
        this.name = name;
        this.phone = phone;
        this.carNo = carNo;
        this.carModel = carModel;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getCarNo() {
        return carNo;
    }

    public String getCarModel() {
        return carModel;
    }

}
