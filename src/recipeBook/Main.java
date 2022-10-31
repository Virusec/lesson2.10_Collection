package recipeBook;

import java.util.*;

import static recipeBook.Storage2.storage2;

/*
Задание 2.
Возвращаемся к заданию со списком продуктов и рецептов. Вам необходимо доработать класс рецептов так, чтобы для
каждого продукта мы могли записать необходимое количество (например, бананы — 2 штуки).
Замените HashSet на HashMap, где в качестве ключа — продукт, а в качестве значения — необходимое количество.
Если количество продукта не было передано, сохраните 1.
Доработайте подсчет суммарной стоимости рецепта — умножьте стоимость каждого продукта на его количество.

Критерии проверки
HashSet заменен на HashMap.
В качестве ключа используется класс Product, в качестве значения — количество.
Количество продукта в рецепте не может быть меньше 1.
Переработан подсчет стоимости рецепта.
Остальная логика кода не была изменена.

Задание 3.
Создайте коллекцию Map<String, Integer>. Заполните ее произвольными значениями.
Напишите метод, который принимает строку (ключ) и целое число (значение) и пытается добавить ее в коллекцию по логике:
Если такого ключа нет, то просто добавляет данные в коллекцию.
Если такой ключ уже есть и значения совпадают, то необходимо бросить исключение.
Если такой ключ уже есть, но значения разные, то обновите целое число в коллекции.
Пример: есть HashMap "str1" —> 2.
Если метод принимает "str2" —> 1, добавляем новое значение.
Если метод принимает "str1" —> 2, кидаем исключение.
Если метод принимает "str1" —> 5, обновляем коллекцию (теперь по ключу "str1" будет храниться значение 5).

Критерии проверки
Создана коллекция Map<String, Integer>.
Коллекция Map<String, Integer> заполнена произвольными значениями.
Создан метод, который принимает строку (ключ) и целое число (значение).
Выполняется условие, при котором в коллекцию добавляются новые данные, если такого ключа нет.
Выполняется условие, при котором выбрасывается исключение, если такой ключ уже есть и значения совпадают.
Выполняется условие, при котором в коллекции обновляется целое число, если такой ключ уже есть, но значения разные.

Домашнее задание 2. Задание 1.
Создайте Map<String, List<Integer>>. Заполните ее 5 элементами, где ключ — произвольное значение, а значение — список,
состоящий из 3 случайных чисел в диапазоне от 0 до 1000.
Преобразуйте созданную коллекцию в новую — Map<String, Integer>, где ключи взяты из первой коллекции,
а число — сумма чисел списка. Выведите результат в консоль.

Пример:
"string1" —> [1, 6, 12]
"string2" —> [200, 150, 350]
Новая коллекция станет:
"string1" —> 19
"string2" —> 700

Критерии оценки
Изначальная коллекция заполняется 5 ключами, в каждом из которых список из 3 элементов.
Элементы списка должны быть случайными значениями в указанном диапазоне.
Изначальную коллекцию необходимо преобразовать в новую согласно условиям.
Результат выводится в консоль.

Задание 2.
Создайте Map<Integer, String>, заполните ее 10 произвольными значениями. Выведите в консоль всё содержимое коллекции
в порядке добавления (в формате "ключ:значение").

Критерии оценки
Выбрана верная реализация интерфейса Map.
Заполняемые значения не повторяются.
Вывод на консоль происходит в порядке, в котором значения добавлялись в коллекцию.
 */

public class Main {
    public static void main(String[] args) {
        Product cucumber = new Product("Огурцы", 150, 1.5);
        Product banana = new Product("Бананы", 90, 2.0);
        Product tomato = new Product("Помидоры", 120, 1.5);
        Product potato = new Product("Картошка", 60, 3.5);
        Product onion = new Product("Лук", 45, 2.5);
        List<Product> products = List.of(cucumber, banana, tomato, potato, onion);

        for (Product product : products) {
            ProductList.addProduct(product);
        }
        System.out.println(ProductList.getProductList());

        printSeparator();
        System.out.println("Домашнее задание 1.Задание 2.");

        Recipe friedPotato = new Recipe("Жареная картошка");
        friedPotato.addProductRecipe(onion, 2);
        friedPotato.addProductRecipe(potato, 2);

        Recipe salad = new Recipe("Салат");
        salad.addProductRecipe(cucumber, 3);
        salad.addProductRecipe(tomato, 2);
        salad.addProductRecipe(onion, 2);

        Recipe salad1 = new Recipe("Салат1");
        salad1.addProductRecipe(cucumber, 2);
        salad1.addProductRecipe(tomato, 0);
        salad1.addProductRecipe(onion, 1);

        RecipeBook.addRecipe(salad);
        RecipeBook.addRecipe(friedPotato);
        RecipeBook.addRecipe(salad1);
        System.out.println(RecipeBook.recipes);

        printSeparator();
        System.out.println("Домашнее задание 1.Задание 3.");

        Storage.addMap("str1", 5);
        Storage.addMap("str2", 1);
        Storage.addMap("str1", 3);
//        Storage.addMap("str1", 3);
        System.out.println(Storage.storage);

        printSeparator();
        System.out.println("Домашнее задание 2. Задание 1.");

        int numsSize = 3;
        storage2.put("string1", generateList(numsSize));
        storage2.put("string2", generateList(numsSize));
        storage2.put("string3", generateList(numsSize));
        storage2.put("string4", generateList(numsSize));
        storage2.put("string5", generateList(numsSize));
        System.out.println(storage2);
        System.out.println(Storage2.getTransformMap());

        printSeparator();
        System.out.println("Домашнее задание 2. Задание 2.");

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Vik");
        map.put(2, "Bob");
        map.put(3, "Kim");
        map.put(4, "Tim");
        map.put(5, "Pit");
        map.put(6, "Jane");
        map.put(7, "Kos");
        map.put(8, "Lim");
        map.put(9, "Zig");
        map.put(10, "Lee");
        System.out.println(map);
        printSeparator();
    }

    public static List<Integer> generateList(int numsSize) {
        Random random = new Random();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < numsSize; i++) {
            nums.add(random.nextInt(1001));
        }
        return nums;
    }

    static void printSeparator() {
        System.out.println("*********************************************");
    }

}
