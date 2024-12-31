package ua.edu.ucu.apps.task1.user;

import ua.edu.ucu.apps.task1.meta.FaceBookUser;

public class MyMetaUser implements User {
    FaceBookUser user;
    public MyMetaUser(FaceBookUser user) {
        this.user = user;
    }

    @Override
    public String getEmail(){
        return user.getUserMail();
    }

    @Override
    public java.time.LocalDate getActiveTime(){
        return user.getLastActiveTime();
    }

    @Override
    public String getCountry(){
        return user.getCountry();
    }
}
