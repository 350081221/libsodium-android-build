package androidx.window.layout;

import android.app.Activity;
import java.lang.reflect.Method;
import java.util.function.Consumer;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1 extends n0 implements v3.a<Boolean> {
    final /* synthetic */ ClassLoader $classLoader;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1(ClassLoader classLoader) {
        super(0);
        this.$classLoader = classLoader;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final Boolean invoke() {
        Class windowLayoutComponentClass;
        boolean isPublic;
        boolean isPublic2;
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
        windowLayoutComponentClass = safeWindowLayoutComponentProvider.windowLayoutComponentClass(this.$classLoader);
        boolean z4 = false;
        Method addListenerMethod = windowLayoutComponentClass.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
        Method removeListenerMethod = windowLayoutComponentClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        l0.o(addListenerMethod, "addListenerMethod");
        isPublic = safeWindowLayoutComponentProvider.isPublic(addListenerMethod);
        if (isPublic) {
            l0.o(removeListenerMethod, "removeListenerMethod");
            isPublic2 = safeWindowLayoutComponentProvider.isPublic(removeListenerMethod);
            if (isPublic2) {
                z4 = true;
            }
        }
        return Boolean.valueOf(z4);
    }
}
