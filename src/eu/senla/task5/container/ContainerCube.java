package eu.senla.task5.container;

public class ContainerCube extends Container{

    @Override
    protected void determineVolumeContainer() {
        volume = Math.pow(super.getDiagonal(), 2) / 2 * super.getHeight();
    }

    @Override
    public String toString() {
        return "СontainerCube " + super.toString();
    }
}
