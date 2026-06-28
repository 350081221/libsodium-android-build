package com.android.dx.cf.attrib;

import com.android.dx.rop.cst.CstString;

/* loaded from: classes2.dex */
public final class AttSourceDebugExtension extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "SourceDebugExtension";
    private final CstString smapString;

    public AttSourceDebugExtension(CstString cstString) {
        super(ATTRIBUTE_NAME);
        if (cstString != null) {
            this.smapString = cstString;
            return;
        }
        throw new NullPointerException("smapString == null");
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
        return this.smapString.getUtf8Size() + 6;
    }

    public CstString getSmapString() {
        return this.smapString;
    }
}
