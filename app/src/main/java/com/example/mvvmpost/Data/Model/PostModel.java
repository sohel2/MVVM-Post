package com.example.mvvmpost.Data.Model;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "posts", indices = @Index(value = {"id"}, unique = true))
public class PostModel {

        @SerializedName("userId")
        @Expose
        private int userId;
        @PrimaryKey(autoGenerate = true)
        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("body")
        @Expose
        private String body;

    public PostModel() {
    }
        public PostModel(int userId, String title, String body) {
            this.userId = userId;
            this.title = title;
            this.body = body;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        @Override
        public String toString() {
            return "PostModel{" +
                    "userId=" + userId +
                    ", id=" + id +
                    ", title='" + title + '\'' +
                    ", body='" + body + '\'' +
                    '}';
        }

    }
