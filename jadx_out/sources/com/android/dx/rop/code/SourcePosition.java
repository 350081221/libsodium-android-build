package com.android.dx.rop.code;

import com.android.dx.rop.cst.CstString;
import com.android.dx.util.Hex;

/* loaded from: classes2.dex */
public final class SourcePosition {
    public static final SourcePosition NO_INFO = new SourcePosition(null, -1, -1);
    private final int address;
    private final int line;
    private final CstString sourceFile;

    public SourcePosition(CstString cstString, int i5, int i6) {
        if (i5 >= -1) {
            if (i6 >= -1) {
                this.sourceFile = cstString;
                this.address = i5;
                this.line = i6;
                return;
            }
            throw new IllegalArgumentException("line < -1");
        }
        throw new IllegalArgumentException("address < -1");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SourcePosition)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        SourcePosition sourcePosition = (SourcePosition) obj;
        if (this.address != sourcePosition.address || !sameLineAndFile(sourcePosition)) {
            return false;
        }
        return true;
    }

    public int getAddress() {
        return this.address;
    }

    public int getLine() {
        return this.line;
    }

    public CstString getSourceFile() {
        return this.sourceFile;
    }

    public int hashCode() {
        return this.sourceFile.hashCode() + this.address + this.line;
    }

    public boolean sameLine(SourcePosition sourcePosition) {
        return this.line == sourcePosition.line;
    }

    public boolean sameLineAndFile(SourcePosition sourcePosition) {
        CstString cstString;
        CstString cstString2;
        if (this.line == sourcePosition.line && ((cstString = this.sourceFile) == (cstString2 = sourcePosition.sourceFile) || (cstString != null && cstString.equals(cstString2)))) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(50);
        CstString cstString = this.sourceFile;
        if (cstString != null) {
            sb.append(cstString.toHuman());
            sb.append(":");
        }
        int i5 = this.line;
        if (i5 >= 0) {
            sb.append(i5);
        }
        sb.append('@');
        int i6 = this.address;
        if (i6 < 0) {
            sb.append("????");
        } else {
            sb.append(Hex.u2(i6));
        }
        return sb.toString();
    }
}
