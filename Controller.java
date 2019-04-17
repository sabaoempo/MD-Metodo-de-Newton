package project.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import project.CMain;


public class Controller {

    @FXML
    private Label campoErro, mostraQuant, quantMon, mostraSinal;

    @FXML
    private TextField quantFiel, quantFiel1;

    @FXML
    private TextArea Polinomio;

    @FXML
    private Button butZero, confirmQuant, confirmBaseMon1, confirmExp1, confirmSinal1, confirmBase2, confirmExp2;

    private boolean simbol;
    
    public static int quantidade, monAtual;

    public void handleButZero(ActionEvent e){
        String mAtual = quantFiel.getText();
        quantFiel.setText(mAtual + "0" );
    }

    public void handleButUm(ActionEvent e){
        String mAtual = quantFiel.getText();
        quantFiel.setText(mAtual + "1" );
    }

    public void handleButDois(ActionEvent e){
        String mAtual = quantFiel.getText();
        quantFiel.setText(mAtual + "2" );
    }

    public void handleButTres(ActionEvent e){
        String mAtual = quantFiel.getText();
        quantFiel.setText(mAtual + "3" );
    }

    public void handleButQuatro(ActionEvent e){
        String mAtual = quantFiel.getText();
        quantFiel.setText(mAtual + "4" );
    }

    public void handleButCinco(ActionEvent e){
        String mAtual = quantFiel.getText();
        quantFiel.setText(mAtual + "5" );
    }

    public void handleButSeis(ActionEvent e){
        String mAtual = quantFiel.getText();
        quantFiel.setText(mAtual + "6" );
    }

    public void handleButSete(ActionEvent e){
        String mAtual = quantFiel.getText();
        quantFiel.setText(mAtual + "7" );
    }

    public void handleButOito(ActionEvent e){
        String mAtual = quantFiel.getText();
        quantFiel.setText(mAtual + "8" );
    }

    public void handleButNove(ActionEvent e){
        String mAtual = quantFiel.getText();
        quantFiel.setText(mAtual + "9" );
    }

    public void handleAdd(ActionEvent e){ quantFiel.setText("+"); }

    public void handleSub(ActionEvent e){ quantFiel .setText("+" ); }

    public void handleDiv(ActionEvent e){ quantFiel .setText("/" ); }

    public void handleMult(ActionEvent e){ quantFiel .setText("*" ); }

    @FXML
    void handleConfirmQuant(ActionEvent event) {
        String quant = quantFiel.getText();
        if (quant.length() != 1) {
            campoErro.setVisible(true);
            quantFiel.setText("");
        }
        else{
            campoErro.setVisible(false);
            int q = Integer.parseInt(quant);
            if (q > 6 || q <= 0) {
                campoErro.setVisible(true);
                quantFiel.setText("");
            }
            else{
                 CMain.setQuant(q);
                quantMon.setVisible(false);
                mostraQuant.setVisible(true);
                confirmQuant.setVisible(false);
                confirmBaseMon1.setVisible(true);
                 quantFiel.setText("");
                 quantidade = q;
            }
        }
    }

    @FXML
    void handleConfirmBaseMon1(ActionEvent event) {
        int base1 = Integer.parseInt(quantFiel.getText());
        CMain.setBase1(base1);
        mostraQuant.setText("Expoente do primeiro monômio");
        Polinomio.setText(String.valueOf(base1));
        quantFiel.setText("");
        confirmBaseMon1.setVisible(false);
        confirmExp1.setVisible(true);
        quantFiel.setText("");
    }

    public void handleConfirmExp1(ActionEvent actionEvent) {
        confirmExp1.setVisible(true);
        int exp1 = Integer.parseInt(quantFiel.getText());
        CMain.setExp1(exp1);
        String p = Polinomio.getText();
        Polinomio.setText(p + "^(" + exp1 + ")");
        if (quantidade == 1){
            CMain.solveit(1);
        }
        else{
            quantFiel.setText("");
            mostraQuant.setText("Base do segundo monômio");
            mostraQuant.setVisible(false);
            mostraSinal.setVisible(true);
            confirmExp1.setVisible(false);
            confirmSinal1.setVisible(true);
        }
    }

    public void handleConfirmSinal1(ActionEvent e){
        String s = quantFiel.getText();
        CMain.setSinal1(s);
        quantFiel.setText("");
        confirmBase2.setVisible(true);
        mostraQuant.setVisible(true);
        mostraSinal.setVisible(false);
        String p = Polinomio.getText();
        Polinomio.setText(p + s);
        }

    public void handleConfirmSinal2(ActionEvent actionEvent) {

    }

    public void handleConfirmExp2(ActionEvent actionEvent) {
        confirmExp2.setVisible(true);
        int exp2 = Integer.parseInt(quantFiel.getText());
        CMain.setExp2(exp2);
        String p = Polinomio.getText();
        Polinomio.setText(p + "^(" + exp2 + ")");
        if (quantidade == 2){
            CMain.solveit(2);
        }
        else{
            quantFiel.setText("");
            mostraQuant.setText("Base do terceiro monômio");
            mostraQuant.setVisible(false);
            mostraSinal.setVisible(true);
            confirmExp1.setVisible(false);
            confirmSinal1.setVisible(true);
        }
    }

    public void handleConfirmBaseMon2(ActionEvent actionEvent) {
        int base2 = Integer.parseInt(quantFiel.getText());
        CMain.setBase2(base2);
        mostraQuant.setText("Expoente do segundo monômio");
        String p = Polinomio.getText();
        Polinomio.setText(p + String.valueOf(base2));
        quantFiel.setText("");
        confirmBase2.setVisible(false);
        confirmExp2.setVisible(true);
        quantFiel.setText("");
    }
}

