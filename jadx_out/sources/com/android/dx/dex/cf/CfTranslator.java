package com.android.dx.dex.cf;

import com.android.dex.util.ExceptionWithContext;
import com.android.dx.cf.code.BootstrapMethodsList;
import com.android.dx.cf.direct.DirectClassFile;
import com.android.dx.cf.iface.Field;
import com.android.dx.cf.iface.FieldList;
import com.android.dx.command.dexer.DxContext;
import com.android.dx.dex.DexOptions;
import com.android.dx.dex.code.DalvCode;
import com.android.dx.dex.code.RopTranslator;
import com.android.dx.dex.file.CallSiteIdsSection;
import com.android.dx.dex.file.ClassDefItem;
import com.android.dx.dex.file.DexFile;
import com.android.dx.dex.file.EncodedField;
import com.android.dx.dex.file.FieldIdsSection;
import com.android.dx.dex.file.MethodHandlesSection;
import com.android.dx.dex.file.MethodIdsSection;
import com.android.dx.rop.annotation.Annotations;
import com.android.dx.rop.code.AccessFlags;
import com.android.dx.rop.code.LocalVariableInfo;
import com.android.dx.rop.code.RopMethod;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.ConstantPool;
import com.android.dx.rop.cst.CstBaseMethodRef;
import com.android.dx.rop.cst.CstBoolean;
import com.android.dx.rop.cst.CstByte;
import com.android.dx.rop.cst.CstCallSite;
import com.android.dx.rop.cst.CstCallSiteRef;
import com.android.dx.rop.cst.CstChar;
import com.android.dx.rop.cst.CstEnumRef;
import com.android.dx.rop.cst.CstFieldRef;
import com.android.dx.rop.cst.CstInteger;
import com.android.dx.rop.cst.CstInterfaceMethodRef;
import com.android.dx.rop.cst.CstInvokeDynamic;
import com.android.dx.rop.cst.CstMethodHandle;
import com.android.dx.rop.cst.CstMethodRef;
import com.android.dx.rop.cst.CstShort;
import com.android.dx.rop.cst.CstString;
import com.android.dx.rop.cst.CstType;
import com.android.dx.rop.cst.TypedConstant;
import com.android.dx.rop.type.Type;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class CfTranslator {
    private static final boolean DEBUG = false;

    private CfTranslator() {
    }

    private static TypedConstant coerceConstant(TypedConstant typedConstant, Type type) {
        if (typedConstant.getType().equals(type)) {
            return typedConstant;
        }
        int basicType = type.getBasicType();
        if (basicType != 1) {
            if (basicType != 2) {
                if (basicType != 3) {
                    if (basicType == 8) {
                        return CstShort.make(((CstInteger) typedConstant).getValue());
                    }
                    throw new UnsupportedOperationException("can't coerce " + typedConstant + " to " + type);
                }
                return CstChar.make(((CstInteger) typedConstant).getValue());
            }
            return CstByte.make(((CstInteger) typedConstant).getValue());
        }
        return CstBoolean.make(((CstInteger) typedConstant).getValue());
    }

    private static void processFields(DirectClassFile directClassFile, ClassDefItem classDefItem, DexFile dexFile) {
        CstType thisClass = directClassFile.getThisClass();
        FieldList fields = directClassFile.getFields();
        int size = fields.size();
        for (int i5 = 0; i5 < size; i5++) {
            Field field = fields.get(i5);
            try {
                CstFieldRef cstFieldRef = new CstFieldRef(thisClass, field.getNat());
                int accessFlags = field.getAccessFlags();
                if (AccessFlags.isStatic(accessFlags)) {
                    TypedConstant constantValue = field.getConstantValue();
                    EncodedField encodedField = new EncodedField(cstFieldRef, accessFlags);
                    if (constantValue != null) {
                        constantValue = coerceConstant(constantValue, cstFieldRef.getType());
                    }
                    classDefItem.addStaticField(encodedField, constantValue);
                } else {
                    classDefItem.addInstanceField(new EncodedField(cstFieldRef, accessFlags));
                }
                Annotations annotations = AttributeTranslator.getAnnotations(field.getAttributes());
                if (annotations.size() != 0) {
                    classDefItem.addFieldAnnotations(cstFieldRef, annotations, dexFile);
                }
                dexFile.getFieldIds().intern(cstFieldRef);
            } catch (RuntimeException e5) {
                throw ExceptionWithContext.withContext(e5, "...while processing " + field.getName().toHuman() + " " + field.getDescriptor().toHuman());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd A[Catch: RuntimeException -> 0x0167, TryCatch #1 {RuntimeException -> 0x0167, blocks: (B:5:0x0020, B:7:0x0044, B:14:0x0056, B:17:0x005f, B:19:0x009e, B:21:0x00a6, B:23:0x00b0, B:25:0x00b9, B:27:0x00bd, B:28:0x00c4, B:31:0x00d0), top: B:4:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b A[Catch: RuntimeException -> 0x0165, TryCatch #0 {RuntimeException -> 0x0165, blocks: (B:34:0x00ec, B:36:0x0105, B:38:0x010b, B:40:0x0111, B:42:0x0115, B:43:0x0119, B:45:0x012a, B:50:0x0135, B:51:0x013c, B:53:0x0146, B:54:0x0149, B:56:0x0153, B:57:0x0156, B:59:0x0139), top: B:33:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115 A[Catch: RuntimeException -> 0x0165, TryCatch #0 {RuntimeException -> 0x0165, blocks: (B:34:0x00ec, B:36:0x0105, B:38:0x010b, B:40:0x0111, B:42:0x0115, B:43:0x0119, B:45:0x012a, B:50:0x0135, B:51:0x013c, B:53:0x0146, B:54:0x0149, B:56:0x0153, B:57:0x0156, B:59:0x0139), top: B:33:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012a A[Catch: RuntimeException -> 0x0165, TryCatch #0 {RuntimeException -> 0x0165, blocks: (B:34:0x00ec, B:36:0x0105, B:38:0x010b, B:40:0x0111, B:42:0x0115, B:43:0x0119, B:45:0x012a, B:50:0x0135, B:51:0x013c, B:53:0x0146, B:54:0x0149, B:56:0x0153, B:57:0x0156, B:59:0x0139), top: B:33:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0146 A[Catch: RuntimeException -> 0x0165, TryCatch #0 {RuntimeException -> 0x0165, blocks: (B:34:0x00ec, B:36:0x0105, B:38:0x010b, B:40:0x0111, B:42:0x0115, B:43:0x0119, B:45:0x012a, B:50:0x0135, B:51:0x013c, B:53:0x0146, B:54:0x0149, B:56:0x0153, B:57:0x0156, B:59:0x0139), top: B:33:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0153 A[Catch: RuntimeException -> 0x0165, TryCatch #0 {RuntimeException -> 0x0165, blocks: (B:34:0x00ec, B:36:0x0105, B:38:0x010b, B:40:0x0111, B:42:0x0115, B:43:0x0119, B:45:0x012a, B:50:0x0135, B:51:0x013c, B:53:0x0146, B:54:0x0149, B:56:0x0153, B:57:0x0156, B:59:0x0139), top: B:33:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void processMethods(com.android.dx.command.dexer.DxContext r28, com.android.dx.cf.direct.DirectClassFile r29, com.android.dx.dex.cf.CfOptions r30, com.android.dx.dex.DexOptions r31, com.android.dx.dex.file.ClassDefItem r32, com.android.dx.dex.file.DexFile r33) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.dx.dex.cf.CfTranslator.processMethods(com.android.dx.command.dexer.DxContext, com.android.dx.cf.direct.DirectClassFile, com.android.dx.dex.cf.CfOptions, com.android.dx.dex.DexOptions, com.android.dx.dex.file.ClassDefItem, com.android.dx.dex.file.DexFile):void");
    }

    public static ClassDefItem translate(DxContext dxContext, DirectClassFile directClassFile, byte[] bArr, CfOptions cfOptions, DexOptions dexOptions, DexFile dexFile) {
        try {
            return translate0(dxContext, directClassFile, bArr, cfOptions, dexOptions, dexFile);
        } catch (RuntimeException e5) {
            throw ExceptionWithContext.withContext(e5, "...while processing " + directClassFile.getFilePath());
        }
    }

    private static ClassDefItem translate0(DxContext dxContext, DirectClassFile directClassFile, byte[] bArr, CfOptions cfOptions, DexOptions dexOptions, DexFile dexFile) {
        CstString sourceFile;
        dxContext.optimizerOptions.loadOptimizeLists(cfOptions.optimizeListFile, cfOptions.dontOptimizeListFile);
        CstType thisClass = directClassFile.getThisClass();
        int accessFlags = directClassFile.getAccessFlags() & (-33);
        if (cfOptions.positionInfo == 1) {
            sourceFile = null;
        } else {
            sourceFile = directClassFile.getSourceFile();
        }
        ClassDefItem classDefItem = new ClassDefItem(thisClass, accessFlags, directClassFile.getSuperclass(), directClassFile.getInterfaces(), sourceFile);
        Annotations classAnnotations = AttributeTranslator.getClassAnnotations(directClassFile, cfOptions);
        if (classAnnotations.size() != 0) {
            classDefItem.setClassAnnotations(classAnnotations, dexFile);
        }
        FieldIdsSection fieldIds = dexFile.getFieldIds();
        MethodIdsSection methodIds = dexFile.getMethodIds();
        MethodHandlesSection methodHandles = dexFile.getMethodHandles();
        CallSiteIdsSection callSiteIds = dexFile.getCallSiteIds();
        processFields(directClassFile, classDefItem, dexFile);
        processMethods(dxContext, directClassFile, cfOptions, dexOptions, classDefItem, dexFile);
        ConstantPool constantPool = directClassFile.getConstantPool();
        int size = constantPool.size();
        for (int i5 = 0; i5 < size; i5++) {
            Constant orNull = constantPool.getOrNull(i5);
            if (orNull instanceof CstMethodRef) {
                methodIds.intern((CstBaseMethodRef) orNull);
            } else if (orNull instanceof CstInterfaceMethodRef) {
                methodIds.intern(((CstInterfaceMethodRef) orNull).toMethodRef());
            } else if (orNull instanceof CstFieldRef) {
                fieldIds.intern((CstFieldRef) orNull);
            } else if (orNull instanceof CstEnumRef) {
                fieldIds.intern(((CstEnumRef) orNull).getFieldRef());
            } else if (orNull instanceof CstMethodHandle) {
                methodHandles.intern((CstMethodHandle) orNull);
            } else if (orNull instanceof CstInvokeDynamic) {
                CstInvokeDynamic cstInvokeDynamic = (CstInvokeDynamic) orNull;
                BootstrapMethodsList.Item item = directClassFile.getBootstrapMethods().get(cstInvokeDynamic.getBootstrapMethodIndex());
                CstCallSite make = CstCallSite.make(item.getBootstrapMethodHandle(), cstInvokeDynamic.getNat(), item.getBootstrapMethodArguments());
                cstInvokeDynamic.setDeclaringClass(directClassFile.getThisClass());
                cstInvokeDynamic.setCallSite(make);
                Iterator<CstCallSiteRef> it = cstInvokeDynamic.getReferences().iterator();
                while (it.hasNext()) {
                    callSiteIds.intern(it.next());
                }
            }
        }
        return classDefItem;
    }

    private static void updateDexStatistics(DxContext dxContext, CfOptions cfOptions, DexOptions dexOptions, RopMethod ropMethod, RopMethod ropMethod2, LocalVariableInfo localVariableInfo, int i5, int i6) {
        DalvCode translate = RopTranslator.translate(ropMethod, cfOptions.positionInfo, localVariableInfo, i5, dexOptions);
        DalvCode translate2 = RopTranslator.translate(ropMethod2, cfOptions.positionInfo, localVariableInfo, i5, dexOptions);
        DalvCode.AssignIndicesCallback assignIndicesCallback = new DalvCode.AssignIndicesCallback() { // from class: com.android.dx.dex.cf.CfTranslator.1
            @Override // com.android.dx.dex.code.DalvCode.AssignIndicesCallback
            public int getIndex(Constant constant) {
                return 0;
            }
        };
        translate.assignIndices(assignIndicesCallback);
        translate2.assignIndices(assignIndicesCallback);
        dxContext.codeStatistics.updateDexStatistics(translate2, translate);
        dxContext.codeStatistics.updateOriginalByteCount(i6);
    }
}
