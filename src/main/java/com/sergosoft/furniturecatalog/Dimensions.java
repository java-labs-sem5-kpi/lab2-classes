package com.sergosoft.furniturecatalog;

import java.util.Objects;

/**
 * Represents the dimensions of a piece of furniture, including width, height, and depth.
 * This class provides methods to access and modify these attributes, and it overrides
 * the {@code equals}, {@code hashCode}, and {@code toString} methods to support equality checks
 * and string representation.
 */
public class Dimensions {

    /** The width of the furniture in meters. */
    private float width;

    /** The height of the furniture in meters. */
    private float height;

    /** The depth of the furniture in meters. */
    private float depth;

    /**
     * Constructs a {@code Dimensions} object with the specified width, height, and depth.
     *
     * @param width the width of the furniture in meters
     * @param height the height of the furniture in meters
     * @param depth the depth of the furniture in meters
     */
    public Dimensions(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    /**
     * Returns the width of the furniture.
     *
     * @return the width of the furniture in meters
     */
    public float getWidth() {
        return width;
    }

    /**
     * Sets the width of the furniture.
     *
     * @param width the new width of the furniture in meters
     */
    public void setWidth(float width) {
        this.width = width;
    }

    /**
     * Returns the height of the furniture.
     *
     * @return the height of the furniture in meters
     */
    public float getHeight() {
        return height;
    }

    /**
     * Sets the height of the furniture.
     *
     * @param height the new height of the furniture in meters
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Returns the depth of the furniture.
     *
     * @return the depth of the furniture in meters
     */
    public float getDepth() {
        return depth;
    }

    /**
     * Sets the depth of the furniture.
     *
     * @param depth the new depth of the furniture in meters
     */
    public void setDepth(float depth) {
        this.depth = depth;
    }

    /**
     * Compares this {@code Dimensions} object to the specified object. The result is {@code true} if and only if
     * the argument is not {@code null} and is a {@code Dimensions} object that represents the same width, height, and depth.
     *
     * @param o the object to compare this {@code Dimensions} object against
     * @return {@code true} if the given object represents a {@code Dimensions} equivalent to this object, {@code false} otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dimensions that = (Dimensions) o;
        return Float.compare(that.width, width) == 0 &&
                Float.compare(that.height, height) == 0 &&
                Float.compare(that.depth, depth) == 0;
    }

    /**
     * Returns a hash code value for this {@code Dimensions} object.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(width, height, depth);
    }

    /**
     * Returns a string representation of this {@code Dimensions} object. The string includes
     * the width, height, and depth of the furniture.
     *
     * @return a string representation of this {@code Dimensions}
     */
    @Override
    public String toString() {
        return "Dimensions{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
