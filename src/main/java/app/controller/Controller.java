package app.controller;
import app.dao.Order;
import app.dto.DataEngine;
import app.view.UIview;
import static app.dto.DataEngine.*;


public class Controller extends Order {

    private static DataEngine data;
    private static UIview ui;
    // public static ArrayList<Integer> paidIn = new ArrayList<>();

    public Controller(DataEngine data,UIview ui) {
        this.data = data;
        this.ui = ui;
    }
    public static void go() {

        while (ui.isON) {
            readData();
            menu();
        }
        writeOnFile();

    }



}
