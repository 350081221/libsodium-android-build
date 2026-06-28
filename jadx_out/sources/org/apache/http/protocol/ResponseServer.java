package org.apache.http.protocol;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.params.CoreProtocolPNames;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class ResponseServer implements HttpResponseInterceptor {
    @Override // org.apache.http.HttpResponseInterceptor
    public void process(HttpResponse response, HttpContext context) throws HttpException, IOException {
        String s5;
        if (response == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (!response.containsHeader(HTTP.SERVER_HEADER) && (s5 = (String) response.getParams().getParameter(CoreProtocolPNames.ORIGIN_SERVER)) != null) {
            response.addHeader(HTTP.SERVER_HEADER, s5);
        }
    }
}
