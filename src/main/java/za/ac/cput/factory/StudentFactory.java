package za.ac.cput.factory;
import za.ac.cput.domain.*;
import za.ac.cput.util.Helper;

public class StudentFactory {

    public static Student createStudent(String studentNumber, String studentName, GenderType studentGender, Address address, ContactDetails contactDetails) {
        if ((Helper.isNullOrEmpty(studentNumber)) || (Helper.isNullOrEmpty(studentName))) {
            throw new IllegalArgumentException("Student number or name is null or empty");
        }
        if (!Helper.isValidEmail(contactDetails.getStudentEmail())){
            throw new IllegalArgumentException("Invalid email address");
        }
        if (Helper.isValidPostalCode((contactDetails.getStudentEmail()))){
            throw new IllegalArgumentException("Invalid postal code");
        }

        return new Student.Builder()
                .setStudentNumber(studentNumber)
                .setStudentName(studentName)
                .setContactDetails(contactDetails)
                .setGender(studentGender)
                .setAddress(address)
                .build();
    }


}
