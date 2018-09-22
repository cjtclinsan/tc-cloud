package com.example.sbmp.service.impl;

import com.example.sbmp.entity.BizUser;
import com.example.sbmp.mapper.BizUserMapper;
import com.example.sbmp.service.IBizUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lengleng
 * @since 2017-08-19
 */
@Service
public class BizUserServiceImpl extends ServiceImpl<BizUserMapper, BizUser> implements IBizUserService {
    public List<BizUser> findUserAndScoreById() {
        baseMapper.findUserAndScoreById();
        return baseMapper.findUserAndScoreById();
    }
}
