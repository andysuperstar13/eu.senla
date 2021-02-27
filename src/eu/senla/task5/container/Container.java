package eu.senla.task5.container;

public abstract class Container {
    double volume;
    private int density;
    private int diagonal;
    private int height;

    Container() {
        this.density = determineDensityWater();
        this.height = determineHeightContainer();
        this.diagonal = determineDiagonalContainer();
        determineVolumeContainer();
    }

    protected abstract void determineVolumeContainer();

    private int determineHeightContainer(){
        return height = (int) (Math.random()*90)+10;
    }

    private int determineDiagonalContainer(){
        if ((int) (Math.random()*2)+1 == 1) {
            this.diagonal = 10;
        }else {
            this.diagonal = 20;
        }
        return this.diagonal;
    }

    private int determineDensityWater(){
        if ((int) (Math.random()*2)+1 == 1) {
            this.density = 1000;
        }else {
            this.density = 2000;
        }
        return this.density;
    }
    public int getDiagonal() {
        return diagonal;
    }

    int getHeight() {
        return height;
    }

    public double getVolume() {
        return volume ;
    }

    public int getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return "{volume = " + volume +
                ", density = " + density +
                ", diagonal = " + diagonal +
                ", height = " + height +
                '}';
    }
}
