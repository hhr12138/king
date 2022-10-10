package common.storage.king.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import lombok.*;

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
@NoArgsConstructor
@ToString
public class NeedPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;

    @TableField("PSM")
    private String psm;

    /**
     * 方法签名或数据名
     */
    private String methorOrData;

    private Long companyId;

    private Long departmentId;

    @TableField(fill = FieldFill.INSERT)
    @TableLogic
    private Boolean del;

    @TableField(fill = FieldFill.INSERT)
    private Long gmtCreate;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long gmtModified;

    public NeedPermission(String psm, String methorOrData, Long companyId, Long departmentId) {
        this.psm = psm;
        this.methorOrData = methorOrData;
        this.companyId = companyId;
        this.departmentId = departmentId;
    }
}
