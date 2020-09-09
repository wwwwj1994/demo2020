package dubbodemo.demo.adapter.passport.v2.adapters;

import dubbodemo.demo.adapter.passport.PassportService;
import dubbodemo.demo.adapter.passport.ResultMsg;

/**
 * @author wj
 * @date 2020/9/9 - 0:54
 */
public abstract class AbstraceAdapter extends PassportService implements ILoginAdapter{

    protected ResultMsg loginForRegist(String username, String password) {
        if (password == null) {
            password = "666666";
        }
        super.regist(username, password);
        return super.login(username, password);
    }
}
