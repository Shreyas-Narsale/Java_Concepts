

/* Interface Implemenation allowed:
    1. one class can extends another class
    2. one class can implenets another interface
    3. one class can implement more than one interface
    4. one interface can extend more than one interface
    5. one class can extend one class and implement more than one interface

    Absrtact class:
     1. One abstract class can extend another abstract class
     2. One class can extend abstract class
     3. One abstract class can implement interfaces
     4. One class can extend abstract class and implement interfaces
     5. Abstract class can implement multiple interfaces
 */

// Q3: What happens if two interfaces have same default method?
interface A {
    default void show() {}
}

interface B {
    default void show() {}
}

class C implements A, B {
    public void show() {
        A.super.show(); // must resolve conflict
    }
}
