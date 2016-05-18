package com.minutes111.jsonparse.model;

import java.util.Date;
import java.util.List;

/**
 * Created by barikos on 17.05.16.
 */
public class User {

    private String mId;
    private int mIndex;
    private String mGuid;
    private boolean mActive;
    private float mBalance;
    private String mPicture;
    private int mAge;
    private String mEyeColor;
    private String mName;
    private String mGender;
    private String mCompany;
    private String mEmail;
    private String mPhone;
    private String mAdress;
    private String mAbout;
    private Date mRegistered;
    private double mLatitude;
    private double mLongitude;
    private List mTags;
    private List<UserFriend> mFriends;
    private String mGreeting;
    private String mFruit;


    public static class Builder{
        private String id;
        private int index;
        private String guid;
        private boolean active;
        private float balance;
        private String picture;
        private int age;
        private String eyeColor;
        private String name;
        private String gender;
        private String company;
        private String email;
        private String phone;
        private String address;
        private String about;
        private Date registered;
        private double latitude;
        private double longitude;
        private List tags;
        private List<UserFriend> friends;
        private String greeting;
        private String fruit;

        public Builder setId(String id){
            this.id = id;
            return this;
        }

        public Builder setIndex(int index) {
            this.index = index;
            return this;
        }

        public Builder setGuid(String guid) {
            this.guid = guid;
            return this;
        }

        public Builder setActive(boolean active) {
            this.active = active;
            return this;
        }

        public Builder setBalance(float balance) {
            this.balance = balance;
            return this;
        }

        public Builder setPicture(String picture) {
            this.picture = picture;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setEyeColor(String eyeColor) {
            this.eyeColor = eyeColor;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setAbout(String about) {
            this.about = about;
            return this;
        }

        public Builder setRegistered(Date registered) {
            this.registered = registered;
            return this;
        }

        public Builder setLatitude(double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(double longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder setTags(List tags) {
            this.tags = tags;
            return this;
        }

        public Builder setFriends(List<UserFriend> friends) {
            this.friends = friends;
            return this;
        }

        public Builder setGreeting(String greeting) {
            this.greeting = greeting;
            return this;
        }

        public Builder setFruit(String fruit) {
            this.fruit = fruit;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    private User(User.Builder builder){
        mId = builder.id;
        mIndex = builder.index;
        mGuid = builder.guid;
        mActive = builder.active;
        mBalance = builder.balance;
        mPicture = builder.picture;
        mAge = builder.age;
        mEyeColor = builder.eyeColor;
        mName = builder.name;
        mGender = builder.gender;
        mCompany = builder.company;
        mEmail = builder.email;
        mPhone = builder.phone;
        mAdress = builder.address;
        mAbout = builder.about;
        mRegistered = builder.registered;
        mLatitude = builder.latitude;
        mLongitude = builder.longitude;
        mTags = builder.tags;
        mFriends = builder.friends;
        mGreeting = builder.greeting;
        mFruit = builder.fruit;
    }

    public String getId() {
        return mId;
    }

    public int getIndex() {
        return mIndex;
    }

    public String getGuid() {
        return mGuid;
    }

    public boolean isActive() {
        return mActive;
    }

    public float getBalance() {
        return mBalance;
    }

    public String getPicture() {
        return mPicture;
    }

    public int getAge() {
        return mAge;
    }

    public String getEyeColor() {
        return mEyeColor;
    }

    public String getName() {
        return mName;
    }

    public String getGender() {
        return mGender;
    }

    public String getCompany() {
        return mCompany;
    }

    public String getEmail() {
        return mEmail;
    }

    public String getPhone() {
        return mPhone;
    }

    public String getAdress() {
        return mAdress;
    }

    public String getAbout() {
        return mAbout;
    }

    public Date getRegistered() {
        return mRegistered;
    }

    public double getLatitude() {
        return mLatitude;
    }

    public double getLongitude() {
        return mLongitude;
    }

    public List getTags() {
        return mTags;
    }

    public List<UserFriend> getFriends() {
        return mFriends;
    }

    public String getGreeting() {
        return mGreeting;
    }

    public String getFruit() {
        return mFruit;
    }


    @Override
    public String toString() {
        return "User{" +
                "mId='" + mId + '\'' +
                ", mIndex=" + mIndex +
                ", mGuid='" + mGuid + '\'' +
                ", mActive=" + mActive +
                ", mBalance=" + mBalance +
                ", mPicture='" + mPicture + '\'' +
                ", mAge=" + mAge +
                ", mEyeColor='" + mEyeColor + '\'' +
                ", mName='" + mName + '\'' +
                ", mGender='" + mGender + '\'' +
                ", mCompany='" + mCompany + '\'' +
                ", mEmail='" + mEmail + '\'' +
                ", mPhone='" + mPhone + '\'' +
                ", mAdress='" + mAdress + '\'' +
                ", mAbout='" + mAbout + '\'' +
                ", mRegistered=" + mRegistered +
                ", mLatitude=" + mLatitude +
                ", mLongitude=" + mLongitude +
                ", mTags=" + mTags.toString() +
                ", mFriends=" + mFriends.toString() +
                ", mGreeting='" + mGreeting + '\'' +
                ", mFruit='" + mFruit + '\'' +
                '}';
    }
}
