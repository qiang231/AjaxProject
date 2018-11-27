package interfaceTest;

public class factoryTest {
    public static void main(String[] args) {
        IWorkFactory iWorkFactory = new StudentsWorkFactory();
        iWorkFactory.getWork().doWork();

        IWorkFactory iWorkFactory1 = new TeacherWorkFactory();
        iWorkFactory1.getWork().doWork();
    }
}

interface IWorkFactory{
    Work getWork();
}

class StudentsWorkFactory implements IWorkFactory{

    @Override
    public Work getWork() {
        return new StudentsWork();
    }
}
class TeacherWorkFactory implements IWorkFactory{

    @Override
    public Work getWork() {
        return new TeacherWork();
    }
}

interface Work{
    void doWork();
}

class StudentsWork implements Work{

    @Override
    public void doWork() {
        System.out.println("写作业");
    }
}

class TeacherWork implements Work{

    @Override
    public void doWork(){
        System.out.println("改作业");
    }
}