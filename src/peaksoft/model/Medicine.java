package peaksoft.model;

public class Medicine {
    private Long id;
    private String medicineName;
    private int price;
    private int count;

    public Medicine(Long id, String medicineName, int price, int count) {
        this.id = id;
        this.medicineName = medicineName;
        this.price = price;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Medicine: " +
                "id: " + id + "\n" +
                "medicineName: " + medicineName + "\n" +
                "price: " + price + "\n" +
                "count: " + count;
    }
}
