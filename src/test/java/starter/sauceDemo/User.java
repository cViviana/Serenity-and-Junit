package starter.sauceDemo;

public enum User {
    STANDARD_USER("standard_user","secret_sauce","A standard user"),
    LOCKED_OUT_USER("locked_out_user","secret_sauce","A locked out user"),
    PROBLEM_USER("problem_user","secret_sauce","A problem user"),
    PERFORMANCE_GLITCH_USER("performance_glitch_user","secret_sauce","A performance glitch user"),
    ERROR_USER("error_user","secret_sauce","An error user"),
    VISUAL_USER("visual_user","secret_sauce","A visual user"),

    private final String username;
    private final String passsword;
    private final String description;

    User(String username, String passsword, String description) {
        this.username = username;
        this.passsword = passsword;
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public String getPasssword() {
        return passsword;
    }

    public String getDescription() {
        return description;
    }

    
}
