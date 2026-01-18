package pl.wsb.fitnesstracker.livecoding.ioc;

/**
 * The type Without io c.
 */
public class WithoutIoC {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.useBar();
    }

    /**
     * The type Bar.
     */
    static class Bar {
        /**
         * Do something.
         */
        public void doSomething() {
            System.out.println("Doing something in Bar");
        }
    }

    /**
     * The type Foo.
     */
    static class Foo {
        private Bar bar;

        /**
         * Instantiates a new Foo.
         */
        public Foo() {
            this.bar = new Bar(); // Direct dependency!
        }

        /**
         * Use bar.
         */
        public void useBar() {
            bar.doSomething();
        }
    }
}
