package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Jeffrey L";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "jeffreylin26";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s25-16");
        team.addMember("Christian L");
        team.addMember("Jeffrey L");
        team.addMember("Derek K");
        team.addMember("John H");
        team.addMember("Suhrit P");
        team.addMember("Wilson L");
        return team;
    }
}
