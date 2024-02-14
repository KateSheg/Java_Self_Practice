package day14.practice.device_task;

public interface Downloadable {
  public default void downloadApp(String appName) {
    System.out.println(getClass().getSimpleName() + " can download app " + appName);
  }
}
