package 문제1번;

import java.util.List;
import java.util.ArrayList;

class Bread {
    private String breadType;
    private Recipe recipe;

    public Bread(String breadType, Recipe recipe) {
        this.breadType = breadType;
        this.recipe = recipe;
    }

    public void displayBreadInfo() {
        System.out.println("breadType: " + breadType);
        System.out.println("recipe");
        recipe.displayRecipe();
    }
}

class Recipe {
    private int flour;
    private int water;
    private int cream;
    private int sugar;
    private int butter;

    public Recipe(int flour, int water, int cream, int sugar, int butter) {
        this.flour = flour;
        this.water = water;
        this.cream = cream;
        this.sugar = sugar;
        this.butter = butter;
    }

    public void displayRecipe() {
        System.out.println("flour: " + flour);
        System.out.println("water: " + water);
        System.out.println("cream: " + cream);
        System.out.println("sugar: " + sugar);
        System.out.println("butter: " + butter);
    }
}

class BreadFactory {
    public static Bread createBread(String breadType, Recipe recipe) {
        return new Bread(breadType, recipe);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Bread> breadList = new ArrayList<>();

        // JSON 데이터로부터 Bread 객체를 생성하고 리스트에 추가
        breadList.add(BreadFactory.createBread("cream", new Recipe(100, 100, 200, 0, 0)));
        breadList.add(BreadFactory.createBread("sugar", new Recipe(100, 50, 0, 200, 0)));
        breadList.add(BreadFactory.createBread("butter", new Recipe(100, 100, 0, 0, 50)));

        // 리스트 내의 Bread 객체를 순환하며 속성을 출력
        for (Bread bread : breadList) {
            bread.displayBreadInfo();
            System.out.println();
        }
    }
}
