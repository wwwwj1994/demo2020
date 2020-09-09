package dubbodemo.demo.adapter.passport.v2;

import dubbodemo.demo.adapter.passport.ResultMsg;
import dubbodemo.demo.adapter.passport.v1.IPassportForThird;
import dubbodemo.demo.adapter.passport.v2.adapters.*;

/**
 * @author wj
 * @date 2020/9/9 - 0:30
 */
public class PassportForThirdAdapter implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String openId) {
        return this.processLogin(openId, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return this.processLogin(openId, LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String Token) {
        return this.processLogin(Token, LoginForPhoneAdapter.class);
    }

    @Override
    public ResultMsg loginForPhone(String phone, String code) {
        return this.processLogin(phone, LoginForQQAdapter.class);
    }

    private ResultMsg processLogin(String id, Class<? extends ILoginAdapter> clazz) {
        try {
            ILoginAdapter iLoginAdapter = clazz.newInstance();
            if (iLoginAdapter.support(iLoginAdapter)) {
                return iLoginAdapter.login(id,iLoginAdapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
