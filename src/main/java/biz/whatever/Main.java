package biz.whatever;

public class Main {

   private DummyLogger logger;

   public Main(DummyLogger logger) {
      this.logger = logger;
      this.logger.setCaller(this.getClass());
   }

   public static void main(String[] args) {
      new Main(new DummyLogger()).doSomething();
   }

   private void doSomething() {
      logger.log("I did something");
   }
}
