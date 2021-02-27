package eu.senla.task5.container;

public class ContainerCone extends Container {

    @Override
    protected void determineVolumeContainer() {
        volume = ((double) 1 / 3) * Math.PI * Math.pow(super.getDiagonal(), 2) / 4 * super.getHeight();
    }

    @Override
    public String toString() {
        return "СontainerCone " + super.toString();
    }
}