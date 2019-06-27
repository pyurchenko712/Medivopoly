/*
 * Expression school is undefined on line 4, column 19 in Templates/Licenses/license-default.txt. Expression department is undefined on line 4, column 29 in Templates/Licenses/license-default.txt. 
 * Expression course is undefined on line 5, column 19 in Templates/Licenses/license-default.txt.
 * @author Petr Yurchenko <pyurchenko2363@westfield.ma.edu>
 * (c) 2019
 * Created: Mar 5, 2019 10:32:32 AM
 */
package medivopoly;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author Petr Yurchenko <pyurchenko2363@westfield.ma.edu>
 */
public class Tile extends BorderPane
{
    Image image;
    String name;
    public Tile(String file, String name)
    {
        super();
        FileInputStream inputstream = null;
        try
        {
            inputstream = new FileInputStream(file);
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(Tile.class.getName()).log(Level.SEVERE, null, ex);
        }
        image = new Image(inputstream, 180, 110, false, true);
        ImageView imageView = new ImageView(image);
        this.name = name;
        Label nameLabel = new Label(name);
        HBox tileCont = new HBox();
        //tileCont.getChildren().addAll(imageView, nameLabel);
        this.setCenter(imageView);
        this.setTop(nameLabel);
        //this.setCenter(tileCont);
    }
}
