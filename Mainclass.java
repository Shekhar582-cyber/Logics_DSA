class Employee {
    private String name;
    private int age;
    private char gender;

    public Employee(String name,int age,char gender){

        this.name =name;
        this.age=age;
        this.gender=gender;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;

    }
    public char getGender(){
        return gender;
    }

    @Override
    public String toString(){
        return  name +" "+age+" "+gender;
    }
}
class Details{
    Employee[] arr;
    public Details(int size){
        arr= new Employee[size];
    }
    public void insertion(int index,Employee emp){
        try{
           if (arr[index]==null){
               arr[index]=emp;
               System.out.println("data added");
           }
           else {
               System.out.println("Cell is already Em");
           }
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }

    public void traverse(){
        for (int i = 0; i< arr.length;i++){
            System.out.println(arr[i].getName());
        }
    }
}

class Mainclass{
    public static void main(String[] args) {
        Details d1 = new Details(5);
        d1.insertion(0,new Employee("Shekhar",21,'M'));

        d1.traverse();
    }
}