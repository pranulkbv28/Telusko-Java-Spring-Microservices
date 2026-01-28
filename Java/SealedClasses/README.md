# $Sealed$ $Classes$

## $What$ $are$ $Sealed$ $Classes$

- By using the `sealed` keyword for `classes` in `Java` wherein we can limit the number of `classes` that can `inherit` from the parent `class`.

## $Implementation$

- To implement `sealed classes` in `Java`, we need to use the `sealed` keyword in the parent `class` and specify the `permitted subclasses` using the `permits` keyword.
  - `Sealed Class`  -> [See here](./SealedClassesInJava.java#L3)
- To implement `sealed interfaces`, we need to use the `sealed` keyword in the parent `interface` and specify the `permitted implementing classes` using the `permits` keyword.
- `Permitted Subclass`: The permitted subclass(s) is(are) to be of any of the three types: `final`, `sealed`, or `non-sealed`.
  - `Sealed Class` -> Here, the class acts like the parent, where it only allows **permitted** classes to inherit it. [See here](./SealedSubclassInJava.java#L16)
  - `Non-Sealed Class` -> Here, the class acts like any normal class, as in, it can be inherited by any class, there are no restrictions. [See here](./NonSealedClassInJava.java#L21)
  - `Final Class` -> Here, the class can not be inherited further. [See here](./FinalClassInJava.java#L25)
- `Permitted Interfaces`: The permitted implementing class(es) is(are) to be of any of the three types: `final`, `sealed`, or `non-sealed`.
  - `Sealed Interface` -> Here, the interface acts like the parent, where it only allows **permitted** classes to implement it. [See here](./SealedInterfaceInJava.java#L37)
  - `Non-Sealed Interface` -> Here, the class acts like any normal class, as in, it can implement any interface, there are no restrictions. [See here](./NonSealedClassImplementingInterfaceInJava.java#L41)
- Note:
  - All the `permitted subclasses` must be in the `same module` or `package` as the `sealed class`.
  - A `superinterface` must be an `interface`.
  - At a time a `sealed interface` can either permit `classes` or `interfaces`, but not both.
