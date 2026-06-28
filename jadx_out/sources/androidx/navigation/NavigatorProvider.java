package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.navigation.Navigator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import u3.m;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J \u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006J*\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u00052\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0017J'\u0010\u000f\u001a\u0002H\u0010\"\f\b\u0000\u0010\u0010*\u0006\u0012\u0002\b\u00030\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0012¢\u0006\u0002\u0010\u0013J#\u0010\u000f\u001a\u0002H\u0010\"\f\b\u0000\u0010\u0010*\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u000e\u001a\u00020\u0005H\u0017¢\u0006\u0002\u0010\u0014R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Landroidx/navigation/NavigatorProvider;", "", "()V", "_navigators", "", "", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "navigators", "", "getNavigators", "()Ljava/util/Map;", "addNavigator", "navigator", "name", "getNavigator", "T", "navigatorClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/navigation/Navigator;", "(Ljava/lang/String;)Landroidx/navigation/Navigator;", "Companion", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"TypeParameterUnusedInFormals"})
@r1({"SMAP\nNavigatorProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorProvider.kt\nandroidx/navigation/NavigatorProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1#2:184\n*E\n"})
/* loaded from: classes2.dex */
public class NavigatorProvider {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final Map<Class<?>, String> annotationNames = new LinkedHashMap();

    @l
    private final Map<String, Navigator<? extends NavDestination>> _navigators = new LinkedHashMap();

    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\u0005H\u0001¢\u0006\u0002\b\nJ\u0017\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u000eR \u0010\u0003\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/navigation/NavigatorProvider$Companion;", "", "()V", "annotationNames", "", "Ljava/lang/Class;", "", "getNameForNavigator", "navigatorClass", "Landroidx/navigation/Navigator;", "getNameForNavigator$navigation_common_release", "validateName", "", "name", "validateName$navigation_common_release", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        @m
        public final String getNameForNavigator$navigation_common_release(@l Class<? extends Navigator<?>> navigatorClass) {
            l0.p(navigatorClass, "navigatorClass");
            String str = (String) NavigatorProvider.annotationNames.get(navigatorClass);
            if (str == null) {
                Navigator.Name name = (Navigator.Name) navigatorClass.getAnnotation(Navigator.Name.class);
                if (name != null) {
                    str = name.value();
                } else {
                    str = null;
                }
                if (validateName$navigation_common_release(str)) {
                    NavigatorProvider.annotationNames.put(navigatorClass, str);
                } else {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + navigatorClass.getSimpleName()).toString());
                }
            }
            l0.m(str);
            return str;
        }

        public final boolean validateName$navigation_common_release(@p4.m String str) {
            if (str != null) {
                return str.length() > 0;
            }
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.m
    public final Navigator<? extends NavDestination> addNavigator(@l Navigator<? extends NavDestination> navigator) {
        l0.p(navigator, "navigator");
        return addNavigator(Companion.getNameForNavigator$navigation_common_release(navigator.getClass()), navigator);
    }

    @l
    public final <T extends Navigator<?>> T getNavigator(@l Class<T> navigatorClass) {
        l0.p(navigatorClass, "navigatorClass");
        return (T) getNavigator(Companion.getNameForNavigator$navigation_common_release(navigatorClass));
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Map<String, Navigator<? extends NavDestination>> getNavigators() {
        Map<String, Navigator<? extends NavDestination>> D0;
        D0 = a1.D0(this._navigators);
        return D0;
    }

    @CallSuper
    @p4.m
    public Navigator<? extends NavDestination> addNavigator(@l String name, @l Navigator<? extends NavDestination> navigator) {
        l0.p(name, "name");
        l0.p(navigator, "navigator");
        if (Companion.validateName$navigation_common_release(name)) {
            Navigator<? extends NavDestination> navigator2 = this._navigators.get(name);
            if (l0.g(navigator2, navigator)) {
                return navigator;
            }
            boolean z4 = false;
            if (navigator2 != null && navigator2.isAttached()) {
                z4 = true;
            }
            if (!z4) {
                if (!navigator.isAttached()) {
                    return this._navigators.put(name, navigator);
                }
                throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
            }
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + navigator2).toString());
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    @l
    @CallSuper
    public <T extends Navigator<?>> T getNavigator(@l String name) {
        l0.p(name, "name");
        if (Companion.validateName$navigation_common_release(name)) {
            Navigator<? extends NavDestination> navigator = this._navigators.get(name);
            if (navigator != null) {
                return navigator;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + name + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }
}
