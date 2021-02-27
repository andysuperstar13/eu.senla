package eu.senla.task5.container;

public class ContainerCylinder extends Container {
    @Override
    protected void determineVolumeContainer() {
        volume = Math.PI * Math.pow(super.getDiagonal(), 2) / 4 * super.getHeight();
    }

    @Override
    public String toString() {
        return "СontainerСylinder " + super.toString();
    }
}
