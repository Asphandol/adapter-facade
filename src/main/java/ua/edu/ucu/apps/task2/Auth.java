package ua.edu.ucu.apps.task2;

public class Auth extends Авторизація {
    public boolean authenticate(Database db) {
        db.getUserData();
        return true;
    }
    @Override @Deprecated
    public boolean авторизуватися(БазаДаних db) {
        return super.авторизуватися(db);
    }
}
