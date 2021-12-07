package Lab3.task1;

public  class User {
    private String firstName;
    private String lastName;
    private String email;
    private String numberOfPhone;
    private Address address;


    User(){
    }

    User(final String firstName,final String lastName,final String email,final String numberOfPhone,final Address address) {
this.firstName=firstName;
this.lastName=lastName;
this.email=email;
this.numberOfPhone=numberOfPhone;
this.address=address;
isEmpty();
isEmail();
isNumber();
    }

void isEmpty() throws UncheckedException{
     if(this.firstName.isEmpty()  || this.firstName.matches(".*([ \t]).*")){
         throw new UncheckedException("FirstName is Empty!",CodeHTTP.HTTP_200);
     }
}

void isNumber() throws UncheckedException {
    if(this.numberOfPhone.matches("(.*)[A-Z,a-z](.*)") ) {
        throw new UncheckedException("You need to enter numbers!", CodeHTTP.HTTP_500);
    }
    if(this.numberOfPhone.length()!=10){
        throw new UncheckedException("You have entered an incorrect number",CodeHTTP.HTTP_500);
    }
    }


void isEmail()throws UncheckedException{
if(!this.email.matches("(.*)@(.*)") || !this.email.matches("(.*)[.](.*)")){
    throw  new UncheckedException("Incorrectly entered email!",CodeHTTP.HTTP_400);
}

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getNumberOfPhone() {
        return numberOfPhone;
    }

    public void setNumberOfPhone(final String numberOfPhone) {this.numberOfPhone = numberOfPhone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }




    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", numberOfPhone='" + numberOfPhone + '\'' +
                ", address=" + address +
                '}';
    }
}
