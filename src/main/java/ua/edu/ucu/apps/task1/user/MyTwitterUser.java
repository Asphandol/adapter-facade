package ua.edu.ucu.apps.task1.user;

import ua.edu.ucu.apps.task1.twitter.TwitterUser;

public class MyTwitterUser implements User {
    TwitterUser user;
    public MyTwitterUser(TwitterUser user) {
        this.user = user;
    }

    @Override
    public String getEmail(){
        return user.getEmail();
    }

    @Override
    public java.time.LocalDate getActiveTime(){
        return user.getUserActiveTime();
    }

    @Override
    public String getCountry(){
        return user.getUserCountry().toString();
    }

    
}
