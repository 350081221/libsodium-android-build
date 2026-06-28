package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import java.util.Arrays;

@kotlin.i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\b\u0087@\u0018\u0000 H2\u00020\u0001:\u0001HB\u0011\u0012\b\b\u0002\u0010B\u001a\u00020A¢\u0006\u0004\bF\u0010GJ \u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010#\u001a\u00020\n¢\u0006\u0004\b!\u0010\"J\r\u0010%\u001a\u00020\n¢\u0006\u0004\b$\u0010\"J\u0018\u0010(\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b'\u0010\u001bJ\u0015\u0010,\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0005¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0005¢\u0006\u0004\b-\u0010+J\u0015\u00100\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0005¢\u0006\u0004\b/\u0010+J+\u00106\u001a\u00020\n2\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u0005¢\u0006\u0004\b4\u00105J+\u00108\u001a\u00020\n2\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u0005¢\u0006\u0004\b7\u00105J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010@\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b>\u0010?R\u0017\u0010B\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\u0088\u0001B\u0092\u0001\u00020A\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006I"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "", "row", "column", "", "get-impl", "([FII)F", "get", "v", "Lkotlin/r2;", "set-impl", "([FIIF)V", "set", "Landroidx/compose/ui/geometry/Offset;", "point", "map-MK-Hz9U", "([FJ)J", "map", "Landroidx/compose/ui/geometry/Rect;", "rect", "map-impl", "([FLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/MutableRect;", "([FLandroidx/compose/ui/geometry/MutableRect;)V", "m", "timesAssign-58bKbWc", "([F[F)V", "timesAssign", "", "toString-impl", "([F)Ljava/lang/String;", "toString", "invert-impl", "([F)V", "invert", "reset-impl", "reset", "matrix", "setFrom-58bKbWc", "setFrom", "degrees", "rotateX-impl", "([FF)V", "rotateX", "rotateY-impl", "rotateY", "rotateZ-impl", "rotateZ", "x", "y", bi.aG, "scale-impl", "([FFFF)V", "scale", "translate-impl", "translate", "hashCode-impl", "([F)I", TTDownloadField.TT_HASHCODE, "other", "", "equals-impl", "([FLjava/lang/Object;)Z", "equals", "", "values", "[F", "getValues", "()[F", "constructor-impl", "([F)[F", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@u3.f
@kotlin.jvm.internal.r1({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,441:1\n39#1:442\n39#1:443\n39#1:444\n42#1,2:445\n42#1,2:447\n42#1,2:449\n42#1,2:451\n42#1,2:453\n42#1,2:455\n42#1,2:457\n42#1,2:459\n42#1,2:461\n42#1,2:463\n42#1,2:465\n42#1,2:467\n42#1,2:469\n42#1,2:471\n42#1,2:473\n42#1,2:475\n39#1:477\n39#1:478\n39#1:479\n39#1:480\n39#1:481\n39#1:482\n39#1:483\n39#1:484\n39#1:485\n39#1:486\n39#1:487\n39#1:488\n39#1:489\n39#1:490\n39#1:491\n39#1:492\n39#1:493\n39#1:494\n39#1:495\n39#1:496\n42#1,2:497\n42#1,2:499\n42#1,2:501\n42#1,2:503\n42#1,2:505\n42#1,2:507\n42#1,2:509\n42#1,2:511\n42#1,2:513\n42#1,2:515\n42#1,2:517\n42#1,2:519\n42#1,2:521\n42#1,2:523\n42#1,2:525\n42#1,2:527\n42#1,2:529\n39#1:531\n39#1:532\n39#1:533\n39#1:534\n39#1:535\n39#1:536\n39#1:537\n39#1:538\n42#1,2:539\n42#1,2:541\n42#1,2:543\n42#1,2:545\n42#1,2:547\n42#1,2:549\n42#1,2:551\n42#1,2:553\n39#1:555\n39#1:556\n39#1:557\n39#1:558\n39#1:559\n39#1:560\n39#1:561\n39#1:562\n42#1,2:563\n42#1,2:565\n42#1,2:567\n42#1,2:569\n42#1,2:571\n42#1,2:573\n42#1,2:575\n42#1,2:577\n39#1:579\n39#1:580\n39#1:581\n39#1:582\n39#1:583\n39#1:584\n39#1:585\n39#1:586\n42#1,2:587\n42#1,2:589\n42#1,2:591\n42#1,2:593\n42#1,2:595\n42#1,2:597\n42#1,2:599\n42#1,2:601\n39#1,5:603\n39#1,5:608\n39#1,5:613\n39#1,5:618\n39#1,5:623\n39#1,5:628\n39#1,5:633\n39#1,5:638\n39#1,5:643\n39#1,5:648\n39#1,5:653\n39#1,5:658\n39#1:663\n39#1:664\n39#1:665\n39#1:666\n39#1:667\n39#1:668\n39#1:669\n39#1:670\n39#1:671\n39#1:672\n39#1:673\n39#1:674\n39#1:675\n39#1:676\n39#1:677\n39#1:678\n42#1,2:679\n42#1,2:681\n42#1,2:683\n42#1,2:685\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n51#1:442\n56#1:443\n57#1:444\n112#1:445,2\n113#1:447,2\n114#1:449,2\n115#1:451,2\n116#1:453,2\n117#1:455,2\n118#1:457,2\n119#1:459,2\n120#1:461,2\n121#1:463,2\n122#1:465,2\n123#1:467,2\n124#1:469,2\n125#1:471,2\n126#1:473,2\n127#1:475,2\n132#1:477\n133#1:478\n134#1:479\n135#1:480\n143#1:481\n144#1:482\n145#1:483\n146#1:484\n147#1:485\n148#1:486\n149#1:487\n150#1:488\n151#1:489\n152#1:490\n153#1:491\n154#1:492\n155#1:493\n156#1:494\n157#1:495\n158#1:496\n177#1:497,2\n178#1:499,2\n179#1:501,2\n180#1:503,2\n181#1:505,2\n182#1:507,2\n183#1:509,2\n184#1:511,2\n185#1:513,2\n186#1:515,2\n187#1:517,2\n188#1:519,2\n189#1:521,2\n190#1:523,2\n191#1:525,2\n192#1:527,2\n201#1:529,2\n220#1:531\n221#1:532\n225#1:533\n226#1:534\n230#1:535\n231#1:536\n235#1:537\n236#1:538\n240#1:539,2\n241#1:541,2\n242#1:543,2\n243#1:545,2\n244#1:547,2\n245#1:549,2\n246#1:551,2\n247#1:553,2\n257#1:555\n258#1:556\n262#1:557\n263#1:558\n267#1:559\n268#1:560\n272#1:561\n273#1:562\n277#1:563,2\n278#1:565,2\n279#1:567,2\n280#1:569,2\n281#1:571,2\n282#1:573,2\n283#1:575,2\n284#1:577,2\n294#1:579\n295#1:580\n299#1:581\n300#1:582\n304#1:583\n305#1:584\n309#1:585\n310#1:586\n314#1:587,2\n315#1:589,2\n316#1:591,2\n317#1:593,2\n318#1:595,2\n319#1:597,2\n320#1:599,2\n321#1:601,2\n326#1:603,5\n327#1:608,5\n328#1:613,5\n329#1:618,5\n330#1:623,5\n331#1:628,5\n332#1:633,5\n333#1:638,5\n334#1:643,5\n335#1:648,5\n336#1:653,5\n337#1:658,5\n342#1:663\n343#1:664\n344#1:665\n345#1:666\n346#1:667\n347#1:668\n348#1:669\n349#1:670\n350#1:671\n351#1:672\n352#1:673\n353#1:674\n354#1:675\n355#1:676\n356#1:677\n357#1:678\n358#1:679,2\n359#1:681,2\n360#1:683,2\n361#1:685,2\n*E\n"})
/* loaded from: classes.dex */
public final class Matrix {

    @p4.l
    public static final Companion Companion = new Companion(null);
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;

    @p4.l
    private final float[] values;

    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/Matrix$Companion;", "", "()V", "Perspective0", "", "Perspective1", "Perspective2", "ScaleX", "ScaleY", "ScaleZ", "SkewX", "SkewY", "TranslateX", "TranslateY", "TranslateZ", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ Matrix m3962boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    @p4.l
    /* renamed from: constructor-impl */
    public static float[] m3963constructorimpl(@p4.l float[] fArr) {
        return fArr;
    }

    /* renamed from: constructor-impl$default */
    public static /* synthetic */ float[] m3964constructorimpl$default(float[] fArr, int i5, kotlin.jvm.internal.w wVar) {
        if ((i5 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m3963constructorimpl(fArr);
    }

    /* renamed from: equals-impl */
    public static boolean m3965equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && kotlin.jvm.internal.l0.g(fArr, ((Matrix) obj).m3985unboximpl());
    }

    /* renamed from: equals-impl0 */
    public static final boolean m3966equalsimpl0(float[] fArr, float[] fArr2) {
        return kotlin.jvm.internal.l0.g(fArr, fArr2);
    }

    /* renamed from: get-impl */
    public static final float m3967getimpl(float[] fArr, int i5, int i6) {
        return fArr[(i5 * 4) + i6];
    }

    /* renamed from: hashCode-impl */
    public static int m3968hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: invert-impl */
    public static final void m3969invertimpl(float[] fArr) {
        boolean z4;
        float f5 = fArr[0];
        float f6 = fArr[1];
        float f7 = fArr[2];
        float f8 = fArr[3];
        float f9 = fArr[4];
        float f10 = fArr[5];
        float f11 = fArr[6];
        float f12 = fArr[7];
        float f13 = fArr[8];
        float f14 = fArr[9];
        float f15 = fArr[10];
        float f16 = fArr[11];
        float f17 = fArr[12];
        float f18 = fArr[13];
        float f19 = fArr[14];
        float f20 = fArr[15];
        float f21 = (f5 * f10) - (f6 * f9);
        float f22 = (f5 * f11) - (f7 * f9);
        float f23 = (f5 * f12) - (f8 * f9);
        float f24 = (f6 * f11) - (f7 * f10);
        float f25 = (f6 * f12) - (f8 * f10);
        float f26 = (f7 * f12) - (f8 * f11);
        float f27 = (f13 * f18) - (f14 * f17);
        float f28 = (f13 * f19) - (f15 * f17);
        float f29 = (f13 * f20) - (f16 * f17);
        float f30 = (f14 * f19) - (f15 * f18);
        float f31 = (f14 * f20) - (f16 * f18);
        float f32 = (f15 * f20) - (f16 * f19);
        float f33 = (((((f21 * f32) - (f22 * f31)) + (f23 * f30)) + (f24 * f29)) - (f25 * f28)) + (f26 * f27);
        if (f33 == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return;
        }
        float f34 = 1.0f / f33;
        fArr[0] = (((f10 * f32) - (f11 * f31)) + (f12 * f30)) * f34;
        fArr[1] = ((((-f6) * f32) + (f7 * f31)) - (f8 * f30)) * f34;
        fArr[2] = (((f18 * f26) - (f19 * f25)) + (f20 * f24)) * f34;
        fArr[3] = ((((-f14) * f26) + (f15 * f25)) - (f16 * f24)) * f34;
        float f35 = -f9;
        fArr[4] = (((f35 * f32) + (f11 * f29)) - (f12 * f28)) * f34;
        fArr[5] = (((f32 * f5) - (f7 * f29)) + (f8 * f28)) * f34;
        float f36 = -f17;
        fArr[6] = (((f36 * f26) + (f19 * f23)) - (f20 * f22)) * f34;
        fArr[7] = (((f26 * f13) - (f15 * f23)) + (f16 * f22)) * f34;
        fArr[8] = (((f9 * f31) - (f10 * f29)) + (f12 * f27)) * f34;
        fArr[9] = ((((-f5) * f31) + (f29 * f6)) - (f8 * f27)) * f34;
        fArr[10] = (((f17 * f25) - (f18 * f23)) + (f20 * f21)) * f34;
        fArr[11] = ((((-f13) * f25) + (f23 * f14)) - (f16 * f21)) * f34;
        fArr[12] = (((f35 * f30) + (f10 * f28)) - (f11 * f27)) * f34;
        fArr[13] = (((f5 * f30) - (f6 * f28)) + (f7 * f27)) * f34;
        fArr[14] = (((f36 * f24) + (f18 * f22)) - (f19 * f21)) * f34;
        fArr[15] = (((f13 * f24) - (f14 * f22)) + (f15 * f21)) * f34;
    }

    /* renamed from: map-MK-Hz9U */
    public static final long m3970mapMKHz9U(float[] fArr, long j5) {
        boolean z4;
        float m3493getXimpl = Offset.m3493getXimpl(j5);
        float m3494getYimpl = Offset.m3494getYimpl(j5);
        float f5 = 1 / (((fArr[3] * m3493getXimpl) + (fArr[7] * m3494getYimpl)) + fArr[15]);
        if (!Float.isInfinite(f5) && !Float.isNaN(f5)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            f5 = 0.0f;
        }
        return OffsetKt.Offset(((fArr[0] * m3493getXimpl) + (fArr[4] * m3494getYimpl) + fArr[12]) * f5, f5 * ((fArr[1] * m3493getXimpl) + (fArr[5] * m3494getYimpl) + fArr[13]));
    }

    @p4.l
    /* renamed from: map-impl */
    public static final Rect m3971mapimpl(float[] fArr, @p4.l Rect rect) {
        long m3970mapMKHz9U = m3970mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getTop()));
        long m3970mapMKHz9U2 = m3970mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getBottom()));
        long m3970mapMKHz9U3 = m3970mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getTop()));
        long m3970mapMKHz9U4 = m3970mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
        return new Rect(Math.min(Math.min(Offset.m3493getXimpl(m3970mapMKHz9U), Offset.m3493getXimpl(m3970mapMKHz9U2)), Math.min(Offset.m3493getXimpl(m3970mapMKHz9U3), Offset.m3493getXimpl(m3970mapMKHz9U4))), Math.min(Math.min(Offset.m3494getYimpl(m3970mapMKHz9U), Offset.m3494getYimpl(m3970mapMKHz9U2)), Math.min(Offset.m3494getYimpl(m3970mapMKHz9U3), Offset.m3494getYimpl(m3970mapMKHz9U4))), Math.max(Math.max(Offset.m3493getXimpl(m3970mapMKHz9U), Offset.m3493getXimpl(m3970mapMKHz9U2)), Math.max(Offset.m3493getXimpl(m3970mapMKHz9U3), Offset.m3493getXimpl(m3970mapMKHz9U4))), Math.max(Math.max(Offset.m3494getYimpl(m3970mapMKHz9U), Offset.m3494getYimpl(m3970mapMKHz9U2)), Math.max(Offset.m3494getYimpl(m3970mapMKHz9U3), Offset.m3494getYimpl(m3970mapMKHz9U4))));
    }

    /* renamed from: reset-impl */
    public static final void m3973resetimpl(float[] fArr) {
        int i5 = 0;
        while (i5 < 4) {
            int i6 = 0;
            while (i6 < 4) {
                fArr[(i6 * 4) + i5] = i5 == i6 ? 1.0f : 0.0f;
                i6++;
            }
            i5++;
        }
    }

    /* renamed from: rotateX-impl */
    public static final void m3974rotateXimpl(float[] fArr, float f5) {
        double d5 = (f5 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d5);
        float sin = (float) Math.sin(d5);
        float f6 = fArr[1];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[6];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[13];
        float f13 = fArr[14];
        fArr[1] = (f6 * cos) - (f7 * sin);
        fArr[2] = (f6 * sin) + (f7 * cos);
        fArr[5] = (f8 * cos) - (f9 * sin);
        fArr[6] = (f8 * sin) + (f9 * cos);
        fArr[9] = (f10 * cos) - (f11 * sin);
        fArr[10] = (f10 * sin) + (f11 * cos);
        fArr[13] = (f12 * cos) - (f13 * sin);
        fArr[14] = (f12 * sin) + (f13 * cos);
    }

    /* renamed from: rotateY-impl */
    public static final void m3975rotateYimpl(float[] fArr, float f5) {
        double d5 = (f5 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d5);
        float sin = (float) Math.sin(d5);
        float f6 = fArr[0];
        float f7 = fArr[2];
        float f8 = fArr[4];
        float f9 = fArr[6];
        float f10 = fArr[8];
        float f11 = fArr[10];
        float f12 = fArr[12];
        float f13 = fArr[14];
        fArr[0] = (f6 * cos) + (f7 * sin);
        fArr[2] = ((-f6) * sin) + (f7 * cos);
        fArr[4] = (f8 * cos) + (f9 * sin);
        fArr[6] = ((-f8) * sin) + (f9 * cos);
        fArr[8] = (f10 * cos) + (f11 * sin);
        fArr[10] = ((-f10) * sin) + (f11 * cos);
        fArr[12] = (f12 * cos) + (f13 * sin);
        fArr[14] = ((-f12) * sin) + (f13 * cos);
    }

    /* renamed from: rotateZ-impl */
    public static final void m3976rotateZimpl(float[] fArr, float f5) {
        double d5 = (f5 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d5);
        float sin = (float) Math.sin(d5);
        float f6 = fArr[0];
        float f7 = fArr[4];
        float f8 = -sin;
        float f9 = fArr[1];
        float f10 = fArr[5];
        float f11 = fArr[2];
        float f12 = fArr[6];
        float f13 = fArr[3];
        float f14 = fArr[7];
        fArr[0] = (cos * f6) + (sin * f7);
        fArr[1] = (cos * f9) + (sin * f10);
        fArr[2] = (cos * f11) + (sin * f12);
        fArr[3] = (cos * f13) + (sin * f14);
        fArr[4] = (f6 * f8) + (f7 * cos);
        fArr[5] = (f9 * f8) + (f10 * cos);
        fArr[6] = (f11 * f8) + (f12 * cos);
        fArr[7] = (f8 * f13) + (cos * f14);
    }

    /* renamed from: scale-impl */
    public static final void m3977scaleimpl(float[] fArr, float f5, float f6, float f7) {
        fArr[0] = fArr[0] * f5;
        fArr[1] = fArr[1] * f5;
        fArr[2] = fArr[2] * f5;
        fArr[3] = fArr[3] * f5;
        fArr[4] = fArr[4] * f6;
        fArr[5] = fArr[5] * f6;
        fArr[6] = fArr[6] * f6;
        fArr[7] = fArr[7] * f6;
        fArr[8] = fArr[8] * f7;
        fArr[9] = fArr[9] * f7;
        fArr[10] = fArr[10] * f7;
        fArr[11] = fArr[11] * f7;
    }

    /* renamed from: scale-impl$default */
    public static /* synthetic */ void m3978scaleimpl$default(float[] fArr, float f5, float f6, float f7, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 1.0f;
        }
        if ((i5 & 2) != 0) {
            f6 = 1.0f;
        }
        if ((i5 & 4) != 0) {
            f7 = 1.0f;
        }
        m3977scaleimpl(fArr, f5, f6, f7);
    }

    /* renamed from: set-impl */
    public static final void m3979setimpl(float[] fArr, int i5, int i6, float f5) {
        fArr[(i5 * 4) + i6] = f5;
    }

    /* renamed from: setFrom-58bKbWc */
    public static final void m3980setFrom58bKbWc(float[] fArr, @p4.l float[] fArr2) {
        for (int i5 = 0; i5 < 16; i5++) {
            fArr[i5] = fArr2[i5];
        }
    }

    /* renamed from: timesAssign-58bKbWc */
    public static final void m3981timesAssign58bKbWc(float[] fArr, @p4.l float[] fArr2) {
        float m3987dotp89u6pk;
        float m3987dotp89u6pk2;
        float m3987dotp89u6pk3;
        float m3987dotp89u6pk4;
        float m3987dotp89u6pk5;
        float m3987dotp89u6pk6;
        float m3987dotp89u6pk7;
        float m3987dotp89u6pk8;
        float m3987dotp89u6pk9;
        float m3987dotp89u6pk10;
        float m3987dotp89u6pk11;
        float m3987dotp89u6pk12;
        float m3987dotp89u6pk13;
        float m3987dotp89u6pk14;
        float m3987dotp89u6pk15;
        float m3987dotp89u6pk16;
        m3987dotp89u6pk = MatrixKt.m3987dotp89u6pk(fArr, 0, fArr2, 0);
        m3987dotp89u6pk2 = MatrixKt.m3987dotp89u6pk(fArr, 0, fArr2, 1);
        m3987dotp89u6pk3 = MatrixKt.m3987dotp89u6pk(fArr, 0, fArr2, 2);
        m3987dotp89u6pk4 = MatrixKt.m3987dotp89u6pk(fArr, 0, fArr2, 3);
        m3987dotp89u6pk5 = MatrixKt.m3987dotp89u6pk(fArr, 1, fArr2, 0);
        m3987dotp89u6pk6 = MatrixKt.m3987dotp89u6pk(fArr, 1, fArr2, 1);
        m3987dotp89u6pk7 = MatrixKt.m3987dotp89u6pk(fArr, 1, fArr2, 2);
        m3987dotp89u6pk8 = MatrixKt.m3987dotp89u6pk(fArr, 1, fArr2, 3);
        m3987dotp89u6pk9 = MatrixKt.m3987dotp89u6pk(fArr, 2, fArr2, 0);
        m3987dotp89u6pk10 = MatrixKt.m3987dotp89u6pk(fArr, 2, fArr2, 1);
        m3987dotp89u6pk11 = MatrixKt.m3987dotp89u6pk(fArr, 2, fArr2, 2);
        m3987dotp89u6pk12 = MatrixKt.m3987dotp89u6pk(fArr, 2, fArr2, 3);
        m3987dotp89u6pk13 = MatrixKt.m3987dotp89u6pk(fArr, 3, fArr2, 0);
        m3987dotp89u6pk14 = MatrixKt.m3987dotp89u6pk(fArr, 3, fArr2, 1);
        m3987dotp89u6pk15 = MatrixKt.m3987dotp89u6pk(fArr, 3, fArr2, 2);
        m3987dotp89u6pk16 = MatrixKt.m3987dotp89u6pk(fArr, 3, fArr2, 3);
        fArr[0] = m3987dotp89u6pk;
        fArr[1] = m3987dotp89u6pk2;
        fArr[2] = m3987dotp89u6pk3;
        fArr[3] = m3987dotp89u6pk4;
        fArr[4] = m3987dotp89u6pk5;
        fArr[5] = m3987dotp89u6pk6;
        fArr[6] = m3987dotp89u6pk7;
        fArr[7] = m3987dotp89u6pk8;
        fArr[8] = m3987dotp89u6pk9;
        fArr[9] = m3987dotp89u6pk10;
        fArr[10] = m3987dotp89u6pk11;
        fArr[11] = m3987dotp89u6pk12;
        fArr[12] = m3987dotp89u6pk13;
        fArr[13] = m3987dotp89u6pk14;
        fArr[14] = m3987dotp89u6pk15;
        fArr[15] = m3987dotp89u6pk16;
    }

    @p4.l
    /* renamed from: toString-impl */
    public static String m3982toStringimpl(float[] fArr) {
        String p5;
        p5 = kotlin.text.x.p("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
        return p5;
    }

    /* renamed from: translate-impl */
    public static final void m3983translateimpl(float[] fArr, float f5, float f6, float f7) {
        float f8 = (fArr[0] * f5) + (fArr[4] * f6) + (fArr[8] * f7) + fArr[12];
        float f9 = (fArr[1] * f5) + (fArr[5] * f6) + (fArr[9] * f7) + fArr[13];
        float f10 = (fArr[2] * f5) + (fArr[6] * f6) + (fArr[10] * f7) + fArr[14];
        float f11 = (fArr[3] * f5) + (fArr[7] * f6) + (fArr[11] * f7) + fArr[15];
        fArr[12] = f8;
        fArr[13] = f9;
        fArr[14] = f10;
        fArr[15] = f11;
    }

    /* renamed from: translate-impl$default */
    public static /* synthetic */ void m3984translateimpl$default(float[] fArr, float f5, float f6, float f7, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 2) != 0) {
            f6 = 0.0f;
        }
        if ((i5 & 4) != 0) {
            f7 = 0.0f;
        }
        m3983translateimpl(fArr, f5, f6, f7);
    }

    public boolean equals(Object obj) {
        return m3965equalsimpl(this.values, obj);
    }

    @p4.l
    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m3968hashCodeimpl(this.values);
    }

    @p4.l
    public String toString() {
        return m3982toStringimpl(this.values);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ float[] m3985unboximpl() {
        return this.values;
    }

    /* renamed from: map-impl */
    public static final void m3972mapimpl(float[] fArr, @p4.l MutableRect mutableRect) {
        long m3970mapMKHz9U = m3970mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getLeft(), mutableRect.getTop()));
        long m3970mapMKHz9U2 = m3970mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getLeft(), mutableRect.getBottom()));
        long m3970mapMKHz9U3 = m3970mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getRight(), mutableRect.getTop()));
        long m3970mapMKHz9U4 = m3970mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getRight(), mutableRect.getBottom()));
        mutableRect.setLeft(Math.min(Math.min(Offset.m3493getXimpl(m3970mapMKHz9U), Offset.m3493getXimpl(m3970mapMKHz9U2)), Math.min(Offset.m3493getXimpl(m3970mapMKHz9U3), Offset.m3493getXimpl(m3970mapMKHz9U4))));
        mutableRect.setTop(Math.min(Math.min(Offset.m3494getYimpl(m3970mapMKHz9U), Offset.m3494getYimpl(m3970mapMKHz9U2)), Math.min(Offset.m3494getYimpl(m3970mapMKHz9U3), Offset.m3494getYimpl(m3970mapMKHz9U4))));
        mutableRect.setRight(Math.max(Math.max(Offset.m3493getXimpl(m3970mapMKHz9U), Offset.m3493getXimpl(m3970mapMKHz9U2)), Math.max(Offset.m3493getXimpl(m3970mapMKHz9U3), Offset.m3493getXimpl(m3970mapMKHz9U4))));
        mutableRect.setBottom(Math.max(Math.max(Offset.m3494getYimpl(m3970mapMKHz9U), Offset.m3494getYimpl(m3970mapMKHz9U2)), Math.max(Offset.m3494getYimpl(m3970mapMKHz9U3), Offset.m3494getYimpl(m3970mapMKHz9U4))));
    }
}
