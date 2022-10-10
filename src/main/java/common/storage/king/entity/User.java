package common.storage.king.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

import lombok.*;

/**
 * <p>
 * 
 * </p>
 *
 * @author haoran hou
 * @since 2022-09-19
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;

    private String name;

    private String password;

    private String salt;

    private String headImage;

    private String sex;

    private String phone;

    /**
     * 时间戳
     */
    private Long birthday;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 实名
     */
    private String realName;

    /**
     * 身份证号
     */
    private String identityCard;

    private String country;

    private String province;

    private String city;

    /**
     * 地址
     */
    private String location;

    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean del;

    @TableField(fill = FieldFill.INSERT)
    private Long gmtCreate;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long gmtModified;


}
