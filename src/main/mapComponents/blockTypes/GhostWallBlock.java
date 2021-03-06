package main.mapComponents.blockTypes;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import main.mapComponents.Coordinate;

/**
 * murs que seulement les Fantômes peuvent passer
 * voir MapBlock pour plus d'info sur les methodes
 */
public class GhostWallBlock extends MapBlock {

    public GhostWallBlock(Coordinate blockCoord, int blockSize) {
        super(blockCoord, blockSize);
    }

    @Override
    protected void setGraphic(int blockSize) {
        Rectangle rectangle = new Rectangle(
                blockSize,
                blockSize,
                Color.DARKGRAY
        );
        this.shapes.add(rectangle);
    }
}
