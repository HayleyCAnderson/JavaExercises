public class Locker {
  public boolean isOpen;

  public Locker() {
    isOpen = false;
  }

  public void toggle() {
    this.isOpen = !isOpen;
  }

  public String state() {
    if (isOpen == true) {
      return "open";
    } else {
      return "closed";
    }
  }
}
