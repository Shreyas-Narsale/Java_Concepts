

/*Packages:
     group related classes, interfaces, and sub-packages together.
     Think of it like a folder in a computer:
        Files inside a folder are organized by purpose
        Similarly, classes inside a package are organized by functionality
    Types of Packages:
    1. Inbuilt Packages:
        Provided by Java:
            Examples:
            java.util package → Collections, List, Map
            java.io package → File handling
            java.lang package → String, Math, System
    2. User-defined Packages
        created by developer
 */

// How to create package
/*  file Name: Test.java
package mypack;

public class Test {
    public void show() {
        System.out.println("Hello from package");
    }
}

*/

/* To comiple:
Step 2: Compile
javac -d . Test.java

👉 Creates folder structure automatically

use it:
import mypack.Test;

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
    }
}

1. Single class import
    import java.util.List;
2. Entire package import
    import java.util.*;

Subpackage:
com/
 └── bank/
      ├── account/
      │     └── Account.java
      ├── loan/
      │     └── Loan.java
      └── customer/
            └── Customer.java

How to create:
package com.bank.account;

public class Account {
    public void show() {
        System.out.println("Account details");
    }
}

Use Subpackage Class:
import com.bank.account.Account;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.show();
    }
}

How compilation works:
javac -d . Account.java

👉 Creates folder structure automatically:
com/bank/account/Account.class


ex.
if we have:
package com.bank.loan;

public class Loan {

then inside :
package com.bank.account;
we can use:
import com.bank.loan.Loan;
public class Account {

not allowed: import com.bank.*;   // does NOT include subpackages
*/
