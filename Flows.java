public class Flows {

    public void methodUno(String input) {
        System.out.println("j");
        if (!input.equals("start")) {
            System.out.println("t");
            methodDos("start");
        } else {
            System.out.println("a");
            System.out.println("v");
            System.out.println("a");
        }

    }

    public void methodDos(String start) {
        System.out.println("e");
        System.out.println("r");
    }

    public int methodTres(String input) {
        System.out.println("s");
        return input.length() * 2;
    }

    public void methodCuatro(int number) {
        if (number > 5) {
            System.out.println("j");
            System.out.println("o");
            System.out.println("v");
            System.out.println("t");
        }
    }


}