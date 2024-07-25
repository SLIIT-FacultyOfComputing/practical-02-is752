import java.util.Scanner;

public class Marks {

    static class Student {
        int studentId;
        int[] marks = new int[3]; // 0: Math, 1: P6, 2: Chem
    }

    static public String grade(int m) {
        if(m <= 100 && m >= 0)
        {
            if(m >= 90) {
                return "A";
            }        
            else if(m >= 80) {
                return "B";
            }
            else if(m >= 70) {
                return "C";
            }
            else if(m >= 60) {
                return "D";
            }
            else {
                return "Fail";
            }
        }
        else {
            return "Invalid Grade";
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = kb.nextInt();
        kb.nextLine(); // newline char
        Student[] students = new Student[n];

        System.out.println(" ");
        System.out.println("                        Command format              ");
        System.out.println("Add student marks: add [studentID]- student ID will be an integer ranging from 1 to n");
        System.out.println("Update student mark : update [studentID] [subjectID] [mark] - subject ID will be an integer from 1 to 3");
        System.out.println("Get the average for a subject: average_s [studentID]");
        System.out.println("Get the average for a student: average [studentID]");
        System.out.println("Get the total mark of a student : total [studentID]");
        System.out.println("Display the grades of student : grades [studentID]");
        System.out.println("       !!!Students with empty marks will be given zero for that subject!!!");
        System.out.println(" ");

        while (true) {
            System.out.print("Enter command: ");
            String input = kb.nextLine();

            String[] commands = input.split(" ");
            String command = commands[0];

            switch (command) {
                case "add":
                    int id = Integer.parseInt(commands[1]) - 1;
                    if (id < 0 || id >= n) {
                        System.out.println("Invalid ID");
                    } else {
                        students[id] = new Student();
                        students[id].studentId = id + 1;
                        System.out.println("Student added with ID " + (id + 1));
                    }
                    break;

                case "update":
                    id = Integer.parseInt(commands[1]) - 1;
                    int sid = Integer.parseInt(commands[2]) - 1;
                    int mark = Integer.parseInt(commands[3]);
                    if (id < 0 || id >= n || sid < 0 || sid >= 3 || students[id] == null) {
                        System.out.println("Invalid input");
                    } else {
                        students[id].marks[sid] = mark;
                        System.out.println("Student " + (id + 1) + "'s marks for subject " + (sid + 1) + " was updated to " + mark);
                    }
                    break;

                case "average_s":
                    sid = Integer.parseInt(commands[1]) - 1;
                    if (sid < 0 || sid >= 3) {
                        System.out.println("Invalid subject ID");
                    } else {
                        float total = 0;
                        int count = 0;
                        for (int i = 0; i < n; i++) {
                            if (students[i] != null) {
                                total += students[i].marks[sid];
                                count++;
                            }
                        }
                        if (count > 0) {
                            float avg = total / count;
                            System.out.println("Average mark for subject " + (sid + 1) + " is " + avg);
                        } else {
                            System.out.println("No students available");
                        }
                    }
                    break;

                case "average":
                    id = Integer.parseInt(commands[1]) - 1;
                    if (id < 0 || id >= n || students[id] == null) {
                        System.out.println("Invalid student ID");
                    } else {
                        float avg = (students[id].marks[0] + students[id].marks[1] + students[id].marks[2]) / 3.0f;
                        System.out.println("Average mark for student " + (id + 1) + " is " + avg);
                    }
                    break;

                case "total":
                    id = Integer.parseInt(commands[1]) - 1;
                    if (id < 0 || id >= n || students[id] == null) {
                        System.out.println("Invalid student ID");
                    } else {
                        int total = students[id].marks[0] + students[id].marks[1] + students[id].marks[2];
                        System.out.println("Total mark for student " + (id + 1) + " is " + total);
                    }
                    break;

                case "grades":
                    id = Integer.parseInt(commands[1]) - 1;

                    int m1 = students[id].marks[0];
                    int m2 = students[id].marks[1];
                    int m3 = students[id].marks[2];

                    System.out.print("Math: ");
                    System.out.println(grade(m1));
                    System.out.print("Physics: ");
                    System.out.println(grade(m2));
                    System.out.print("Chemistry: ");
                    System.out.println(grade(m3));
                    break;


                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
}
