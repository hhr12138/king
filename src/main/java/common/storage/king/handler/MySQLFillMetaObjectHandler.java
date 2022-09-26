package common.storage.king.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

@Component
public class MySQLFillMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        long now = System.currentTimeMillis();
        this.strictInsertFill(metaObject,"gmtCreate",Long.class,now);
        this.strictInsertFill(metaObject,"gmtModified",Long.class,now);
        this.strictInsertFill(metaObject,"del",Boolean.class,Boolean.FALSE);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        long now = System.currentTimeMillis();
        this.strictUpdateFill(metaObject,"gmtModified",Long.class,now);
    }
}
