package PatternsOOP;/*
  @author   Romanyuk Bohdan
  @project   Module2
  @class  Student
  @version  1.0.0 
  @since 28.03.2021 - 19.07
*/


import java.time.LocalDate;
import java.util.Objects;

public class Student {
    // Creating 25 fields for class Student

    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate birthday;
    private boolean isAdult;
    private String gender;
    private int course;
    private String eMail;
    private String phoneNumber;
    private String placeOfResidence;
    private String speciality;
    private String chair;
    private int marksheetNumber;
    private double averageScore;
    private boolean isStateEmployee;
    private boolean isSportsActivist;
    private boolean isCulturalActivist;
    private boolean isPublicFigure;
    private boolean isPrivileged;
    private boolean isScholar;
    private int participationsInScientificConferences;
    private boolean hasWork;
    private boolean isCaptain;
    private int retakingExams;


    // ----------------------------------
    // Creating FULL constructor



    public Student(String firstName,
                   String lastName,
                   String patronymic,
                   LocalDate birthday,
                   boolean isAdult,
                   String gender,
                   int course,
                   String eMail,
                   String phoneNumber,
                   String placeOfResidence,
                   String speciality,
                   String chair,
                   int marksheetNumber,
                   double averageScore,
                   boolean isStateEmployee,
                   boolean isSportsActivist,
                   boolean isCulturalActivist,
                   boolean isPublicFigure,
                   boolean isPrivileged,
                   boolean isScholar,
                   int participationsInScientificConferences,
                   boolean hasWork,
                   boolean isCaptain,
                   int retakingExams) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.isAdult = isAdult;
        this.gender = gender;
        this.course = course;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.placeOfResidence = placeOfResidence;
        this.speciality = speciality;
        this.chair = chair;
        this.marksheetNumber = marksheetNumber;
        this.averageScore = averageScore;
        this.isStateEmployee = isStateEmployee;
        this.isSportsActivist = isSportsActivist;
        this.isCulturalActivist = isCulturalActivist;
        this.isPublicFigure = isPublicFigure;
        this.isPrivileged = isPrivileged;
        this.isScholar = isScholar;
        this.participationsInScientificConferences = participationsInScientificConferences;
        this.hasWork = hasWork;
        this.isCaptain = isCaptain;
        this.retakingExams = retakingExams;
    }

    // ----------------------------------
    // Creating EMPTY constructor


    public Student() {
    }


    // ----------------------------------
    // Getters & Setters


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        gender = gender;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public void setPlaceOfResidence(String placeOfResidence) {
        this.placeOfResidence = placeOfResidence;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public int getMarksheetNumber() {
        return marksheetNumber;
    }

    public void setMarksheetNumber(int marksheetNumber) {
        this.marksheetNumber = marksheetNumber;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public boolean isStateEmployee() {
        return isStateEmployee;
    }

    public void setStateEmployee(boolean stateEmployee) {
        isStateEmployee = stateEmployee;
    }

    public boolean isSportsActivist() {
        return isSportsActivist;
    }

    public void setSportsActivist(boolean sportsActivist) {
        isSportsActivist = sportsActivist;
    }

    public boolean isCulturalActivist() {
        return isCulturalActivist;
    }

    public void setCulturalActivist(boolean culturalActivist) {
        isCulturalActivist = culturalActivist;
    }

    public boolean isPublicFigure() {
        return isPublicFigure;
    }

    public void setPublicFigure(boolean publicFigure) {
        isPublicFigure = publicFigure;
    }

    public boolean isPrivileged() {
        return isPrivileged;
    }

    public void setPrivileged(boolean privileged) {
        isPrivileged = privileged;
    }

    public boolean isScholar() {
        return isScholar;
    }

    public void setScholar(boolean scholar) {
        isScholar = scholar;
    }

    public int getParticipationsInScientificConferences() {
        return participationsInScientificConferences;
    }

    public void setParticipationsInScientificConferences(int participationsInScientificConferences) {
        participationsInScientificConferences = participationsInScientificConferences;
    }

    public boolean isHasWork() {
        return hasWork;
    }

    public void setHasWork(boolean hasWork) {
        this.hasWork = hasWork;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }

    public int getRetakingExams() {
        return retakingExams;
    }

    public void setRetakingExams(int retakingExams) {
        this.retakingExams = retakingExams;
    }



    // ----------------------------------
    // toString() method


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday=" + birthday +
                ", isAdult=" + isAdult +
                ", gender='" + gender + '\'' +
                ", course=" + course +
                ", eMail='" + eMail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", placeOfResidence='" + placeOfResidence + '\'' +
                ", speciality='" + speciality + '\'' +
                ", chair='" + chair + '\'' +
                ", marksheetNumber=" + marksheetNumber +
                ", averageScore=" + averageScore +
                ", isStateEmployee=" + isStateEmployee +
                ", isSportsActivist=" + isSportsActivist +
                ", isCulturalActivist=" + isCulturalActivist +
                ", isPublicFigure=" + isPublicFigure +
                ", isPrivileged=" + isPrivileged +
                ", isScholar=" + isScholar +
                ", participationsInScientificConferences="
                + participationsInScientificConferences +
                ", hasWork=" + hasWork +
                ", isCaptain=" + isCaptain +
                ", retakingExams=" + retakingExams +
                '}';
    }



    // ----------------------------------
    // equals() method


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return isAdult() == student.isAdult() &&
                getCourse() == student.getCourse() &&
                getMarksheetNumber() == student.getMarksheetNumber() &&
                Double.compare(student.getAverageScore(), getAverageScore()) == 0 &&
                isStateEmployee() == student.isStateEmployee() &&
                isSportsActivist() == student.isSportsActivist() &&
                isCulturalActivist() == student.isCulturalActivist() &&
                isPublicFigure() == student.isPublicFigure() &&
                isPrivileged() == student.isPrivileged() &&
                isScholar() == student.isScholar() &&
                getParticipationsInScientificConferences()
                        == student.getParticipationsInScientificConferences() &&
                isHasWork() == student.isHasWork() &&
                isCaptain() == student.isCaptain() &&
                getRetakingExams() == student.getRetakingExams() &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getLastName(), student.getLastName()) &&
                Objects.equals(getPatronymic(), student.getPatronymic()) &&
                Objects.equals(getBirthday(), student.getBirthday()) &&
                Objects.equals(getGender(), student.getGender()) &&
                Objects.equals(geteMail(), student.geteMail()) &&
                Objects.equals(getPhoneNumber(), student.getPhoneNumber()) &&
                Objects.equals(getPlaceOfResidence(), student.getPlaceOfResidence()) &&
                Objects.equals(getSpeciality(), student.getSpeciality()) &&
                Objects.equals(getChair(), student.getChair());
    }



    // ----------------------------------
    // hashCode() method


    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPatronymic(),
                getBirthday(), isAdult(), getGender(), getCourse(),
                geteMail(), getPhoneNumber(), getPlaceOfResidence(),
                getSpeciality(), getChair(), getMarksheetNumber(),
                getAverageScore(), isStateEmployee(), isSportsActivist(),
                isCulturalActivist(), isPublicFigure(), isPrivileged(),
                isScholar(), getParticipationsInScientificConferences(),
                isHasWork(), isCaptain(), getRetakingExams());
    }


    //-------------------------------------------------------------------------------
    //--------------------------------- BUILDER -------------------------------------
    //-------------------------------------------------------------------------------



    // Builder methods


    public static class Builder{

        private Student studentToBuild;

        public Builder(){
            this.studentToBuild = new Student();
        }

        Builder setFirstName(String firstName){
            studentToBuild.setFirstName(firstName);
            return this;
        }

        Builder setLastName(String lastName){
            studentToBuild.setLastName(lastName);
            return this;
        }

        Builder setPatronymic(String patronymic){
            studentToBuild.setPatronymic(patronymic);
            return this;
        }

        Builder setBirthday(LocalDate birthday){
            studentToBuild.setBirthday(birthday);
            return this;
        }

        Builder setIsAdult(boolean isAdult){
            studentToBuild.setAdult(isAdult);
            return this;
        }

        Builder setGender(String gender){
            studentToBuild.setGender(gender);
            return this;
        }

        Builder setCourse(int course){
            studentToBuild.setCourse(course);
            return this;
        }

        Builder seteMail(String eMail){
            studentToBuild.seteMail(eMail);
            return this;
        }

        Builder setPhoneNumber(String phoneNumber){
            studentToBuild.setPhoneNumber(phoneNumber);
            return this;
        }

        Builder setPlaceOfResidence(String placeOfResidence){
            studentToBuild.setPlaceOfResidence(placeOfResidence);
            return this;
        }

        Builder setSpeciality(String speciality){
            studentToBuild.setSpeciality(speciality);
            return this;
        }

        Builder setChair(String chair){
            studentToBuild.setChair(chair);
            return this;
        }

        Builder setMarksheetNumber(int marksheetNumber){
            studentToBuild.setMarksheetNumber(marksheetNumber);
            return this;
        }

        Builder setAverageScore(double averageScore){
            studentToBuild.setAverageScore(averageScore);
            return this;
        }

        Builder setIsStateEmployee(boolean isStateEmployee){
            studentToBuild.setStateEmployee(isStateEmployee);
            return this;
        }

        Builder setIsSportsActivist(boolean isSportsActivist){
            studentToBuild.setSportsActivist(isSportsActivist);
            return this;
        }

        Builder setIsCulturalActivist(boolean isCulturalActivist){
            studentToBuild.setCulturalActivist(isCulturalActivist);
            return this;
        }

        Builder setIsPublicFigure(boolean isPublicFigure){
            studentToBuild.setPublicFigure(isPublicFigure);
            return this;
        }

        Builder setIsPrivileged(boolean isPrivileged){
            studentToBuild.setPrivileged(isPrivileged);
            return this;
        }

        Builder setIsScholar(boolean isScholar){
            studentToBuild.setScholar(isScholar);
            return this;
        }

        Builder setParticipationsInScientificConferences(int participationsInScientificConferences){
            studentToBuild.setParticipationsInScientificConferences(participationsInScientificConferences);
            return this;
        }

        Builder setHasWork(boolean hasWork){
            studentToBuild.setHasWork(hasWork);
            return this;
        }

        Builder setIsCaptain(boolean isCaptain){
            studentToBuild.setCaptain(isCaptain);
            return this;
        }

        Builder setRetakingExams(int retakingExams){
            studentToBuild.setRetakingExams(retakingExams);
            return this;
        }

        Student build() {
            return studentToBuild;
        }


        // ----------------------------------
        // Builder method setSimilarTo()



        public Builder setSimilarTo(Student student){

            this.studentToBuild.firstName = student.firstName;
            this.studentToBuild.lastName = student.lastName;
            this.studentToBuild.patronymic = student.patronymic;
            this.studentToBuild.birthday = student.birthday;
            this.studentToBuild.isAdult = student.isAdult;
            this.studentToBuild.gender = student.gender;
            this.studentToBuild.course = student.course;
            this.studentToBuild.eMail = student.eMail;
            this.studentToBuild.phoneNumber = student.phoneNumber;
            this.studentToBuild.placeOfResidence = student.placeOfResidence;
            this.studentToBuild.speciality = student.speciality;
            this.studentToBuild.chair = student.chair;
            this.studentToBuild.marksheetNumber = student.marksheetNumber;
            this.studentToBuild.averageScore = student.averageScore;
            this.studentToBuild.isStateEmployee = student.isStateEmployee;
            this.studentToBuild.isSportsActivist = student.isSportsActivist;
            this.studentToBuild.isCulturalActivist = student.isCulturalActivist;
            this.studentToBuild.isPublicFigure = student.isPublicFigure;
            this.studentToBuild.isPrivileged = student.isPrivileged;
            this.studentToBuild.isScholar = student.isScholar;
            this.studentToBuild.participationsInScientificConferences = student.participationsInScientificConferences;
            this.studentToBuild.hasWork = student.hasWork;
            this.studentToBuild.isCaptain = student.isCaptain;
            this.studentToBuild.retakingExams = student.retakingExams;
            return this;

        }


    }


}
