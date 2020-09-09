package dubbodemo.demo.adapter.passport.v2.adapters;

import dubbodemo.demo.adapter.passport.ResultMsg;

/**
 * @author wj
 * @date 2020/9/9 - 0:45
 */
public class LoginForQQAdapter extends AbstraceAdapter {


    @Override
    public Boolean support(Object object) {
        return object instanceof ILoginAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return this.loginForRegist(id, null);
    }
}
