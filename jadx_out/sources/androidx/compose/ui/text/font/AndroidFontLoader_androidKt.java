package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.core.content.res.ResourcesCompat;
import com.umeng.analytics.pro.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.d1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.p;
import kotlinx.coroutines.q;
import p4.l;

@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroid/content/Context;", d.X, "Landroid/graphics/Typeface;", "load", "loadAsync", "(Landroidx/compose/ui/text/font/ResourceFont;Landroid/content/Context;Lkotlin/coroutines/d;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nAndroidFontLoader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader_androidKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,86:1\n314#2,11:87\n*S KotlinDebug\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader_androidKt\n*L\n72#1:87,11\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidFontLoader_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Typeface load(ResourceFont resourceFont, Context context) {
        android.graphics.Typeface font = ResourcesCompat.getFont(context, resourceFont.getResId());
        l0.m(font);
        return font;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadAsync(final ResourceFont resourceFont, Context context, kotlin.coroutines.d<? super android.graphics.Typeface> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        final q qVar = new q(e5, 1);
        qVar.B();
        ResourcesCompat.getFont(context, resourceFont.getResId(), new ResourcesCompat.FontCallback() { // from class: androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1
            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            /* renamed from: onFontRetrievalFailed */
            public void lambda$callbackFailAsync$1(int i5) {
                qVar.a(new IllegalStateException("Unable to load font " + resourceFont + " (reason=" + i5 + ')'));
            }

            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            /* renamed from: onFontRetrieved */
            public void lambda$callbackSuccessAsync$0(@l android.graphics.Typeface typeface) {
                p<android.graphics.Typeface> pVar = qVar;
                d1.a aVar = d1.Companion;
                pVar.resumeWith(d1.m6444constructorimpl(typeface));
            }
        }, null);
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            h.c(dVar);
        }
        return E;
    }
}
