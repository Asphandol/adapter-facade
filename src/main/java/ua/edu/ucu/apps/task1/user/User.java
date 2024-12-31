package ua.edu.ucu.apps.task1.user;

import java.time.LocalDate;

public interface User {
    public String getEmail();
    public String getCountry();
    public LocalDate getActiveTime();
}
