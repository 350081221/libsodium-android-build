package androidx.constraintlayout.core.parser;

/* loaded from: classes2.dex */
public class CLToken extends CLElement {
    int index;
    char[] tokenFalse;
    char[] tokenNull;
    char[] tokenTrue;
    Type type;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.core.parser.CLToken$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type = iArr;
            try {
                iArr[Type.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type[Type.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type[Type.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type[Type.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum Type {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public CLToken(char[] cArr) {
        super(cArr);
        this.index = 0;
        this.type = Type.UNKNOWN;
        this.tokenTrue = "true".toCharArray();
        this.tokenFalse = "false".toCharArray();
        this.tokenNull = "null".toCharArray();
    }

    public static CLElement allocate(char[] cArr) {
        return new CLToken(cArr);
    }

    public boolean getBoolean() throws CLParsingException {
        Type type = this.type;
        if (type == Type.TRUE) {
            return true;
        }
        if (type == Type.FALSE) {
            return false;
        }
        throw new CLParsingException("this token is not a boolean: <" + content() + ">", this);
    }

    public Type getType() {
        return this.type;
    }

    public boolean isNull() throws CLParsingException {
        if (this.type == Type.NULL) {
            return true;
        }
        throw new CLParsingException("this token is not a null: <" + content() + ">", this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i5, int i6) {
        StringBuilder sb = new StringBuilder();
        addIndent(sb, i5);
        sb.append(content());
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        if (CLParser.DEBUG) {
            return "<" + content() + ">";
        }
        return content();
    }

    public boolean validate(char c5, long j5) {
        int i5 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type[this.type.ordinal()];
        boolean z4 = false;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 == 4) {
                        char[] cArr = this.tokenTrue;
                        int i6 = this.index;
                        if (cArr[i6] == c5) {
                            this.type = Type.TRUE;
                        } else if (this.tokenFalse[i6] == c5) {
                            this.type = Type.FALSE;
                        } else if (this.tokenNull[i6] == c5) {
                            this.type = Type.NULL;
                        }
                        z4 = true;
                    }
                } else {
                    char[] cArr2 = this.tokenNull;
                    int i7 = this.index;
                    if (cArr2[i7] == c5) {
                        z4 = true;
                    }
                    if (z4 && i7 + 1 == cArr2.length) {
                        setEnd(j5);
                    }
                }
            } else {
                char[] cArr3 = this.tokenFalse;
                int i8 = this.index;
                if (cArr3[i8] == c5) {
                    z4 = true;
                }
                if (z4 && i8 + 1 == cArr3.length) {
                    setEnd(j5);
                }
            }
        } else {
            char[] cArr4 = this.tokenTrue;
            int i9 = this.index;
            if (cArr4[i9] == c5) {
                z4 = true;
            }
            if (z4 && i9 + 1 == cArr4.length) {
                setEnd(j5);
            }
        }
        this.index++;
        return z4;
    }
}
