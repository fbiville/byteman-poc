package biz.whatever;

/**
 * @author fbiville
 */
public class DummyLogger {

   private Class<?> callerClass;

   public void log(String msg) {
      System.out.println(new StringBuilder("[").append(callerClass.getSimpleName()).append("] ").append(msg).toString());
   }

   public void setCaller(Class<?> callerClass) {
      this.callerClass = callerClass;
   }
}
