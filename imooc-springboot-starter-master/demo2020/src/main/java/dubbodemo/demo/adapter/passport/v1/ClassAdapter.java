package dubbodemo.demo.adapter.passport.v1;

import dubbodemo.demo.adapter.passport.PassportService;
import dubbodemo.demo.adapter.passport.ResultMsg;

/**
 * @author wj
 * @date 2020/9/9 - 0:30
 */
public class ClassAdapter extends PassportService implements  IPassportForThird{
    @Override
    public ResultMsg loginForQQ(String openId) {
        return this.loginForRegist(openId,null);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return this.loginForRegist(openId,null);
    }

    @Override
    public ResultMsg loginForToken(String Token) {
        return this.loginForRegist(Token,null);
    }

    @Override
    public ResultMsg loginForPhone(String phone, String code) {
        return this.loginForRegist(phone,code);
    }
    
    private ResultMsg loginForRegist(String username, String password) {
        if (password == null) {
            password = "666666";
        }
        super.regist(username, password);
        return super.login(username, password);
    }
}
