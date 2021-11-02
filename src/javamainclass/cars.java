/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamainclass;

/**
 *
 * @author sanik
 */
public class cars {
    private String personID;
    private String name;
    private String community;
    private int age;
    private String gender;
    private String city;
    private String house;
    
    public cars(String personID,String name, String community, int age, String gender, String city, String house){
        this.personID = personID;
        this.age = age;
        this.city = city;
        this.community = community;
        this.name = name;
        this.house = house;
        this.gender = gender;
    }
    cars(){
        
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
    
    
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return community;
    }

   

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    private String Location;

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    
    @Override
    public String toString(){
        return personID;
    }
    
    
}
