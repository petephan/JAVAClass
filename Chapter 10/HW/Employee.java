// Fig. 10.4: Employee.java
// Employee abstract superclass.
//Peter Phan 11/9/14

public abstract class Employee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date birthDate;

    // three-argument constructor
    public Employee(String first, String last, String ssn, int month, int day, int year) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        birthDate = new Date( month, day, year );
    } // end three-argument Employee constructor

    // set first name
    public void setFirstName(String first) {
        firstName = first; // should validate
    } // end method setFirstName

    // return first name
    public String getFirstName() {
        return firstName;
    } // end method getFirstName

    // set last name
    public void setLastName(String last) {
        lastName = last; // should validate
    } // end method setLastName

    // return last name
    public String getLastName() {
        return lastName;
    } // end method getLastName

    // set social security number
    public void setSocialSecurityNumber(String ssn) {
        socialSecurityNumber = ssn; // should validate
    } // end method setSocialSecurityNumber

    // return social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    } // end method getSocialSecurityNumber

   // return String representation of Employee object
    public void setBirthDate(int month, int day, int year) {
        birthDate = new Date(month, day, year);
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s %s\nsocial security number: %s" + "\nBirthdate: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber(), birthDate.toDateString());
    } // end method toString

    // abstract method overridden by concrete subclasses
    public abstract double earnings(); // no implementation here
} // end abstract class Employee
