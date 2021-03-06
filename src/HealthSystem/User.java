package HealthSystem;

/**
 * HealthSystem.User class represents all kind of users in a general way in the Health System Application
 * Common features of user types such as patient, doctor, nurse  are gathered in this class.
 */
public class User implements HealthSystemUsers {
    private PersonalData personalData;
    private String loginName;
    private String password;
    private Hospital hospital;

    /**
     * Creates a person with given information.
     * @param personalData personal data of user
     * @param loginName login name of user
     * @param password password of user
     * @param hospital the hospital to which the user belongs
     */
    public User(PersonalData personalData, String loginName, String password, Hospital hospital)
    {
        this.personalData = personalData;
        this.loginName = loginName;
        this.password = password;
        this.hospital = hospital;
    }


    /**
     * This method verifies if given user is valid
     * @param name user's name
     * @param verifyPassword user's password
     * @return true if user is valid
     */
    @Override
    public Boolean verifyUser(String name, String verifyPassword){
         return (loginName.equals(name) && password.equals(verifyPassword));
    }

    /**
     * Getter method for user's personalData
     * @return user's personal data
     */
    public PersonalData getPersonalData(){
        return personalData;
    }

    /**
     * Getter method for hospital
     * @return HealthSystem.Hospital object of user
     */
    public Hospital getHospital() {
        return hospital;
    }

    /**
     * Getter method for login name
     * @return loginName of the user
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Getter for password
     * @return password of the user
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets hospital with new HealthSystem.Hospital object
     * @param hospital new hospital object
     */
    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    /**
     * Sets loginName
     * @param loginName new loginName of the user
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * Sets password
     * @param password new password of the user
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Sets the personal data with new HealthSystem.PersonalData object
     * @param personalData new personalData of the user
     */
    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    @Override
    public int compareTo(HealthSystemUsers o) {
        return getPersonalData().compareTo(o.getPersonalData());
    }
}

