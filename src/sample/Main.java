package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Boolean calculator");
        primaryStage.setScene(new Scene(root));
        primaryStage.getIcons().add(new Image("static/css/icon.png"));
        primaryStage.show();






//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        }
//        catch (ClassNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//
//        try {
//            String url = "jdbc:mysql://localhost:3306/calculation";
//            Connection con = DriverManager.getConnection(url, "root", "1");
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }



//
//        DBWorker worker = new DBWorker();
//        String query = "select * from history";
//
//        try {
//            java.sql.Statement statement = worker.getConnection().createStatement();
//            ResultSet resultSet = statement.executeQuery(query);
//
//            while (resultSet.next()){
//                BooleanCalc boolCal = new BooleanCalc();
//                boolCal.setValueOne(Boolean.valueOf(resultSet.getString(2)));
//                boolCal.setValueTwo(Boolean.valueOf(resultSet.getString(3)));
//                boolCal.setOperation(resultSet.getString(1));
//
//                System.out.println(boolCal);
//            }
//        }
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
