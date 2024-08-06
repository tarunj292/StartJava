class Product
{
    private int code, qty;
    private String pname;
    private float price, offer;

    private void getOffer()
    {
        if (qty <= 50)
            offer = 0;
        else if (qty > 50 && qty <= 100)
            offer = 5;
        else if (qty > 100)
            offer = 10;
    }

    public void getStock(int code, String pname, float price, int qty)
    {
        this.code = code;
        this.pname = pname;
        this.price = price;
        this.qty = qty;
        getOffer();
    }

    public void ShowProduct()
    {
        System.out.println("Code: " + code + "\nProduct Name: " + pname + "\nPrice: " + price + "\nQuantity: " + qty + "\nOffer: " + offer);
    }
}

class ProductDemo
{
    public static void main(String[] args)
    {
        Product p = new Product();
        p.getStock(1, "Lassi", 45.0f, 900);
        p.ShowProduct();
    }
}
