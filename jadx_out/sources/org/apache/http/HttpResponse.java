package org.apache.http;

import java.util.Locale;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public interface HttpResponse extends HttpMessage {
    HttpEntity getEntity();

    Locale getLocale();

    StatusLine getStatusLine();

    void setEntity(HttpEntity httpEntity);

    void setLocale(Locale locale);

    void setReasonPhrase(String str) throws IllegalStateException;

    void setStatusCode(int i5) throws IllegalStateException;

    void setStatusLine(ProtocolVersion protocolVersion, int i5);

    void setStatusLine(ProtocolVersion protocolVersion, int i5, String str);

    void setStatusLine(StatusLine statusLine);
}
