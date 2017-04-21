package com.aurea.antipatterns.deadcode.inner;

/**
 * Class with 2 dead nodes / 4 dead lines for WithoutInnerClasses Created by valb3r on 21.06.16.
 */
//CHECKSTYLE:OFF
public class WithoutInnerClasses {
    private void unused1() {
        System.out.print("ZZZOOOOOOOO");
    }

    private void used(int unusedPar) {}

    private WithoutInnerClasses() {
        used(1);
    }

    public class InnerClassNotDetected {
        private void notUsedInner() {}

        private void used(int unusedPar) {}

        private InnerClassNotDetected() {
            used(1);
        }
    }
}

