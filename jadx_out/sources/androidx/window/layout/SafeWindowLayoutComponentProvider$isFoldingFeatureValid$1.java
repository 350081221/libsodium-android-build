package androidx.window.layout;

import android.graphics.Rect;
import java.lang.reflect.Method;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1 extends n0 implements v3.a<Boolean> {
    final /* synthetic */ ClassLoader $classLoader;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1(ClassLoader classLoader) {
        super(0);
        this.$classLoader = classLoader;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final Boolean invoke() {
        Class foldingFeatureClass;
        boolean doesReturn;
        boolean isPublic;
        boolean doesReturn2;
        boolean isPublic2;
        boolean doesReturn3;
        boolean isPublic3;
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
        foldingFeatureClass = safeWindowLayoutComponentProvider.foldingFeatureClass(this.$classLoader);
        boolean z4 = false;
        Method getBoundsMethod = foldingFeatureClass.getMethod("getBounds", new Class[0]);
        Method getTypeMethod = foldingFeatureClass.getMethod("getType", new Class[0]);
        Method getStateMethod = foldingFeatureClass.getMethod("getState", new Class[0]);
        l0.o(getBoundsMethod, "getBoundsMethod");
        doesReturn = safeWindowLayoutComponentProvider.doesReturn(getBoundsMethod, (kotlin.reflect.d<?>) l1.d(Rect.class));
        if (doesReturn) {
            isPublic = safeWindowLayoutComponentProvider.isPublic(getBoundsMethod);
            if (isPublic) {
                l0.o(getTypeMethod, "getTypeMethod");
                Class cls = Integer.TYPE;
                doesReturn2 = safeWindowLayoutComponentProvider.doesReturn(getTypeMethod, (kotlin.reflect.d<?>) l1.d(cls));
                if (doesReturn2) {
                    isPublic2 = safeWindowLayoutComponentProvider.isPublic(getTypeMethod);
                    if (isPublic2) {
                        l0.o(getStateMethod, "getStateMethod");
                        doesReturn3 = safeWindowLayoutComponentProvider.doesReturn(getStateMethod, (kotlin.reflect.d<?>) l1.d(cls));
                        if (doesReturn3) {
                            isPublic3 = safeWindowLayoutComponentProvider.isPublic(getStateMethod);
                            if (isPublic3) {
                                z4 = true;
                            }
                        }
                    }
                }
            }
        }
        return Boolean.valueOf(z4);
    }
}
