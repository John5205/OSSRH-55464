package com.github.privilege.utils.ztree;

import lombok.Data;

/**
 * Tree基类
 *
 * @author ruoyi
 */
@Data
public class TreeEntity extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 父菜单名称 */
    private String parentName;

    /** 父菜单ID */
    private Long parentId;

    /** 显示顺序 */
    private Integer orderNum;

    /** 祖级列表 */
    private String ancestors;
}
