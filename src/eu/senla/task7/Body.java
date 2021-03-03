package eu.senla.task7;

import eu.senla.task7.constant.Material;

public class Body {
    private Material material;

    Body(Material material) {
        this.material = material;
    }

    Material getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return this.material.toString();
    }
}
