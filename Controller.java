package project.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import project.CMain;


public class Controller {

    private static int monAtual=1;

    @FXML
    private Label campoErro, mostraQuant, quantMon, mostraSinal;

    @FXML
    private TextField quantField, quantFiel1;

    @FXML
    private TextArea Polinomio;

    @FXML
    private Button butZero, confirmQuant, confirmBase, confirmExp, confirmSinal, confirmBase2, confirmExp2, confirmSinal2, confirmBase3, confirmExp3;

    @FXML
    private  Button confirmBase4, confirmExp4, confirmBase5, confirmExp5,confirmBase6, confirmExp6;
    private boolean simbol;
    
    public static int quantidade, sinalAtual=0;

    public void handleButZero(ActionEvent e){
        String mAtual = quantField.getText();
        quantField.setText(mAtual + "0" );
    }

    public void handleButUm(ActionEvent e){
        String mAtual = quantField.getText();
        quantField.setText(mAtual + "1" );
    }

    public void handleButDois(ActionEvent e){
        String mAtual = quantField.getText();
        quantField.setText(mAtual + "2" );
    }

    public void handleButTres(ActionEvent e){
        String mAtual = quantField.getText();
        quantField.setText(mAtual + "3" );
    }

    public void handleButQuatro(ActionEvent e){
        String mAtual = quantField.getText();
        quantField.setText(mAtual + "4" );
    }

    public void handleButCinco(ActionEvent e){
        String mAtual = quantField.getText();
        quantField.setText(mAtual + "5" );
    }

    public void handleButSeis(ActionEvent e){
        String mAtual = quantField.getText();
        quantField.setText(mAtual + "6" );
    }

    public void handleButSete(ActionEvent e){
        String mAtual = quantField.getText();
        quantField.setText(mAtual + "7" );
    }

    public void handleButOito(ActionEvent e){
        String mAtual = quantField.getText();
        quantField.setText(mAtual + "8" );
    }

    public void handleButNove(ActionEvent e){
        String mAtual = quantField.getText();
        quantField.setText(mAtual + "9" );
    }

    public void handleAdd(ActionEvent e){ quantField.setText("+"); }

    public void handleSub(ActionEvent e){ quantField.setText("+" ); }

    public void handleDiv(ActionEvent e){ quantField.setText("/" ); }

    public void handleMult(ActionEvent e){ quantField.setText("*" ); }

    @FXML
    void handleConfirmQuant(ActionEvent event) {
        String quant = quantField.getText();
        if (quant.length() != 1) {
            campoErro.setVisible(true);
            quantField.setText("");
        }
        else{
            campoErro.setVisible(false);
            int q = Integer.parseInt(quant);
            if (q > 6 || q <= 0) {
                campoErro.setVisible(true);
                quantField.setText("");
            }
            else{
                 CMain.setQuant(q);
                quantMon.setVisible(false);
                mostraQuant.setVisible(true);
                confirmQuant.setVisible(false);
                confirmBase.setVisible(true);
                 quantField.setText("");
                 quantidade = q;
            }
        }
    }

    @FXML
    void handleConfirmBaseMon(ActionEvent event) {

        switch (monAtual){
            case 1:
            int base1 = Integer.parseInt(quantField.getText());
            CMain.setBase1(base1);
            mostraQuant.setText("Expoente do primeiro monômio");
            Polinomio.setText(String.valueOf(base1));
                quantField.setText("");
                confirmBase.setVisible(false);
                confirmExp.setVisible(true);
            break;
            case 2:
                int base2 = Integer.parseInt(quantField.getText());
                CMain.setBase2(base2);
                mostraQuant.setText("Expoente do segundo monômio");
                String p = Polinomio.getText();
                Polinomio.setText(p + String.valueOf(base2));
                quantField.setText("");
                confirmBase2.setVisible(false);
                confirmExp2.setVisible(true);
                break;
            case 3:
                int base3 = Integer.parseInt(quantField.getText());
                CMain.setBase3(base3);
                mostraQuant.setText("Expoente do terceiro monômio");
                p = Polinomio.getText();
                Polinomio.setText(p + String.valueOf(base3));
                quantField.setText("");
                confirmBase3.setVisible(false);
                confirmExp3.setVisible(true);
                break;
            case 4:
                int base4 = Integer.parseInt(quantField.getText());
                CMain.setBase4(base4);
                mostraQuant.setText("Expoente do quarto monômio");
                p = Polinomio.getText();
                Polinomio.setText(p + String.valueOf(base4));
                quantField.setText("");
                confirmBase4.setVisible(false);
                confirmExp4.setVisible(true);
                break;
            case 5:
                int base5 = Integer.parseInt(quantField.getText());
                CMain.setBase5(base5);
                mostraQuant.setText("Expoente do quinto monômio");
                p = Polinomio.getText();
                Polinomio.setText(p + String.valueOf(base5));
                quantField.setText("");
                confirmBase5.setVisible(false);
                confirmExp5.setVisible(true);
                break;
            case 6:
                int base6 = Integer.parseInt(quantField.getText());
                CMain.setBase6(base6);
                mostraQuant.setText("Expoente do sexto monômio");
                p = Polinomio.getText();
                Polinomio.setText(p + String.valueOf(base6));
                quantField.setText("");
                confirmBase6.setVisible(false);
                confirmExp6.setVisible(true);
                break;
    }

    }

    public void handleConfirmExp(ActionEvent actionEvent) {
        confirmExp.setVisible(true);
        switch (monAtual) {
            case 1:int
                    exp1 = Integer.parseInt(quantField.getText());
                CMain.setExp1(exp1);
                String p = Polinomio.getText();
                Polinomio.setText(p + "^(" + exp1 + ")");
                mostraQuant.setText("Base do segundo monômio");
                if (quantidade == 1)
                    CMain.solveit(1);
                break;
            case 2:
                int exp2 = Integer.parseInt(quantField.getText());
                CMain.setExp2(exp2);
                p = Polinomio.getText();
                Polinomio.setText(p + "^(" + exp2 + ")");
                mostraQuant.setText("Base do terceiro monômio");
                if (quantidade == 2)
                    CMain.solveit(2);
                break;
            case 3:
                int exp3 = Integer.parseInt(quantField.getText());
                CMain.setExp3(exp3);
                p = Polinomio.getText();
                Polinomio.setText(p + "^(" + exp3 + ")");
                mostraQuant.setText("Base do quarto monômio");
                if (quantidade == 3)
                    CMain.solveit(3);
                break;
            case 4:
                int exp4 = Integer.parseInt(quantField.getText());
                CMain.setExp4(exp4);
                p = Polinomio.getText();
                Polinomio.setText(p + "^(" + exp4 + ")");
                mostraQuant.setText("Base do quinto monômio");
                if (quantidade == 4)
                    CMain.solveit(4);
                break;
            case 5:
                int exp5 = Integer.parseInt(quantField.getText());
                CMain.setExp5(exp5);
                p = Polinomio.getText();
                Polinomio.setText(p + "^(" + exp5 + ")");
                mostraQuant.setText("Base do sexto monômio");
                if (quantidade == 5)
                    CMain.solveit(5);
                break;
            case 6:
                int exp6 = Integer.parseInt(quantField.getText());
                CMain.setExp3(exp6);
                p = Polinomio.getText();
                Polinomio.setText(p + "^(" + exp6 + ")");
                if (quantidade == 6)
                    CMain.solveit(6);
                break;
        }

            mostraSinal.setVisible(true);
            confirmSinal.setVisible(true);

            sinalAtual++;
            monAtual++;
            quantField.setText("");
            mostraQuant.setVisible(false);
            confirmExp.setVisible(false);

    }

    public void handleConfirmSinal(ActionEvent e) {
        String s = quantField.getText();
        quantField.setText("");
        switch (sinalAtual){ case 1:
             CMain.setSinal1(s);
            confirmBase.setVisible(true);
            mostraQuant.setVisible(true);
            mostraSinal.setVisible(false);
            String p = Polinomio.getText();
            Polinomio.setText(p + s);
            confirmBase2.setVisible(true);
            break;
            case 2:
            CMain.setSinal2(s);
            confirmBase.setVisible(true);
            break;
            case 3:
                CMain.setSinal3(s);
                confirmBase.setVisible(true);
                break;
            case 4:
                CMain.setSinal4(s);
                confirmBase.setVisible(true);
                break;
            case 5:
                CMain.setSinal5(s);
                confirmBase.setVisible(true);
                break;
        }

        }
}

