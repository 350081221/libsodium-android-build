package org.apache.http.entity;

import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public abstract class AbstractHttpEntity implements HttpEntity {
    protected boolean chunked;
    protected Header contentEncoding;
    protected Header contentType;

    @Override // org.apache.http.HttpEntity
    public Header getContentType() {
        return this.contentType;
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentEncoding() {
        return this.contentEncoding;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isChunked() {
        return this.chunked;
    }

    public void setContentType(Header contentType) {
        this.contentType = contentType;
    }

    public void setContentType(String ctString) {
        Header h5 = null;
        if (ctString != null) {
            h5 = new BasicHeader(HTTP.CONTENT_TYPE, ctString);
        }
        setContentType(h5);
    }

    public void setContentEncoding(Header contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    public void setContentEncoding(String ceString) {
        Header h5 = null;
        if (ceString != null) {
            h5 = new BasicHeader(HTTP.CONTENT_ENCODING, ceString);
        }
        setContentEncoding(h5);
    }

    public void setChunked(boolean b5) {
        this.chunked = b5;
    }

    @Override // org.apache.http.HttpEntity
    public void consumeContent() throws IOException, UnsupportedOperationException {
        if (isStreaming()) {
            throw new UnsupportedOperationException("streaming entity does not implement consumeContent()");
        }
    }
}
