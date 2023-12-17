package decorator;


import decorator.Decorators.Asterisk;
import decorator.Decorators.Bracket;
import decorator.Decorators.Hashtag;

public class Main {


    public static void main(String[] args){


        Tag tag1 = new Tag("<html>");
        tag1.printComponent();


        Component tag2 = new Hashtag(new Tag("<body>"));
        tag2.printComponent();


        Component tag3 = new Bracket(new Tag("<div>"));
        tag3.printComponent();


        Component tag4 = new Asterisk(new Tag("<span>"));
        tag4.printComponent();


        Component tag5 = new Bracket(new Hashtag(new Asterisk(new Tag("<section>"))));
        tag5.printComponent();
    }

}
