package eu.epitech.hub.lcl.beaconsetter;

public class ApiBridge {
    static final public String  apiUrl = "http://ec2-54-93-111-136.eu-central-1.compute.amazonaws.com:21996/";

    static public String    getSetBeaconUrl(String major, String minor, String profile, String usecase) {
        return apiUrl + "beacon/set?major=" + major + "&minor=" + minor + "&profile=" + profile + "&usecase=" + usecase;
    }

    static public String    getGetBeaconUrl(String major, String minor) {
        return apiUrl + "beacon/get?major=" + major + "&minor=" + minor;
    }

    static public String    getRemoveBeaconUrl(String major, String minor) {
        return apiUrl + "beacon/delete?major=" + major + "&minor=" + minor;
    }

    public static String getAllBeaconUrl() {
        return apiUrl + "beacon/all";
    }
}
