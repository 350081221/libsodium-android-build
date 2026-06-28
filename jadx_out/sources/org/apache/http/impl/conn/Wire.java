package org.apache.http.impl.conn;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.text.k0;
import org.apache.commons.logging.Log;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class Wire {
    private final Log log;

    public Wire(Log log) {
        this.log = log;
    }

    private void wire(String header, InputStream instream) throws IOException {
        StringBuilder buffer = new StringBuilder();
        while (true) {
            int ch = instream.read();
            if (ch == -1) {
                break;
            }
            if (ch == 13) {
                buffer.append("[\\r]");
            } else if (ch == 10) {
                buffer.append("[\\n]\"");
                buffer.insert(0, "\"");
                buffer.insert(0, header);
                this.log.debug(buffer.toString());
                buffer.setLength(0);
            } else if (ch < 32 || ch > 127) {
                buffer.append("[0x");
                buffer.append(Integer.toHexString(ch));
                buffer.append("]");
            } else {
                buffer.append((char) ch);
            }
        }
        if (buffer.length() > 0) {
            buffer.append(k0.f19765b);
            buffer.insert(0, k0.f19765b);
            buffer.insert(0, header);
            this.log.debug(buffer.toString());
        }
    }

    public boolean enabled() {
        return this.log.isDebugEnabled();
    }

    public void output(InputStream outstream) throws IOException {
        if (outstream == null) {
            throw new IllegalArgumentException("Output may not be null");
        }
        wire(">> ", outstream);
    }

    public void input(InputStream instream) throws IOException {
        if (instream == null) {
            throw new IllegalArgumentException("Input may not be null");
        }
        wire("<< ", instream);
    }

    public void output(byte[] b5, int off, int len) throws IOException {
        if (b5 == null) {
            throw new IllegalArgumentException("Output may not be null");
        }
        wire(">> ", new ByteArrayInputStream(b5, off, len));
    }

    public void input(byte[] b5, int off, int len) throws IOException {
        if (b5 == null) {
            throw new IllegalArgumentException("Input may not be null");
        }
        wire("<< ", new ByteArrayInputStream(b5, off, len));
    }

    public void output(byte[] b5) throws IOException {
        if (b5 == null) {
            throw new IllegalArgumentException("Output may not be null");
        }
        wire(">> ", new ByteArrayInputStream(b5));
    }

    public void input(byte[] b5) throws IOException {
        if (b5 == null) {
            throw new IllegalArgumentException("Input may not be null");
        }
        wire("<< ", new ByteArrayInputStream(b5));
    }

    public void output(int b5) throws IOException {
        output(new byte[]{(byte) b5});
    }

    public void input(int b5) throws IOException {
        input(new byte[]{(byte) b5});
    }

    public void output(String s5) throws IOException {
        if (s5 == null) {
            throw new IllegalArgumentException("Output may not be null");
        }
        output(s5.getBytes());
    }

    public void input(String s5) throws IOException {
        if (s5 == null) {
            throw new IllegalArgumentException("Input may not be null");
        }
        input(s5.getBytes());
    }
}
