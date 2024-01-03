class User {
    private static int nextUserId = 1;
    private int userId;
    private String username;
    private String password;

    public User(String username, String password) {
        this.userId = nextUserId++;
        this.username = username;
        this.password = password;
    }

    public User(int userId, String username, String password) {
        this.userId = userId;
        nextUserId++;
        this.username = username;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

