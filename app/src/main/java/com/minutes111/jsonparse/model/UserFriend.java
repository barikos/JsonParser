package com.minutes111.jsonparse.model;

/**
 * Created by barikos on 17.05.16.
 */
public class UserFriend {
    private int mId;
    private String mName;

    public UserFriend(int id, String name) {
        mId = id;
        mName = name;
    }

    public UserFriend() {
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }


}
