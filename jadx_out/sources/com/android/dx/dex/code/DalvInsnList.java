package com.android.dx.dex.code;

import com.android.dex.util.ExceptionWithContext;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstBaseMethodRef;
import com.android.dx.rop.cst.CstCallSiteRef;
import com.android.dx.rop.cst.CstProtoRef;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.FixedSizeList;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class DalvInsnList extends FixedSizeList {
    private final int regCount;

    public DalvInsnList(int i5, int i6) {
        super(i5);
        this.regCount = i6;
    }

    public static DalvInsnList makeImmutable(ArrayList<DalvInsn> arrayList, int i5) {
        int size = arrayList.size();
        DalvInsnList dalvInsnList = new DalvInsnList(size, i5);
        for (int i6 = 0; i6 < size; i6++) {
            dalvInsnList.set(i6, arrayList.get(i6));
        }
        dalvInsnList.setImmutable();
        return dalvInsnList;
    }

    public int codeSize() {
        int size = size();
        if (size == 0) {
            return 0;
        }
        return get(size - 1).getNextAddress();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[Catch: IOException -> 0x0030, TryCatch #0 {IOException -> 0x0030, blocks: (B:4:0x000d, B:10:0x0026, B:12:0x0029, B:14:0x001e, B:20:0x002c), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void debugPrint(java.io.Writer r5, java.lang.String r6, boolean r7) {
        /*
            r4 = this;
            com.android.dx.util.IndentingWriter r0 = new com.android.dx.util.IndentingWriter
            r1 = 0
            r0.<init>(r5, r1, r6)
            int r5 = r4.size()
            r6 = r1
        Lb:
            if (r6 >= r5) goto L2c
            java.lang.Object r2 = r4.get0(r6)     // Catch: java.io.IOException -> L30
            com.android.dx.dex.code.DalvInsn r2 = (com.android.dx.dex.code.DalvInsn) r2     // Catch: java.io.IOException -> L30
            int r3 = r2.codeSize()     // Catch: java.io.IOException -> L30
            if (r3 != 0) goto L1e
            if (r7 == 0) goto L1c
            goto L1e
        L1c:
            r2 = 0
            goto L24
        L1e:
            java.lang.String r3 = ""
            java.lang.String r2 = r2.listingString(r3, r1, r7)     // Catch: java.io.IOException -> L30
        L24:
            if (r2 == 0) goto L29
            r0.write(r2)     // Catch: java.io.IOException -> L30
        L29:
            int r6 = r6 + 1
            goto Lb
        L2c:
            r0.flush()     // Catch: java.io.IOException -> L30
            return
        L30:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.dx.dex.code.DalvInsnList.debugPrint(java.io.Writer, java.lang.String, boolean):void");
    }

    public DalvInsn get(int i5) {
        return (DalvInsn) get0(i5);
    }

    public int getOutsSize() {
        int wordCount;
        int size = size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            DalvInsn dalvInsn = (DalvInsn) get0(i6);
            boolean z4 = true;
            if (dalvInsn instanceof CstInsn) {
                Constant constant = ((CstInsn) dalvInsn).getConstant();
                if (constant instanceof CstBaseMethodRef) {
                    CstBaseMethodRef cstBaseMethodRef = (CstBaseMethodRef) constant;
                    if (dalvInsn.getOpcode().getFamily() != 113) {
                        z4 = false;
                    }
                    wordCount = cstBaseMethodRef.getParameterWordCount(z4);
                } else if (constant instanceof CstCallSiteRef) {
                    wordCount = ((CstCallSiteRef) constant).getPrototype().getParameterTypes().getWordCount();
                } else {
                    wordCount = 0;
                }
            } else if (dalvInsn instanceof MultiCstInsn) {
                if (dalvInsn.getOpcode().getFamily() == 250) {
                    wordCount = ((CstProtoRef) ((MultiCstInsn) dalvInsn).getConstant(1)).getPrototype().getParameterTypes().getWordCount() + 1;
                } else {
                    throw new RuntimeException("Expecting invoke-polymorphic");
                }
            } else {
                continue;
            }
            if (wordCount > i5) {
                i5 = wordCount;
            }
        }
        return i5;
    }

    public int getRegistersSize() {
        return this.regCount;
    }

    public void set(int i5, DalvInsn dalvInsn) {
        set0(i5, dalvInsn);
    }

    public void writeTo(AnnotatedOutput annotatedOutput) {
        String listingString;
        int cursor = annotatedOutput.getCursor();
        int size = size();
        if (annotatedOutput.annotates()) {
            boolean isVerbose = annotatedOutput.isVerbose();
            for (int i5 = 0; i5 < size; i5++) {
                DalvInsn dalvInsn = (DalvInsn) get0(i5);
                int codeSize = dalvInsn.codeSize() * 2;
                if (codeSize == 0 && !isVerbose) {
                    listingString = null;
                } else {
                    listingString = dalvInsn.listingString("  ", annotatedOutput.getAnnotationWidth(), true);
                }
                if (listingString != null) {
                    annotatedOutput.annotate(codeSize, listingString);
                } else if (codeSize != 0) {
                    annotatedOutput.annotate(codeSize, "");
                }
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            DalvInsn dalvInsn2 = (DalvInsn) get0(i6);
            try {
                dalvInsn2.writeTo(annotatedOutput);
            } catch (RuntimeException e5) {
                throw ExceptionWithContext.withContext(e5, "...while writing " + dalvInsn2);
            }
        }
        int cursor2 = (annotatedOutput.getCursor() - cursor) / 2;
        if (cursor2 == codeSize()) {
            return;
        }
        throw new RuntimeException("write length mismatch; expected " + codeSize() + " but actually wrote " + cursor2);
    }

    public void debugPrint(OutputStream outputStream, String str, boolean z4) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        debugPrint(outputStreamWriter, str, z4);
        try {
            outputStreamWriter.flush();
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }
}
