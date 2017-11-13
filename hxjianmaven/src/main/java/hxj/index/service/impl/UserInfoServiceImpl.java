package hxj.index.service.impl;

import hxj.index.mode.User;
import hxj.index.repository.UserInfoMapper;
import hxj.index.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/10.
 */
@Service
@EnableCaching
public class UserInfoServiceImpl implements UserInfoService{
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    @Cacheable(value = "common",key="'user'")
    public List<User> selectUserInfo() {
        return userInfoMapper.selectUserInfo();
    }
}
