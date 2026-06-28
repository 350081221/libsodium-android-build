package androidx.compose.ui.platform;

import android.content.res.Configuration;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.unit.LayoutDirection;

@kotlin.i0(d1 = {"\u00006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u001e\u0010\t\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a.\u0010\u0010\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a2\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\".\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\"\u0018\u0010#\u001a\u00020\u0002*\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirectionFromInt", "Landroidx/compose/ui/graphics/Matrix;", "other", "Lkotlin/r2;", "preTransform-JiSxe2E", "([F[F)V", "preTransform", "", "x", "y", "tmpMatrix", "preTranslate-cG2Xzmc", "([FFF[F)V", "preTranslate", "m1", "row", "m2", "column", "dot-p89u6pk", "([FI[FI)F", "dot", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "platformTextInputServiceInterceptor", "Lv3/l;", "getPlatformTextInputServiceInterceptor", "()Lv3/l;", "setPlatformTextInputServiceInterceptor", "(Lv3/l;)V", "Landroid/content/res/Configuration;", "getLocaleLayoutDirection", "(Landroid/content/res/Configuration;)Landroidx/compose/ui/unit/LayoutDirection;", "localeLayoutDirection", "ui_release"}, k = 2, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,2348:1\n42#2,2:2349\n42#2,2:2351\n42#2,2:2353\n42#2,2:2355\n42#2,2:2357\n42#2,2:2359\n42#2,2:2361\n42#2,2:2363\n42#2,2:2365\n42#2,2:2367\n42#2,2:2369\n42#2,2:2371\n42#2,2:2373\n42#2,2:2375\n42#2,2:2377\n42#2,2:2379\n39#2:2381\n39#2:2382\n39#2:2383\n39#2:2384\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n*L\n2124#1:2349,2\n2125#1:2351,2\n2126#1:2353,2\n2127#1:2355,2\n2128#1:2357,2\n2129#1:2359,2\n2130#1:2361,2\n2131#1:2363,2\n2132#1:2365,2\n2133#1:2367,2\n2134#1:2369,2\n2135#1:2371,2\n2136#1:2373,2\n2137#1:2375,2\n2138#1:2377,2\n2139#1:2379,2\n2153#1:2381\n2154#1:2382\n2155#1:2383\n2156#1:2384\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidComposeView_androidKt {

    @p4.l
    private static v3.l<? super PlatformTextInputService, ? extends PlatformTextInputService> platformTextInputServiceInterceptor = AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1.INSTANCE;

    public static final /* synthetic */ LayoutDirection access$layoutDirectionFromInt(int i5) {
        return layoutDirectionFromInt(i5);
    }

    /* renamed from: access$preTranslate-cG2Xzmc */
    public static final /* synthetic */ void m5294access$preTranslatecG2Xzmc(float[] fArr, float f5, float f6, float[] fArr2) {
        m5297preTranslatecG2Xzmc(fArr, f5, f6, fArr2);
    }

    /* renamed from: dot-p89u6pk */
    private static final float m5295dotp89u6pk(float[] fArr, int i5, float[] fArr2, int i6) {
        int i7 = i5 * 4;
        return (fArr[i7 + 0] * fArr2[0 + i6]) + (fArr[i7 + 1] * fArr2[4 + i6]) + (fArr[i7 + 2] * fArr2[8 + i6]) + (fArr[i7 + 3] * fArr2[12 + i6]);
    }

    @p4.l
    public static final LayoutDirection getLocaleLayoutDirection(@p4.l Configuration configuration) {
        return layoutDirectionFromInt(configuration.getLayoutDirection());
    }

    @p4.l
    public static final v3.l<PlatformTextInputService, PlatformTextInputService> getPlatformTextInputServiceInterceptor() {
        return platformTextInputServiceInterceptor;
    }

    public static final LayoutDirection layoutDirectionFromInt(int i5) {
        if (i5 != 0) {
            if (i5 != 1) {
                return LayoutDirection.Ltr;
            }
            return LayoutDirection.Rtl;
        }
        return LayoutDirection.Ltr;
    }

    /* renamed from: preTransform-JiSxe2E */
    public static final void m5296preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float m5295dotp89u6pk = m5295dotp89u6pk(fArr2, 0, fArr, 0);
        float m5295dotp89u6pk2 = m5295dotp89u6pk(fArr2, 0, fArr, 1);
        float m5295dotp89u6pk3 = m5295dotp89u6pk(fArr2, 0, fArr, 2);
        float m5295dotp89u6pk4 = m5295dotp89u6pk(fArr2, 0, fArr, 3);
        float m5295dotp89u6pk5 = m5295dotp89u6pk(fArr2, 1, fArr, 0);
        float m5295dotp89u6pk6 = m5295dotp89u6pk(fArr2, 1, fArr, 1);
        float m5295dotp89u6pk7 = m5295dotp89u6pk(fArr2, 1, fArr, 2);
        float m5295dotp89u6pk8 = m5295dotp89u6pk(fArr2, 1, fArr, 3);
        float m5295dotp89u6pk9 = m5295dotp89u6pk(fArr2, 2, fArr, 0);
        float m5295dotp89u6pk10 = m5295dotp89u6pk(fArr2, 2, fArr, 1);
        float m5295dotp89u6pk11 = m5295dotp89u6pk(fArr2, 2, fArr, 2);
        float m5295dotp89u6pk12 = m5295dotp89u6pk(fArr2, 2, fArr, 3);
        float m5295dotp89u6pk13 = m5295dotp89u6pk(fArr2, 3, fArr, 0);
        float m5295dotp89u6pk14 = m5295dotp89u6pk(fArr2, 3, fArr, 1);
        float m5295dotp89u6pk15 = m5295dotp89u6pk(fArr2, 3, fArr, 2);
        float m5295dotp89u6pk16 = m5295dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = m5295dotp89u6pk;
        fArr[1] = m5295dotp89u6pk2;
        fArr[2] = m5295dotp89u6pk3;
        fArr[3] = m5295dotp89u6pk4;
        fArr[4] = m5295dotp89u6pk5;
        fArr[5] = m5295dotp89u6pk6;
        fArr[6] = m5295dotp89u6pk7;
        fArr[7] = m5295dotp89u6pk8;
        fArr[8] = m5295dotp89u6pk9;
        fArr[9] = m5295dotp89u6pk10;
        fArr[10] = m5295dotp89u6pk11;
        fArr[11] = m5295dotp89u6pk12;
        fArr[12] = m5295dotp89u6pk13;
        fArr[13] = m5295dotp89u6pk14;
        fArr[14] = m5295dotp89u6pk15;
        fArr[15] = m5295dotp89u6pk16;
    }

    /* renamed from: preTranslate-cG2Xzmc */
    public static final void m5297preTranslatecG2Xzmc(float[] fArr, float f5, float f6, float[] fArr2) {
        Matrix.m3973resetimpl(fArr2);
        Matrix.m3984translateimpl$default(fArr2, f5, f6, 0.0f, 4, null);
        m5296preTransformJiSxe2E(fArr, fArr2);
    }

    public static final void setPlatformTextInputServiceInterceptor(@p4.l v3.l<? super PlatformTextInputService, ? extends PlatformTextInputService> lVar) {
        platformTextInputServiceInterceptor = lVar;
    }
}
