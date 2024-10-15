package com.sergosoft.furniturecatalog;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Furniture[] furnitureArray = {
                new Furniture("Wood", new Dimensions(100, 50, 30), 20.5f, "Brown", "Table"),
                new Furniture("Metal", new Dimensions(60, 40, 20), 15.0f, "Black", "Chair"),
                new Furniture("Plastic", new Dimensions(120, 60, 35), 10.0f, "White", "Cabinet"),
                new Furniture("Wood", new Dimensions(80, 40, 25), 18.5f, "Red", "Desk"),
                new Furniture("Glass", new Dimensions(70, 35, 15), 12.0f, "Transparent", "Coffee Table")
        };

        // print initial state of the furniture array
        System.out.println("=> Меблевий каталог:");
        for (Furniture furniture : furnitureArray) {
            System.out.println("\t" + furniture);
        }

        // sort the furniture array by name in ascending order аnd then by weight in descending order
        Arrays.sort(furnitureArray, Comparator.comparing(Furniture::getName)
                .thenComparing(Comparator.comparing(Furniture::getWeight).reversed()));

        // print sorted state of the furniture array
        System.out.println("\n=> Відсортований меблевий каталог за назвами(за зростанням) та вагою(за спаданням):");
        for (Furniture furniture : furnitureArray) {
            System.out.println("\t" + furniture);
        }

        // try to find an existent furniture
        Furniture existentFurnitureToSearch = new Furniture("Metal", new Dimensions(60, 40, 20), 15.0f, "Black", "Chair");
        findFurniture(existentFurnitureToSearch, furnitureArray);

        // try to find an non-existent furniture
        Furniture nonexistentFurnitureToSearch = new Furniture("Gold", new Dimensions(22, 44, 33), 22.0f, "Golden", "Sofa");
        findFurniture(nonexistentFurnitureToSearch, furnitureArray);
    }

    private static void findFurniture(Furniture furniture, Furniture[] furnitureArray) {
        if(furniture == null) {
            throw new IllegalArgumentException("Furniture cannot be null.");
        }
        System.out.println("\n=> Пошук заданої позиції: " + furniture);
        if (Arrays.asList(furnitureArray).contains(furniture)) {
            System.out.println("\tОб'єкт знайдено: " + furniture);
        } else {
            System.out.println("\tОб'єкт не знайдено.");
        }
    }
}