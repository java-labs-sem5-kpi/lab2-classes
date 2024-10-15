package com.sergosoft.furniturecatalog;

import java.util.Objects;

/**
 * Represents a piece of furniture with various attributes such as material, dimensions, weight, color, and name.
 * This class provides methods to access and modify these attributes, and it overrides the {@code equals}, {@code hashCode},
 * and {@code toString} methods to support equality checks and string representation.
 */
public class Furniture {

    /** The name of the furniture, e.g., "Chair", "Table". */
    private String name;

    /** The material from which the furniture is made, e.g., "Wood", "Metal". */
    private String material;

    /** The dimensions of the furniture, represented by a separate {@link Dimensions} class. */
    private Dimensions dimensions;

    /** The weight of the furniture in kilograms. */
    private float weight;

    /** The color of the furniture. */
    private String color;

    /**
     * Constructs a {@code Furniture} object with the specified attributes.
     *
     * @param material the material of the furniture
     * @param dimensions the dimensions of the furniture (must not be null)
     * @param weight the weight of the furniture in kilograms
     * @param color the color of the furniture
     * @param name the name of the furniture (e.g., "Chair", "Table")
     * @throws IllegalArgumentException if the {@code dimensions} is null
     */
    public Furniture(String material, Dimensions dimensions, float weight, String color, String name) {
        if (dimensions == null) {
            throw new IllegalArgumentException("Dimensions is mandatory.");
        }
        this.material = material;
        this.dimensions = dimensions;
        this.weight = weight;
        this.color = color;
        this.name = name;
    }

    /**
     * Returns the name of the furniture.
     *
     * @return the name of the furniture
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the furniture.
     *
     * @param name the new name of the furniture
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the material of the furniture.
     *
     * @return the material of the furniture
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the material of the furniture.
     *
     * @param material the new material of the furniture
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Returns the dimensions of the furniture.
     *
     * @return the dimensions of the furniture
     */
    public Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * Sets the dimensions of the furniture.
     *
     * @param dimensions the new dimensions of the furniture
     */
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * Returns the weight of the furniture.
     *
     * @return the weight of the furniture
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the furniture.
     *
     * @param weight the new weight of the furniture in kilograms
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * Returns the color of the furniture.
     *
     * @return the color of the furniture
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the furniture.
     *
     * @param color the new color of the furniture
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Compares this {@code Furniture} to the specified object. The result is {@code true} if and only if the argument
     * is not {@code null} and is a {@code Furniture} object that represents the same material, dimensions, weight,
     * color, and name.
     *
     * @param o the object to compare this {@code Furniture} against
     * @return {@code true} if the given object represents a {@code Furniture} equivalent to this object, {@code false} otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Furniture furniture = (Furniture) o;
        return Float.compare(furniture.weight, weight) == 0 &&
                Objects.equals(material, furniture.material) &&
                Objects.equals(dimensions, furniture.dimensions) &&
                Objects.equals(color, furniture.color) &&
                Objects.equals(name, furniture.name);
    }

    /**
     * Returns a hash code value for this {@code Furniture} object.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(material, dimensions, weight, color, name);
    }

    /**
     * Returns a string representation of this {@code Furniture} object. The string includes the material, dimensions, weight,
     * color, and name of the furniture.
     *
     * @return a string representation of this {@code Furniture}
     */
    @Override
    public String toString() {
        return "Furniture{" +
                "material='" + material + '\'' +
                ", dimensions=" + dimensions +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}