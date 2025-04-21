package School.HomeWork.StayHear.none.Experiment4_extar;

import java.util.ArrayList;
import java.util.List;

public class Course {
  private String courseName;
  private List<String> students;

  public Course(String courseName) {
    this.courseName = courseName;
    this.students = new ArrayList<>();
  }
  // 添加学生
  public void addStudent(String student) {
    if (!students.contains(student)) {
      students.add(student);
    }
  }
  // 学生退课
  public void dropStudent(String student) {
    students.remove(student);
  }
  // 获取所有学生
  public String[] getStudents() {
    return students.toArray(new String[0]);
  }
  // 获取学生数量
  public int getNumberOfStudents() {
    return students.size();
  }
  // 获取课程名称
  public String getCourseName() {
    return courseName;
  }
  // 检查学生是否在课程中
  public boolean isEnrolled(String student) {
    return students.contains(student);
  }
  // 修改学生信息
  public void updateStudent(String oldStudent, String newStudent) {
    if (students.contains(oldStudent)) {
      students.set(students.indexOf(oldStudent), newStudent);
    }
  }
}
