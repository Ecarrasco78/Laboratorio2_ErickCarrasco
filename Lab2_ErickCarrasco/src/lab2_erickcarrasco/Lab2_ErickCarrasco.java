package lab2_erickcarrasco;
import java.util.*;


public class Lab2_ErickCarrasco {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome");
        int opt;
        ArrayList<Alumnos> users = new ArrayList();
        ArrayList<Notas> grades = new ArrayList();
        ArrayList<Examenes> tests = new ArrayList();
        ArrayList clases = new ArrayList();
        System.out.println("1/ Admin");
        System.out.println("2/ Create account");
        System.out.println("3/ Log in");
        System.out.println("4/ Shut Down");
        opt = read.nextInt();
        while (opt > 0 && opt < 4) {
            if (opt == 1) {
                
                System.out.println("1/Create Test");
                System.out.println("2/Test check");
                System.out.println("3/Check grades");
                System.out.println("4/Modify grades");
                System.out.println("5/Exit");
                int  selectA;
                selectA = read.nextInt();
                while(selectA !=5){
                    if(selectA == 1){
                        System.out.println("Crear examen");
                        String clase="";
                        System.out.println("Ingrese el nombre de la clase");
                        clase = read.nextLine();
                        String preguntas ="";
                        char resp = 's';
                        while (resp == 's'|| resp== 's'){
                            String q="";
                            System.out.println("Ingrese su pregunta");
                            q=read.nextLine();
                            preguntas += q + "\n";
                            System.out.println("Desea volver a ingresar una pregunta? s/n");
                            resp = read.next().charAt(0);
                        }
                        tests.add(new Examenes(clase, preguntas));
                        
                    }
                    
                }


      
                
            }
            if(opt == 2){
                
                System.out.println("Create account");
                String name="";
                String usern = "";
                String password = "";
                String nationality ="";
                String city="";
                String ID ="";
                System.out.println("Write your name");
                name = read.nextLine();
                name = read.nextLine();
                read = new Scanner(System.in);
                System.out.println("Write your username");
                usern = read.nextLine();
                System.out.println("Write down a password");
                password = read.nextLine();
                System.out.println("Nacionalidad");
                nationality = read.nextLine();
                System.out.println("City of residence");
                city = read.nextLine();
                System.out.println("ID");
                ID = read.nextLine();
                users.add(new Alumnos(name, usern, password, nationality, city, ID));
                
                String salida="";
                for (Object temp : users) {
                    if (temp instanceof Alumnos) {
                        salida+=temp+"\n";
                        
                    }
                }
                System.out.println(salida);
            }
            if(opt==3){
                String log1="";
                String log2="";
                System.out.println("LOG IN");
                System.out.println("Ingrese su usuario");
                log1 = read.nextLine();
                System.out.println("Password");
                log2 = read.nextLine();
                
                for (Object temp : users) {
                   // if (log1.equals((Alumnos)users.get()){
                        
                    
                }
    
                
                
            }

            System.out.println("1/ Admin");
            System.out.println("2/ Create account");
            System.out.println("3/ Log in");
            System.out.println("4/ Shut Down");
            
            opt = read.nextInt();
        }
    }
    
}
