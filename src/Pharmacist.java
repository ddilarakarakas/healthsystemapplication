public class Pharmacist extends User {
    static int currentID=0;
    /**
     * Creates a person with given information.
     * @param personalData personal data of user
     * @param loginName    login name of user
     * @param password     password of user
     * @param hospital     the hospital to which the user belongs
     */
    public Pharmacist(PersonalData personalData, String loginName, String password, Hospital hospital) {
        super(personalData, loginName, password, hospital);
    }

    static int getNextID(){
        currentID++;
        return currentID-1;
    }

}