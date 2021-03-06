package alexclin.httplite.retrofit;

import java.lang.reflect.Method;

import alexclin.httplite.HttpLite;

/**
 * MethodListener
 *
 * @author alexclin
 * @date 16/1/31 00:05
 */
public interface MethodListener {
    void onMethod(Method method,Retrofit retrofit,Object... args);
}
