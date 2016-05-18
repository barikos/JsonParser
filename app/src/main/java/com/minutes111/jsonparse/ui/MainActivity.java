package com.minutes111.jsonparse.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.minutes111.jsonparse.Const;
import com.minutes111.jsonparse.R;
import com.minutes111.jsonparse.model.User;
import com.minutes111.jsonparse.model.UserFriend;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List users = parseJson(Const.RESPONSE);
    }



    private List<User> parseJson(String json){
        List<User> userList = new ArrayList<>();
        try {
            JSONArray mArray = new JSONArray(json);
            for (int i=0; i<mArray.length(); ++i){
                JSONObject user = (JSONObject) mArray.get(i);

                String id = user.getString(Const.ID);
                int index = user.getInt(Const.INDEX);
                String guid = user.getString(Const.GUID);
                boolean active = user.getBoolean(Const.ACTIVE);
                float balance = getFloatBalance(user.getString(Const.BALANCE));
                String picture = user.getString(Const.PICTURE);
                int age = user.getInt(Const.AGE);
                String eyeColor = user.getString(Const.EYE_COLOR);
                String name = user.getString(Const.NAME);
                String gender = user.getString(Const.GENDER);
                String company = user.getString(Const.COMPANY);
                String email = user.getString(Const.EMAIL);
                String phone = user.getString(Const.PHONE);
                String address = user.getString(Const.ADDRESS);
                String about = user.getString(Const.ABOUT);
                Date registr = getDateReg(user.getString(Const.REGISTERED));
                double latitude = user.getDouble(Const.LAT);
                double longitude = user.getDouble(Const.LON);
                List tags = getListTags(user.getJSONArray(Const.TAGS));
                List<UserFriend> friends = getListFriends(user.getJSONArray(Const.FRIENDS));
                String greeting = user.getString(Const.GREET);
                String fruit = user.getString(Const.FRUIT);

                User userModel = new User.Builder()
                        .setId(id)
                        .setIndex(index)
                        .setGuid(guid)
                        .setActive(active)
                        .setBalance(balance)
                        .setPicture(picture)
                        .setAge(age)
                        .setEyeColor(eyeColor)
                        .setName(name)
                        .setGender(gender)
                        .setCompany(company)
                        .setEmail(email)
                        .setPhone(phone)
                        .setAddress(address)
                        .setAbout(about)
                        .setRegistered(registr)
                        .setLatitude(latitude)
                        .setLongitude(longitude)
                        .setTags(tags)
                        .setFriends(friends)
                        .setGreeting(greeting)
                        .setFruit(fruit)
                        .build();
                userList.add(userModel);
                Log.d("myLogs",userModel.toString());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return userList;
    }



    private float getFloatBalance(String str){
        String string = str.substring(1, str.length());
        return  Float.valueOf(string.replace(",",""));
    }

    private Date getDateReg(String str){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss Z");
        Date date = new Date();
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    private ArrayList getListTags(JSONArray array) throws JSONException {
        ArrayList tags = new ArrayList();
        for (int i=0; i<array.length(); ++i){
            tags.add(array.get(i));
        }
        return tags;
    }

    private ArrayList getListFriends(JSONArray jsonArray) throws JSONException {
        ArrayList users = new ArrayList();
        for (int i=0; i<jsonArray.length(); ++i){
            JSONObject friend = jsonArray.getJSONObject(i);
            int id = friend.getInt(Const.FRIEND_ID);
            String name = friend.getString(Const.FRIEND_NAME);
            users.add(new UserFriend(id,name));
        }
        return users;
    }
}
