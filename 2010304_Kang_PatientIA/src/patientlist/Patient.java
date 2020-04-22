/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientlist;

import java.io.Serializable;

/**
 *
 * @author 2010304
 */
public class Patient implements Serializable {
    // instance variables
    String firstName;
    String lastName;
    String sex;
    int DOB;
    String street;
    String city;
    int zipCode;
    int phoneNumber;
    int SSN;
    String race;
    String maritalStatus;
    
    public Patient(String firstName, String lastName, String sex, int DOB, String street, String city, int zipCode, int phoneNumber, int SSN, String race, String maritalStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.DOB = DOB;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.SSN = SSN;
        this.race = race;
        this.maritalStatus = maritalStatus;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getSex() {
        return sex;
    }
    
    public int getDOB() {
        return DOB;
    }
    
    public String getStreet() {
        return street;
    }
 
    public String getCity() {
        return city;
    }
    
    public int getZipCode() {
        return zipCode;
    }
    
    public int getPhoneNumber() {
        return phoneNumber;
    }
    
    public int getSSN() {
        return SSN;
    }
    
    public String getRace() {
        return race;
    }
    
    public String getMaritalStatus() {
        return maritalStatus;
    }
    
    public String getNewSex() {
        String sexText = "";

        switch(sex) {
            case"000":
                sexText = "Male";
                break;
            case"100":
                sexText = "Female";
                break;
        }
        
        return sexText;
    }
    
        public String getNewRace() {
        String raceText = "";
        
        switch(race) {
            case"000":
                raceText = "White";
                break;
            case"100":
                raceText = "Asian";
                break;
            case"200":
                raceText = "Black or African American";
                break;
            case"300":
                raceText = "Hispanic or Latino";
                break;
            case"400":
                raceText = "Native Hawaiian or Other Pacific Islander";
                break;
            case"500":
                raceText = "American Indian or Alaska Native";
                break;
            case"600":
                raceText = "Two or more races";
                break;
        }
        
        return raceText;
    }
        
    public String getNewMaritalStatus() {
        String maritalText = "";

        switch(maritalStatus) {
            case"000":
                maritalText = "Single";
                break;
            case"100":
                maritalText = "Married";
                break;
            case"200":
                maritalText = "Widowed";
                break;
            case"300":
                maritalText = "Divorced";
                break;
        }
        
        return maritalText;
    }
}