package hxj.index.repository;

import hxj.index.mode.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/11/10.
 */
@Repository
public interface UserInfoMapper {
    List<User> selectUserInfo();
}
