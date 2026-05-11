import java.lang.*;

/* Static Class:
    Outer Static not allowed;
    FOr Innser Static:
        Can access static members of outer	 Yes
        Can access non-static members	 No
    ex. User Example with  builder class
*/


// static class A { } // NOT allowed

class User {

    private String name;
    private int age;

    public User(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
    }

    static class Builder {
        private String name;
         private int age;

        Builder setName(String name) {
            this.name = name;
            return this;
        }
          Builder setAge(int age) {
            this.age = age;
            return this;
        }

        User build() {
            return new User(this);
        }
    }
}

class Main{
    public static void main(String args[]){
        User user = new User.Builder().setName("Shreyas").setAge(10).build();

        System.out.println(user);
    }
}
