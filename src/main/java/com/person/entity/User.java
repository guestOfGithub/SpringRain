package com.person.entity;

import java.io.Serializable;

/**
 * 
 * @ClassName: User.java
 * @Description: User Entity
 *
 * @version: v1.1.0
 * @author: She Xiangdong
 * @date: Oct 17, 2016 10:34:30 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *------------------------------------------------------------
 * Oct 17, 2016     She Xiangdong          v1.1.0               修改原因
 */
public class User implements Serializable{
	private String username;
	private String password;
	public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
       this.password=password;
    }

}
