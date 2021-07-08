package com.alireza.store;

public class User {


    private static final int ADMIN = 0  ;

    private static final int SELLER = 1 ;

    private static final int COSTUMER = 2 ;
    enum UserMode
    {
        ADMIN ,
        SELLER ,
        COSTUMER
    }
   private UserMode userMode ;

    public void setUserMode(UserMode userMode) {
        this.userMode = userMode;
    }

    public UserMode getUserMode() {
        return userMode;
    }
}
