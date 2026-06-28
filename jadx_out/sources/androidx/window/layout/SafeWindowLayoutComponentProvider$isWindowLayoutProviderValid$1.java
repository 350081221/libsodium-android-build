package androidx.window.layout;

import java.lang.reflect.Method;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1 extends n0 implements v3.a<Boolean> {
    final /* synthetic */ ClassLoader $classLoader;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1(ClassLoader classLoader) {
        super(0);
        this.$classLoader = classLoader;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final Boolean invoke() {
        Class windowExtensionsProviderClass;
        Class windowExtensionsClass;
        boolean doesReturn;
        boolean isPublic;
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
        windowExtensionsProviderClass = safeWindowLayoutComponentProvider.windowExtensionsProviderClass(this.$classLoader);
        boolean z4 = false;
        Method getWindowExtensionsMethod = windowExtensionsProviderClass.getDeclaredMethod("getWindowExtensions", new Class[0]);
        windowExtensionsClass = safeWindowLayoutComponentProvider.windowExtensionsClass(this.$classLoader);
        l0.o(getWindowExtensionsMethod, "getWindowExtensionsMethod");
        l0.o(windowExtensionsClass, "windowExtensionsClass");
        doesReturn = safeWindowLayoutComponentProvider.doesReturn(getWindowExtensionsMethod, (Class<?>) windowExtensionsClass);
        if (doesReturn) {
            isPublic = safeWindowLayoutComponentProvider.isPublic(getWindowExtensionsMethod);
            if (isPublic) {
                z4 = true;
            }
        }
        return Boolean.valueOf(z4);
    }
}
