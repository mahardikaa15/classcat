public class Cat {
        static String name = "Jhon";
        static int age = 5;
        static String color = "black";
        static int custID = 1505;

        public static void getname(){
            System.out.println ("cat: " + name);
        }
        public static void getage(){
            System.out.println("cat: "+age);
        }
        public static void getcolor(){
            System.out.println("cat: "+color);
        }
        public static void getcustID(){
            System.out.println("cat: "+custID);
        }

        public static void main(String[] args){
            getname();
            getage();
            getcolor();
            getcustID();
        }
    }