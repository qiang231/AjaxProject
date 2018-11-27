package interfaceTest;

public class FactoryTest1 {
    public static void main(String[] args) {
        IWorkFactory1 i1 = new StuFactory();
        i1.getWork().dowork1();

        IWorkFactory1 i2 = new TeacherFactory1();
        i2.getWork().dowork1();
    }
}

interface IWorkFactory1{
    Work1 getWork();
}

class StuFactory implements IWorkFactory1{


    public Work1 getWork() {
        return new Student();
    }
}

class TeacherFactory1 implements IWorkFactory1{


    public Work1 getWork() {
        return new Teacher();
    }
}

interface Work1{
    void dowork1();
}

class Student implements Work1{

    @Override
    public void dowork1() {
        System.out.println("学生写作业");
    }
}

class Teacher implements Work1{

    @Override
    public void dowork1() {
        System.out.println("老师批改作业");
    }
}