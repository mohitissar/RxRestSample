package com.whiterabbit.rxrestsample.rest;

import com.google.gson.annotations.SerializedName;

public class Repo {
    public static class Owner {
        private String login;
        private String id;
        @SerializedName("avatar_url")
        private String avatarUrl;
        @SerializedName("html_url")
        private String htmlUrl;
    }

    private String id;
    private String name;
    @SerializedName("full_name")
    private String fullName;


}