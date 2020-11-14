package com.chj.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author chj
 * @since 2020-11-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("USER_ROLE")
public class UserRole implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * id
     */
    @TableId(value = "ur_id", type = IdType.AUTO)
    private Integer urId;

    /**
     * 用户id
     */
    private Integer urUserid;

    /**
     * 权限id
     */
    private Integer urRoleid;


}
