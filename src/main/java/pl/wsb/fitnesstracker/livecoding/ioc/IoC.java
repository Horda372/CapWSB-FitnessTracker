package pl.wsb.fitnesstracker.livecoding.ioc;

/**
 * The type Io c.
 */
public class IoC {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // Instance created outside
        Bar bar = new Bar();

        // Foo constructed with Bar (from outside)
        Foo foo = new Foo(bar);
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
         *
         * @param bar the bar
         */
// Dependency injected from Outside
        public Foo(Bar bar) {
            this.bar = bar;
        }

        /**
         * Use bar.
         */
        public void useBar() {
            bar.doSomething();
        }
    }
}
