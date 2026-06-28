package org.apache.http;

import java.io.IOException;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public interface HttpClientConnection extends HttpConnection {
    void flush() throws IOException;

    boolean isResponseAvailable(int i5) throws IOException;

    void receiveResponseEntity(HttpResponse httpResponse) throws HttpException, IOException;

    HttpResponse receiveResponseHeader() throws HttpException, IOException;

    void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) throws HttpException, IOException;

    void sendRequestHeader(HttpRequest httpRequest) throws HttpException, IOException;
}
