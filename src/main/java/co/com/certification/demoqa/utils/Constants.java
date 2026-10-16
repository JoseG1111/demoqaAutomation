package co.com.certification.demoqa.utils;

public enum Constants {
    FULL_NAME("fullName"),
    EMAIL("email"),
    CURRENT_ADDRESS("currentAddress"),
    PERMANENT_ADDRESS("permanentAddress"),
    MESSAGE("message");

    private String constants;

    Constants(String constants){ this.constants = constants; }

    public String getConstants() {
        return constants;
    }



}
