package response;

import login.User;

/**
 * Created by Shraddha on 23-07-2017.
 */
public class RegisterResponse {
    String error;
    String error_msg;
    String uid;
    User user;


    public RegisterResponse(String error, String error_msg, User user) {
        this.error = error;
        this.error_msg = error_msg;
        this.user = user;
    }

    public String getError() {
        return error;
    }

    public String getError_msg() {
        return error_msg;
    }

    public User getUser() {
        return user;
    }
}

