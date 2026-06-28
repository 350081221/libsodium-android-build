package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import com.umeng.analytics.pro.d;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "Landroidx/compose/ui/text/font/Font;", "font", "Landroid/graphics/Typeface;", "loadBlocking", "awaitLoad", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", d.X, "Landroid/content/Context;", "", "cacheKey", "Ljava/lang/Object;", "getCacheKey", "()Ljava/lang/Object;", "<init>", "(Landroid/content/Context;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAndroidFontLoader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidFontLoader implements PlatformFontLoader {
    public static final int $stable = 8;

    @m
    private final Object cacheKey;
    private final Context context;

    public AndroidFontLoader(@l Context context) {
        this.context = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitLoad(@p4.l androidx.compose.ui.text.font.Font r6, @p4.l kotlin.coroutines.d<? super android.graphics.Typeface> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = (androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.L$1
            androidx.compose.ui.text.font.Font r6 = (androidx.compose.ui.text.font.Font) r6
            java.lang.Object r0 = r0.L$0
            androidx.compose.ui.text.font.AndroidFontLoader r0 = (androidx.compose.ui.text.font.AndroidFontLoader) r0
            kotlin.e1.n(r7)
            goto L70
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            kotlin.e1.n(r7)
            goto L58
        L40:
            kotlin.e1.n(r7)
            boolean r7 = r6 instanceof androidx.compose.ui.text.font.AndroidFont
            if (r7 == 0) goto L59
            androidx.compose.ui.text.font.AndroidFont r6 = (androidx.compose.ui.text.font.AndroidFont) r6
            androidx.compose.ui.text.font.AndroidFont$TypefaceLoader r7 = r6.getTypefaceLoader()
            android.content.Context r2 = r5.context
            r0.label = r4
            java.lang.Object r7 = r7.awaitLoad(r2, r6, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            return r7
        L59:
            boolean r7 = r6 instanceof androidx.compose.ui.text.font.ResourceFont
            if (r7 == 0) goto L7f
            r7 = r6
            androidx.compose.ui.text.font.ResourceFont r7 = (androidx.compose.ui.text.font.ResourceFont) r7
            android.content.Context r2 = r5.context
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = androidx.compose.ui.text.font.AndroidFontLoader_androidKt.access$loadAsync(r7, r2, r0)
            if (r7 != r1) goto L6f
            return r1
        L6f:
            r0 = r5
        L70:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            androidx.compose.ui.text.font.ResourceFont r6 = (androidx.compose.ui.text.font.ResourceFont) r6
            androidx.compose.ui.text.font.FontVariation$Settings r6 = r6.getVariationSettings()
            android.content.Context r0 = r0.context
            android.graphics.Typeface r6 = androidx.compose.ui.text.font.PlatformTypefaces_androidKt.setFontVariationSettings(r7, r6, r0)
            return r6
        L7f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown font type: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AndroidFontLoader.awaitLoad(androidx.compose.ui.text.font.Font, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @m
    public Object getCacheKey() {
        return this.cacheKey;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @m
    public android.graphics.Typeface loadBlocking(@l Font font) {
        Object m6444constructorimpl;
        android.graphics.Typeface typeface;
        android.graphics.Typeface load;
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            return androidFont.getTypefaceLoader().loadBlocking(this.context, androidFont);
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int mo5601getLoadingStrategyPKNRLFQ = font.mo5601getLoadingStrategyPKNRLFQ();
        FontLoadingStrategy.Companion companion = FontLoadingStrategy.Companion;
        if (FontLoadingStrategy.m5641equalsimpl0(mo5601getLoadingStrategyPKNRLFQ, companion.m5646getBlockingPKNRLFQ())) {
            typeface = AndroidFontLoader_androidKt.load((ResourceFont) font, this.context);
        } else {
            if (!FontLoadingStrategy.m5641equalsimpl0(mo5601getLoadingStrategyPKNRLFQ, companion.m5647getOptionalLocalPKNRLFQ())) {
                if (FontLoadingStrategy.m5641equalsimpl0(mo5601getLoadingStrategyPKNRLFQ, companion.m5645getAsyncPKNRLFQ())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) FontLoadingStrategy.m5643toStringimpl(font.mo5601getLoadingStrategyPKNRLFQ())));
            }
            try {
                d1.a aVar = d1.Companion;
                load = AndroidFontLoader_androidKt.load((ResourceFont) font, this.context);
                m6444constructorimpl = d1.m6444constructorimpl(load);
            } catch (Throwable th) {
                d1.a aVar2 = d1.Companion;
                m6444constructorimpl = d1.m6444constructorimpl(e1.a(th));
            }
            typeface = (android.graphics.Typeface) (d1.m6450isFailureimpl(m6444constructorimpl) ? null : m6444constructorimpl);
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings(typeface, ((ResourceFont) font).getVariationSettings(), this.context);
    }
}
