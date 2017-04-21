package com.aurea.antipatterns.deadcode.inner;


/**
 * Class with 5 dead nodes / 11 dead lines.
 */
//CHECKSTYLE:OFF
interface Iface {
    void usedIface();
}


public class WithInnerClasses {
    private void unused1() {
        System.out.print("ZZZOOOOOOOO");
    }

    public class ClassInner1 {
        private void unusedInner1() {
            System.out.print("ZZZOOOOOOOO");
        }

        public class ClassInnerInner1 {
            private void unusedInnerInner1() {}

            private void used(int unusedPar) {}

            private ClassInnerInner1() {
                used(0);
            }
            // TBD: Analyzer
            /*
             * public void used2() { (new Iface() {
             * 
             * @Override public void usedIface() {
             * 
             * } private void unusedAnon() { //ZZZAAA } }).usedIface(); }
             */
        }
    }
}

