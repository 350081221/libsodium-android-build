package com.lody.virtual.helper.utils;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import kotlin.text.k0;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes3.dex */
public class FastXmlSerializer implements XmlSerializer {
    private static final int BUFFER_LEN = 8192;
    private static final String[] ESCAPE_TABLE = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};
    private static String sSpace = "                                                              ";
    private CharsetEncoder mCharset;
    private boolean mInTag;
    private OutputStream mOutputStream;
    private int mPos;
    private Writer mWriter;
    private final char[] mText = new char[8192];
    private ByteBuffer mBytes = ByteBuffer.allocate(8192);
    private boolean mIndent = false;
    private int mNesting = 0;
    private boolean mLineStart = true;

    private void append(char c5) throws IOException {
        int i5 = this.mPos;
        if (i5 >= 8191) {
            flush();
            i5 = this.mPos;
        }
        this.mText[i5] = c5;
        this.mPos = i5 + 1;
    }

    private void appendIndent(int i5) throws IOException {
        int i6 = i5 * 4;
        if (i6 > sSpace.length()) {
            i6 = sSpace.length();
        }
        append(sSpace, 0, i6);
    }

    private void escapeAndAppendString(String str) throws IOException {
        String str2;
        int length = str.length();
        String[] strArr = ESCAPE_TABLE;
        char length2 = (char) strArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            char charAt = str.charAt(i5);
            if (charAt < length2 && (str2 = strArr[charAt]) != null) {
                if (i6 < i5) {
                    append(str, i6, i5 - i6);
                }
                i6 = i5 + 1;
                append(str2);
            }
            i5++;
        }
        if (i6 < i5) {
            append(str, i6, i5 - i6);
        }
    }

    private void flushBytes() throws IOException {
        int position = this.mBytes.position();
        if (position > 0) {
            this.mBytes.flip();
            this.mOutputStream.write(this.mBytes.array(), 0, position);
            this.mBytes.clear();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer attribute(String str, String str2, String str3) throws IOException, IllegalArgumentException, IllegalStateException {
        append(' ');
        if (str != null) {
            append(str);
            append(':');
        }
        append(str2);
        append("=\"");
        escapeAndAppendString(str3);
        append(k0.f19765b);
        this.mLineStart = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void cdsect(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void comment(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void docdecl(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void endDocument() throws IOException, IllegalArgumentException, IllegalStateException {
        flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer endTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        int i5 = this.mNesting - 1;
        this.mNesting = i5;
        if (this.mInTag) {
            append(" />\n");
        } else {
            if (this.mIndent && this.mLineStart) {
                appendIndent(i5);
            }
            append("</");
            if (str != null) {
                append(str);
                append(':');
            }
            append(str2);
            append(">\n");
        }
        this.mLineStart = true;
        this.mInTag = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void entityRef(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void flush() throws IOException {
        int i5 = this.mPos;
        if (i5 > 0) {
            if (this.mOutputStream != null) {
                CharBuffer wrap = CharBuffer.wrap(this.mText, 0, i5);
                CoderResult encode = this.mCharset.encode(wrap, this.mBytes, true);
                while (!encode.isError()) {
                    if (encode.isOverflow()) {
                        flushBytes();
                        encode = this.mCharset.encode(wrap, this.mBytes, true);
                    } else {
                        flushBytes();
                        this.mOutputStream.flush();
                    }
                }
                throw new IOException(encode.toString());
            }
            this.mWriter.write(this.mText, 0, i5);
            this.mWriter.flush();
            this.mPos = 0;
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public int getDepth() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getName() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getNamespace() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getPrefix(String str, boolean z4) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void ignorableWhitespace(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void processingInstruction(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setFeature(String str, boolean z4) throws IllegalArgumentException, IllegalStateException {
        if (str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            this.mIndent = true;
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(OutputStream outputStream, String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (outputStream != null) {
            try {
                this.mCharset = Charset.forName(str).newEncoder();
                this.mOutputStream = outputStream;
                return;
            } catch (IllegalCharsetNameException e5) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e5));
            } catch (UnsupportedCharsetException e6) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e6));
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setPrefix(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setProperty(String str, Object obj) throws IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void startDocument(String str, Boolean bool) throws IOException, IllegalArgumentException, IllegalStateException {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version='1.0' encoding='utf-8' standalone='");
        if (bool.booleanValue()) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        sb.append(str2);
        sb.append("' ?>\n");
        append(sb.toString());
        this.mLineStart = true;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer startTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.mInTag) {
            append(">\n");
        }
        if (this.mIndent) {
            appendIndent(this.mNesting);
        }
        this.mNesting++;
        append(k0.f19768e);
        if (str != null) {
            append(str);
            append(':');
        }
        append(str2);
        this.mInTag = true;
        this.mLineStart = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(char[] cArr, int i5, int i6) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.mInTag) {
            append(">");
            this.mInTag = false;
        }
        escapeAndAppendString(cArr, i5, i6);
        if (this.mIndent) {
            this.mLineStart = cArr[(i5 + i6) - 1] == '\n';
        }
        return this;
    }

    private void append(String str, int i5, int i6) throws IOException {
        if (i6 > 8192) {
            int i7 = i6 + i5;
            while (i5 < i7) {
                int i8 = i5 + 8192;
                append(str, i5, i8 < i7 ? 8192 : i7 - i5);
                i5 = i8;
            }
            return;
        }
        int i9 = this.mPos;
        if (i9 + i6 > 8192) {
            flush();
            i9 = this.mPos;
        }
        str.getChars(i5, i5 + i6, this.mText, i9);
        this.mPos = i9 + i6;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        boolean z4 = false;
        if (this.mInTag) {
            append(">");
            this.mInTag = false;
        }
        escapeAndAppendString(str);
        if (this.mIndent) {
            if (str.length() > 0 && str.charAt(str.length() - 1) == '\n') {
                z4 = true;
            }
            this.mLineStart = z4;
        }
        return this;
    }

    private void escapeAndAppendString(char[] cArr, int i5, int i6) throws IOException {
        String str;
        String[] strArr = ESCAPE_TABLE;
        char length = (char) strArr.length;
        int i7 = i6 + i5;
        int i8 = i5;
        while (i5 < i7) {
            char c5 = cArr[i5];
            if (c5 < length && (str = strArr[c5]) != null) {
                if (i8 < i5) {
                    append(cArr, i8, i5 - i8);
                }
                i8 = i5 + 1;
                append(str);
            }
            i5++;
        }
        if (i8 < i5) {
            append(cArr, i8, i5 - i8);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(Writer writer) throws IOException, IllegalArgumentException, IllegalStateException {
        this.mWriter = writer;
    }

    private void append(char[] cArr, int i5, int i6) throws IOException {
        if (i6 > 8192) {
            int i7 = i6 + i5;
            while (i5 < i7) {
                int i8 = i5 + 8192;
                append(cArr, i5, i8 < i7 ? 8192 : i7 - i5);
                i5 = i8;
            }
            return;
        }
        int i9 = this.mPos;
        if (i9 + i6 > 8192) {
            flush();
            i9 = this.mPos;
        }
        System.arraycopy(cArr, i5, this.mText, i9, i6);
        this.mPos = i9 + i6;
    }

    private void append(String str) throws IOException {
        append(str, 0, str.length());
    }
}
