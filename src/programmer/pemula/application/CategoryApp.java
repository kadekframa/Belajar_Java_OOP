package programmer.pemula.application;

import programmer.pemula.data.Category;

public class CategoryApp {
    public static void main(String[] args) {

        var category = new Category();      // membuat object category dari class Category.
        category.setId("ID");
        category.setExpensive(true);
        category.setId(null);               // ini tidak terbaca, karena value parameternya sama dengan null.

        System.out.println(category.getId());
        System.out.println(category.isExpensive());

    }
}
