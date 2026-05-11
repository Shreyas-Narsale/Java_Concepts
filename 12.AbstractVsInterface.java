import java.lang.*;

/*  Abstract vs interface:
:
    1. Abstract :Partional Impleneation allowed: if same functionlites across all child class then easy keep in absract class
       Interface: You want similar behavior across unrelated classes
            ex. UPI, Card, NetBanking all behave differently but follow same contract
            interface Payment {
                void pay();
            }
        
    2. functionlity diffeence:
        | Feature              | Abstract Class             | Interface                   |
        | -------------------- | -------------------------- | --------------------------- |
        | Method type          | Abstract + Concrete        | Abstract + default + static |
        | Variables            | Instance variables allowed | Only public static final    |
        | Constructors         | ✔ Allowed                  | ❌ Not allowed              |
        | Multiple inheritance | ❌ Not allowed             | ✔ Supported                 |
        | Flexibility          | Medium                     | High                        |

    3. Abstract Class → IS-A relationship
            ex. Car IS-A Vehicle
                Dog IS-A Animal
       Interface → CAN-DO relationship
            ex. Car CAN-DO Refuelable
                Robot CAN-DO Runnable
 */
// 6. Real System Example
// Abstract Class Example
abstract class PaymentGateway {
    void validate() {
        System.out.println("Validating payment...");
    }

    abstract void pay();
}

// Shared logic = validation
// Interface Example
interface Payment {
    void pay();
}

/* 
Implementations:
UPI
Card
Crypto
*/
