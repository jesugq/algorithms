# JMC17 31 Person

Write a class with the name **Person.** The class needs **three fields (instance variables)** with the names **firstName, lastName** of type **String** and **age** of type **int**.

Write the following **methods** (instance methods):

- Method named **getFirstName** **without** **any parameters**, it needs to **return** the value of the **firstName** field.
- Method named **getLastName** **without** **any parameters**, it needs to **return** the value of the **lastName** field.
- Method named **getAge** **without** **any parameters**, it needs to **return** the value of the **age** field.
- Method named **setFirstName** **with one parameter of type String**, it needs to **set the value** of the **firstName** field.
- Method named **setLastName with one parameter of type String**, it needs to **set the value** of the **lastName** field.
- Method named **setAge with one parameter of type int**, it needs to **set the value** of the **age** field. If the **parameter** is **less than 0 or greater than 100,** it needs to set the **age** field value to **0**. 
- Method named **isTeen without any parameters,** it needs to **return true** if the value of the **age** field is **greater than 12 and less than 20,** otherwise, **return false**.
- Method named **getFullName without any parameters,** it needs to return the full name of the person.
    - In case both **firstName** and **lastName** fields are empty, Strings **return an empty String**.
    - In case **lastName** is an empty String, **return firstName.**
    - In case **firstName** is an empty String, **return lastName.**

To check if s String is empty, use the method **isEmpty** from the **String** class. For example, **firstName.isEmpty()** returns true if the String is empty or in other words, when the String does not contain any characters.


**TEST EXAMPLE**

**TEST CODE:**

```java
1. Person person = new Person();
2. person.setFirstName("");   // firstName is set to empty string
3. person.setLastName("");    // lastName is set to empty string
4. person.setAge(10);
5. System.out.println("fullName= " + person.getFullName());
6. System.out.println("teen= " + person.isTeen());
7. person.setFirstName("John");    // firstName is set to John
8. person.setAge(18);
9. System.out.println("fullName= " + person.getFullName());
10. System.out.println("teen= " + person.isTeen());
11. person.setLastName("Smith");    // lastName is set to Smith
12. System.out.println("fullName= " + person.getFullName());
```

**OUTPUT**

```java
1. fullName=
2. teen= false
3. fullName= John
4. teen= true
5. fullName= John Smith
```


**NOTE:** All **​**methods should be defined as **public NOT public static**.

**NOTE:** In total, you have to write **8 methods**.

**NOTE:** Do not add the **main** method to the solution code.
