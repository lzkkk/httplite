package alexclin.httplite.sample.json;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.Type;

import alexclin.httplite.StringParser;

/**
 * alexclin.httplite.sample
 *
 * @author alexclin
 * @date 16/1/2 16:37
 */
public class FastJsonParser extends StringParser {
    @Override
    public <T> T praseResponse(String content, Type type) throws Exception {
        return JSON.parseObject(content,type);
    }

    @Override
    public boolean isSupported(Type type) {
        return true;
    }
}
