package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import t0.b;
import u3.f;

@f
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0097\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u001e\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000fJ\u001b\u0010\u001c\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u000fJ\u001e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u000fJ\u001e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0011J\u000f\u0010 \u001a\u00020!H\u0017¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "", b.f22420d, "", "constructor-impl", "(F)F", "getValue", "()F", "compareTo", "", "other", "compareTo-0680j_4", "(FF)I", "div", "div-0680j_4", "(FF)F", "div-u2uoSUM", "(FI)F", "equals", "", "", "equals-impl", "(FLjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "(F)I", "minus", "minus-5rwHm24", "plus", "plus-5rwHm24", "times", "times-u2uoSUM", "toString", "", "toString-impl", "(F)Ljava/lang/String;", "unaryMinus", "unaryMinus-D9Ej5fM", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@r1({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,557:1\n137#2:558\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n101#1:558\n*E\n"})
/* loaded from: classes.dex */
public final class Dp implements Comparable<Dp> {

    @l
    public static final Companion Companion = new Companion(null);
    private static final float Hairline = m6044constructorimpl(0.0f);
    private static final float Infinity = m6044constructorimpl(Float.POSITIVE_INFINITY);
    private static final float Unspecified = m6044constructorimpl(Float.NaN);
    private final float value;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R$\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/unit/Dp$Companion;", "", "()V", "Hairline", "Landroidx/compose/ui/unit/Dp;", "getHairline-D9Ej5fM$annotations", "getHairline-D9Ej5fM", "()F", "F", "Infinity", "getInfinity-D9Ej5fM$annotations", "getInfinity-D9Ej5fM", "Unspecified", "getUnspecified-D9Ej5fM$annotations", "getUnspecified-D9Ej5fM", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @Stable
        /* renamed from: getHairline-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m6059getHairlineD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getInfinity-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m6060getInfinityD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m6061getUnspecifiedD9Ej5fM$annotations() {
        }

        /* renamed from: getHairline-D9Ej5fM, reason: not valid java name */
        public final float m6062getHairlineD9Ej5fM() {
            return Dp.Hairline;
        }

        /* renamed from: getInfinity-D9Ej5fM, reason: not valid java name */
        public final float m6063getInfinityD9Ej5fM() {
            return Dp.Infinity;
        }

        /* renamed from: getUnspecified-D9Ej5fM, reason: not valid java name */
        public final float m6064getUnspecifiedD9Ej5fM() {
            return Dp.Unspecified;
        }
    }

    private /* synthetic */ Dp(float f5) {
        this.value = f5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Dp m6042boximpl(float f5) {
        return new Dp(f5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m6044constructorimpl(float f5) {
        return f5;
    }

    @Stable
    /* renamed from: div-0680j_4, reason: not valid java name */
    public static final float m6045div0680j_4(float f5, float f6) {
        return f5 / f6;
    }

    @Stable
    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m6046divu2uoSUM(float f5, float f6) {
        return m6044constructorimpl(f5 / f6);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6048equalsimpl(float f5, Object obj) {
        return (obj instanceof Dp) && Float.compare(f5, ((Dp) obj).m6058unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6049equalsimpl0(float f5, float f6) {
        return Float.compare(f5, f6) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6050hashCodeimpl(float f5) {
        return Float.hashCode(f5);
    }

    @Stable
    /* renamed from: minus-5rwHm24, reason: not valid java name */
    public static final float m6051minus5rwHm24(float f5, float f6) {
        return m6044constructorimpl(f5 - f6);
    }

    @Stable
    /* renamed from: plus-5rwHm24, reason: not valid java name */
    public static final float m6052plus5rwHm24(float f5, float f6) {
        return m6044constructorimpl(f5 + f6);
    }

    @Stable
    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m6053timesu2uoSUM(float f5, float f6) {
        return m6044constructorimpl(f5 * f6);
    }

    @Stable
    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6055toStringimpl(float f5) {
        if (Float.isNaN(f5)) {
            return "Dp.Unspecified";
        }
        return f5 + ".dp";
    }

    @Stable
    /* renamed from: unaryMinus-D9Ej5fM, reason: not valid java name */
    public static final float m6056unaryMinusD9Ej5fM(float f5) {
        return m6044constructorimpl(-f5);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Dp dp) {
        return m6057compareTo0680j_4(dp.m6058unboximpl());
    }

    @Stable
    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public int m6057compareTo0680j_4(float f5) {
        return m6043compareTo0680j_4(this.value, f5);
    }

    public boolean equals(Object obj) {
        return m6048equalsimpl(this.value, obj);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return m6050hashCodeimpl(this.value);
    }

    @Stable
    @l
    public String toString() {
        return m6055toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m6058unboximpl() {
        return this.value;
    }

    @Stable
    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public static int m6043compareTo0680j_4(float f5, float f6) {
        return Float.compare(f5, f6);
    }

    @Stable
    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m6047divu2uoSUM(float f5, int i5) {
        return m6044constructorimpl(f5 / i5);
    }

    @Stable
    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m6054timesu2uoSUM(float f5, int i5) {
        return m6044constructorimpl(f5 * i5);
    }
}
