package eu.senla.task7.factory;

public class Factory<T> implements IFactory {
    private T typeObject;

    public T getTypeObject() {
        return typeObject;
    }

    private void setTypeObject(T typeObject) {
        this.typeObject = typeObject;
    }

    @Override
    public void createElement(Object object) {
        setTypeObject((T) object);
    }
}
