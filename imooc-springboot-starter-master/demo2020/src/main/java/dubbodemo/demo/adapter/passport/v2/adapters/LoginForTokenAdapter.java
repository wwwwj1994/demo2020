package dubbodemo.demo.adapter.passport.v2.adapters;

import dubbodemo.demo.adapter.passport.ResultMsg;

/**
 * @author wj
 * @date 2020/9/9 - 0:45
 */
public class LoginForTokenAdapter extends AbstraceAdapter {


    @Override
    public Boolean support(Object object) {
        return object instanceof ILoginAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id, null);
    }
}
