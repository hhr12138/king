package common.storage.king.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SpiceMapper<T> extends BaseMapper<T> {
    int insertBatchSomeColumn(List<T> entityList);
}
