package medivopoly;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Medivopoly extends Application
{      
    @Override
    public void start(Stage primaryStage)
    {   
        //GET FULL SCREEN SIZE
        double screenHeight = 960;
        double screenWidth = 1800 ;
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //screenHeight = screenSize.getHeight();
        //screenWidth = screenSize.getWidth();
        
        
        //Set Up of the main border pane that contains the game and all of its elements
        BorderPane gameRoot = new BorderPane();
        HBox topRow = new HBox();
        HBox bottomRow = new HBox();
        VBox leftColumn = new VBox();
        VBox rightColumn = new VBox();
        gameRoot.setTop(topRow);
        gameRoot.setLeft(leftColumn);
        gameRoot.setBottom(bottomRow);
        gameRoot.setRight(rightColumn);
                
        Tile[] tiles = new Tile[24];
        
        setTopTiles(topRow, tiles);
        setBottomTiles(bottomRow, tiles);
        setLeftTiles(leftColumn, tiles);
        setRightTiles(rightColumn, tiles);
        
        //DON'T TOUCH
        Scene scene = new Scene(gameRoot);        
        primaryStage.setTitle("Medivopoly");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void setTopTiles(HBox topRow, Tile[] tiles)
    {
        Tile throneRoom = new Tile("resources\\throne_room.jpg", "Throne Room");
        Tile kingsCastle = new Tile("resources\\kings_castle.jpg", "Kings Castle");
        Tile capitalCity = new Tile("resources\\capital_city.jpg", "Capital City");
        Tile highlands = new Tile("resources\\highlands.jpg", "Highlands");
        Tile mountainCastle = new Tile("resources\\mountain_castle.jpg", "Mountain Castle");
        Tile mountainVillage = new Tile("resources\\mountain_village.jpg", "Mountain Village");
        Tile wildlands = new Tile("resources\\wildlands.jpg", "Wildlands");
        
        topRow.getChildren().addAll(throneRoom, kingsCastle, capitalCity, highlands, mountainCastle, mountainVillage, wildlands);
        tiles[0] = throneRoom;
        tiles[23] = kingsCastle;
        tiles[22] = capitalCity;
        tiles[21] = highlands;
        tiles[20] = mountainCastle;
        tiles[19] = mountainVillage;
        tiles[18] = wildlands;
    }
    public static void setBottomTiles(HBox bottomRow, Tile[] tiles)
    {
        Tile mercenaryCamp = new Tile("resources\\mercenary_camp.jpg", "Mercenary Camp");
        Tile lighthouse = new Tile("resources\\lighthouse.jpg", "Lighthouse");
        Tile port = new Tile("resources\\port.jpg", "Port");
        Tile darkForest = new Tile("resources\\dark_forest.jpg", "Dark Forest");
        Tile tower = new Tile("resources\\tower.jpg", "Tower");
        Tile walledCity = new Tile("resources\\walled_city.jpg", "Walled City");
        Tile dungeon = new Tile("resources\\dungeon.jpg", "Dungeon");
        
        bottomRow.getChildren().addAll(mercenaryCamp, lighthouse, port, darkForest, tower, walledCity, dungeon);
        tiles[6] = mercenaryCamp;
        tiles[7] = lighthouse;
        tiles[8] = port;
        tiles[9] = darkForest;
        tiles[10] = tower;
        tiles[11] = walledCity;
        tiles[12] = dungeon;
    }
    public static void setLeftTiles(VBox leftColumn, Tile[] tiles)
    {
        Tile smallFarm = new Tile("resources\\small_farm.jpg", "Small Farm");
        Tile wheatField = new Tile("resources\\wheat_field.jpg", "Wheat Field");
        Tile windmill = new Tile("resources\\windmill.jpg", "Windmill");
        Tile inn = new Tile("resources\\inn.jpg", "Inn");
        Tile smallTown = new Tile("resources\\small_town.jpg", "Small Town");
        
        leftColumn.getChildren().addAll(smallFarm, wheatField, windmill, inn, smallTown);
        tiles[1] = smallFarm;
        tiles[2] = wheatField;
        tiles[3] = windmill;
        tiles[4] = inn;
        tiles[5] = smallTown;
    }
    public static void setRightTiles(VBox rightColumn, Tile[] tiles)
    {
        Tile darkCastle = new Tile("resources\\dark_castle.jpg", "Dark Castle");
        Tile warPost = new Tile("resources\\war_post.jpg", "War Post");
        Tile desertTribe = new Tile("resources\\desert_tribe.jpg", "Desert Tribe");
        Tile forestTribe = new Tile("resources\\forest_tribe.jpg", "Forest Tribe");
        Tile riverTribe = new Tile("resources\\river_tribe.jpg", "River Tribe");
        
        rightColumn.getChildren().addAll(darkCastle, warPost, desertTribe, forestTribe, riverTribe);
        tiles[17] = darkCastle;
        tiles[16] = warPost;
        tiles[15] = desertTribe;
        tiles[14] = forestTribe;
        tiles[13] = riverTribe;
    }
    public static void main(String[] args)
    {
        launch(args);
    } 
}
