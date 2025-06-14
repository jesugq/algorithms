public class Person {
    
    private String firstName;
    private String lastName;
    private int age;
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setAge(int age) {
        this.age = (age<0 || age>100) ? 0 : age;
    }
    
    public boolean isTeen() {
        return (age > 12) && (age < 20);
    }
    
    public String getFullName() {
        
        boolean hasFirstName = !firstName.isEmpty();
        boolean hasLastName = !lastName.isEmpty();
        
        return (hasFirstName && hasLastName)
            ? (firstName+" "+lastName)
            : (hasFirstName)
                ? firstName
                : lastName;
    }
}
