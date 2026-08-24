public class School {
    public static void main(String[] args) {
        LabClass labClass1 = new LabClass(5);
        Student student001 = new Student("Gilberto Gil", "001");
        Student student002 = new Student("Caetano Veloso", "002");
        Student student003 = new Student("Milton Nascimento", "003");
        labClass1.enrollStudent(student001);
        labClass1.printList();

        LabClass matematica = new LabClass(3);
        matematica.setInstructor("Márcio");
        matematica.setTime("08:50");
        matematica.setRoom("309");
        matematica.enrollStudent(student001);
        matematica.enrollStudent(student002);
        matematica.enrollStudent(student003);


        LabClass programacao = new LabClass(3);
        programacao.setInstructor("Aluísio");
        programacao.setTime("10:40");
        programacao.setRoom("T01");
        programacao.enrollStudent(student001);
        programacao.enrollStudent(student002);
        programacao.enrollStudent(student003);

        LabClass redes = new LabClass(3);
        redes.setInstructor("Renato");
        redes.setTime("10:40");
        redes.setRoom("309");
        redes.enrollStudent(student001);
        redes.enrollStudent(student002);
        redes.enrollStudent(student003);

        student001.addCredits(20);
        student002.addCredits(20);
        student003.addCredits(20);

        System.out.println("Matemática: ");
        matematica.printList();

        System.out.println("Programação: ");
        programacao.printList();

        System.out.println("Redes de Computadores: ");
        redes.printList();
    }
}
