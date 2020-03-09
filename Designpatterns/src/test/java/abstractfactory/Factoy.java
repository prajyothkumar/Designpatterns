package abstractfactory;

public class Factoy {



    public static void main(String[] args){
        IFactory simpleFactory = new SimpleFactory();
        IFactory jsFactory = new JSFactory();

        Element button = simpleFactory.getButton();
        button.click();

        Element jsInput = jsFactory.getInput();
        jsInput.click();
    }
}