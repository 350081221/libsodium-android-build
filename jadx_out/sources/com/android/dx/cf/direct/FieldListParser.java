package com.android.dx.cf.direct;

import com.android.dx.cf.iface.AttributeList;
import com.android.dx.cf.iface.Member;
import com.android.dx.cf.iface.StdField;
import com.android.dx.cf.iface.StdFieldList;
import com.android.dx.rop.code.AccessFlags;
import com.android.dx.rop.cst.CstNat;
import com.android.dx.rop.cst.CstType;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FieldListParser extends MemberListParser {
    private final StdFieldList fields;

    public FieldListParser(DirectClassFile directClassFile, CstType cstType, int i5, AttributeFactory attributeFactory) {
        super(directClassFile, cstType, i5, attributeFactory);
        this.fields = new StdFieldList(getCount());
    }

    @Override // com.android.dx.cf.direct.MemberListParser
    protected int getAttributeContext() {
        return 1;
    }

    public StdFieldList getList() {
        parseIfNecessary();
        return this.fields;
    }

    @Override // com.android.dx.cf.direct.MemberListParser
    protected String humanAccessFlags(int i5) {
        return AccessFlags.fieldString(i5);
    }

    @Override // com.android.dx.cf.direct.MemberListParser
    protected String humanName() {
        return "field";
    }

    @Override // com.android.dx.cf.direct.MemberListParser
    protected Member set(int i5, int i6, CstNat cstNat, AttributeList attributeList) {
        StdField stdField = new StdField(getDefiner(), i6, cstNat, attributeList);
        this.fields.set(i5, stdField);
        return stdField;
    }
}
