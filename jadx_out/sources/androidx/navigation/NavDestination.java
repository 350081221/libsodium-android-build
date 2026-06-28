package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavDeepLinkRequest;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.d;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.e0;
import kotlin.collections.k;
import kotlin.collections.x;
import kotlin.collections.x0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.sequences.s;
import kotlin.text.k0;
import n3.e;
import n3.f;
import p4.l;
import p4.m;
import u3.i;

@i0(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 d2\u00020\u0001:\u0003edfB\u000f\u0012\u0006\u00107\u001a\u00020\u0007¢\u0006\u0004\b`\u0010[B\u0019\b\u0016\u0012\u000e\u0010b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000a¢\u0006\u0004\b`\u0010cJ.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u0007H\u0007J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u0013H\u0017J\u0014\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0000H\u0007J\u001a\u0010 \u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u001fH\u0007J\b\u0010!\u001a\u00020\nH\u0017J\u0012\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0001\u0010#\u001a\u00020\"J\u001a\u0010(\u001a\u00020\u00102\b\b\u0001\u0010&\u001a\u00020\"2\b\b\u0001\u0010'\u001a\u00020\"J\u0018\u0010(\u001a\u00020\u00102\b\b\u0001\u0010&\u001a\u00020\"2\u0006\u0010)\u001a\u00020$J\u0010\u0010*\u001a\u00020\u00102\b\b\u0001\u0010&\u001a\u00020\"J\u0016\u0010-\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\bJ\u000e\u0010.\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0007J\u0014\u00100\u001a\u0004\u0018\u00010\u001f2\b\u0010/\u001a\u0004\u0018\u00010\u001fH\u0007J\u001a\u00102\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u00010\u001fJ\b\u00103\u001a\u00020\u0007H\u0016J\u0013\u00105\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00106\u001a\u00020\"H\u0016R\u0017\u00107\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R.\u0010=\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010;8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00108R$\u0010E\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020$0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\"\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR,\u0010#\u001a\u00020\"2\b\b\u0001\u0010#\u001a\u00020\"8G@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR.\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00108\u001a\u0004\bY\u0010:\"\u0004\bZ\u0010[R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010:¨\u0006g"}, d2 = {"Landroidx/navigation/NavDestination;", "", "Landroidx/navigation/NavDeepLink;", "deepLink", "Landroid/net/Uri;", "uri", "", "", "Landroidx/navigation/NavArgument;", "arguments", "", "hasRequiredArguments", "Landroid/content/Context;", d.X, "Landroid/util/AttributeSet;", "attrs", "Lkotlin/r2;", "onInflate", "hasDeepLink", "Landroidx/navigation/NavDeepLinkRequest;", "deepLinkRequest", "uriPattern", "addDeepLink", "navDeepLink", "route", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink", "navDeepLinkRequest", "previousDestination", "", "buildDeepLinkIds", "Landroid/os/Bundle;", "hasRoute", "supportsActions", "", "id", "Landroidx/navigation/NavAction;", "getAction", "actionId", "destId", "putAction", "action", "removeAction", "argumentName", "argument", "addArgument", "removeArgument", "args", "addInDefaultArgs", "bundle", "fillInLabel", "toString", "other", "equals", TTDownloadField.TT_HASHCODE, "navigatorName", "Ljava/lang/String;", "getNavigatorName", "()Ljava/lang/String;", "Landroidx/navigation/NavGraph;", "<set-?>", "parent", "Landroidx/navigation/NavGraph;", "getParent", "()Landroidx/navigation/NavGraph;", "setParent", "(Landroidx/navigation/NavGraph;)V", "idName", "", TTDownloadField.TT_LABEL, "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "", "deepLinks", "Ljava/util/List;", "Landroidx/collection/SparseArrayCompat;", "actions", "Landroidx/collection/SparseArrayCompat;", "", "_arguments", "Ljava/util/Map;", "I", "getId", "()I", "setId", "(I)V", "getRoute", "setRoute", "(Ljava/lang/String;)V", "getArguments", "()Ljava/util/Map;", "getDisplayName", "displayName", "<init>", "Landroidx/navigation/Navigator;", "navigator", "(Landroidx/navigation/Navigator;)V", "Companion", "ClassType", "DeepLinkMatch", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nNavDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Uri.kt\nandroidx/core/net/UriKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,820:1\n232#2,3:821\n1#3:824\n288#4,2:825\n1549#4:828\n1620#4,3:829\n1855#4,2:836\n1855#4,2:839\n1855#4,2:842\n29#5:827\n1206#6,2:832\n1206#6,2:834\n32#7:838\n33#7:841\n*S KotlinDebug\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination\n*L\n192#1:821,3\n232#1:825,2\n465#1:828\n465#1:829,3\n705#1:836,2\n713#1:839,2\n717#1:842,2\n371#1:827\n686#1:832,2\n689#1:834,2\n710#1:838\n710#1:841\n*E\n"})
/* loaded from: classes2.dex */
public class NavDestination {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final Map<String, Class<?>> classes = new LinkedHashMap();

    @l
    private Map<String, NavArgument> _arguments;

    @l
    private final SparseArrayCompat<NavAction> actions;

    @l
    private final List<NavDeepLink> deepLinks;
    private int id;

    @m
    private String idName;

    @m
    private CharSequence label;

    @l
    private final String navigatorName;

    @m
    private NavGraph parent;

    @m
    private String route;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @e(n3.a.BINARY)
    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\f\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002R\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/NavDestination$ClassType;", "", "Lkotlin/reflect/d;", t0.b.f22420d, "()Ljava/lang/Class;", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
    @f(allowedTargets = {n3.b.ANNOTATION_CLASS, n3.b.CLASS})
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes2.dex */
    public @interface ClassType {
        Class<?> value();
    }

    @i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0007H\u0005J:\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0007H\u0007J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0012\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0007R$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0011*\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/navigation/NavDestination$Companion;", "", "C", "Landroid/content/Context;", d.X, "", "name", "Ljava/lang/Class;", "expectedClassType", "parseClassFromName", "parseClassFromNameInternal", "", "id", "getDisplayName", "route", "createRoute", "Landroidx/navigation/NavDestination;", "Lkotlin/sequences/m;", "getHierarchy", "(Landroidx/navigation/NavDestination;)Lkotlin/sequences/m;", "getHierarchy$annotations", "(Landroidx/navigation/NavDestination;)V", "hierarchy", "", "classes", "Ljava/util/Map;", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @u3.m
        public static /* synthetic */ void getHierarchy$annotations(NavDestination navDestination) {
        }

        @l
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final String createRoute(@m String str) {
            if (str == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + str;
        }

        @l
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @u3.m
        public final String getDisplayName(@l Context context, int i5) {
            String valueOf;
            l0.p(context, "context");
            if (i5 <= 16777215) {
                return String.valueOf(i5);
            }
            try {
                valueOf = context.getResources().getResourceName(i5);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i5);
            }
            l0.o(valueOf, "try {\n                co….toString()\n            }");
            return valueOf;
        }

        @l
        public final kotlin.sequences.m<NavDestination> getHierarchy(@l NavDestination navDestination) {
            kotlin.sequences.m<NavDestination> l5;
            l0.p(navDestination, "<this>");
            l5 = s.l(navDestination, NavDestination$Companion$hierarchy$1.INSTANCE);
            return l5;
        }

        @l
        @u3.m
        protected final <C> Class<? extends C> parseClassFromName(@l Context context, @l String name, @l Class<? extends C> expectedClassType) {
            String str;
            l0.p(context, "context");
            l0.p(name, "name");
            l0.p(expectedClassType, "expectedClassType");
            if (name.charAt(0) == '.') {
                str = context.getPackageName() + name;
            } else {
                str = name;
            }
            Class<? extends C> cls = (Class) NavDestination.classes.get(str);
            if (cls == null) {
                try {
                    cls = (Class<? extends C>) Class.forName(str, true, context.getClassLoader());
                    NavDestination.classes.put(name, cls);
                } catch (ClassNotFoundException e5) {
                    throw new IllegalArgumentException(e5);
                }
            }
            l0.m(cls);
            if (expectedClassType.isAssignableFrom(cls)) {
                return cls;
            }
            throw new IllegalArgumentException((str + " must be a subclass of " + expectedClassType).toString());
        }

        @l
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @u3.m
        public final <C> Class<? extends C> parseClassFromNameInternal(@l Context context, @l String name, @l Class<? extends C> expectedClassType) {
            l0.p(context, "context");
            l0.p(name, "name");
            l0.p(expectedClassType, "expectedClassType");
            return NavDestination.parseClassFromName(context, name, expectedClassType);
        }
    }

    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0011\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0000H\u0096\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/navigation/NavDestination$DeepLinkMatch;", "", "destination", "Landroidx/navigation/NavDestination;", "matchingArgs", "Landroid/os/Bundle;", "isExactDeepLink", "", "matchingPathSegments", "", "hasMatchingAction", "mimeTypeMatchLevel", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;ZIZI)V", "getDestination", "()Landroidx/navigation/NavDestination;", "getMatchingArgs", "()Landroid/os/Bundle;", "compareTo", "other", "hasMatchingArgs", "arguments", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @r1({"SMAP\nNavDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,820:1\n1855#2,2:821\n*S KotlinDebug\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n*L\n128#1:821,2\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class DeepLinkMatch implements Comparable<DeepLinkMatch> {

        @l
        private final NavDestination destination;
        private final boolean hasMatchingAction;
        private final boolean isExactDeepLink;

        @m
        private final Bundle matchingArgs;
        private final int matchingPathSegments;
        private final int mimeTypeMatchLevel;

        public DeepLinkMatch(@l NavDestination destination, @m Bundle bundle, boolean z4, int i5, boolean z5, int i6) {
            l0.p(destination, "destination");
            this.destination = destination;
            this.matchingArgs = bundle;
            this.isExactDeepLink = z4;
            this.matchingPathSegments = i5;
            this.hasMatchingAction = z5;
            this.mimeTypeMatchLevel = i6;
        }

        @l
        public final NavDestination getDestination() {
            return this.destination;
        }

        @m
        public final Bundle getMatchingArgs() {
            return this.matchingArgs;
        }

        public final boolean hasMatchingArgs(@m Bundle bundle) {
            Bundle bundle2;
            NavType<Object> navType;
            Object obj;
            if (bundle == null || (bundle2 = this.matchingArgs) == null) {
                return false;
            }
            Set<String> keySet = bundle2.keySet();
            l0.o(keySet, "matchingArgs.keySet()");
            for (String key : keySet) {
                if (!bundle.containsKey(key)) {
                    return false;
                }
                NavArgument navArgument = (NavArgument) this.destination._arguments.get(key);
                Object obj2 = null;
                if (navArgument != null) {
                    navType = navArgument.getType();
                } else {
                    navType = null;
                }
                if (navType != null) {
                    Bundle bundle3 = this.matchingArgs;
                    l0.o(key, "key");
                    obj = navType.get(bundle3, key);
                } else {
                    obj = null;
                }
                if (navType != null) {
                    l0.o(key, "key");
                    obj2 = navType.get(bundle, key);
                }
                if (!l0.g(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.lang.Comparable
        public int compareTo(@l DeepLinkMatch other) {
            l0.p(other, "other");
            boolean z4 = this.isExactDeepLink;
            if (z4 && !other.isExactDeepLink) {
                return 1;
            }
            if (!z4 && other.isExactDeepLink) {
                return -1;
            }
            int i5 = this.matchingPathSegments - other.matchingPathSegments;
            if (i5 > 0) {
                return 1;
            }
            if (i5 < 0) {
                return -1;
            }
            Bundle bundle = this.matchingArgs;
            if (bundle != null && other.matchingArgs == null) {
                return 1;
            }
            if (bundle == null && other.matchingArgs != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = other.matchingArgs;
                l0.m(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z5 = this.hasMatchingAction;
            if (z5 && !other.hasMatchingAction) {
                return 1;
            }
            if (z5 || !other.hasMatchingAction) {
                return this.mimeTypeMatchLevel - other.mimeTypeMatchLevel;
            }
            return -1;
        }
    }

    public NavDestination(@l String navigatorName) {
        l0.p(navigatorName, "navigatorName");
        this.navigatorName = navigatorName;
        this.deepLinks = new ArrayList();
        this.actions = new SparseArrayCompat<>();
        this._arguments = new LinkedHashMap();
    }

    public static /* synthetic */ int[] buildDeepLinkIds$default(NavDestination navDestination, NavDestination navDestination2, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i5 & 1) != 0) {
            navDestination2 = null;
        }
        return navDestination.buildDeepLinkIds(navDestination2);
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @u3.m
    public static final String getDisplayName(@l Context context, int i5) {
        return Companion.getDisplayName(context, i5);
    }

    @l
    public static final kotlin.sequences.m<NavDestination> getHierarchy(@l NavDestination navDestination) {
        return Companion.getHierarchy(navDestination);
    }

    private final boolean hasRequiredArguments(NavDeepLink navDeepLink, Uri uri, Map<String, NavArgument> map) {
        return NavArgumentKt.missingRequiredArguments(map, new NavDestination$hasRequiredArguments$missingRequiredArguments$1(navDeepLink.getMatchingPathAndQueryArgs$navigation_common_release(uri, map))).isEmpty();
    }

    @l
    @u3.m
    protected static final <C> Class<? extends C> parseClassFromName(@l Context context, @l String str, @l Class<? extends C> cls) {
        return Companion.parseClassFromName(context, str, cls);
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @u3.m
    public static final <C> Class<? extends C> parseClassFromNameInternal(@l Context context, @l String str, @l Class<? extends C> cls) {
        return Companion.parseClassFromNameInternal(context, str, cls);
    }

    public final void addArgument(@l String argumentName, @l NavArgument argument) {
        l0.p(argumentName, "argumentName");
        l0.p(argument, "argument");
        this._arguments.put(argumentName, argument);
    }

    public final void addDeepLink(@l String uriPattern) {
        l0.p(uriPattern, "uriPattern");
        addDeepLink(new NavDeepLink.Builder().setUriPattern(uriPattern).build());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @m
    public final Bundle addInDefaultArgs(@m Bundle bundle) {
        boolean z4;
        if (bundle == null) {
            Map<String, NavArgument> map = this._arguments;
            if (map != null && !map.isEmpty()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                return null;
            }
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, NavArgument> entry : this._arguments.entrySet()) {
            entry.getValue().putDefaultValue(entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry<String, NavArgument> entry2 : this._arguments.entrySet()) {
                String key = entry2.getKey();
                NavArgument value = entry2.getValue();
                if (!value.verify(key, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + key + "' in argument bundle. " + value.getType().getName() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @i
    public final int[] buildDeepLinkIds() {
        return buildDeepLinkIds$default(this, null, 1, null);
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @i
    public final int[] buildDeepLinkIds(@m NavDestination navDestination) {
        NavGraph navGraph;
        List S5;
        int Y;
        int[] R5;
        k kVar = new k();
        NavDestination navDestination2 = this;
        while (true) {
            l0.m(navDestination2);
            NavGraph navGraph2 = navDestination2.parent;
            if (navDestination != null) {
                navGraph = navDestination.parent;
            } else {
                navGraph = null;
            }
            if (navGraph != null) {
                NavGraph navGraph3 = navDestination.parent;
                l0.m(navGraph3);
                if (navGraph3.findNode(navDestination2.id) == navDestination2) {
                    kVar.addFirst(navDestination2);
                    break;
                }
            }
            if (navGraph2 == null || navGraph2.getStartDestinationId() != navDestination2.id) {
                kVar.addFirst(navDestination2);
            }
            if (l0.g(navGraph2, navDestination) || navGraph2 == null) {
                break;
            }
            navDestination2 = navGraph2;
        }
        S5 = e0.S5(kVar);
        List list = S5;
        Y = x.Y(list, 10);
        ArrayList arrayList = new ArrayList(Y);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((NavDestination) it.next()).id));
        }
        R5 = e0.R5(arrayList);
        return R5;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@p4.m java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto Lc7
            boolean r2 = r9 instanceof androidx.navigation.NavDestination
            if (r2 != 0) goto Ld
            goto Lc7
        Ld:
            java.util.List<androidx.navigation.NavDeepLink> r2 = r8.deepLinks
            androidx.navigation.NavDestination r9 = (androidx.navigation.NavDestination) r9
            java.util.List<androidx.navigation.NavDeepLink> r3 = r9.deepLinks
            boolean r2 = kotlin.jvm.internal.l0.g(r2, r3)
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r3 = r8.actions
            int r3 = r3.size()
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r4 = r9.actions
            int r4 = r4.size()
            if (r3 != r4) goto L5c
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r3 = r8.actions
            kotlin.collections.s0 r3 = androidx.collection.SparseArrayKt.keyIterator(r3)
            kotlin.sequences.m r3 = kotlin.sequences.p.e(r3)
            java.util.Iterator r3 = r3.iterator()
        L33:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L57
            java.lang.Object r4 = r3.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r5 = r8.actions
            java.lang.Object r5 = r5.get(r4)
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r6 = r9.actions
            java.lang.Object r4 = r6.get(r4)
            boolean r4 = kotlin.jvm.internal.l0.g(r5, r4)
            if (r4 != 0) goto L33
            r3 = r1
            goto L58
        L57:
            r3 = r0
        L58:
            if (r3 == 0) goto L5c
            r3 = r0
            goto L5d
        L5c:
            r3 = r1
        L5d:
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r4 = r8._arguments
            int r4 = r4.size()
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r5 = r9._arguments
            int r5 = r5.size()
            if (r4 != r5) goto Lad
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r4 = r8._arguments
            kotlin.sequences.m r4 = kotlin.collections.x0.T0(r4)
            java.util.Iterator r4 = r4.iterator()
        L75:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La8
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r6 = r9._arguments
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto La3
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r6 = r9._arguments
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = kotlin.jvm.internal.l0.g(r6, r5)
            if (r5 == 0) goto La3
            r5 = r0
            goto La4
        La3:
            r5 = r1
        La4:
            if (r5 != 0) goto L75
            r4 = r1
            goto La9
        La8:
            r4 = r0
        La9:
            if (r4 == 0) goto Lad
            r4 = r0
            goto Lae
        Lad:
            r4 = r1
        Lae:
            int r5 = r8.id
            int r6 = r9.id
            if (r5 != r6) goto Lc5
            java.lang.String r5 = r8.route
            java.lang.String r9 = r9.route
            boolean r9 = kotlin.jvm.internal.l0.g(r5, r9)
            if (r9 == 0) goto Lc5
            if (r2 == 0) goto Lc5
            if (r3 == 0) goto Lc5
            if (r4 == 0) goto Lc5
            goto Lc6
        Lc5:
            r0 = r1
        Lc6:
            return r0
        Lc7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.equals(java.lang.Object):boolean");
    }

    @m
    public final String fillInLabel(@l Context context, @m Bundle bundle) {
        NavType<Object> navType;
        NavArgument navArgument;
        l0.p(context, "context");
        CharSequence charSequence = this.label;
        if (charSequence == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (bundle != null && bundle.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, "");
                if (group != null && (navArgument = this._arguments.get(group)) != null) {
                    navType = navArgument.getType();
                } else {
                    navType = null;
                }
                if (l0.g(navType, NavType.ReferenceType)) {
                    String string = context.getString(bundle.getInt(group));
                    l0.o(string, "context.getString(bundle.getInt(argName))");
                    stringBuffer.append(string);
                } else {
                    stringBuffer.append(String.valueOf(bundle.get(group)));
                }
            } else {
                throw new IllegalArgumentException("Could not find \"" + group + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + k0.f19765b);
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @m
    public final NavAction getAction(@IdRes int i5) {
        NavAction navAction;
        if (this.actions.isEmpty()) {
            navAction = null;
        } else {
            navAction = this.actions.get(i5);
        }
        if (navAction == null) {
            NavGraph navGraph = this.parent;
            if (navGraph == null) {
                return null;
            }
            return navGraph.getAction(i5);
        }
        return navAction;
    }

    @l
    public final Map<String, NavArgument> getArguments() {
        return x0.D0(this._arguments);
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String getDisplayName() {
        String str = this.idName;
        return str == null ? String.valueOf(this.id) : str;
    }

    @IdRes
    public final int getId() {
        return this.id;
    }

    @m
    public final CharSequence getLabel() {
        return this.label;
    }

    @l
    public final String getNavigatorName() {
        return this.navigatorName;
    }

    @m
    public final NavGraph getParent() {
        return this.parent;
    }

    @m
    public final String getRoute() {
        return this.route;
    }

    public boolean hasDeepLink(@l Uri deepLink) {
        l0.p(deepLink, "deepLink");
        return hasDeepLink(new NavDeepLinkRequest(deepLink, null, null));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean hasRoute(@l String route, @m Bundle bundle) {
        NavDestination navDestination;
        l0.p(route, "route");
        if (l0.g(this.route, route)) {
            return true;
        }
        DeepLinkMatch matchDeepLink = matchDeepLink(route);
        if (matchDeepLink != null) {
            navDestination = matchDeepLink.getDestination();
        } else {
            navDestination = null;
        }
        if (!l0.g(this, navDestination)) {
            return false;
        }
        return matchDeepLink.hasMatchingArgs(bundle);
    }

    public int hashCode() {
        int i5;
        int i6;
        int i7;
        Set<String> keySet;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = this.id * 31;
        String str = this.route;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = i12 + i5;
        for (NavDeepLink navDeepLink : this.deepLinks) {
            int i14 = i13 * 31;
            String uriPattern = navDeepLink.getUriPattern();
            if (uriPattern != null) {
                i9 = uriPattern.hashCode();
            } else {
                i9 = 0;
            }
            int i15 = (i14 + i9) * 31;
            String action = navDeepLink.getAction();
            if (action != null) {
                i10 = action.hashCode();
            } else {
                i10 = 0;
            }
            int i16 = (i15 + i10) * 31;
            String mimeType = navDeepLink.getMimeType();
            if (mimeType != null) {
                i11 = mimeType.hashCode();
            } else {
                i11 = 0;
            }
            i13 = i16 + i11;
        }
        Iterator valueIterator = SparseArrayKt.valueIterator(this.actions);
        while (valueIterator.hasNext()) {
            NavAction navAction = (NavAction) valueIterator.next();
            int destinationId = ((i13 * 31) + navAction.getDestinationId()) * 31;
            NavOptions navOptions = navAction.getNavOptions();
            if (navOptions != null) {
                i7 = navOptions.hashCode();
            } else {
                i7 = 0;
            }
            i13 = destinationId + i7;
            Bundle defaultArguments = navAction.getDefaultArguments();
            if (defaultArguments != null && (keySet = defaultArguments.keySet()) != null) {
                l0.o(keySet, "keySet()");
                for (String str2 : keySet) {
                    int i17 = i13 * 31;
                    Bundle defaultArguments2 = navAction.getDefaultArguments();
                    l0.m(defaultArguments2);
                    Object obj = defaultArguments2.get(str2);
                    if (obj != null) {
                        i8 = obj.hashCode();
                    } else {
                        i8 = 0;
                    }
                    i13 = i17 + i8;
                }
            }
        }
        for (String str3 : this._arguments.keySet()) {
            int hashCode = ((i13 * 31) + str3.hashCode()) * 31;
            NavArgument navArgument = this._arguments.get(str3);
            if (navArgument != null) {
                i6 = navArgument.hashCode();
            } else {
                i6 = 0;
            }
            i13 = hashCode + i6;
        }
        return i13;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @m
    public final DeepLinkMatch matchDeepLink(@l String route) {
        l0.p(route, "route");
        NavDeepLinkRequest.Builder.Companion companion = NavDeepLinkRequest.Builder.Companion;
        Uri parse = Uri.parse(Companion.createRoute(route));
        l0.h(parse, "Uri.parse(this)");
        NavDeepLinkRequest build = companion.fromUri(parse).build();
        if (this instanceof NavGraph) {
            return ((NavGraph) this).matchDeepLinkExcludingChildren(build);
        }
        return matchDeepLink(build);
    }

    @CallSuper
    public void onInflate(@l Context context, @l AttributeSet attrs) {
        l0.p(context, "context");
        l0.p(attrs, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, androidx.navigation.common.R.styleable.Navigator);
        l0.o(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        setRoute(obtainAttributes.getString(androidx.navigation.common.R.styleable.Navigator_route));
        int i5 = androidx.navigation.common.R.styleable.Navigator_android_id;
        if (obtainAttributes.hasValue(i5)) {
            setId(obtainAttributes.getResourceId(i5, 0));
            this.idName = Companion.getDisplayName(context, this.id);
        }
        this.label = obtainAttributes.getText(androidx.navigation.common.R.styleable.Navigator_android_label);
        r2 r2Var = r2.f19517a;
        obtainAttributes.recycle();
    }

    public final void putAction(@IdRes int i5, @IdRes int i6) {
        putAction(i5, new NavAction(i6, null, null, 6, null));
    }

    public final void removeAction(@IdRes int i5) {
        this.actions.remove(i5);
    }

    public final void removeArgument(@l String argumentName) {
        l0.p(argumentName, "argumentName");
        this._arguments.remove(argumentName);
    }

    public final void setId(@IdRes int i5) {
        this.id = i5;
        this.idName = null;
    }

    public final void setLabel(@m CharSequence charSequence) {
        this.label = charSequence;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setParent(@m NavGraph navGraph) {
        this.parent = navGraph;
    }

    public final void setRoute(@m String str) {
        boolean S1;
        Object obj;
        if (str == null) {
            setId(0);
        } else {
            S1 = kotlin.text.e0.S1(str);
            if (!S1) {
                String createRoute = Companion.createRoute(str);
                setId(createRoute.hashCode());
                addDeepLink(createRoute);
            } else {
                throw new IllegalArgumentException("Cannot have an empty route".toString());
            }
        }
        List<NavDeepLink> list = this.deepLinks;
        List<NavDeepLink> list2 = list;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (l0.g(((NavDeepLink) obj).getUriPattern(), Companion.createRoute(this.route))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        u1.a(list2).remove(obj);
        this.route = str;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean supportsActions() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.String r1 = r2.idName
            if (r1 != 0) goto L28
            java.lang.String r1 = "0x"
            r0.append(r1)
            int r1 = r2.id
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            goto L2b
        L28:
            r0.append(r1)
        L2b:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r1 = r2.route
            if (r1 == 0) goto L3d
            boolean r1 = kotlin.text.v.S1(r1)
            if (r1 == 0) goto L3b
            goto L3d
        L3b:
            r1 = 0
            goto L3e
        L3d:
            r1 = 1
        L3e:
            if (r1 != 0) goto L4a
            java.lang.String r1 = " route="
            r0.append(r1)
            java.lang.String r1 = r2.route
            r0.append(r1)
        L4a:
            java.lang.CharSequence r1 = r2.label
            if (r1 == 0) goto L58
            java.lang.String r1 = " label="
            r0.append(r1)
            java.lang.CharSequence r1 = r2.label
            r0.append(r1)
        L58:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "sb.toString()"
            kotlin.jvm.internal.l0.o(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.toString():java.lang.String");
    }

    public final void addDeepLink(@l NavDeepLink navDeepLink) {
        l0.p(navDeepLink, "navDeepLink");
        List<String> missingRequiredArguments = NavArgumentKt.missingRequiredArguments(this._arguments, new NavDestination$addDeepLink$missingRequiredArguments$1(navDeepLink));
        if (missingRequiredArguments.isEmpty()) {
            this.deepLinks.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.getUriPattern() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + missingRequiredArguments).toString());
    }

    public boolean hasDeepLink(@l NavDeepLinkRequest deepLinkRequest) {
        l0.p(deepLinkRequest, "deepLinkRequest");
        return matchDeepLink(deepLinkRequest) != null;
    }

    public final void putAction(@IdRes int i5, @l NavAction action) {
        l0.p(action, "action");
        if (supportsActions()) {
            if (i5 != 0) {
                this.actions.put(i5, action);
                return;
            }
            throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
        }
        throw new UnsupportedOperationException("Cannot add action " + i5 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavDestination(@l Navigator<? extends NavDestination> navigator) {
        this(NavigatorProvider.Companion.getNameForNavigator$navigation_common_release(navigator.getClass()));
        l0.p(navigator, "navigator");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @m
    public DeepLinkMatch matchDeepLink(@l NavDeepLinkRequest navDeepLinkRequest) {
        l0.p(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.deepLinks.isEmpty()) {
            return null;
        }
        DeepLinkMatch deepLinkMatch = null;
        for (NavDeepLink navDeepLink : this.deepLinks) {
            Uri uri = navDeepLinkRequest.getUri();
            Bundle matchingArguments = uri != null ? navDeepLink.getMatchingArguments(uri, this._arguments) : null;
            int calculateMatchingPathSegments$navigation_common_release = navDeepLink.calculateMatchingPathSegments$navigation_common_release(uri);
            String action = navDeepLinkRequest.getAction();
            boolean z4 = action != null && l0.g(action, navDeepLink.getAction());
            String mimeType = navDeepLinkRequest.getMimeType();
            int mimeTypeMatchRating = mimeType != null ? navDeepLink.getMimeTypeMatchRating(mimeType) : -1;
            if (matchingArguments == null) {
                if (z4 || mimeTypeMatchRating > -1) {
                    if (hasRequiredArguments(navDeepLink, uri, this._arguments)) {
                    }
                }
            }
            DeepLinkMatch deepLinkMatch2 = new DeepLinkMatch(this, matchingArguments, navDeepLink.isExactDeepLink(), calculateMatchingPathSegments$navigation_common_release, z4, mimeTypeMatchRating);
            if (deepLinkMatch == null || deepLinkMatch2.compareTo(deepLinkMatch) > 0) {
                deepLinkMatch = deepLinkMatch2;
            }
        }
        return deepLinkMatch;
    }
}
