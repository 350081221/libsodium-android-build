package androidx.constraintlayout.core.parser;

/* loaded from: classes2.dex */
public class CLParser {
    static boolean DEBUG = false;
    private boolean hasComment = false;
    private int lineNumber;
    private String mContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.core.parser.CLParser$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE;

        static {
            int[] iArr = new int[TYPE.values().length];
            $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE = iArr;
            try {
                iArr[TYPE.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[TYPE.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[TYPE.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[TYPE.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[TYPE.KEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[TYPE.TOKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public CLParser(String str) {
        this.mContent = str;
    }

    private CLElement createElement(CLElement cLElement, int i5, TYPE type, boolean z4, char[] cArr) {
        CLElement allocate;
        if (DEBUG) {
            System.out.println("CREATE " + type + " at " + cArr[i5]);
        }
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[type.ordinal()]) {
            case 1:
                allocate = CLObject.allocate(cArr);
                i5++;
                break;
            case 2:
                allocate = CLArray.allocate(cArr);
                i5++;
                break;
            case 3:
                allocate = CLString.allocate(cArr);
                break;
            case 4:
                allocate = CLNumber.allocate(cArr);
                break;
            case 5:
                allocate = CLKey.allocate(cArr);
                break;
            case 6:
                allocate = CLToken.allocate(cArr);
                break;
            default:
                allocate = null;
                break;
        }
        if (allocate == null) {
            return null;
        }
        allocate.setLine(this.lineNumber);
        if (z4) {
            allocate.setStart(i5);
        }
        if (cLElement instanceof CLContainer) {
            allocate.setContainer((CLContainer) cLElement);
        }
        return allocate;
    }

    private CLElement getNextJsonElement(int i5, char c5, CLElement cLElement, char[] cArr) throws CLParsingException {
        if (c5 != '\t' && c5 != '\n' && c5 != '\r' && c5 != ' ') {
            if (c5 != '\"' && c5 != '\'') {
                if (c5 != '[') {
                    if (c5 != ']') {
                        if (c5 != '{') {
                            if (c5 != '}') {
                                switch (c5) {
                                    case '+':
                                    case '-':
                                    case '.':
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        return createElement(cLElement, i5, TYPE.NUMBER, true, cArr);
                                    case ',':
                                    case ':':
                                        return cLElement;
                                    case '/':
                                        int i6 = i5 + 1;
                                        if (i6 < cArr.length && cArr[i6] == '/') {
                                            this.hasComment = true;
                                            return cLElement;
                                        }
                                        return cLElement;
                                    default:
                                        if ((cLElement instanceof CLContainer) && !(cLElement instanceof CLObject)) {
                                            CLElement createElement = createElement(cLElement, i5, TYPE.TOKEN, true, cArr);
                                            CLToken cLToken = (CLToken) createElement;
                                            if (!cLToken.validate(c5, i5)) {
                                                throw new CLParsingException("incorrect token <" + c5 + "> at line " + this.lineNumber, cLToken);
                                            }
                                            return createElement;
                                        }
                                        return createElement(cLElement, i5, TYPE.KEY, true, cArr);
                                }
                            }
                        } else {
                            return createElement(cLElement, i5, TYPE.OBJECT, true, cArr);
                        }
                    }
                    cLElement.setEnd(i5 - 1);
                    CLElement container = cLElement.getContainer();
                    container.setEnd(i5);
                    return container;
                }
                return createElement(cLElement, i5, TYPE.ARRAY, true, cArr);
            }
            if (cLElement instanceof CLObject) {
                return createElement(cLElement, i5, TYPE.KEY, true, cArr);
            }
            return createElement(cLElement, i5, TYPE.STRING, true, cArr);
        }
        return cLElement;
    }

    public static CLObject parse(String str) throws CLParsingException {
        return new CLParser(str).parse();
    }

    public CLObject parse() throws CLParsingException {
        char[] charArray = this.mContent.toCharArray();
        int length = charArray.length;
        int i5 = 1;
        this.lineNumber = 1;
        boolean z4 = false;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                i6 = -1;
                break;
            }
            char c5 = charArray[i6];
            if (c5 == '{') {
                break;
            }
            if (c5 == '\n') {
                this.lineNumber++;
            }
            i6++;
        }
        if (i6 != -1) {
            CLObject allocate = CLObject.allocate(charArray);
            allocate.setLine(this.lineNumber);
            allocate.setStart(i6);
            int i7 = i6 + 1;
            CLElement cLElement = allocate;
            while (i7 < length) {
                char c6 = charArray[i7];
                if (c6 == '\n') {
                    this.lineNumber += i5;
                }
                if (this.hasComment) {
                    if (c6 == '\n') {
                        this.hasComment = z4;
                    } else {
                        continue;
                        i7++;
                        i5 = 1;
                        z4 = false;
                    }
                }
                if (cLElement == null) {
                    break;
                }
                if (cLElement.isDone()) {
                    cLElement = getNextJsonElement(i7, c6, cLElement, charArray);
                } else if (cLElement instanceof CLObject) {
                    if (c6 == '}') {
                        cLElement.setEnd(i7 - 1);
                    } else {
                        cLElement = getNextJsonElement(i7, c6, cLElement, charArray);
                    }
                } else if (!(cLElement instanceof CLArray)) {
                    boolean z5 = cLElement instanceof CLString;
                    if (z5) {
                        long j5 = cLElement.start;
                        if (charArray[(int) j5] == c6) {
                            cLElement.setStart(j5 + 1);
                            cLElement.setEnd(i7 - 1);
                        }
                    } else {
                        if (cLElement instanceof CLToken) {
                            CLToken cLToken = (CLToken) cLElement;
                            if (!cLToken.validate(c6, i7)) {
                                throw new CLParsingException("parsing incorrect token " + cLToken.content() + " at line " + this.lineNumber, cLToken);
                            }
                        }
                        if ((cLElement instanceof CLKey) || z5) {
                            long j6 = cLElement.start;
                            char c7 = charArray[(int) j6];
                            if ((c7 == '\'' || c7 == '\"') && c7 == c6) {
                                cLElement.setStart(j6 + 1);
                                cLElement.setEnd(i7 - 1);
                            }
                        }
                        if (!cLElement.isDone() && (c6 == '}' || c6 == ']' || c6 == ',' || c6 == ' ' || c6 == '\t' || c6 == '\r' || c6 == '\n' || c6 == ':')) {
                            long j7 = i7 - 1;
                            cLElement.setEnd(j7);
                            if (c6 == '}' || c6 == ']') {
                                cLElement = cLElement.getContainer();
                                cLElement.setEnd(j7);
                                if (cLElement instanceof CLKey) {
                                    cLElement = cLElement.getContainer();
                                    cLElement.setEnd(j7);
                                }
                            }
                        }
                    }
                } else if (c6 == ']') {
                    cLElement.setEnd(i7 - 1);
                } else {
                    cLElement = getNextJsonElement(i7, c6, cLElement, charArray);
                }
                if (cLElement.isDone() && (!(cLElement instanceof CLKey) || ((CLKey) cLElement).mElements.size() > 0)) {
                    cLElement = cLElement.getContainer();
                }
                i7++;
                i5 = 1;
                z4 = false;
            }
            while (cLElement != null && !cLElement.isDone()) {
                if (cLElement instanceof CLString) {
                    cLElement.setStart(((int) cLElement.start) + 1);
                }
                cLElement.setEnd(length - 1);
                cLElement = cLElement.getContainer();
            }
            if (DEBUG) {
                System.out.println("Root: " + allocate.toJSON());
            }
            return allocate;
        }
        throw new CLParsingException("invalid json content", null);
    }
}
