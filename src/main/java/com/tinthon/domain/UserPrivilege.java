package com.tinthon.domain;

import javax.persistence.*;

/**
 * Created by sidney on 2017/2/23.
 */

@Entity(name = "user_privilege")
public class UserPrivilege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "up_id")
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "p_id")
    private int privilegeId;

    @Column(name = "p_type")
    private int privilegeType;

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(int privilegeId) {
        this.privilegeId = privilegeId;
    }

    public int getPrivilegeType() {
        return privilegeType;
    }

    public void setPrivilegeType(int privilegeType) {
        this.privilegeType = privilegeType;
    }
}
