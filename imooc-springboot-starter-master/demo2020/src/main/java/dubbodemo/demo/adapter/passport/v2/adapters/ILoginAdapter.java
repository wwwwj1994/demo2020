package dubbodemo.demo.adapter.passport.v2.adapters;

import dubbodemo.demo.adapter.passport.ResultMsg;

/**
 * @author wj
 * @date 2020/9/9 - 0:38
 */
public interface ILoginAdapter {

    /**
     * 校验
     * @param object
     * @return
     */
    Boolean support(Object object);

    /**
     * 登录
     * @param id
     * @param adapter
     * @return
     */
    ResultMsg login (String id, Object adapter);
}
