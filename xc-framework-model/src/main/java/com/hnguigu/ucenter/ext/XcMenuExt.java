package com.hnguigu.ucenter.ext;

import com.hnguigu.course.ext.CategoryNode;
import com.hnguigu.ucenter.XcMenu;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Created by admin on 2018/3/20.
 */
@Data
@ToString
public class XcMenuExt extends XcMenu {

    List<CategoryNode> children;
}
