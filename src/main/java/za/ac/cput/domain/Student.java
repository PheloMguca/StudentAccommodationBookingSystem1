package za.ac.cput.domain;

//
// * Student.java
// * using Builder Pattern
// * Author: Sethu Mdluli (230830811)
// * Date: 17 March 2026
// */


public class Student {
    private String studentNumber;
    private String studentName;
    private GenderType gender;
    private Address address;
    private ContactDetails contactDetails;

    public Student() {
    }
    //    Builder Constractor
    public Student(Builder builder) {
        this.studentNumber = builder.studentNumber;
        this.studentName = builder.studentName;
        this.gender = builder.gender;
        this.address = builder.address;
        this.contactDetails = builder.contactDetails;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }
    public GenderType getGender() {
        return gender;
    }
    public Address getAddress() {
        return address;
    }
    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", studentName='" + studentName + '\'' +
                ", contactDetails=" + contactDetails +
                ", gender=" + gender +
                ", address=" + address +
                '}';
    }

    //    Builder Class
    public static class Builder {
        private String studentNumber;
        private String studentName;
        private GenderType gender;
        private Address address;
        private ContactDetails contactDetails;

        public Builder setStudentNumber(String studentNumber) {
            this.studentNumber = studentNumber;
            return this;
        }
        public Builder setStudentName(String studentName) {
            this.studentName = studentName;
            return this;
        }
        public Builder setGender(GenderType gender) {
            this.gender = gender;
            return this;
        }
        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }
        public Builder setContactDetails(ContactDetails contactDetails) {
            this.contactDetails = contactDetails;
            return this;
        }
        public Builder copy(Student student){
            this.studentNumber = student.studentNumber;
            this.studentName = student.studentName;
            this.gender = student.gender;
            this.address = student.address;
            this.contactDetails = student.contactDetails;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }
}
