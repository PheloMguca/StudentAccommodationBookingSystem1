package za.ac.cput.domain;
//
// * ContactDetails.java
// * using Builder Pattern
// * Author: Sethu Mdluli (230830811)
// * Date: 17 March 2026
// */
public class ContactDetails {
    private String studentEmail;
    private String phone;

    public ContactDetails() {
    }

    //    Builder Constractor
    public ContactDetails(Builder builder) {
        this.studentEmail = builder.studentEmail;
        this.phone = builder.phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "phone='" + phone + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                '}';
    }
    //    Builder Class
    public static class Builder {
        private String studentEmail;
        private String phone;

        public Builder setStudentEmail(String studentEmail) {
            this.studentEmail = studentEmail;
            return this;
        }
        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public Builder copy(ContactDetails contactDetails){
            this.studentEmail = contactDetails.studentEmail;
            this.phone = contactDetails.phone;
            return this;
        }
        public ContactDetails build(){
            return new ContactDetails(this);
        }

    }
}
