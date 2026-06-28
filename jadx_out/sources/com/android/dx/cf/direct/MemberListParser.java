package com.android.dx.cf.direct;

import com.android.dx.cf.iface.AttributeList;
import com.android.dx.cf.iface.Member;
import com.android.dx.cf.iface.ParseException;
import com.android.dx.cf.iface.ParseObserver;
import com.android.dx.cf.iface.StdAttributeList;
import com.android.dx.rop.cst.ConstantPool;
import com.android.dx.rop.cst.CstNat;
import com.android.dx.rop.cst.CstString;
import com.android.dx.rop.cst.CstType;
import com.android.dx.util.ByteArray;
import com.android.dx.util.Hex;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class MemberListParser {
    private final AttributeFactory attributeFactory;
    private final DirectClassFile cf;
    private final CstType definer;
    private int endOffset;
    private ParseObserver observer;
    private final int offset;

    public MemberListParser(DirectClassFile directClassFile, CstType cstType, int i5, AttributeFactory attributeFactory) {
        if (directClassFile != null) {
            if (i5 >= 0) {
                if (attributeFactory != null) {
                    this.cf = directClassFile;
                    this.definer = cstType;
                    this.offset = i5;
                    this.attributeFactory = attributeFactory;
                    this.endOffset = -1;
                    return;
                }
                throw new NullPointerException("attributeFactory == null");
            }
            throw new IllegalArgumentException("offset < 0");
        }
        throw new NullPointerException("cf == null");
    }

    private void parse() {
        int i5;
        ConstantPool constantPool;
        char c5;
        int attributeContext = getAttributeContext();
        int count = getCount();
        int i6 = this.offset + 2;
        ByteArray bytes = this.cf.getBytes();
        ConstantPool constantPool2 = this.cf.getConstantPool();
        ParseObserver parseObserver = this.observer;
        if (parseObserver != null) {
            parseObserver.parsed(bytes, this.offset, 2, humanName() + "s_count: " + Hex.u2(count));
        }
        int i7 = 0;
        while (i7 < count) {
            try {
                int unsignedShort = bytes.getUnsignedShort(i6);
                int i8 = i6 + 2;
                int unsignedShort2 = bytes.getUnsignedShort(i8);
                int i9 = i6 + 4;
                int unsignedShort3 = bytes.getUnsignedShort(i9);
                CstString cstString = (CstString) constantPool2.get(unsignedShort2);
                CstString cstString2 = (CstString) constantPool2.get(unsignedShort3);
                ParseObserver parseObserver2 = this.observer;
                int i10 = count;
                if (parseObserver2 != null) {
                    constantPool = constantPool2;
                    parseObserver2.startParsingMember(bytes, i6, cstString.getString(), cstString2.getString());
                    this.observer.parsed(bytes, i6, 0, "\n" + humanName() + "s[" + i7 + "]:\n");
                    this.observer.changeIndent(1);
                    ParseObserver parseObserver3 = this.observer;
                    StringBuilder sb = new StringBuilder();
                    sb.append("access_flags: ");
                    sb.append(humanAccessFlags(unsignedShort));
                    parseObserver3.parsed(bytes, i6, 2, sb.toString());
                    this.observer.parsed(bytes, i8, 2, "name: " + cstString.toHuman());
                    c5 = 2;
                    this.observer.parsed(bytes, i9, 2, "descriptor: " + cstString2.toHuman());
                } else {
                    constantPool = constantPool2;
                    c5 = 2;
                }
                AttributeListParser attributeListParser = new AttributeListParser(this.cf, attributeContext, i6 + 6, this.attributeFactory);
                attributeListParser.setObserver(this.observer);
                i6 = attributeListParser.getEndOffset();
                StdAttributeList list = attributeListParser.getList();
                list.setImmutable();
                Member member = set(i7, unsignedShort, new CstNat(cstString, cstString2), list);
                ParseObserver parseObserver4 = this.observer;
                if (parseObserver4 != null) {
                    parseObserver4.changeIndent(-1);
                    this.observer.parsed(bytes, i6, 0, "end " + humanName() + "s[" + i7 + "]\n");
                    i5 = i7;
                    try {
                        this.observer.endParsingMember(bytes, i6, cstString.getString(), cstString2.getString(), member);
                    } catch (ParseException e5) {
                        e = e5;
                        e.addContext("...while parsing " + humanName() + "s[" + i5 + "]");
                        throw e;
                    } catch (RuntimeException e6) {
                        e = e6;
                        ParseException parseException = new ParseException(e);
                        parseException.addContext("...while parsing " + humanName() + "s[" + i5 + "]");
                        throw parseException;
                    }
                } else {
                    i5 = i7;
                }
                i7 = i5 + 1;
                count = i10;
                constantPool2 = constantPool;
            } catch (ParseException e7) {
                e = e7;
                i5 = i7;
            } catch (RuntimeException e8) {
                e = e8;
                i5 = i7;
            }
        }
        this.endOffset = i6;
    }

    protected abstract int getAttributeContext();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getCount() {
        return this.cf.getBytes().getUnsignedShort(this.offset);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final CstType getDefiner() {
        return this.definer;
    }

    public int getEndOffset() {
        parseIfNecessary();
        return this.endOffset;
    }

    protected abstract String humanAccessFlags(int i5);

    protected abstract String humanName();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void parseIfNecessary() {
        if (this.endOffset < 0) {
            parse();
        }
    }

    protected abstract Member set(int i5, int i6, CstNat cstNat, AttributeList attributeList);

    public final void setObserver(ParseObserver parseObserver) {
        this.observer = parseObserver;
    }
}
