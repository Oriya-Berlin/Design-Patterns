package Composite;

import Composite.Composites.Container;
import Composite.Composites.Panel;
import Composite.Composites.Window;
import Composite.Leafs.Button;
import Composite.Leafs.CheckBox;
import Composite.Leafs.TextField;


public class Main {


    public static void main(String[] args){

        // leafs
        Component btn_1 = new Button("button c1");
        Component textField_1 = new TextField("text field c2");
        Component checkBox_1 = new CheckBox("check box c3");

        // composite
        Container containerPanel = new Panel();

        containerPanel.getChildren().add(btn_1);
        containerPanel.getChildren().add(textField_1);
        containerPanel.getChildren().add(checkBox_1);

        // another leafs at the same level of 'containerPanel'
        Component btn_2 = new Button("button c4");
        Component textField_2 = new TextField("text field c5");
        Component checkBox_2 = new CheckBox("check box c6");



        //
        Container window = new Window();

        window.getChildren().add(containerPanel);
        window.getChildren().add(btn_2);
        window.getChildren().add(textField_2);
        window.getChildren().add(checkBox_2);


        window.printComponent();
    }
}
