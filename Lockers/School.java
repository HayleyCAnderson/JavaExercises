public class School {
  final static int LOCKERS = 100;
  final static int STUDENTS = 100;

  public static void main(String[] args) {
    School school = new School();
    school.setLockers();
  }

  public void setLockers() {
    for (int lockerNumber = 1; lockerNumber <= LOCKERS; ++lockerNumber) {
      Locker locker = new Locker();

      for (int studentNumber = 1; studentNumber <= STUDENTS; ++studentNumber) {
        if (lockerNumber % studentNumber == 0) {
          locker.toggle();
        }
      }

      System.out.println(lockerNumber + ": " + locker.state());
    }
  }
}
