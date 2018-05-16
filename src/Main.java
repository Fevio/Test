import javafx.application.Application;
        import javafx.geometry.Pos;
        import javafx.scene.Scene;
        import javafx.scene.image.Image;
        import javafx.scene.image.ImageView;
        import javafx.scene.layout.*;
        import javafx.scene.transform.Rotate;
        import javafx.stage.Stage;

public class Main extends Application {


    public GridPane creaGriglia(int column, int row) {
        GridPane griglia = new GridPane();
	Image image = new Image("http://goo.gl/kYEQl");

        for (int a = 0; a < column; a++) {
            griglia.addColumn(column);
            for (int b = 0; b < row; b++) {
                griglia.addRow(row);
            }
        }


        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {

                ImageView imageView = new ImageView();
                imageView.setImage(image);
                griglia.add(imageView, i, j);
            }
        }
        ColumnConstraints col0 = new ColumnConstraints();
        col0.setHgrow(Priority.ALWAYS);
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setHgrow(Priority.ALWAYS);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setHgrow(Priority.ALWAYS);
        ColumnConstraints col3 = new ColumnConstraints();
        col3.setHgrow(Priority.ALWAYS);
        ColumnConstraints col4 = new ColumnConstraints();
        col4.setHgrow(Priority.ALWAYS);
        griglia.getColumnConstraints().addAll(col0, col1, col2, col3, col4);

        return griglia;
    }

    @Override
    public void start(Stage stage) {


        GridPane grid = creaGriglia(5, 5);
        grid.setPrefSize(300, 300);

        //griglia.setAlignment(Pos.CENTER);
        //griglia.getTransforms().add(new Rotate(30, 30, 60)); //


        Scene scene = new Scene(grid, 400, 400);


        stage.setScene(scene);
        stage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
