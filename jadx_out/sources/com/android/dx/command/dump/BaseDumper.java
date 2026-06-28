package com.android.dx.command.dump;

import com.android.dx.cf.code.ConcreteMethod;
import com.android.dx.cf.iface.Member;
import com.android.dx.cf.iface.ParseObserver;
import com.android.dx.dex.DexOptions;
import com.android.dx.util.ByteArray;
import com.android.dx.util.Hex;
import com.android.dx.util.IndentingWriter;
import com.android.dx.util.TwoColumnOutput;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public abstract class BaseDumper implements ParseObserver {
    protected Args args;
    private final byte[] bytes;
    protected final DexOptions dexOptions;
    private final String filePath;
    private final int hexCols;
    private int indent;
    private final PrintStream out;
    private final boolean rawBytes;
    private int readBytes;
    private String separator;
    private final boolean strictParse;
    private final int width;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r1 > 10) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BaseDumper(byte[] r1, java.io.PrintStream r2, java.lang.String r3, com.android.dx.command.dump.Args r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.bytes = r1
            boolean r1 = r4.rawBytes
            r0.rawBytes = r1
            r0.out = r2
            int r2 = r4.width
            if (r2 > 0) goto L11
            r2 = 79
        L11:
            r0.width = r2
            r0.filePath = r3
            boolean r3 = r4.strictParse
            r0.strictParse = r3
            r3 = 0
            r0.indent = r3
            if (r1 == 0) goto L22
            java.lang.String r1 = "|"
            goto L24
        L22:
            java.lang.String r1 = ""
        L24:
            r0.separator = r1
            r0.readBytes = r3
            r0.args = r4
            com.android.dx.dex.DexOptions r1 = new com.android.dx.dex.DexOptions
            r1.<init>()
            r0.dexOptions = r1
            int r2 = r2 + (-5)
            int r2 = r2 / 15
            int r2 = r2 + 1
            r1 = r2 & (-2)
            r2 = 6
            if (r1 >= r2) goto L3e
        L3c:
            r1 = r2
            goto L43
        L3e:
            r2 = 10
            if (r1 <= r2) goto L43
            goto L3c
        L43:
            r0.hexCols = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.dx.command.dump.BaseDumper.<init>(byte[], java.io.PrintStream, java.lang.String, com.android.dx.command.dump.Args):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeParamWidth(ConcreteMethod concreteMethod, boolean z4) {
        return concreteMethod.getEffectiveDescriptor().getParameterTypes().getWordCount();
    }

    @Override // com.android.dx.cf.iface.ParseObserver
    public void changeIndent(int i5) {
        String str;
        this.indent += i5;
        if (this.rawBytes) {
            str = HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
        } else {
            str = "";
        }
        this.separator = str;
        for (int i6 = 0; i6 < this.indent; i6++) {
            this.separator += "  ";
        }
    }

    @Override // com.android.dx.cf.iface.ParseObserver
    public void endParsingMember(ByteArray byteArray, int i5, String str, String str2, Member member) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final byte[] getBytes() {
        return this.bytes;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String getFilePath() {
        return this.filePath;
    }

    protected final boolean getRawBytes() {
        return this.rawBytes;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getReadBytes() {
        return this.readBytes;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean getStrictParse() {
        return this.strictParse;
    }

    protected final int getWidth1() {
        if (this.rawBytes) {
            int i5 = this.hexCols;
            return (i5 * 2) + 5 + (i5 / 2);
        }
        return 0;
    }

    protected final int getWidth2() {
        int i5;
        if (this.rawBytes) {
            i5 = getWidth1() + 1;
        } else {
            i5 = 0;
        }
        return (this.width - i5) - (this.indent * 2);
    }

    protected final String hexDump(int i5, int i6) {
        return Hex.dump(this.bytes, i5, i6, i5, this.hexCols, 4);
    }

    @Override // com.android.dx.cf.iface.ParseObserver
    public void parsed(ByteArray byteArray, int i5, int i6, String str) {
        String str2;
        int underlyingOffset = byteArray.underlyingOffset(i5);
        if (getRawBytes()) {
            str2 = hexDump(underlyingOffset, i6);
        } else {
            str2 = "";
        }
        print(twoColumns(str2, str));
        this.readBytes += i6;
    }

    protected final void print(String str) {
        this.out.print(str);
    }

    protected final void println(String str) {
        this.out.println(str);
    }

    @Override // com.android.dx.cf.iface.ParseObserver
    public void startParsingMember(ByteArray byteArray, int i5, String str, String str2) {
    }

    protected final String twoColumns(String str, String str2) {
        int width1 = getWidth1();
        int width2 = getWidth2();
        try {
            if (width1 == 0) {
                int length = str2.length();
                StringWriter stringWriter = new StringWriter(length * 2);
                IndentingWriter indentingWriter = new IndentingWriter(stringWriter, width2, this.separator);
                indentingWriter.write(str2);
                if (length == 0 || str2.charAt(length - 1) != '\n') {
                    indentingWriter.write(10);
                }
                indentingWriter.flush();
                return stringWriter.toString();
            }
            return TwoColumnOutput.toString(str, width1, this.separator, str2, width2);
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }
}
