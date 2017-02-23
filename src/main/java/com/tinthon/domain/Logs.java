package com.tinthon.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by sidney on 2017/2/23.
 */
@Entity(name = "logs")
public class Logs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    private int id;

    @Column(name = "option_type")
    private int optionType;

    @Column(name = "content")
    private String content;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "update_time")
    private Date updateTime;

    public int getId() {
        return id;
    }

    public int getOptionType() {
        return optionType;
    }

    public void setOptionType(int optionType) {
        this.optionType = optionType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
