package gui;

import game.data.Coordinate2D;

public class Bounds {
    private int minX, maxX, minZ, maxZ;

    public Bounds() {
        reset();
    }

    public void reset() {
        this.minX = Integer.MAX_VALUE;
        this.maxX = Integer.MIN_VALUE;
        this.minZ = Integer.MAX_VALUE;
        this.maxZ = Integer.MIN_VALUE;
    }

    public void update(Coordinate2D coord) {
        updateX(coord.getX());
        updateZ(coord.getZ());
    }

    private void updateX(int x) {
        if (x < minX) { minX = x; }
        if (x > maxX) { maxX = x; }
    }

    private void updateZ(int z) {
        if (z < minZ) { minZ = z; }
        if (z > maxZ) { maxZ = z; }
    }

    public int getWidth() {
        return Math.abs(getMaxX() - getMinX()) + 1;
    }

    public int getHeight() {
        return Math.abs(getMaxZ() - getMinZ()) + 1;
    }

    public int getMinX() {
        return minX;
    }


    public int getMaxX() {
        return maxX;
    }

    public int getMinZ() {
        return minZ;
    }

    public int getMaxZ() {
        return maxZ;
    }

    @Override
    public String toString() {
        return "Bounds{" +
            "minX=" + minX +
            ", maxX=" + maxX +
            ", minZ=" + minZ +
            ", maxZ=" + maxZ +
            '}';
    }
}
