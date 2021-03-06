package com.github.privilege.bean.vo;

import com.github.privilege.bean.base.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @ClassName SysUserVO
 * @Description TODO
 * @Author JOHN
 * @Date 2020/2/25 15:22
 * @Version 1.0
 **/
@Data
public class SysUserVO extends BaseEntity {

    /**
     * 用户名
     */
    private String loginName;
    /**
     * 昵称
     */
    private String userName;
    /**
     * 邮件
     */
    private String email;
    /**
     * 手机
     */
    private String phone;

    /**
     * 角色id
     */
    @NotBlank(message = "角色id不能为空")
    private String roleId;

}
