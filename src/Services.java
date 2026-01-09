import java.util.List;

public class Services {
    private String serviceName;
    private double price;

    public Services(String serviceName, double price) {
        this.serviceName = serviceName;
        this.price = price;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getPrice() {
        return price;
    }
}
