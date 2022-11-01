package recipeBook;

import java.util.*;

public class Recipe {
    private final String name;
    private int amountCostRecipe;
    private final Map<Product, Integer> products;

    public Recipe(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Введите название рецепта!");
        } else {
            this.name = name;
        }
        this.amountCostRecipe = 0;
        this.products = new HashMap<>();
    }

    public void addProductRecipe(Product product, int value) {
        if (products.containsKey(product)) {
            throw new IllegalArgumentException("Продукт уже в списке!");
        }
        if (value < 1) {
            value = 1;
        }
        products.put(product, value);
        amountCostRecipe += product.getPrice() * value;
    }

    public String getName() {
        return name;
    }

    public int getAmountCostRecipe() {
        return amountCostRecipe;
    }

    public Map<Product,Integer> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", amountCostRecipe=" + amountCostRecipe +
                ", products=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
