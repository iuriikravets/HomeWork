import java.util.Scanner;

public class Lesson10 {

        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            Database database = new Database();
            database.init();

            boolean exit = false;
            String name, position;
            int salary,age,index;

            while (!exit){
                System.out.print("db> ");
                String command = scanner.next();
                switch (command){
                    case "x":
                      exit= true;
                      break;
                    case "c":
                     System.out.print("create> ");
                      name = scanner.next();
                      position = scanner.next();
                      salary = scanner.nextInt();
                      age = scanner.nextInt();
                     database.create(new Employee(name,position,salary,age));
                        break;
                    case "r":
                        System.out.println(database.read());
                        break;
                    case "u":
                        System.out.print("update> ");
                        String oldname = scanner.next();
                         name = scanner.next();
                         position = scanner.next();
                         salary = scanner.nextInt();
                         age = scanner.nextInt();
                         database.update( oldname,new Employee(name,position,salary,age));
                        break;
                    case "d":
                        System.out.print("delete> ");
                        name = scanner.next();
                        database.delete(name);
                        break;
                    case "f":
                        System.out.print("find> ");
                        name= scanner.next();
                        System.out.println(database.find(name));
                    case "p":
                       System.out.print(database.getPosition());
                       break;

                }
            }

        }
    }

