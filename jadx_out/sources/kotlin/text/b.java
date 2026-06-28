package kotlin.text;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.x0;
import kotlin.jvm.internal.r1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001c"}, d2 = {"Lkotlin/text/CharDirectionality;", "", t0.b.f22420d, "", "(Ljava/lang/String;II)V", "getValue", "()I", "UNDEFINED", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "RIGHT_TO_LEFT_ARABIC", "EUROPEAN_NUMBER", "EUROPEAN_NUMBER_SEPARATOR", "EUROPEAN_NUMBER_TERMINATOR", "ARABIC_NUMBER", "COMMON_NUMBER_SEPARATOR", "NONSPACING_MARK", "BOUNDARY_NEUTRAL", "PARAGRAPH_SEPARATOR", "SEGMENT_SEPARATOR", "WHITESPACE", "OTHER_NEUTRALS", "LEFT_TO_RIGHT_EMBEDDING", "LEFT_TO_RIGHT_OVERRIDE", "RIGHT_TO_LEFT_EMBEDDING", "RIGHT_TO_LEFT_OVERRIDE", "POP_DIRECTIONAL_FORMAT", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @p4.l
    public static final C0564b Companion;

    @p4.l
    private static final kotlin.d0<Map<Integer, b>> directionalityMap$delegate;
    private final int value;
    public static final b UNDEFINED = new b("UNDEFINED", 0, -1);
    public static final b LEFT_TO_RIGHT = new b("LEFT_TO_RIGHT", 1, 0);
    public static final b RIGHT_TO_LEFT = new b("RIGHT_TO_LEFT", 2, 1);
    public static final b RIGHT_TO_LEFT_ARABIC = new b("RIGHT_TO_LEFT_ARABIC", 3, 2);
    public static final b EUROPEAN_NUMBER = new b("EUROPEAN_NUMBER", 4, 3);
    public static final b EUROPEAN_NUMBER_SEPARATOR = new b("EUROPEAN_NUMBER_SEPARATOR", 5, 4);
    public static final b EUROPEAN_NUMBER_TERMINATOR = new b("EUROPEAN_NUMBER_TERMINATOR", 6, 5);
    public static final b ARABIC_NUMBER = new b("ARABIC_NUMBER", 7, 6);
    public static final b COMMON_NUMBER_SEPARATOR = new b("COMMON_NUMBER_SEPARATOR", 8, 7);
    public static final b NONSPACING_MARK = new b("NONSPACING_MARK", 9, 8);
    public static final b BOUNDARY_NEUTRAL = new b("BOUNDARY_NEUTRAL", 10, 9);
    public static final b PARAGRAPH_SEPARATOR = new b("PARAGRAPH_SEPARATOR", 11, 10);
    public static final b SEGMENT_SEPARATOR = new b("SEGMENT_SEPARATOR", 12, 11);
    public static final b WHITESPACE = new b("WHITESPACE", 13, 12);
    public static final b OTHER_NEUTRALS = new b("OTHER_NEUTRALS", 14, 13);
    public static final b LEFT_TO_RIGHT_EMBEDDING = new b("LEFT_TO_RIGHT_EMBEDDING", 15, 14);
    public static final b LEFT_TO_RIGHT_OVERRIDE = new b("LEFT_TO_RIGHT_OVERRIDE", 16, 15);
    public static final b RIGHT_TO_LEFT_EMBEDDING = new b("RIGHT_TO_LEFT_EMBEDDING", 17, 16);
    public static final b RIGHT_TO_LEFT_OVERRIDE = new b("RIGHT_TO_LEFT_OVERRIDE", 18, 17);
    public static final b POP_DIRECTIONAL_FORMAT = new b("POP_DIRECTIONAL_FORMAT", 19, 18);

    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lkotlin/text/CharDirectionality;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nCharDirectionality.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality$Companion$directionalityMap$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,123:1\n8541#2,2:124\n8801#2,4:126\n*S KotlinDebug\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality$Companion$directionalityMap$2\n*L\n118#1:124,2\n118#1:126,4\n*E\n"})
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.n0 implements v3.a<Map<Integer, ? extends b>> {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        @Override // v3.a
        @p4.l
        public final Map<Integer, ? extends b> invoke() {
            int u4;
            b[] values = b.values();
            u4 = kotlin.ranges.u.u(x0.j(values.length), 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(u4);
            for (b bVar : values) {
                linkedHashMap.put(Integer.valueOf(bVar.getValue()), bVar);
            }
            return linkedHashMap;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/text/CharDirectionality$Companion;", "", "()V", "directionalityMap", "", "", "Lkotlin/text/CharDirectionality;", "getDirectionalityMap", "()Ljava/util/Map;", "directionalityMap$delegate", "Lkotlin/Lazy;", "valueOf", "directionality", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0564b {
        private C0564b() {
        }

        public /* synthetic */ C0564b(kotlin.jvm.internal.w wVar) {
            this();
        }

        private final Map<Integer, b> a() {
            return (Map) b.directionalityMap$delegate.getValue();
        }

        @p4.l
        public final b b(int i5) {
            b bVar = a().get(Integer.valueOf(i5));
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalArgumentException("Directionality #" + i5 + " is not defined.");
        }
    }

    private static final /* synthetic */ b[] $values() {
        return new b[]{UNDEFINED, LEFT_TO_RIGHT, RIGHT_TO_LEFT, RIGHT_TO_LEFT_ARABIC, EUROPEAN_NUMBER, EUROPEAN_NUMBER_SEPARATOR, EUROPEAN_NUMBER_TERMINATOR, ARABIC_NUMBER, COMMON_NUMBER_SEPARATOR, NONSPACING_MARK, BOUNDARY_NEUTRAL, PARAGRAPH_SEPARATOR, SEGMENT_SEPARATOR, WHITESPACE, OTHER_NEUTRALS, LEFT_TO_RIGHT_EMBEDDING, LEFT_TO_RIGHT_OVERRIDE, RIGHT_TO_LEFT_EMBEDDING, RIGHT_TO_LEFT_OVERRIDE, POP_DIRECTIONAL_FORMAT};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        Companion = new C0564b(null);
        directionalityMap$delegate = kotlin.e0.c(a.INSTANCE);
        $ENTRIES = kotlin.enums.b.b($values);
    }

    private b(String str, int i5, int i6) {
        this.value = i6;
    }

    @p4.l
    public static kotlin.enums.a<b> getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
