package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class StringEntity extends AbstractHttpEntity implements Cloneable {
    protected final byte[] content;

    public StringEntity(String s5, String charset) throws UnsupportedEncodingException {
        if (s5 == null) {
            throw new IllegalArgumentException("Source string may not be null");
        }
        charset = charset == null ? "ISO-8859-1" : charset;
        this.content = s5.getBytes(charset);
        setContentType("text/plain; charset=" + charset);
    }

    public StringEntity(String s5) throws UnsupportedEncodingException {
        this(s5, null);
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.content.length;
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() throws IOException {
        return new ByteArrayInputStream(this.content);
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outstream) throws IOException {
        if (outstream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        outstream.write(this.content);
        outstream.flush();
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return false;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
