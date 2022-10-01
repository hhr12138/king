package common.storage.king.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author haoran hou
 * @since 2022-10-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long companyId;

    private Long departmentId;

    private String permission;

    @TableField(fill = FieldFill.INSERT)
    @TableLogic
    private Boolean del;

    @TableField(fill = FieldFill.INSERT)
    private Long gmtCreate;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long gmtModified;


}
