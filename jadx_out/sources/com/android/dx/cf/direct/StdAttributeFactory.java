package com.android.dx.cf.direct;

import com.android.dx.cf.attrib.AttAnnotationDefault;
import com.android.dx.cf.attrib.AttBootstrapMethods;
import com.android.dx.cf.attrib.AttCode;
import com.android.dx.cf.attrib.AttConstantValue;
import com.android.dx.cf.attrib.AttDeprecated;
import com.android.dx.cf.attrib.AttEnclosingMethod;
import com.android.dx.cf.attrib.AttExceptions;
import com.android.dx.cf.attrib.AttInnerClasses;
import com.android.dx.cf.attrib.AttLineNumberTable;
import com.android.dx.cf.attrib.AttLocalVariableTable;
import com.android.dx.cf.attrib.AttLocalVariableTypeTable;
import com.android.dx.cf.attrib.AttRuntimeInvisibleAnnotations;
import com.android.dx.cf.attrib.AttRuntimeInvisibleParameterAnnotations;
import com.android.dx.cf.attrib.AttRuntimeVisibleAnnotations;
import com.android.dx.cf.attrib.AttRuntimeVisibleParameterAnnotations;
import com.android.dx.cf.attrib.AttSignature;
import com.android.dx.cf.attrib.AttSourceDebugExtension;
import com.android.dx.cf.attrib.AttSourceFile;
import com.android.dx.cf.attrib.AttSynthetic;
import com.android.dx.cf.attrib.InnerClassList;
import com.android.dx.cf.code.BootstrapMethodArgumentsList;
import com.android.dx.cf.code.BootstrapMethodsList;
import com.android.dx.cf.code.ByteCatchList;
import com.android.dx.cf.code.BytecodeArray;
import com.android.dx.cf.code.LineNumberList;
import com.android.dx.cf.code.LocalVariableList;
import com.android.dx.cf.iface.Attribute;
import com.android.dx.cf.iface.ParseException;
import com.android.dx.cf.iface.ParseObserver;
import com.android.dx.cf.iface.StdAttributeList;
import com.android.dx.rop.annotation.AnnotationVisibility;
import com.android.dx.rop.code.AccessFlags;
import com.android.dx.rop.cst.ConstantPool;
import com.android.dx.rop.cst.CstMethodHandle;
import com.android.dx.rop.cst.CstNat;
import com.android.dx.rop.cst.CstString;
import com.android.dx.rop.cst.CstType;
import com.android.dx.rop.cst.TypedConstant;
import com.android.dx.util.ByteArray;
import com.android.dx.util.Hex;
import java.io.IOException;

/* loaded from: classes2.dex */
public class StdAttributeFactory extends AttributeFactory {
    public static final StdAttributeFactory THE_ONE = new StdAttributeFactory();

    private Attribute annotationDefault(DirectClassFile directClassFile, int i5, int i6, ParseObserver parseObserver) {
        if (i6 < 2) {
            throwSeverelyTruncated();
        }
        return new AttAnnotationDefault(new AnnotationParser(directClassFile, i5, i6, parseObserver).parseValueAttribute(), i6);
    }

    private Attribute bootstrapMethods(DirectClassFile directClassFile, int i5, int i6, ParseObserver parseObserver) {
        if (i6 < 2) {
            return throwSeverelyTruncated();
        }
        ByteArray bytes = directClassFile.getBytes();
        int unsignedShort = bytes.getUnsignedShort(i5);
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i5, 2, "num_boostrap_methods: " + Hex.u2(unsignedShort));
        }
        return new AttBootstrapMethods(parseBootstrapMethods(bytes, directClassFile.getConstantPool(), directClassFile.getThisClass(), unsignedShort, i5 + 2, i6 - 2, parseObserver));
    }

    private Attribute code(DirectClassFile directClassFile, int i5, int i6, ParseObserver parseObserver) {
        ByteCatchList byteCatchList;
        String human;
        if (i6 < 12) {
            return throwSeverelyTruncated();
        }
        ByteArray bytes = directClassFile.getBytes();
        ConstantPool constantPool = directClassFile.getConstantPool();
        int unsignedShort = bytes.getUnsignedShort(i5);
        int i7 = i5 + 2;
        int unsignedShort2 = bytes.getUnsignedShort(i7);
        int i8 = i5 + 4;
        int i9 = bytes.getInt(i8);
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i5, 2, "max_stack: " + Hex.u2(unsignedShort));
            parseObserver.parsed(bytes, i7, 2, "max_locals: " + Hex.u2(unsignedShort2));
            parseObserver.parsed(bytes, i8, 4, "code_length: " + Hex.u4(i9));
        }
        int i10 = i5 + 8;
        int i11 = i6 - 8;
        if (i11 < i9 + 4) {
            return throwTruncated();
        }
        int i12 = i10 + i9;
        int i13 = i11 - i9;
        BytecodeArray bytecodeArray = new BytecodeArray(bytes.slice(i10, i12), constantPool);
        if (parseObserver != null) {
            bytecodeArray.forEach(new CodeObserver(bytecodeArray.getBytes(), parseObserver));
        }
        int unsignedShort3 = bytes.getUnsignedShort(i12);
        if (unsignedShort3 == 0) {
            byteCatchList = ByteCatchList.EMPTY;
        } else {
            byteCatchList = new ByteCatchList(unsignedShort3);
        }
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i12, 2, "exception_table_length: " + Hex.u2(unsignedShort3));
        }
        int i14 = i12 + 2;
        int i15 = i13 - 2;
        if (i15 < (unsignedShort3 * 8) + 2) {
            return throwTruncated();
        }
        for (int i16 = 0; i16 < unsignedShort3; i16++) {
            if (parseObserver != null) {
                parseObserver.changeIndent(1);
            }
            int unsignedShort4 = bytes.getUnsignedShort(i14);
            int unsignedShort5 = bytes.getUnsignedShort(i14 + 2);
            int unsignedShort6 = bytes.getUnsignedShort(i14 + 4);
            CstType cstType = (CstType) constantPool.get0Ok(bytes.getUnsignedShort(i14 + 6));
            byteCatchList.set(i16, unsignedShort4, unsignedShort5, unsignedShort6, cstType);
            if (parseObserver != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(Hex.u2(unsignedShort4));
                sb.append("..");
                sb.append(Hex.u2(unsignedShort5));
                sb.append(" -> ");
                sb.append(Hex.u2(unsignedShort6));
                sb.append(" ");
                if (cstType == null) {
                    human = "<any>";
                } else {
                    human = cstType.toHuman();
                }
                sb.append(human);
                parseObserver.parsed(bytes, i14, 8, sb.toString());
            }
            i14 += 8;
            i15 -= 8;
            if (parseObserver != null) {
                parseObserver.changeIndent(-1);
            }
        }
        byteCatchList.setImmutable();
        AttributeListParser attributeListParser = new AttributeListParser(directClassFile, 3, i14, this);
        attributeListParser.setObserver(parseObserver);
        StdAttributeList list = attributeListParser.getList();
        list.setImmutable();
        int endOffset = attributeListParser.getEndOffset() - i14;
        if (endOffset != i15) {
            return throwBadLength(endOffset + (i14 - i5));
        }
        return new AttCode(unsignedShort, unsignedShort2, bytecodeArray, byteCatchList, list);
    }

    private Attribute constantValue(DirectClassFile directClassFile, int i5, int i6, ParseObserver parseObserver) {
        if (i6 != 2) {
            return throwBadLength(2);
        }
        ByteArray bytes = directClassFile.getBytes();
        TypedConstant typedConstant = (TypedConstant) directClassFile.getConstantPool().get(bytes.getUnsignedShort(i5));
        AttConstantValue attConstantValue = new AttConstantValue(typedConstant);
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i5, 2, "value: " + typedConstant);
        }
        return attConstantValue;
    }

    private Attribute deprecated(DirectClassFile directClassFile, int i5, int i6, ParseObserver parseObserver) {
        if (i6 != 0) {
            return throwBadLength(0);
        }
        return new AttDeprecated();
    }

    private Attribute enclosingMethod(DirectClassFile directClassFile, int i5, int i6, ParseObserver parseObserver) {
        if (i6 != 4) {
            throwBadLength(4);
        }
        ByteArray bytes = directClassFile.getBytes();
        ConstantPool constantPool = directClassFile.getConstantPool();
        CstType cstType = (CstType) constantPool.get(bytes.getUnsignedShort(i5));
        int i7 = i5 + 2;
        CstNat cstNat = (CstNat) constantPool.get0Ok(bytes.getUnsignedShort(i7));
        AttEnclosingMethod attEnclosingMethod = new AttEnclosingMethod(cstType, cstNat);
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i5, 2, "class: " + cstType);
            parseObserver.parsed(bytes, i7, 2, "method: " + DirectClassFile.stringOrNone(cstNat));
        }
        return attEnclosingMethod;
    }

    private Attribute exceptions(DirectClassFile directClassFile, int i5, int i6, ParseObserver parseObserver) {
        if (i6 < 2) {
            return throwSeverelyTruncated();
        }
        ByteArray bytes = directClassFile.getBytes();
        int unsignedShort = bytes.getUnsignedShort(i5);
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i5, 2, "number_of_exceptions: " + Hex.u2(unsignedShort));
        }
        int i7 = i5 + 2;
        int i8 = unsignedShort * 2;
        if (i6 - 2 != i8) {
            throwBadLength(i8 + 2);
        }
        return new AttExceptions(directClassFile.makeTypeList(i7, unsignedShort));
    }

    private Attribute innerClasses(DirectClassFile directClassFile, int i5, int i6, ParseObserver parseObserver) {
        if (i6 < 2) {
            return throwSeverelyTruncated();
        }
        ByteArray bytes = directClassFile.getBytes();
        ConstantPool constantPool = directClassFile.getConstantPool();
        int unsignedShort = bytes.getUnsignedShort(i5);
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i5, 2, "number_of_classes: " + Hex.u2(unsignedShort));
        }
        int i7 = i5 + 2;
        int i8 = unsignedShort * 8;
        if (i6 - 2 != i8) {
            throwBadLength(i8 + 2);
        }
        InnerClassList innerClassList = new InnerClassList(unsignedShort);
        for (int i9 = 0; i9 < unsignedShort; i9++) {
            int unsignedShort2 = bytes.getUnsignedShort(i7);
            int i10 = i7 + 2;
            int unsignedShort3 = bytes.getUnsignedShort(i10);
            int i11 = i7 + 4;
            int unsignedShort4 = bytes.getUnsignedShort(i11);
            int i12 = i7 + 6;
            int unsignedShort5 = bytes.getUnsignedShort(i12);
            CstType cstType = (CstType) constantPool.get(unsignedShort2);
            CstType cstType2 = (CstType) constantPool.get0Ok(unsignedShort3);
            CstString cstString = (CstString) constantPool.get0Ok(unsignedShort4);
            innerClassList.set(i9, cstType, cstType2, cstString, unsignedShort5);
            if (parseObserver != null) {
                parseObserver.parsed(bytes, i7, 2, "inner_class: " + DirectClassFile.stringOrNone(cstType));
                parseObserver.parsed(bytes, i10, 2, "  outer_class: " + DirectClassFile.stringOrNone(cstType2));
                parseObserver.parsed(bytes, i11, 2, "  name: " + DirectClassFile.stringOrNone(cstString));
                parseObserver.parsed(bytes, i12, 2, "  access_flags: " + AccessFlags.innerClassString(unsignedShort5));
            }
            i7 += 8;
        }
        innerClassList.setImmutable();
        return new AttInnerClasses(innerClassList);
    }

    private Attribute lineNumberTable(DirectClassFile directClassFile, int i5, int i6, ParseObserver parseObserver) {
        if (i6 < 2) {
            return throwSeverelyTruncated();
        }
        ByteArray bytes = directClassFile.getBytes();
        int unsignedShort = bytes.getUnsignedShort(i5);
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i5, 2, "line_number_table_length: " + Hex.u2(unsignedShort));
        }
        int i7 = i5 + 2;
        int i8 = unsignedShort * 4;
        if (i6 - 2 != i8) {
            throwBadLength(i8 + 2);
        }
        LineNumberList lineNumberList = new LineNumberList(unsignedShort);
        for (int i9 = 0; i9 < unsignedShort; i9++) {
            int unsignedShort2 = bytes.getUnsignedShort(i7);
            int unsignedShort3 = bytes.getUnsignedShort(i7 + 2);
            lineNumberList.set(i9, unsignedShort2, unsignedShort3);
            if (parseObserver != null) {
                parseObserver.parsed(bytes, i7, 4, Hex.u2(unsignedShort2) + " " + unsignedShort3);
            }
            i7 += 4;
        }
        lineNumberList.setImmutable();
        return new AttLineNumberTable(lineNumberList);
    }

    private Attribute localVariableTable(DirectClassFile directClassFile, int i5, int i6, ParseObserver parseObserver) {
        if (i6 < 2) {
            return throwSeverelyTruncated();
        }
        ByteArray bytes = directClassFile.getBytes();
        int unsignedShort = bytes.getUnsignedShort(i5);
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i5, 2, "local_variable_table_length: " + Hex.u2(unsignedShort));
        }
        return new AttLocalVariableTable(parseLocalVariables(bytes.slice(i5 + 2, i5 + i6), directClassFile.getConstantPool(), parseObserver, unsignedShort, false));
    }

    private Attribute localVariableTypeTable(DirectClassFile directClassFile, int i5, int i6, ParseObserver parseObserver) {
        if (i6 < 2) {
            return throwSeverelyTruncated();
        }
        ByteArray bytes = directClassFile.getBytes();
        int unsignedShort = bytes.getUnsignedShort(i5);
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i5, 2, "local_variable_type_table_length: " + Hex.u2(unsignedShort));
        }
        return new AttLocalVariableTypeTable(parseLocalVariables(bytes.slice(i5 + 2, i5 + i6), directClassFile.getConstantPool(), parseObserver, unsignedShort, true));
    }

    private BootstrapMethodsList parseBootstrapMethods(ByteArray byteArray, ConstantPool constantPool, CstType cstType, int i5, int i6, int i7, ParseObserver parseObserver) throws ParseException {
        BootstrapMethodsList bootstrapMethodsList = new BootstrapMethodsList(i5);
        int i8 = i6;
        int i9 = i7;
        for (int i10 = 0; i10 < i5; i10++) {
            if (i9 < 4) {
                throwTruncated();
            }
            int unsignedShort = byteArray.getUnsignedShort(i8);
            int i11 = i8 + 2;
            int unsignedShort2 = byteArray.getUnsignedShort(i11);
            if (parseObserver != null) {
                parseObserver.parsed(byteArray, i8, 2, "bootstrap_method_ref: " + Hex.u2(unsignedShort));
                parseObserver.parsed(byteArray, i11, 2, "num_bootstrap_arguments: " + Hex.u2(unsignedShort2));
            }
            i8 += 4;
            i9 -= 4;
            if (i9 < unsignedShort2 * 2) {
                throwTruncated();
            }
            BootstrapMethodArgumentsList bootstrapMethodArgumentsList = new BootstrapMethodArgumentsList(unsignedShort2);
            int i12 = 0;
            while (i12 < unsignedShort2) {
                int unsignedShort3 = byteArray.getUnsignedShort(i8);
                if (parseObserver != null) {
                    parseObserver.parsed(byteArray, i8, 2, "bootstrap_arguments[" + i12 + "]" + Hex.u2(unsignedShort3));
                }
                bootstrapMethodArgumentsList.set(i12, constantPool.get(unsignedShort3));
                i12++;
                i8 += 2;
                i9 -= 2;
            }
            bootstrapMethodArgumentsList.setImmutable();
            bootstrapMethodsList.set(i10, cstType, (CstMethodHandle) constantPool.get(unsignedShort), bootstrapMethodArgumentsList);
        }
        bootstrapMethodsList.setImmutable();
        if (i9 != 0) {
            throwBadLength(i9);
        }
        return bootstrapMethodsList;
    }

    private LocalVariableList parseLocalVariables(ByteArray byteArray, ConstantPool constantPool, ParseObserver parseObserver, int i5, boolean z4) {
        CstString cstString;
        CstString cstString2;
        int i6 = i5 * 10;
        if (byteArray.size() != i6) {
            throwBadLength(i6 + 2);
        }
        ByteArray.MyDataInputStream makeDataInputStream = byteArray.makeDataInputStream();
        LocalVariableList localVariableList = new LocalVariableList(i5);
        for (int i7 = 0; i7 < i5; i7++) {
            try {
                int readUnsignedShort = makeDataInputStream.readUnsignedShort();
                int readUnsignedShort2 = makeDataInputStream.readUnsignedShort();
                int readUnsignedShort3 = makeDataInputStream.readUnsignedShort();
                int readUnsignedShort4 = makeDataInputStream.readUnsignedShort();
                int readUnsignedShort5 = makeDataInputStream.readUnsignedShort();
                CstString cstString3 = (CstString) constantPool.get(readUnsignedShort3);
                CstString cstString4 = (CstString) constantPool.get(readUnsignedShort4);
                if (z4) {
                    cstString2 = null;
                    cstString = cstString4;
                } else {
                    cstString = null;
                    cstString2 = cstString4;
                }
                localVariableList.set(i7, readUnsignedShort, readUnsignedShort2, cstString3, cstString2, cstString, readUnsignedShort5);
                if (parseObserver != null) {
                    parseObserver.parsed(byteArray, i7 * 10, 10, Hex.u2(readUnsignedShort) + ".." + Hex.u2(readUnsignedShort + readUnsignedShort2) + " " + Hex.u2(readUnsignedShort5) + " " + cstString3.toHuman() + " " + cstString4.toHuman());
                }
            } catch (IOException e5) {
                throw new RuntimeException("shouldn't happen", e5);
            }
        }
        localVariableList.setImmutable();
        return localVariableList;
    }

    private Attribute runtimeInvisibleAnnotations(DirectClassFile directClassFile, int i5, int i6, ParseObserver parseObserver) {
        if (i6 < 2) {
            throwSeverelyTruncated();
        }
        return new AttRuntimeInvisibleAnnotations(new AnnotationParser(directClassFile, i5, i6, parseObserver).parseAnnotationAttribute(AnnotationVisibility.BUILD), i6);
    }

    private Attribute runtimeInvisibleParameterAnnotations(DirectClassFile directClassFile, int i5, int i6, ParseObserver parseObserver) {
        if (i6 < 2) {
            throwSeverelyTruncated();
        }
        return new AttRuntimeInvisibleParameterAnnotations(new AnnotationParser(directClassFile, i5, i6, parseObserver).parseParameterAttribute(AnnotationVisibility.BUILD), i6);
    }

    private Attribute runtimeVisibleAnnotations(DirectClassFile directClassFile, int i5, int i6, ParseObserver parseObserver) {
        if (i6 < 2) {
            throwSeverelyTruncated();
        }
        return new AttRuntimeVisibleAnnotations(new AnnotationParser(directClassFile, i5, i6, parseObserver).parseAnnotationAttribute(AnnotationVisibility.RUNTIME), i6);
    }

    private Attribute runtimeVisibleParameterAnnotations(DirectClassFile directClassFile, int i5, int i6, ParseObserver parseObserver) {
        if (i6 < 2) {
            throwSeverelyTruncated();
        }
        return new AttRuntimeVisibleParameterAnnotations(new AnnotationParser(directClassFile, i5, i6, parseObserver).parseParameterAttribute(AnnotationVisibility.RUNTIME), i6);
    }

    private Attribute signature(DirectClassFile directClassFile, int i5, int i6, ParseObserver parseObserver) {
        if (i6 != 2) {
            throwBadLength(2);
        }
        ByteArray bytes = directClassFile.getBytes();
        CstString cstString = (CstString) directClassFile.getConstantPool().get(bytes.getUnsignedShort(i5));
        AttSignature attSignature = new AttSignature(cstString);
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i5, 2, "signature: " + cstString);
        }
        return attSignature;
    }

    private Attribute sourceDebugExtension(DirectClassFile directClassFile, int i5, int i6, ParseObserver parseObserver) {
        ByteArray slice = directClassFile.getBytes().slice(i5, i5 + i6);
        CstString cstString = new CstString(slice);
        AttSourceDebugExtension attSourceDebugExtension = new AttSourceDebugExtension(cstString);
        if (parseObserver != null) {
            parseObserver.parsed(slice, i5, i6, "sourceDebugExtension: " + cstString.getString());
        }
        return attSourceDebugExtension;
    }

    private Attribute sourceFile(DirectClassFile directClassFile, int i5, int i6, ParseObserver parseObserver) {
        if (i6 != 2) {
            throwBadLength(2);
        }
        ByteArray bytes = directClassFile.getBytes();
        CstString cstString = (CstString) directClassFile.getConstantPool().get(bytes.getUnsignedShort(i5));
        AttSourceFile attSourceFile = new AttSourceFile(cstString);
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i5, 2, "source: " + cstString);
        }
        return attSourceFile;
    }

    private Attribute synthetic(DirectClassFile directClassFile, int i5, int i6, ParseObserver parseObserver) {
        if (i6 != 0) {
            return throwBadLength(0);
        }
        return new AttSynthetic();
    }

    private static Attribute throwBadLength(int i5) {
        throw new ParseException("bad attribute length; expected length " + Hex.u4(i5));
    }

    private static Attribute throwSeverelyTruncated() {
        throw new ParseException("severely truncated attribute");
    }

    private static Attribute throwTruncated() {
        throw new ParseException("truncated attribute");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.dx.cf.direct.AttributeFactory
    public Attribute parse0(DirectClassFile directClassFile, int i5, String str, int i6, int i7, ParseObserver parseObserver) {
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        if (str == AttLineNumberTable.ATTRIBUTE_NAME) {
                            return lineNumberTable(directClassFile, i6, i7, parseObserver);
                        }
                        if (str == AttLocalVariableTable.ATTRIBUTE_NAME) {
                            return localVariableTable(directClassFile, i6, i7, parseObserver);
                        }
                        if (str == AttLocalVariableTypeTable.ATTRIBUTE_NAME) {
                            return localVariableTypeTable(directClassFile, i6, i7, parseObserver);
                        }
                    }
                } else {
                    if (str == AttAnnotationDefault.ATTRIBUTE_NAME) {
                        return annotationDefault(directClassFile, i6, i7, parseObserver);
                    }
                    if (str == AttCode.ATTRIBUTE_NAME) {
                        return code(directClassFile, i6, i7, parseObserver);
                    }
                    if (str == AttDeprecated.ATTRIBUTE_NAME) {
                        return deprecated(directClassFile, i6, i7, parseObserver);
                    }
                    if (str == AttExceptions.ATTRIBUTE_NAME) {
                        return exceptions(directClassFile, i6, i7, parseObserver);
                    }
                    if (str == AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME) {
                        return runtimeInvisibleAnnotations(directClassFile, i6, i7, parseObserver);
                    }
                    if (str == AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME) {
                        return runtimeVisibleAnnotations(directClassFile, i6, i7, parseObserver);
                    }
                    if (str == AttRuntimeInvisibleParameterAnnotations.ATTRIBUTE_NAME) {
                        return runtimeInvisibleParameterAnnotations(directClassFile, i6, i7, parseObserver);
                    }
                    if (str == AttRuntimeVisibleParameterAnnotations.ATTRIBUTE_NAME) {
                        return runtimeVisibleParameterAnnotations(directClassFile, i6, i7, parseObserver);
                    }
                    if (str == AttSignature.ATTRIBUTE_NAME) {
                        return signature(directClassFile, i6, i7, parseObserver);
                    }
                    if (str == AttSynthetic.ATTRIBUTE_NAME) {
                        return synthetic(directClassFile, i6, i7, parseObserver);
                    }
                }
            } else {
                if (str == AttConstantValue.ATTRIBUTE_NAME) {
                    return constantValue(directClassFile, i6, i7, parseObserver);
                }
                if (str == AttDeprecated.ATTRIBUTE_NAME) {
                    return deprecated(directClassFile, i6, i7, parseObserver);
                }
                if (str == AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME) {
                    return runtimeInvisibleAnnotations(directClassFile, i6, i7, parseObserver);
                }
                if (str == AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME) {
                    return runtimeVisibleAnnotations(directClassFile, i6, i7, parseObserver);
                }
                if (str == AttSignature.ATTRIBUTE_NAME) {
                    return signature(directClassFile, i6, i7, parseObserver);
                }
                if (str == AttSynthetic.ATTRIBUTE_NAME) {
                    return synthetic(directClassFile, i6, i7, parseObserver);
                }
            }
        } else {
            if (str == AttBootstrapMethods.ATTRIBUTE_NAME) {
                return bootstrapMethods(directClassFile, i6, i7, parseObserver);
            }
            if (str == AttDeprecated.ATTRIBUTE_NAME) {
                return deprecated(directClassFile, i6, i7, parseObserver);
            }
            if (str == AttEnclosingMethod.ATTRIBUTE_NAME) {
                return enclosingMethod(directClassFile, i6, i7, parseObserver);
            }
            if (str == AttInnerClasses.ATTRIBUTE_NAME) {
                return innerClasses(directClassFile, i6, i7, parseObserver);
            }
            if (str == AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME) {
                return runtimeInvisibleAnnotations(directClassFile, i6, i7, parseObserver);
            }
            if (str == AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME) {
                return runtimeVisibleAnnotations(directClassFile, i6, i7, parseObserver);
            }
            if (str == AttSynthetic.ATTRIBUTE_NAME) {
                return synthetic(directClassFile, i6, i7, parseObserver);
            }
            if (str == AttSignature.ATTRIBUTE_NAME) {
                return signature(directClassFile, i6, i7, parseObserver);
            }
            if (str == AttSourceDebugExtension.ATTRIBUTE_NAME) {
                return sourceDebugExtension(directClassFile, i6, i7, parseObserver);
            }
            if (str == AttSourceFile.ATTRIBUTE_NAME) {
                return sourceFile(directClassFile, i6, i7, parseObserver);
            }
        }
        return super.parse0(directClassFile, i5, str, i6, i7, parseObserver);
    }
}
