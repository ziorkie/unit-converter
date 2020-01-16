package sample;

import app.Converter;
import app.Tuple;
import app.Unit;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.text.DecimalFormat;

public class Controller {
    @FXML private Button P1;
    @FXML private Button P2;
    @FXML private Button P3;
    @FXML private Button P4;
    @FXML private Button P5;
    @FXML private Button BM1;
    @FXML private Button BM2;
    @FXML private Button BM3;
    @FXML private Button BW1;
    @FXML private Button BW2;
    @FXML private Button BW3;
    @FXML private Button BP1;
    @FXML private Button BP2;
    @FXML private Button BP3;

    @FXML private TextArea O1;
    @FXML private TextField I1;
    @FXML private GridPane gridmiary;
    @FXML private GridPane gridwagi;
    @FXML private GridPane gridpredkosci;
    @FXML private GridPane gridWyboru;
    private boolean firstPress = false;
    private boolean secondPress = false;
    private static DecimalFormat df = new DecimalFormat("0.00");
    private double value;
    private Unit unit;
    private String tmp;
    private String code;
    private String strcomp1;
    private String strcomp2;

    private int textLen;


    @FXML
    public void restart(){
        O1.setText("Witaj, wybierz rodzaj konwersji");
        P5.setDisable(true);
        gridWyboru.setDisable(false);
        gridmiary.setDisable(true);
        gridpredkosci.setDisable(true);
        gridwagi.setDisable(true);
        I1.setDisable(true);
        I1.setText("");
        value=0;
        code=null;

    }

    @FXML
    public void buttonMiaryPressed(){
        gridmiary.setDisable(false);
        gridWyboru.setDisable(true);
        O1.setText("Wybrano konwersję miar.\nWybierz jednostkę którą chcesz przekonwertować.");

    }
    public void buttonWagiPressed(){
        gridwagi.setDisable(false);
        gridWyboru.setDisable(true);
        O1.setText("Wybrano konwersję wagi.\nWybierz jednostkę którą chcesz przekonwertować.");

    }
    public void buttonPredkosciPressed(){
        gridpredkosci.setDisable(false);
        gridWyboru.setDisable(true);
        O1.setText("Wybrano konwersję prędkości.\nWybierz jednostkę którą chcesz przekonwertować.");
    }
    @FXML
    public void buttonM1(){
        I1.setDisable(false);
        gridWyboru.setDisable(true);
        gridmiary.setDisable(true);
        P5.setDisable(false);
        O1.setText("Wybrano konwersję miary centymetra.\nWpisz wartość w polu poniżej, a następnie wciśnij przycisk KONWERTUJ");
        code="m1";

    }
    public void buttonM2(){
        I1.setDisable(false);
        gridWyboru.setDisable(true);
        gridmiary.setDisable(true);
        P5.setDisable(false);
        O1.setText("Wybrano konwersję miary cala.\nWpisz wartość w polu poniżej, a następnie wciśnij przycisk KONWERTUJ");
        code="m2";
    }
    public void buttonM3(){
        I1.setDisable(false);
        gridWyboru.setDisable(true);
        gridmiary.setDisable(true);
        P5.setDisable(false);
        O1.setText("Wybrano konwersję miary stopy.\nWpisz wartość w polu poniżej, a następnie wciśnij przycisk KONWERTUJ");
        code="m3";
    }
    public void buttonW1(){
        I1.setDisable(false);
        gridWyboru.setDisable(true);
        gridwagi.setDisable(true);
        P5.setDisable(false);
        O1.setText("Wybrano konwersję wagi grama.\nWpisz wartość w polu poniżej, a następnie wciśnij przycisk KONWERTUJ");
        code="w1";
    }
    public void buttonW2(){
        I1.setDisable(false);
        gridWyboru.setDisable(true);
        gridwagi.setDisable(true);
        P5.setDisable(false);
        O1.setText("Wybrano konwersję wagi uncji.\nWpisz wartość w polu poniżej, a następnie wciśnij przycisk KONWERTUJ");
        code="w2";
    }
    public void buttonW3(){
        I1.setDisable(false);
        gridWyboru.setDisable(true);
        gridwagi.setDisable(true);
        P5.setDisable(false);
        O1.setText("Wybrano konwersję wagi funta.\nWpisz wartość w polu poniżej, a następnie wciśnij przycisk KONWERTUJ");
        code="w3";
    }
    public void buttonV1(){
        I1.setDisable(false);
        gridWyboru.setDisable(true);
        gridpredkosci.setDisable(true);
        P5.setDisable(false);
        O1.setText("Wybrano konwersję prędkości kilometra na godzinę.\nWpisz wartość w polu poniżej, a następnie wciśnij przycisk KONWERTUJ");
        code="v1";
    }
    public void buttonV2(){
        I1.setDisable(false);
        gridWyboru.setDisable(true);
        gridpredkosci.setDisable(true);
        P5.setDisable(false);
        O1.setText("Wybrano konwersję prędkości mili na godzinę.\nWpisz wartość w polu poniżej, a następnie wciśnij przycisk KONWERTUJ");
        code="v2";
    }
    public void buttonV3(){
        I1.setDisable(false);
        gridWyboru.setDisable(true);
        gridpredkosci.setDisable(true);
        P5.setDisable(false);
        O1.setText("Wybrano konwersję prędkości węzła.\nWpisz wartość w polu poniżej, a następnie wciśnij przycisk KONWERTUJ\n\n");
        code="v3";
    }
    public void buttonConvert(){
        tmp=I1.getText();
        Converter.numericVerifier(tmp);
        if(Converter.numericVerifier(tmp) ){
            value=Double.parseDouble(tmp);
            Unit unit = new Unit(code, value);
            double tempvalue;
            Tuple tuple = new Tuple();
            if(unit.getCode().contains("m")){
                tuple=Converter.mConvert(unit);
                O1.setText("Wynik przeliczenia: \n");
                O1.appendText("centymetry: "+Double.toString(tuple.getFirst())+"\n");
                O1.appendText("cale: "+Double.toString(tuple.getSecond())+"\n");
                O1.appendText("stopy: "+Double.toString(tuple.getThird()) + "\n");
            }
            if(unit.getCode().contains("w")){
                tuple=Converter.wConvert(unit);
                O1.setText("Wynik przeliczenia: \n");
                O1.appendText("gramy: "+Double.toString(tuple.getFirst())+"\n");
                O1.appendText("uncje: "+Double.toString(tuple.getSecond())+"\n");
                O1.appendText("funty: "+Double.toString(tuple.getThird()) + "\n");
            }
            if(unit.getCode().contains("v")){
                tuple=Converter.vConvert(unit);
                O1.setText("Wynik przeliczenia: \n");
                O1.appendText("kilometry/h: "+Double.toString(tuple.getFirst())+"\n");
                O1.appendText("mile/h: "+Double.toString(tuple.getSecond())+"\n");
                O1.appendText("węzły: "+Double.toString(tuple.getThird()) + "\n");
            }












        }
        else{
            strcomp1=String.valueOf(O1.getText().charAt(O1.getText().length()-1));
            strcomp2=".";
            if(strcomp1.equals(strcomp2)){
                textLen = O1.getLength();
                O1.deleteText(textLen-31, textLen);
            }

            O1.appendText("\nBłędne dane, spróbuj ponownie.");
        }
    }

}
