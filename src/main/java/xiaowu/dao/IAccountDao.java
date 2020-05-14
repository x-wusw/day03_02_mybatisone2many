package xiaowu.dao;


import xiaowu.domain.Account;
import xiaowu.domain.AccountUser;

import java.util.List;

public interface IAccountDao {
    /**
     * 查询所有用户
     * @return
     */
    List<Account> findAll();

    /**
     * 查询所有用户并带有用户名称和地址
     * @return
     */
    List<AccountUser> findAllAccountUser();


    /**
     * 根据id查询用户信息
     * @param userId
     * @return
     */
    Account findById(Integer userId);
}
