package androidx.compose.ui.platform;

@kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"invertTo", "", "Landroidx/compose/ui/graphics/Matrix;", "other", "invertTo-JiSxe2E", "([F[F)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nInvertMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,78:1\n39#2:79\n39#2:80\n39#2:81\n39#2:82\n39#2:83\n39#2:84\n39#2:85\n39#2:86\n39#2:87\n39#2:88\n39#2:89\n39#2:90\n39#2:91\n39#2:92\n39#2:93\n39#2:94\n42#2,2:95\n42#2,2:97\n42#2,2:99\n42#2,2:101\n42#2,2:103\n42#2,2:105\n42#2,2:107\n42#2,2:109\n42#2,2:111\n42#2,2:113\n42#2,2:115\n42#2,2:117\n42#2,2:119\n42#2,2:121\n42#2,2:123\n42#2,2:125\n*S KotlinDebug\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n*L\n26#1:79\n27#1:80\n28#1:81\n29#1:82\n30#1:83\n31#1:84\n32#1:85\n33#1:86\n34#1:87\n35#1:88\n36#1:89\n37#1:90\n38#1:91\n39#1:92\n40#1:93\n41#1:94\n60#1:95,2\n61#1:97,2\n62#1:99,2\n63#1:101,2\n64#1:103,2\n65#1:105,2\n66#1:107,2\n67#1:109,2\n68#1:111,2\n69#1:113,2\n70#1:115,2\n71#1:117,2\n72#1:119,2\n73#1:121,2\n74#1:123,2\n75#1:125,2\n*E\n"})
/* loaded from: classes.dex */
public final class InvertMatrixKt {
    /* renamed from: invertTo-JiSxe2E, reason: not valid java name */
    public static final boolean m5322invertToJiSxe2E(@p4.l float[] fArr, @p4.l float[] fArr2) {
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
            return false;
        }
        float f34 = 1.0f / f33;
        fArr2[0] = (((f10 * f32) - (f11 * f31)) + (f12 * f30)) * f34;
        fArr2[1] = ((((-f6) * f32) + (f7 * f31)) - (f8 * f30)) * f34;
        fArr2[2] = (((f18 * f26) - (f19 * f25)) + (f20 * f24)) * f34;
        fArr2[3] = ((((-f14) * f26) + (f15 * f25)) - (f16 * f24)) * f34;
        float f35 = -f9;
        fArr2[4] = (((f35 * f32) + (f11 * f29)) - (f12 * f28)) * f34;
        fArr2[5] = (((f32 * f5) - (f7 * f29)) + (f8 * f28)) * f34;
        float f36 = -f17;
        fArr2[6] = (((f36 * f26) + (f19 * f23)) - (f20 * f22)) * f34;
        fArr2[7] = (((f26 * f13) - (f15 * f23)) + (f16 * f22)) * f34;
        fArr2[8] = (((f9 * f31) - (f10 * f29)) + (f12 * f27)) * f34;
        fArr2[9] = ((((-f5) * f31) + (f29 * f6)) - (f8 * f27)) * f34;
        fArr2[10] = (((f17 * f25) - (f18 * f23)) + (f20 * f21)) * f34;
        fArr2[11] = ((((-f13) * f25) + (f23 * f14)) - (f16 * f21)) * f34;
        fArr2[12] = (((f35 * f30) + (f10 * f28)) - (f11 * f27)) * f34;
        fArr2[13] = (((f5 * f30) - (f6 * f28)) + (f7 * f27)) * f34;
        fArr2[14] = (((f36 * f24) + (f18 * f22)) - (f19 * f21)) * f34;
        fArr2[15] = (((f13 * f24) - (f14 * f22)) + (f15 * f21)) * f34;
        return true;
    }
}
