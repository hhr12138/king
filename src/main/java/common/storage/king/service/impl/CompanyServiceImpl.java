package common.storage.king.service.impl;

import common.storage.king.entity.Company;
import common.storage.king.mapper.CompanyMapper;
import common.storage.king.service.CompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author haoran hou
 * @since 2022-10-01
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements CompanyService {

}
