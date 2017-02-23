package com.tinthon.domain;

import javax.persistence.*;

/**
 * Created by sidney on 2017/2/23.
 */

@Entity(name = "role_privilege")
public class RolePrivilege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rp_id")
    private int id;

    @Column(name = "role_id")
    private int roleId;

    @Column(name = "p_id")
    private int privilegeId;

    @Column(name = "p_type")
    private int privalegeType;

    public int getId() {
        return id;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(int privilegeId) {
        this.privilegeId = privilegeId;
    }

    public int getPrivalegeType() {
        return privalegeType;
    }

    public void setPrivalegeType(int privalegeType) {
        this.privalegeType = privalegeType;
    }
}
