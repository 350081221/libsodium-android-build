package com.android.dx.cf.cst;

import com.android.dx.cf.iface.ParseException;
import com.android.dx.cf.iface.ParseObserver;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstDouble;
import com.android.dx.rop.cst.CstFieldRef;
import com.android.dx.rop.cst.CstFloat;
import com.android.dx.rop.cst.CstInteger;
import com.android.dx.rop.cst.CstInterfaceMethodRef;
import com.android.dx.rop.cst.CstInvokeDynamic;
import com.android.dx.rop.cst.CstLong;
import com.android.dx.rop.cst.CstMethodHandle;
import com.android.dx.rop.cst.CstMethodRef;
import com.android.dx.rop.cst.CstNat;
import com.android.dx.rop.cst.CstProtoRef;
import com.android.dx.rop.cst.CstString;
import com.android.dx.rop.cst.CstType;
import com.android.dx.rop.cst.StdConstantPool;
import com.android.dx.rop.type.Type;
import com.android.dx.util.ByteArray;
import com.android.dx.util.Hex;
import java.util.BitSet;

/* loaded from: classes2.dex */
public final class ConstantPoolParser {
    private final ByteArray bytes;
    private int endOffset;
    private ParseObserver observer;
    private final int[] offsets;
    private final StdConstantPool pool;

    public ConstantPoolParser(ByteArray byteArray) {
        int unsignedShort = byteArray.getUnsignedShort(8);
        this.bytes = byteArray;
        this.pool = new StdConstantPool(unsignedShort);
        this.offsets = new int[unsignedShort];
        this.endOffset = -1;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0011. Please report as an issue. */
    private void determineOffsets() {
        int i5;
        int i6 = 10;
        int i7 = 1;
        while (true) {
            int[] iArr = this.offsets;
            if (i7 < iArr.length) {
                iArr[i7] = i6;
                int unsignedByte = this.bytes.getUnsignedByte(i6);
                switch (unsignedByte) {
                    case 1:
                        i6 += this.bytes.getUnsignedShort(i6 + 1) + 3;
                        i5 = 1;
                        i7 += i5;
                    case 2:
                    case 13:
                    case 14:
                    case 17:
                    default:
                        throw new ParseException("unknown tag byte: " + Hex.u1(unsignedByte));
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 18:
                        i6 += 5;
                        i5 = 1;
                        i7 += i5;
                    case 5:
                    case 6:
                        i6 += 9;
                        i5 = 2;
                        i7 += i5;
                    case 7:
                    case 8:
                    case 16:
                        i6 += 3;
                        i5 = 1;
                        i7 += i5;
                    case 15:
                        try {
                            i6 += 4;
                            i5 = 1;
                            i7 += i5;
                        } catch (ParseException e5) {
                            e5.addContext("...while preparsing cst " + Hex.u2(i7) + " at offset " + Hex.u4(i6));
                            throw e5;
                        }
                }
            } else {
                this.endOffset = i6;
                return;
            }
        }
    }

    private static int getMethodHandleTypeForKind(int i5) {
        switch (i5) {
            case 1:
                return 3;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 0;
            case 5:
                return 5;
            case 6:
                return 4;
            case 7:
                return 7;
            case 8:
                return 6;
            case 9:
                return 8;
            default:
                throw new IllegalArgumentException("invalid kind: " + i5);
        }
    }

    private void parse() {
        String str;
        determineOffsets();
        ParseObserver parseObserver = this.observer;
        if (parseObserver != null) {
            parseObserver.parsed(this.bytes, 8, 2, "constant_pool_count: " + Hex.u2(this.offsets.length));
            this.observer.parsed(this.bytes, 10, 0, "\nconstant_pool:");
            this.observer.changeIndent(1);
        }
        BitSet bitSet = new BitSet(this.offsets.length);
        int i5 = 1;
        while (true) {
            int[] iArr = this.offsets;
            if (i5 >= iArr.length) {
                break;
            }
            if (iArr[i5] != 0 && this.pool.getOrNull(i5) == null) {
                parse0(i5, bitSet);
            }
            i5++;
        }
        if (this.observer != null) {
            for (int i6 = 1; i6 < this.offsets.length; i6++) {
                Constant orNull = this.pool.getOrNull(i6);
                if (orNull != null) {
                    int i7 = this.offsets[i6];
                    int i8 = this.endOffset;
                    int i9 = i6 + 1;
                    while (true) {
                        int[] iArr2 = this.offsets;
                        if (i9 >= iArr2.length) {
                            break;
                        }
                        int i10 = iArr2[i9];
                        if (i10 != 0) {
                            i8 = i10;
                            break;
                        }
                        i9++;
                    }
                    if (bitSet.get(i6)) {
                        str = Hex.u2(i6) + ": utf8{\"" + orNull.toHuman() + "\"}";
                    } else {
                        str = Hex.u2(i6) + ": " + orNull.toString();
                    }
                    this.observer.parsed(this.bytes, i7, i8 - i7, str);
                }
            }
            this.observer.changeIndent(-1);
            this.observer.parsed(this.bytes, this.endOffset, 0, "end constant_pool");
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0017. Please report as an issue. */
    private Constant parse0(int i5, BitSet bitSet) {
        Constant parseUtf8;
        Constant make;
        Constant cstFieldRef;
        Constant constant;
        Constant orNull = this.pool.getOrNull(i5);
        if (orNull != null) {
            return orNull;
        }
        int i6 = this.offsets[i5];
        try {
            int unsignedByte = this.bytes.getUnsignedByte(i6);
            switch (unsignedByte) {
                case 1:
                    parseUtf8 = parseUtf8(i6);
                    bitSet.set(i5);
                    make = parseUtf8;
                    this.pool.set(i5, make);
                    return make;
                case 2:
                case 13:
                case 14:
                case 17:
                default:
                    throw new ParseException("unknown tag byte: " + Hex.u1(unsignedByte));
                case 3:
                    make = CstInteger.make(this.bytes.getInt(i6 + 1));
                    this.pool.set(i5, make);
                    return make;
                case 4:
                    make = CstFloat.make(this.bytes.getInt(i6 + 1));
                    this.pool.set(i5, make);
                    return make;
                case 5:
                    make = CstLong.make(this.bytes.getLong(i6 + 1));
                    this.pool.set(i5, make);
                    return make;
                case 6:
                    make = CstDouble.make(this.bytes.getLong(i6 + 1));
                    this.pool.set(i5, make);
                    return make;
                case 7:
                    parseUtf8 = new CstType(Type.internClassName(((CstString) parse0(this.bytes.getUnsignedShort(i6 + 1), bitSet)).getString()));
                    make = parseUtf8;
                    this.pool.set(i5, make);
                    return make;
                case 8:
                    make = parse0(this.bytes.getUnsignedShort(i6 + 1), bitSet);
                    this.pool.set(i5, make);
                    return make;
                case 9:
                    cstFieldRef = new CstFieldRef((CstType) parse0(this.bytes.getUnsignedShort(i6 + 1), bitSet), (CstNat) parse0(this.bytes.getUnsignedShort(i6 + 3), bitSet));
                    make = cstFieldRef;
                    this.pool.set(i5, make);
                    return make;
                case 10:
                    cstFieldRef = new CstMethodRef((CstType) parse0(this.bytes.getUnsignedShort(i6 + 1), bitSet), (CstNat) parse0(this.bytes.getUnsignedShort(i6 + 3), bitSet));
                    make = cstFieldRef;
                    this.pool.set(i5, make);
                    return make;
                case 11:
                    cstFieldRef = new CstInterfaceMethodRef((CstType) parse0(this.bytes.getUnsignedShort(i6 + 1), bitSet), (CstNat) parse0(this.bytes.getUnsignedShort(i6 + 3), bitSet));
                    make = cstFieldRef;
                    this.pool.set(i5, make);
                    return make;
                case 12:
                    cstFieldRef = new CstNat((CstString) parse0(this.bytes.getUnsignedShort(i6 + 1), bitSet), (CstString) parse0(this.bytes.getUnsignedShort(i6 + 3), bitSet));
                    make = cstFieldRef;
                    this.pool.set(i5, make);
                    return make;
                case 15:
                    int unsignedByte2 = this.bytes.getUnsignedByte(i6 + 1);
                    int unsignedShort = this.bytes.getUnsignedShort(i6 + 2);
                    switch (unsignedByte2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            constant = (CstFieldRef) parse0(unsignedShort, bitSet);
                            break;
                        case 5:
                        case 8:
                            constant = (CstMethodRef) parse0(unsignedShort, bitSet);
                            break;
                        case 6:
                        case 7:
                            constant = parse0(unsignedShort, bitSet);
                            if (!(constant instanceof CstMethodRef) && !(constant instanceof CstInterfaceMethodRef)) {
                                throw new ParseException("Unsupported ref constant type for MethodHandle " + constant.getClass());
                            }
                            break;
                        case 9:
                            constant = (CstInterfaceMethodRef) parse0(unsignedShort, bitSet);
                            break;
                        default:
                            throw new ParseException("Unsupported MethodHandle kind: " + unsignedByte2);
                    }
                    make = CstMethodHandle.make(getMethodHandleTypeForKind(unsignedByte2), constant);
                    this.pool.set(i5, make);
                    return make;
                case 16:
                    make = CstProtoRef.make((CstString) parse0(this.bytes.getUnsignedShort(i6 + 1), bitSet));
                    this.pool.set(i5, make);
                    return make;
                case 18:
                    make = CstInvokeDynamic.make(this.bytes.getUnsignedShort(i6 + 1), (CstNat) parse0(this.bytes.getUnsignedShort(i6 + 3), bitSet));
                    this.pool.set(i5, make);
                    return make;
            }
        } catch (ParseException e5) {
            e5.addContext("...while parsing cst " + Hex.u2(i5) + " at offset " + Hex.u4(i6));
            throw e5;
        } catch (RuntimeException e6) {
            ParseException parseException = new ParseException(e6);
            parseException.addContext("...while parsing cst " + Hex.u2(i5) + " at offset " + Hex.u4(i6));
            throw parseException;
        }
    }

    private void parseIfNecessary() {
        if (this.endOffset < 0) {
            parse();
        }
    }

    private CstString parseUtf8(int i5) {
        int unsignedShort = this.bytes.getUnsignedShort(i5 + 1);
        int i6 = i5 + 3;
        try {
            return new CstString(this.bytes.slice(i6, unsignedShort + i6));
        } catch (IllegalArgumentException e5) {
            throw new ParseException(e5);
        }
    }

    public int getEndOffset() {
        parseIfNecessary();
        return this.endOffset;
    }

    public StdConstantPool getPool() {
        parseIfNecessary();
        return this.pool;
    }

    public void setObserver(ParseObserver parseObserver) {
        this.observer = parseObserver;
    }
}
