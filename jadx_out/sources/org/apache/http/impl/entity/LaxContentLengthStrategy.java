package org.apache.http.impl.entity;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class LaxContentLengthStrategy implements ContentLengthStrategy {
    @Override // org.apache.http.entity.ContentLengthStrategy
    public long determineLength(HttpMessage message) throws HttpException {
        if (message == null) {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
        HttpParams params = message.getParams();
        boolean strict = params.isParameterTrue(CoreProtocolPNames.STRICT_TRANSFER_ENCODING);
        Header transferEncodingHeader = message.getFirstHeader(HTTP.TRANSFER_ENCODING);
        Header contentLengthHeader = message.getFirstHeader(HTTP.CONTENT_LEN);
        if (transferEncodingHeader != null) {
            try {
                HeaderElement[] encodings = transferEncodingHeader.getElements();
                if (strict) {
                    for (HeaderElement headerElement : encodings) {
                        String encoding = headerElement.getName();
                        if (encoding != null && encoding.length() > 0 && !encoding.equalsIgnoreCase(HTTP.CHUNK_CODING) && !encoding.equalsIgnoreCase(HTTP.IDENTITY_CODING)) {
                            throw new ProtocolException("Unsupported transfer encoding: " + encoding);
                        }
                    }
                }
                int i5 = encodings.length;
                if (HTTP.IDENTITY_CODING.equalsIgnoreCase(transferEncodingHeader.getValue())) {
                    return -1L;
                }
                if (i5 > 0 && HTTP.CHUNK_CODING.equalsIgnoreCase(encodings[i5 - 1].getName())) {
                    return -2L;
                }
                if (!strict) {
                    return -1L;
                }
                throw new ProtocolException("Chunk-encoding must be the last one applied");
            } catch (ParseException px) {
                throw new ProtocolException("Invalid Transfer-Encoding header value: " + transferEncodingHeader, px);
            }
        }
        if (contentLengthHeader == null) {
            return -1L;
        }
        long contentlen = -1;
        Header[] headers = message.getHeaders(HTTP.CONTENT_LEN);
        if (!strict || headers.length <= 1) {
            int i6 = headers.length - 1;
            while (true) {
                int i7 = i6;
                if (i7 < 0) {
                    break;
                }
                Header header = headers[i7];
                try {
                    contentlen = Long.parseLong(header.getValue());
                    break;
                } catch (NumberFormatException e5) {
                    if (strict) {
                        throw new ProtocolException("Invalid content length: " + header.getValue());
                    }
                    i6 = i7 - 1;
                }
            }
            if (contentlen < 0) {
                return -1L;
            }
            return contentlen;
        }
        throw new ProtocolException("Multiple content length headers");
    }
}
