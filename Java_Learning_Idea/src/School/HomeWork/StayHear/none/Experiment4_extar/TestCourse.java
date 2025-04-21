package School.HomeWork.StayHear.none.Experiment4_extar;

public class TestCourse {
  public static void main(String[] args) {
    Course course1 = new Course("数据结构");
    Course course2 = new Course("数据库系统");

    // 添加学生
    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("Anne Kennedy");

    course2.addStudent("Peter Jones");
    course2.addStudent("Steve Smith");

    // 输出课程1的学生数量和学生列表
    System.out.println("课程1的学生数量: " + course1.getNumberOfStudents());
    String[] students1 = course1.getStudents();
    for (String student : students1) {
      System.out.print(student + ", ");
    }
    System.out.println();

    // 输出课程2的学生数量
    System.out.println("课程2的学生数量: " + course2.getNumberOfStudents());

    // 学生退课
    course1.dropStudent("Brian Smith");
    System.out.println("Brian Smith 从课程1退课后：");
    System.out.println("课程1的学生数量: " + course1.getNumberOfStudents());
    students1 = course1.getStudents();
    for (String student : students1) {
      System.out.print(student + ", ");
    }
    System.out.println();

    // 修改学生信息
    course1.updateStudent("Anne Kennedy", "Anne Brown");
    System.out.println("将课程1中的学生 Anne Kennedy 更新为 Anne Brown 后：");
    System.out.println("课程1的学生数量: " + course1.getNumberOfStudents());
    students1 = course1.getStudents();
    for (String student : students1) {
      System.out.print(student + ", ");
    }
    System.out.println();

    // 检查学生是否在课程中
    System.out.println("Peter Jones 是否在课程1中? " + course1.isEnrolled("Peter Jones"));
    System.out.println("Brian Smith 是否在课程1中? " + course1.isEnrolled("Brian Smith"));
  }
}
