package composite;

import composite.Composites.Container;
import composite.Composites.Panel;
import composite.Composites.Window;
import composite.Leafs.Button;
import composite.Leafs.CheckBox;
import composite.Leafs.TextField;


public class Main {


    public static void main(String[] args){

        // leafs
        Component btn_1 = new Button("button c1");
        Component textField_1 = new TextField("text field c2");
        Component checkBox_1 = new CheckBox("check box c3");

        Container panel = new Panel();

        panel.getChildren().add(btn_1);
        panel.getChildren().add(textField_1);
        panel.getChildren().add(checkBox_1);

        // another leafs at the same level of 'panel'
        Component btn_2 = new Button("button c4");
        Component textField_2 = new TextField("text field c5");
        Component checkBox_2 = new CheckBox("check box c6");


        Container window = new Window();
        window.getChildren().add(panel);
        window.getChildren().add(btn_2);
        window.getChildren().add(textField_2);
        window.getChildren().add(checkBox_2);

        window.printComponent();
    }
}
