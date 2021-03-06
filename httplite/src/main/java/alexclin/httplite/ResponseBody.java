package alexclin.httplite;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/**
 * alexclin.httplite
 *
 * @author alexclin
 * @date 16/1/1 10:11
 */
public interface ResponseBody extends Closeable{
    MediaType contentType();

    long contentLength() throws IOException;

    InputStream stream() throws IOException;
}
