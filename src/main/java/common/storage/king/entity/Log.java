package common.storage.king.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

import lombok.*;
import org.springframework.boot.context.properties.bind.Name;

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
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long userId;

    private String requestId;

    @TableField("PSM")
    private String PSM;

    private String level;

    private String context;

    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean del;

    @TableField(fill = FieldFill.INSERT)
    private Long gmtCreate;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long gmtModified;

    public Log(Long userId, String requestId, String PSM, String level, String context) {
        this.userId = userId;
        this.requestId = requestId;
        this.PSM = PSM;
        this.level = level;
        this.context = context;
    }
}
