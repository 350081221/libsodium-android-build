package com.android.internal.http.multipart;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EncodingUtils;

/* loaded from: assets/org.apache.http.legacy.boot */
public class MultipartEntity extends AbstractHttpEntity {
    public static final String MULTIPART_BOUNDARY = "http.method.multipart.boundary";
    private static final String MULTIPART_FORM_CONTENT_TYPE = "multipart/form-data";
    private boolean contentConsumed = false;
    private byte[] multipartBoundary;
    private HttpParams params;
    protected Part[] parts;
    private static final Log log = LogFactory.getLog(MultipartEntity.class);
    private static byte[] MULTIPART_CHARS = EncodingUtils.getAsciiBytes("-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");

    private static byte[] generateMultipartBoundary() {
        Random rand = new Random();
        byte[] bytes = new byte[rand.nextInt(11) + 30];
        for (int i5 = 0; i5 < bytes.length; i5++) {
            bytes[i5] = MULTIPART_CHARS[rand.nextInt(MULTIPART_CHARS.length)];
        }
        return bytes;
    }

    public MultipartEntity(Part[] parts, HttpParams params) {
        if (parts == null) {
            throw new IllegalArgumentException("parts cannot be null");
        }
        if (params == null) {
            throw new IllegalArgumentException("params cannot be null");
        }
        this.parts = parts;
        this.params = params;
    }

    public MultipartEntity(Part[] parts) {
        setContentType(MULTIPART_FORM_CONTENT_TYPE);
        if (parts == null) {
            throw new IllegalArgumentException("parts cannot be null");
        }
        this.parts = parts;
        this.params = null;
    }

    protected byte[] getMultipartBoundary() {
        if (this.multipartBoundary == null) {
            String temp = null;
            if (this.params != null) {
                temp = (String) this.params.getParameter(MULTIPART_BOUNDARY);
            }
            if (temp != null) {
                this.multipartBoundary = EncodingUtils.getAsciiBytes(temp);
            } else {
                this.multipartBoundary = generateMultipartBoundary();
            }
        }
        return this.multipartBoundary;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        for (int i5 = 0; i5 < this.parts.length; i5++) {
            if (!this.parts[i5].isRepeatable()) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream out) throws IOException {
        Part.sendParts(out, this.parts, getMultipartBoundary());
    }

    @Override // org.apache.http.entity.AbstractHttpEntity, org.apache.http.HttpEntity
    public Header getContentType() {
        StringBuffer buffer = new StringBuffer(MULTIPART_FORM_CONTENT_TYPE);
        buffer.append("; boundary=");
        buffer.append(EncodingUtils.getAsciiString(getMultipartBoundary()));
        return new BasicHeader(HTTP.CONTENT_TYPE, buffer.toString());
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        try {
            return Part.getLengthOfParts(this.parts, getMultipartBoundary());
        } catch (Exception e5) {
            log.error("An exception occurred while getting the length of the parts", e5);
            return 0L;
        }
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() throws IOException, IllegalStateException {
        if (!isRepeatable() && this.contentConsumed) {
            throw new IllegalStateException("Content has been consumed");
        }
        this.contentConsumed = true;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Part.sendParts(baos, this.parts, this.multipartBoundary);
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        return bais;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return false;
    }
}
