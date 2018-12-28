package com.nfsq.yqf.automikosjta.bean;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by qfyu
 * Date:2018/12/28
 * Time:13:40
 **/
@Setter
@Getter
public class User implements Serializable {
    private static final long serialVersionUID =1L;

    private Integer id;

    private String userName;

    private String password;


}
