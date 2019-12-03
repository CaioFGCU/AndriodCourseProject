package sample;

/**
 * enum to get the type of engine within Vehicle made
 */

public enum EngineType {
    FOUR_CYLINDER("V4"),
    SIX_CYLINDER("V6"),
    EIGHT_CYLINDER("V8"),
    TWELVE_CYLINDER("V12");

    private String code;

    /**
     * constructor of EngineType to get code when called.
     *
     * @param code
     */
    EngineType(String code) {
        this.code = code;
    }

    /**
     * getter for code
     *
     * @return code
     */
    public String getCode() {
        return code;
    }
}
