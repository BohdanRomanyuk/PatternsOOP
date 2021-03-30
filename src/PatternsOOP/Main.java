package PatternsOOP;/*
  @author   Romanyuk Bohdan
  @project   Module2
  @class  Main
  @version  1.0.0 
  @since 28.03.2021 - 19.06
*/

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        // ----------------------------------
        // Creating student object WITHOUT builder


        Student Bohdan = new Student("Bohdan", "Romaniuk",
                "Anatoliyovich", LocalDate.of(1999, Month.AUGUST, 27),
                 true, "Male",
                5, "bjiag2@gmail.com", "+380995515892",
                "Perechyn, Ukraine",
                "Software-Engineer", "Systems Software",
                436594, 67,
                false, true, true,
                false, false, false,
                1, false, false, 0);



        // Creating student object WITH builder

        Student Vasya = new Student.Builder()
                .setFirstName("Volodymir")
                .setLastName("Evriy")
                .setPatronymic("Vasilyovich")
                .setBirthday(LocalDate.of(2002, Month.APRIL, 22))
                .setIsAdult(true)
                .setGender("Male")
                .seteMail("bro4@gmail.com")
                .setPhoneNumber("+7368528560")
                .setPlaceOfResidence("Moskva, Russia")
                .setSpeciality("Ingeener")
                .setChair("RandChair")
                .setMarksheetNumber(631112)
                .setAverageScore(86)
                .setIsStateEmployee(true)
                .setIsSportsActivist(true)
                .setIsCulturalActivist(false)
                .setIsPublicFigure(true)
                .setIsPrivileged(true)
                .setIsScholar(false)
                .setParticipationsInScientificConferences(11)
                .setHasWork(true)
                .setIsCaptain(true)
                .setRetakingExams(3)
                .build();




        // Creating student object with method setSimilarTo()

        Student Dmitro = new Student.Builder()
                .setSimilarTo(Bohdan)
                .setFirstName("Dmitro")
                .setLastName("Kilb")
                .setPatronymic("Egorovich")
                .build();


        // Checking Info

        System.out.println(Bohdan);
        System.out.println(Vasya);
        System.out.println(Dmitro);


    }
    }
