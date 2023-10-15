package ArrayList;

public  class Product {
    private  int productId;
    private String productName;
    private  double productPrice;
    private  int productqty;

    public Product(int productId, String productName, double productPrice, int productqty) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productqty = productqty;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductqty() {
        return productqty;
    }

    public void setProductqty(int productqty) {
        this.productqty = productqty;
    }

}

