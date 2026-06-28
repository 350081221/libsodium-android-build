package androidx.compose.foundation.text2.input.internal;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import kotlin.i0;
import p4.l;
import p4.p;

@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a(\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0004H\u0001\"\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/view/View;", "view", "Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;", "ComposeInputMethodManager", "Lkotlin/Function1;", "factory", "overrideComposeInputMethodManagerFactoryForTests", "ComposeInputMethodManagerFactory", "Lv3/l;", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ComposeInputMethodManager_androidKt {

    @l
    private static v3.l<? super View, ? extends ComposeInputMethodManager> ComposeInputMethodManagerFactory = ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1.INSTANCE;

    @l
    public static final ComposeInputMethodManager ComposeInputMethodManager(@l View view) {
        return ComposeInputMethodManagerFactory.invoke(view);
    }

    @l
    @p
    @VisibleForTesting
    public static final v3.l<View, ComposeInputMethodManager> overrideComposeInputMethodManagerFactoryForTests(@l v3.l<? super View, ? extends ComposeInputMethodManager> lVar) {
        v3.l lVar2 = ComposeInputMethodManagerFactory;
        ComposeInputMethodManagerFactory = lVar;
        return lVar2;
    }
}
