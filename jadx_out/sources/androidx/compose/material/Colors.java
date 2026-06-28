package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import com.huawei.agconnect.apms.collect.model.event.interaction.ForeAndBackgroundEvent;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;

@Stable
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b0\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\bB\u0010CJ\u0092\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0016R1\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR1\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR1\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR1\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR1\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR1\u0010\b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR1\u0010\t\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR1\u0010\n\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b/\u0010\u0018\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR1\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b2\u0010\u0018\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR1\u0010\f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b5\u0010\u0018\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u0010\u001cR1\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b8\u0010\u0018\u001a\u0004\b9\u0010\u001a\"\u0004\b:\u0010\u001cR1\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b;\u0010\u0018\u001a\u0004\b<\u0010\u001a\"\u0004\b=\u0010\u001cR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010\u0018\u001a\u0004\b\u0010\u0010?\"\u0004\b@\u0010A\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/material/Colors;", "", "Landroidx/compose/ui/graphics/Color;", "primary", "primaryVariant", "secondary", "secondaryVariant", ForeAndBackgroundEvent.BACKGROUND, "surface", d.U, "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "", "isLight", "copy-pvPzIIM", "(JJJJJJJJJJJJZ)Landroidx/compose/material/Colors;", "copy", "", "toString", "<set-?>", "primary$delegate", "Landroidx/compose/runtime/MutableState;", "getPrimary-0d7_KjU", "()J", "setPrimary-8_81llA$material_release", "(J)V", "primaryVariant$delegate", "getPrimaryVariant-0d7_KjU", "setPrimaryVariant-8_81llA$material_release", "secondary$delegate", "getSecondary-0d7_KjU", "setSecondary-8_81llA$material_release", "secondaryVariant$delegate", "getSecondaryVariant-0d7_KjU", "setSecondaryVariant-8_81llA$material_release", "background$delegate", "getBackground-0d7_KjU", "setBackground-8_81llA$material_release", "surface$delegate", "getSurface-0d7_KjU", "setSurface-8_81llA$material_release", "error$delegate", "getError-0d7_KjU", "setError-8_81llA$material_release", "onPrimary$delegate", "getOnPrimary-0d7_KjU", "setOnPrimary-8_81llA$material_release", "onSecondary$delegate", "getOnSecondary-0d7_KjU", "setOnSecondary-8_81llA$material_release", "onBackground$delegate", "getOnBackground-0d7_KjU", "setOnBackground-8_81llA$material_release", "onSurface$delegate", "getOnSurface-0d7_KjU", "setOnSurface-8_81llA$material_release", "onError$delegate", "getOnError-0d7_KjU", "setOnError-8_81llA$material_release", "isLight$delegate", "()Z", "setLight$material_release", "(Z)V", "<init>", "(JJJJJJJJJJJJZLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Colors.kt\nandroidx/compose/material/Colors\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,337:1\n81#2:338\n107#2,2:339\n81#2:341\n107#2,2:342\n81#2:344\n107#2,2:345\n81#2:347\n107#2,2:348\n81#2:350\n107#2,2:351\n81#2:353\n107#2,2:354\n81#2:356\n107#2,2:357\n81#2:359\n107#2,2:360\n81#2:362\n107#2,2:363\n81#2:365\n107#2,2:366\n81#2:368\n107#2,2:369\n81#2:371\n107#2,2:372\n81#2:374\n107#2,2:375\n*S KotlinDebug\n*F\n+ 1 Colors.kt\nandroidx/compose/material/Colors\n*L\n82#1:338\n82#1:339,2\n84#1:341\n84#1:342,2\n86#1:344\n86#1:345,2\n88#1:347\n88#1:348,2\n90#1:350\n90#1:351,2\n92#1:353\n92#1:354,2\n94#1:356\n94#1:357,2\n96#1:359\n96#1:360,2\n98#1:362\n98#1:363,2\n100#1:365\n100#1:366,2\n102#1:368\n102#1:369,2\n104#1:371\n104#1:372,2\n106#1:374\n106#1:375,2\n*E\n"})
/* loaded from: classes.dex */
public final class Colors {
    public static final int $stable = 0;

    @l
    private final MutableState background$delegate;

    @l
    private final MutableState error$delegate;

    @l
    private final MutableState isLight$delegate;

    @l
    private final MutableState onBackground$delegate;

    @l
    private final MutableState onError$delegate;

    @l
    private final MutableState onPrimary$delegate;

    @l
    private final MutableState onSecondary$delegate;

    @l
    private final MutableState onSurface$delegate;

    @l
    private final MutableState primary$delegate;

    @l
    private final MutableState primaryVariant$delegate;

    @l
    private final MutableState secondary$delegate;

    @l
    private final MutableState secondaryVariant$delegate;

    @l
    private final MutableState surface$delegate;

    private Colors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z4) {
        this.primary$delegate = SnapshotStateKt.mutableStateOf(Color.m3724boximpl(j5), SnapshotStateKt.structuralEqualityPolicy());
        this.primaryVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m3724boximpl(j6), SnapshotStateKt.structuralEqualityPolicy());
        this.secondary$delegate = SnapshotStateKt.mutableStateOf(Color.m3724boximpl(j7), SnapshotStateKt.structuralEqualityPolicy());
        this.secondaryVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m3724boximpl(j8), SnapshotStateKt.structuralEqualityPolicy());
        this.background$delegate = SnapshotStateKt.mutableStateOf(Color.m3724boximpl(j9), SnapshotStateKt.structuralEqualityPolicy());
        this.surface$delegate = SnapshotStateKt.mutableStateOf(Color.m3724boximpl(j10), SnapshotStateKt.structuralEqualityPolicy());
        this.error$delegate = SnapshotStateKt.mutableStateOf(Color.m3724boximpl(j11), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimary$delegate = SnapshotStateKt.mutableStateOf(Color.m3724boximpl(j12), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondary$delegate = SnapshotStateKt.mutableStateOf(Color.m3724boximpl(j13), SnapshotStateKt.structuralEqualityPolicy());
        this.onBackground$delegate = SnapshotStateKt.mutableStateOf(Color.m3724boximpl(j14), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m3724boximpl(j15), SnapshotStateKt.structuralEqualityPolicy());
        this.onError$delegate = SnapshotStateKt.mutableStateOf(Color.m3724boximpl(j16), SnapshotStateKt.structuralEqualityPolicy());
        this.isLight$delegate = SnapshotStateKt.mutableStateOf(Boolean.valueOf(z4), SnapshotStateKt.structuralEqualityPolicy());
    }

    public /* synthetic */ Colors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z4, w wVar) {
        this(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, z4);
    }

    /* renamed from: copy-pvPzIIM$default, reason: not valid java name */
    public static /* synthetic */ Colors m1266copypvPzIIM$default(Colors colors, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z4, int i5, Object obj) {
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        boolean z5;
        if ((i5 & 1) != 0) {
            j17 = colors.m1275getPrimary0d7_KjU();
        } else {
            j17 = j5;
        }
        if ((i5 & 2) != 0) {
            j18 = colors.m1276getPrimaryVariant0d7_KjU();
        } else {
            j18 = j6;
        }
        if ((i5 & 4) != 0) {
            j19 = colors.m1277getSecondary0d7_KjU();
        } else {
            j19 = j7;
        }
        if ((i5 & 8) != 0) {
            j20 = colors.m1278getSecondaryVariant0d7_KjU();
        } else {
            j20 = j8;
        }
        if ((i5 & 16) != 0) {
            j21 = colors.m1268getBackground0d7_KjU();
        } else {
            j21 = j9;
        }
        if ((i5 & 32) != 0) {
            j22 = colors.m1279getSurface0d7_KjU();
        } else {
            j22 = j10;
        }
        if ((i5 & 64) != 0) {
            j23 = colors.m1269getError0d7_KjU();
        } else {
            j23 = j11;
        }
        if ((i5 & 128) != 0) {
            j24 = colors.m1272getOnPrimary0d7_KjU();
        } else {
            j24 = j12;
        }
        long j29 = j24;
        if ((i5 & 256) != 0) {
            j25 = colors.m1273getOnSecondary0d7_KjU();
        } else {
            j25 = j13;
        }
        long j30 = j25;
        if ((i5 & 512) != 0) {
            j26 = colors.m1270getOnBackground0d7_KjU();
        } else {
            j26 = j14;
        }
        long j31 = j26;
        if ((i5 & 1024) != 0) {
            j27 = colors.m1274getOnSurface0d7_KjU();
        } else {
            j27 = j15;
        }
        long j32 = j27;
        if ((i5 & 2048) != 0) {
            j28 = colors.m1271getOnError0d7_KjU();
        } else {
            j28 = j16;
        }
        if ((i5 & 4096) != 0) {
            z5 = colors.isLight();
        } else {
            z5 = z4;
        }
        return colors.m1267copypvPzIIM(j17, j18, j19, j20, j21, j22, j23, j29, j30, j31, j32, j28, z5);
    }

    @l
    /* renamed from: copy-pvPzIIM, reason: not valid java name */
    public final Colors m1267copypvPzIIM(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z4) {
        return new Colors(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, z4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m1268getBackground0d7_KjU() {
        return ((Color) this.background$delegate.getValue()).m3744unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m1269getError0d7_KjU() {
        return ((Color) this.error$delegate.getValue()).m3744unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m1270getOnBackground0d7_KjU() {
        return ((Color) this.onBackground$delegate.getValue()).m3744unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnError-0d7_KjU, reason: not valid java name */
    public final long m1271getOnError0d7_KjU() {
        return ((Color) this.onError$delegate.getValue()).m3744unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnPrimary-0d7_KjU, reason: not valid java name */
    public final long m1272getOnPrimary0d7_KjU() {
        return ((Color) this.onPrimary$delegate.getValue()).m3744unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnSecondary-0d7_KjU, reason: not valid java name */
    public final long m1273getOnSecondary0d7_KjU() {
        return ((Color) this.onSecondary$delegate.getValue()).m3744unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnSurface-0d7_KjU, reason: not valid java name */
    public final long m1274getOnSurface0d7_KjU() {
        return ((Color) this.onSurface$delegate.getValue()).m3744unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPrimary-0d7_KjU, reason: not valid java name */
    public final long m1275getPrimary0d7_KjU() {
        return ((Color) this.primary$delegate.getValue()).m3744unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPrimaryVariant-0d7_KjU, reason: not valid java name */
    public final long m1276getPrimaryVariant0d7_KjU() {
        return ((Color) this.primaryVariant$delegate.getValue()).m3744unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSecondary-0d7_KjU, reason: not valid java name */
    public final long m1277getSecondary0d7_KjU() {
        return ((Color) this.secondary$delegate.getValue()).m3744unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSecondaryVariant-0d7_KjU, reason: not valid java name */
    public final long m1278getSecondaryVariant0d7_KjU() {
        return ((Color) this.secondaryVariant$delegate.getValue()).m3744unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSurface-0d7_KjU, reason: not valid java name */
    public final long m1279getSurface0d7_KjU() {
        return ((Color) this.surface$delegate.getValue()).m3744unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isLight() {
        return ((Boolean) this.isLight$delegate.getValue()).booleanValue();
    }

    /* renamed from: setBackground-8_81llA$material_release, reason: not valid java name */
    public final void m1280setBackground8_81llA$material_release(long j5) {
        this.background$delegate.setValue(Color.m3724boximpl(j5));
    }

    /* renamed from: setError-8_81llA$material_release, reason: not valid java name */
    public final void m1281setError8_81llA$material_release(long j5) {
        this.error$delegate.setValue(Color.m3724boximpl(j5));
    }

    public final void setLight$material_release(boolean z4) {
        this.isLight$delegate.setValue(Boolean.valueOf(z4));
    }

    /* renamed from: setOnBackground-8_81llA$material_release, reason: not valid java name */
    public final void m1282setOnBackground8_81llA$material_release(long j5) {
        this.onBackground$delegate.setValue(Color.m3724boximpl(j5));
    }

    /* renamed from: setOnError-8_81llA$material_release, reason: not valid java name */
    public final void m1283setOnError8_81llA$material_release(long j5) {
        this.onError$delegate.setValue(Color.m3724boximpl(j5));
    }

    /* renamed from: setOnPrimary-8_81llA$material_release, reason: not valid java name */
    public final void m1284setOnPrimary8_81llA$material_release(long j5) {
        this.onPrimary$delegate.setValue(Color.m3724boximpl(j5));
    }

    /* renamed from: setOnSecondary-8_81llA$material_release, reason: not valid java name */
    public final void m1285setOnSecondary8_81llA$material_release(long j5) {
        this.onSecondary$delegate.setValue(Color.m3724boximpl(j5));
    }

    /* renamed from: setOnSurface-8_81llA$material_release, reason: not valid java name */
    public final void m1286setOnSurface8_81llA$material_release(long j5) {
        this.onSurface$delegate.setValue(Color.m3724boximpl(j5));
    }

    /* renamed from: setPrimary-8_81llA$material_release, reason: not valid java name */
    public final void m1287setPrimary8_81llA$material_release(long j5) {
        this.primary$delegate.setValue(Color.m3724boximpl(j5));
    }

    /* renamed from: setPrimaryVariant-8_81llA$material_release, reason: not valid java name */
    public final void m1288setPrimaryVariant8_81llA$material_release(long j5) {
        this.primaryVariant$delegate.setValue(Color.m3724boximpl(j5));
    }

    /* renamed from: setSecondary-8_81llA$material_release, reason: not valid java name */
    public final void m1289setSecondary8_81llA$material_release(long j5) {
        this.secondary$delegate.setValue(Color.m3724boximpl(j5));
    }

    /* renamed from: setSecondaryVariant-8_81llA$material_release, reason: not valid java name */
    public final void m1290setSecondaryVariant8_81llA$material_release(long j5) {
        this.secondaryVariant$delegate.setValue(Color.m3724boximpl(j5));
    }

    /* renamed from: setSurface-8_81llA$material_release, reason: not valid java name */
    public final void m1291setSurface8_81llA$material_release(long j5) {
        this.surface$delegate.setValue(Color.m3724boximpl(j5));
    }

    @l
    public String toString() {
        return "Colors(primary=" + ((Object) Color.m3742toStringimpl(m1275getPrimary0d7_KjU())) + ", primaryVariant=" + ((Object) Color.m3742toStringimpl(m1276getPrimaryVariant0d7_KjU())) + ", secondary=" + ((Object) Color.m3742toStringimpl(m1277getSecondary0d7_KjU())) + ", secondaryVariant=" + ((Object) Color.m3742toStringimpl(m1278getSecondaryVariant0d7_KjU())) + ", background=" + ((Object) Color.m3742toStringimpl(m1268getBackground0d7_KjU())) + ", surface=" + ((Object) Color.m3742toStringimpl(m1279getSurface0d7_KjU())) + ", error=" + ((Object) Color.m3742toStringimpl(m1269getError0d7_KjU())) + ", onPrimary=" + ((Object) Color.m3742toStringimpl(m1272getOnPrimary0d7_KjU())) + ", onSecondary=" + ((Object) Color.m3742toStringimpl(m1273getOnSecondary0d7_KjU())) + ", onBackground=" + ((Object) Color.m3742toStringimpl(m1270getOnBackground0d7_KjU())) + ", onSurface=" + ((Object) Color.m3742toStringimpl(m1274getOnSurface0d7_KjU())) + ", onError=" + ((Object) Color.m3742toStringimpl(m1271getOnError0d7_KjU())) + ", isLight=" + isLight() + ')';
    }
}
