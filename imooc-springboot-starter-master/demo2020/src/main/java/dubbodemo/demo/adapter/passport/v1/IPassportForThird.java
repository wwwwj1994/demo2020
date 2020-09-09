package dubbodemo.demo.adapter.passport.v1;

import dubbodemo.demo.adapter.passport.ResultMsg;

/**
 * @author wj
 * @date 2020/9/9 - 0:27
 */
public interface IPassportForThird {

    /**
     * QQ登录
     * @param openId
     * @return
     */
    ResultMsg loginForQQ(String openId);

    /**
     * 微信登录
     * @param openId
     * @return
     */
    ResultMsg loginForWechat(String openId);

    /**
     * Token
     * @param Token
     * @return
     */
    ResultMsg loginForToken(String Token);

    /**
     * 手机号登录
     * @param phone code
     * @return
     */
    ResultMsg loginForPhone(String phone, String code);
}
