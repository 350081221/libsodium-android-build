package com.android.dx.util;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes2.dex */
public final class IndentingWriter extends FilterWriter {
    private boolean collectingIndent;
    private int column;
    private int indent;
    private final int maxIndent;
    private final String prefix;
    private final int width;

    public IndentingWriter(Writer writer, int i5, String str) {
        super(writer);
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("width < 0");
        }
        if (str != null) {
            this.width = i5 != 0 ? i5 : Integer.MAX_VALUE;
            this.maxIndent = i5 >> 1;
            this.prefix = str.length() == 0 ? null : str;
            bol();
            return;
        }
        throw new NullPointerException("prefix == null");
    }

    private void bol() {
        boolean z4;
        this.column = 0;
        if (this.maxIndent != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.collectingIndent = z4;
        this.indent = 0;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i5) throws IOException {
        int i6;
        synchronized (((FilterWriter) this).lock) {
            int i7 = 0;
            if (this.collectingIndent) {
                if (i5 == 32) {
                    int i8 = this.indent + 1;
                    this.indent = i8;
                    int i9 = this.maxIndent;
                    if (i8 >= i9) {
                        this.indent = i9;
                        this.collectingIndent = false;
                    }
                } else {
                    this.collectingIndent = false;
                }
            }
            if (this.column == this.width && i5 != 10) {
                ((FilterWriter) this).out.write(10);
                this.column = 0;
            }
            if (this.column == 0) {
                String str = this.prefix;
                if (str != null) {
                    ((FilterWriter) this).out.write(str);
                }
                if (!this.collectingIndent) {
                    while (true) {
                        i6 = this.indent;
                        if (i7 >= i6) {
                            break;
                        }
                        ((FilterWriter) this).out.write(32);
                        i7++;
                    }
                    this.column = i6;
                }
            }
            ((FilterWriter) this).out.write(i5);
            if (i5 == 10) {
                bol();
            } else {
                this.column++;
            }
        }
    }

    public IndentingWriter(Writer writer, int i5) {
        this(writer, i5, "");
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i5, int i6) throws IOException {
        synchronized (((FilterWriter) this).lock) {
            while (i6 > 0) {
                write(cArr[i5]);
                i5++;
                i6--;
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i5, int i6) throws IOException {
        synchronized (((FilterWriter) this).lock) {
            while (i6 > 0) {
                write(str.charAt(i5));
                i5++;
                i6--;
            }
        }
    }
}
