package videoshop.order;

import org.salespointframework.catalog.Product;

public class QuantityForm {
    private Float quantity;
    private Product itemQuantity;

    public QuantityForm(Float quantity, Product itemQuantity) {
        this.quantity = quantity;
        this.itemQuantity = itemQuantity;
    }

    public Float getQuantity() {
        return this.quantity;
    }

    public Product getItemQuantity() {
        return this.itemQuantity;
    }
}
