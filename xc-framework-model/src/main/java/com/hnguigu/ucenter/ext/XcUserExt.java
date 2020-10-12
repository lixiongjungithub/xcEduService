package com.hnguigu.ucenter.ext;

import com.hnguigu.ucenter.XcMenu;
import com.hnguigu.ucenter.XcUser;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Created by admin on 2018/3/20.
 */
@Data
@ToString
public class XcUserExt extends XcUser {

    //权限信息
    private List<XcMenu> permissions;

    //企业信息
    private String companyId;
}
