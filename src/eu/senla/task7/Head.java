package eu.senla.task7;

import eu.senla.task7.constant.Shape;

public class Head {
    private Shape form;

    Head(Shape form) {
        this.form =form;
    }

    Shape getForm() {
        return form;
    }

    @Override
    public String toString() {
        return this.form.toString();
    }
}
