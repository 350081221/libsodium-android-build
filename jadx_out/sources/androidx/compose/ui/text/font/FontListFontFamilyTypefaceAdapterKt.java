package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.AsyncTypefaceCache;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import java.util.List;
import kotlin.collections.w;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import kotlin.r2;
import kotlin.u0;
import v3.l;

@i0(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aR\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\t0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0002¨\u0006\r"}, d2 = {"", "Landroidx/compose/ui/text/font/Font;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "Lkotlin/Function1;", "", "createDefaultTypeface", "Lkotlin/u0;", "firstImmediatelyAvailable", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 3 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n420#2:433\n421#2,9:435\n420#2:444\n421#2,7:446\n428#2,2:454\n26#3:434\n26#3:445\n1#4:453\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n*L\n189#1:433\n189#1:435,9\n205#1:444\n205#1:446,7\n205#1:454,2\n189#1:434\n205#1:445\n*E\n"})
/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapterKt {
    public static final /* synthetic */ u0 access$firstImmediatelyAvailable(List list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, l lVar) {
        return firstImmediatelyAvailable(list, typefaceRequest, asyncTypefaceCache, platformFontLoader, lVar);
    }

    public static final u0<List<Font>, Object> firstImmediatelyAvailable(List<? extends Font> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, l<? super TypefaceRequest, ? extends Object> lVar) {
        Object loadBlocking;
        Object m6444constructorimpl;
        int size = list.size();
        List list2 = null;
        for (int i5 = 0; i5 < size; i5++) {
            Font font = list.get(i5);
            int mo5601getLoadingStrategyPKNRLFQ = font.mo5601getLoadingStrategyPKNRLFQ();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.Companion;
            if (FontLoadingStrategy.m5641equalsimpl0(mo5601getLoadingStrategyPKNRLFQ, companion.m5646getBlockingPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                    AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key);
                    if (asyncTypefaceResult == null) {
                        asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key);
                    }
                    if (asyncTypefaceResult != null) {
                        loadBlocking = asyncTypefaceResult.m5618unboximpl();
                    } else {
                        r2 r2Var = r2.f19517a;
                        try {
                            loadBlocking = platformFontLoader.loadBlocking(font);
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, loadBlocking, false, 8, null);
                        } catch (Exception e5) {
                            throw new IllegalStateException("Unable to load font " + font, e5);
                        }
                    }
                }
                if (loadBlocking != null) {
                    return q1.a(list2, FontSynthesis_androidKt.m5675synthesizeTypefaceFxwP2eA(typefaceRequest.m5700getFontSynthesisGVVA2EU(), loadBlocking, font, typefaceRequest.getFontWeight(), typefaceRequest.m5699getFontStyle_LCdwA()));
                }
                throw new IllegalStateException("Unable to load font " + font);
            }
            if (FontLoadingStrategy.m5641equalsimpl0(mo5601getLoadingStrategyPKNRLFQ, companion.m5647getOptionalLocalPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                    AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key2);
                    if (asyncTypefaceResult2 == null) {
                        asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key2);
                    }
                    if (asyncTypefaceResult2 != null) {
                        m6444constructorimpl = asyncTypefaceResult2.m5618unboximpl();
                    } else {
                        r2 r2Var2 = r2.f19517a;
                        try {
                            d1.a aVar = d1.Companion;
                            m6444constructorimpl = d1.m6444constructorimpl(platformFontLoader.loadBlocking(font));
                        } catch (Throwable th) {
                            d1.a aVar2 = d1.Companion;
                            m6444constructorimpl = d1.m6444constructorimpl(e1.a(th));
                        }
                        if (d1.m6450isFailureimpl(m6444constructorimpl)) {
                            m6444constructorimpl = null;
                        }
                        AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, m6444constructorimpl, false, 8, null);
                    }
                }
                if (m6444constructorimpl != null) {
                    return q1.a(list2, FontSynthesis_androidKt.m5675synthesizeTypefaceFxwP2eA(typefaceRequest.m5700getFontSynthesisGVVA2EU(), m6444constructorimpl, font, typefaceRequest.getFontWeight(), typefaceRequest.m5699getFontStyle_LCdwA()));
                }
            } else if (FontLoadingStrategy.m5641equalsimpl0(mo5601getLoadingStrategyPKNRLFQ, companion.m5645getAsyncPKNRLFQ())) {
                AsyncTypefaceCache.AsyncTypefaceResult m5610get1ASDuI8 = asyncTypefaceCache.m5610get1ASDuI8(font, platformFontLoader);
                if (m5610get1ASDuI8 == null) {
                    if (list2 == null) {
                        list2 = w.P(font);
                    } else {
                        list2.add(font);
                    }
                } else if (!AsyncTypefaceCache.AsyncTypefaceResult.m5616isPermanentFailureimpl(m5610get1ASDuI8.m5618unboximpl()) && m5610get1ASDuI8.m5618unboximpl() != null) {
                    return q1.a(list2, FontSynthesis_androidKt.m5675synthesizeTypefaceFxwP2eA(typefaceRequest.m5700getFontSynthesisGVVA2EU(), m5610get1ASDuI8.m5618unboximpl(), font, typefaceRequest.getFontWeight(), typefaceRequest.m5699getFontStyle_LCdwA()));
                }
            } else {
                throw new IllegalStateException("Unknown font type " + font);
            }
        }
        return q1.a(list2, lVar.invoke(typefaceRequest));
    }
}
