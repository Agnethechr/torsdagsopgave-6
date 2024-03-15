public class Main1 {
    public static void main(String[] args) {
        Flows flows = new Flows();
        //   System.out.println("flows.methodA(\"Hello, world\");");
        //   flows.methodA("Hello, world");
        System.out.println("flows.methodUno(\"start\");");
        flows.methodUno("start");
        System.out.println("flows.methoDos(\"Hello, world\");");
        flows.methodDos("Hello, world");
        System.out.println("flows.methodTres(\"Hello, world\");");
        flows.methodTres("Hello, world");
        System.out.println("flows.methodCuatro(25);");
        flows.methodCuatro(25);
    }
}