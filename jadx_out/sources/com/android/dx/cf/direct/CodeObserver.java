package com.android.dx.cf.direct;

import com.android.dx.cf.code.ByteOps;
import com.android.dx.cf.code.BytecodeArray;
import com.android.dx.cf.code.SwitchList;
import com.android.dx.cf.iface.ParseObserver;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstDouble;
import com.android.dx.rop.cst.CstFloat;
import com.android.dx.rop.cst.CstInteger;
import com.android.dx.rop.cst.CstKnownNull;
import com.android.dx.rop.cst.CstLong;
import com.android.dx.rop.cst.CstType;
import com.android.dx.rop.type.Type;
import com.android.dx.util.ByteArray;
import com.android.dx.util.Hex;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class CodeObserver implements BytecodeArray.Visitor {
    private final ByteArray bytes;
    private final ParseObserver observer;

    public CodeObserver(ByteArray byteArray, ParseObserver parseObserver) {
        if (byteArray != null) {
            if (parseObserver != null) {
                this.bytes = byteArray;
                this.observer = parseObserver;
                return;
            }
            throw new NullPointerException("observer == null");
        }
        throw new NullPointerException("bytes == null");
    }

    private String header(int i5) {
        int unsignedByte = this.bytes.getUnsignedByte(i5);
        String opName = ByteOps.opName(unsignedByte);
        if (unsignedByte == 196) {
            opName = opName + " " + ByteOps.opName(this.bytes.getUnsignedByte(i5 + 1));
        }
        return Hex.u2(i5) + ": " + opName;
    }

    private void visitLiteralDouble(int i5, int i6, int i7, long j5) {
        String str;
        if (i7 != 1) {
            str = " #" + Hex.u8(j5);
        } else {
            str = "";
        }
        this.observer.parsed(this.bytes, i6, i7, header(i6) + str + " // " + Double.longBitsToDouble(j5));
    }

    private void visitLiteralFloat(int i5, int i6, int i7, int i8) {
        String str;
        if (i7 != 1) {
            str = " #" + Hex.u4(i8);
        } else {
            str = "";
        }
        this.observer.parsed(this.bytes, i6, i7, header(i6) + str + " // " + Float.intBitsToFloat(i8));
    }

    private void visitLiteralInt(int i5, int i6, int i7, int i8) {
        String str;
        String str2;
        if (i7 == 1) {
            str = " // ";
        } else {
            str = " ";
        }
        int unsignedByte = this.bytes.getUnsignedByte(i6);
        if (i7 != 1 && unsignedByte != 16) {
            if (unsignedByte == 17) {
                str2 = "#" + Hex.s2(i8);
            } else {
                str2 = "#" + Hex.s4(i8);
            }
        } else {
            str2 = "#" + Hex.s1(i8);
        }
        this.observer.parsed(this.bytes, i6, i7, header(i6) + str + str2);
    }

    private void visitLiteralLong(int i5, int i6, int i7, long j5) {
        String str;
        String s8;
        if (i7 == 1) {
            str = " // ";
        } else {
            str = " #";
        }
        if (i7 == 1) {
            s8 = Hex.s1((int) j5);
        } else {
            s8 = Hex.s8(j5);
        }
        this.observer.parsed(this.bytes, i6, i7, header(i6) + str + s8);
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public int getPreviousOffset() {
        return -1;
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void setPreviousOffset(int i5) {
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitBranch(int i5, int i6, int i7, int i8) {
        String u4;
        if (i7 <= 3) {
            u4 = Hex.u2(i8);
        } else {
            u4 = Hex.u4(i8);
        }
        this.observer.parsed(this.bytes, i6, i7, header(i6) + " " + u4);
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitConstant(int i5, int i6, int i7, Constant constant, int i8) {
        String str;
        if (constant instanceof CstKnownNull) {
            visitNoArgs(i5, i6, i7, null);
            return;
        }
        if (constant instanceof CstInteger) {
            visitLiteralInt(i5, i6, i7, i8);
            return;
        }
        if (constant instanceof CstLong) {
            visitLiteralLong(i5, i6, i7, ((CstLong) constant).getValue());
            return;
        }
        if (constant instanceof CstFloat) {
            visitLiteralFloat(i5, i6, i7, ((CstFloat) constant).getIntBits());
            return;
        }
        if (constant instanceof CstDouble) {
            visitLiteralDouble(i5, i6, i7, ((CstDouble) constant).getLongBits());
            return;
        }
        if (i8 != 0) {
            if (i5 == 197) {
                str = ", " + Hex.u1(i8);
            } else {
                str = ", " + Hex.u2(i8);
            }
        } else {
            str = "";
        }
        this.observer.parsed(this.bytes, i6, i7, header(i6) + " " + constant + str);
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitInvalid(int i5, int i6, int i7) {
        this.observer.parsed(this.bytes, i6, i7, header(i6));
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitLocal(int i5, int i6, int i7, int i8, Type type, int i9) {
        String u22;
        String str;
        String str2;
        String str3;
        String s22;
        if (i7 <= 3) {
            u22 = Hex.u1(i8);
        } else {
            u22 = Hex.u2(i8);
        }
        boolean z4 = true;
        if (i7 != 1) {
            z4 = false;
        }
        String str4 = "";
        if (i5 != 132) {
            str = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(", #");
            if (i7 <= 3) {
                s22 = Hex.s1(i9);
            } else {
                s22 = Hex.s2(i9);
            }
            sb.append(s22);
            str = sb.toString();
        }
        if (type.isCategory2()) {
            StringBuilder sb2 = new StringBuilder();
            if (z4) {
                str3 = ",";
            } else {
                str3 = " //";
            }
            sb2.append(str3);
            sb2.append(" category-2");
            str4 = sb2.toString();
        }
        ParseObserver parseObserver = this.observer;
        ByteArray byteArray = this.bytes;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(header(i6));
        if (z4) {
            str2 = " // ";
        } else {
            str2 = " ";
        }
        sb3.append(str2);
        sb3.append(u22);
        sb3.append(str);
        sb3.append(str4);
        parseObserver.parsed(byteArray, i6, i7, sb3.toString());
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitNewarray(int i5, int i6, CstType cstType, ArrayList<Constant> arrayList) {
        String str;
        if (i6 == 1) {
            str = " // ";
        } else {
            str = " ";
        }
        String human = cstType.getClassType().getComponentType().toHuman();
        this.observer.parsed(this.bytes, i5, i6, header(i5) + str + human);
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitNoArgs(int i5, int i6, int i7, Type type) {
        this.observer.parsed(this.bytes, i6, i7, header(i6));
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitSwitch(int i5, int i6, int i7, SwitchList switchList, int i8) {
        int size = switchList.size();
        StringBuilder sb = new StringBuilder((size * 20) + 100);
        sb.append(header(i6));
        if (i8 != 0) {
            sb.append(" // padding: " + Hex.u4(i8));
        }
        sb.append('\n');
        for (int i9 = 0; i9 < size; i9++) {
            sb.append("  ");
            sb.append(Hex.s4(switchList.getValue(i9)));
            sb.append(": ");
            sb.append(Hex.u2(switchList.getTarget(i9)));
            sb.append('\n');
        }
        sb.append("  default: ");
        sb.append(Hex.u2(switchList.getDefaultTarget()));
        this.observer.parsed(this.bytes, i6, i7, sb.toString());
    }
}
