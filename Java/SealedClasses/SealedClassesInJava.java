package Java.SealedClasses;

sealed class A permits B, C, D {

}

sealed interface X permits Y, Z {

}

// if you want this class to be inherited, we can make it "abstract"
// if you do not want it to be inherited, we can make it "final"
// by using "sealed" keyword, we can limit the number of inheritances and
// properly monitor it

sealed class B extends A permits E { // this class is sealed and can only inherited by E
    // as you can see here, a class can also extend as well as permit

}

non-sealed class C extends A { // this has no restrictions, and can be inherited by any class

}

final class D extends A { // this class cannot be inherited by any other class as it has the "final"
                          // keyword

}
// if a class is to be permitted by a "sealed" class, the sub-classes need to be
// of one of the 3 types
/*
 * final
 * sealed
 * non-sealed
 */

sealed interface Y extends X permits W {

}

non-sealed interface Z extends X {

}

// for an interface which extends to a "sealed" interface, there are only 2
// keywords
/*
 * sealed
 * non-sealed
 */

non-sealed class E extends B {

}

class F extends E {

}

non-sealed interface W extends Y {

}

public class SealedClassesInJava {
    public static void main(String[] args) {

    }
}
