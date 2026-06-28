package org.apache.http.impl.io;

import java.io.IOException;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class HttpResponseWriter extends AbstractMessageWriter {
    public HttpResponseWriter(SessionOutputBuffer buffer, LineFormatter formatter, HttpParams params) {
        super(buffer, formatter, params);
    }

    @Override // org.apache.http.impl.io.AbstractMessageWriter
    protected void writeHeadLine(HttpMessage message) throws IOException {
        CharArrayBuffer buffer = this.lineFormatter.formatStatusLine(this.lineBuf, ((HttpResponse) message).getStatusLine());
        this.sessionBuffer.writeLine(buffer);
    }
}
