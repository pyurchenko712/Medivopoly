package medivopoly;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screenHeight = screenSize.getHeight() - 100;
        screenWidth = screenSize.getWidth();
        BorderPane mainMenuRoot = new BorderPane();
        Button newGame = new Button("New Game");
        Button loadGame = new Button("Load Game");
        Button exitGame = new Button("Exit Game");
        mainMenuRoot.setTop(newGame);
        mainMenuRoot.setCenter(loadGame);
        mainMenuRoot.setBottom(exitGame);
        
       
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
        
        setTiles(topRow, bottomRow, leftColumn, rightColumn, tiles);
        
        //DON'T TOUCH
        Scene scene = new Scene(mainMenuRoot, screenWidth, screenHeight);        
        primaryStage.setTitle("Medivopoly");
        primaryStage.setScene(scene);
        primaryStage.show();
        
         newGame.setOnAction( e -> {
            scene.setRoot(gameRoot);
        });
        
    }
    public static void setTiles(HBox topRow, HBox bottomRow, VBox leftColumn, VBox rightColumn, Tile[] tiles)
    {
        Tile throneRoom = new Tile("resources\\throne_room.jpg", "Throne Room", false, 0);
        Tile smallFarm = new Tile("resources\\small_farm.jpg", "Small Farm", true, 100);
        Tile wheatField = new Tile("resources\\wheat_field.jpg", "Wheat Field", true, 200);
        Tile windmill = new Tile("resources\\windmill.jpg", "Windmill", true, 300);
        Tile inn = new Tile("resources\\inn.jpg", "Inn", true, 400);
        Tile smallTown = new Tile("resources\\small_town.jpg", "Small Town", true, 500);
        Tile mercenaryCamp = new Tile("resources\\mercenary_camp.jpg", "Mercenary Camp", false, 0);
        Tile lighthouse = new Tile("resources\\lighthouse.jpg", "Lighthouse", true, 700);
        Tile port = new Tile("resources\\port.jpg", "Port", true, 800);
        Tile darkForest = new Tile("resources\\dark_forest.jpg", "Dark Forest", false, 0);
        Tile tower = new Tile("resources\\tower.jpg", "Tower", true, 900);
        Tile walledCity = new Tile("resources\\walled_city.jpg", "Walled City", true, 1000);
        Tile dungeon = new Tile("resources\\dungeon.jpg", "Dungeon", false, 0);
        Tile riverTribe = new Tile("resources\\river_tribe.jpg", "River Tribe", true, 1100);
        Tile forestTribe = new Tile("resources\\forest_tribe.jpg", "Forest Tribe", true, 1300);
        Tile desertTribe = new Tile("resources\\desert_tribe.jpg", "Desert Tribe", true, 1500);
        Tile warPost = new Tile("resources\\war_post.jpg", "War Post", true, 1700);
        Tile darkCastle = new Tile("resources\\dark_castle.jpg", "Dark Castle", true, 1900);
        Tile wildlands = new Tile("resources\\wildlands.jpg", "Wildlands", false, 0);
        Tile mountainVillage = new Tile("resources\\mountain_village.jpg", "Mountain Village", true, 2000);
        Tile mountainCastle = new Tile("resources\\mountain_castle.jpg", "Mountain Castle", true, 2200);
        Tile highlands = new Tile("resources\\highlands.jpg", "Highlands", false, 0);
        Tile capitalCity = new Tile("resources\\capital_city.jpg", "Capital City", true, 2500);
        Tile kingsCastle = new Tile("resources\\kings_castle.jpg", "Kings Castle", true, 3000);
        
        topRow.getChildren().addAll(throneRoom, kingsCastle, capitalCity, highlands, mountainCastle, mountainVillage, wildlands);
        bottomRow.getChildren().addAll(mercenaryCamp, lighthouse, port, darkForest, tower, walledCity, dungeon);
        leftColumn.getChildren().addAll(smallFarm, wheatField, windmill, inn, smallTown);
        rightColumn.getChildren().addAll(darkCastle, warPost, desertTribe, forestTribe, riverTribe);
        
        tiles[0] = throneRoom;
        tiles[1] = smallFarm;
        tiles[2] = wheatField;
        tiles[3] = windmill;
        tiles[4] = inn;
        tiles[5] = smallTown;
        tiles[6] = mercenaryCamp;
        tiles[7] = lighthouse;
        tiles[8] = port;
        tiles[9] = darkForest;
        tiles[10] = tower;
        tiles[11] = walledCity;
        tiles[12] = dungeon;
        tiles[17] = darkCastle;
        tiles[16] = warPost;
        tiles[15] = desertTribe;
        tiles[14] = forestTribe;
        tiles[13] = riverTribe;
        tiles[23] = kingsCastle;
        tiles[22] = capitalCity;
        tiles[21] = highlands;
        tiles[20] = mountainCastle;
        tiles[19] = mountainVillage;
        tiles[18] = wildlands;
    }
    public static void main(String[] args)
    {
        launch(args);
    } 
}
