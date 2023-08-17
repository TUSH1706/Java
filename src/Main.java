public class Main {
    public static void main(String[] args) {
                // data of 5 students
        int[] rno = new int[5];
        String[] name = new String[5];
          float[] marks = new float[5];

        Student[] students = new Student[5];

                Student tushar = new Student(15, "tushar singh", 85.4f);
                Student kunal = new Student();

//        tushar.rno = 13;
//        tushar.name = "tushar singh";
//        tushar.marks = 80.8f;

//        tushar.changeName("shoe lover");
                tushar.greeting();

                System.out.println(tushar.rno);
                System.out.println(tushar.name);
                System.out.println(tushar.marks);

                Student random = new Student(tushar);
                System.out.println(random.name);

                Student one = new Student();
                Student two = one;

                one.name = "Something something";

                System.out.println(two.name);


             }
        }

// create a class
// datatype for every single student
        class Student {
            int rno;
            String name;
            float marks;

            void greeting() {
                System.out.println("Hello: My name is " + this.name);
            }

            void changeName(String newName) {
                name = newName;
            }

            Student  (Student other) {
                this.name = other.name;
                this.rno = other.rno;
                this.marks = other.marks;

            }

            Student() {
                this.rno = 13;
                this.name = "Tushar Singh";
                this.marks = 89.8f;

            }

            // Student Arpit = new Student();
            // here this is replaced by Arpit.
            Student(int rno, String name, float marks) {
               this.rno = rno;
               this.name = name;
                this.marks = marks;


            }
        }

