package recipeBook;

import java.util.Objects;

public class Product {
    private final String name;
    private final Integer price;
    private final Double quantity;

    public Product(String name, Integer price, Double quantity) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.name = name;
        }

        if (price == null || price <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.price = price;
        }

        if (quantity == null || quantity <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.quantity = quantity;
        }
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
