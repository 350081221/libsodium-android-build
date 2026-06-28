package androidx.navigation;

import a1.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.NavDestination;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.r2;
import kotlin.sequences.s;
import kotlin.sequences.u;
import kotlin.text.e0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010)\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 D2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001DB\u0017\u0012\u000e\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000@¢\u0006\u0004\bB\u0010CJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\tH\u0007J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001J\u0016\u0010\u0013\u001a\u00020\u00072\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011J!\u0010\u0013\u001a\u00020\u00072\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0014\"\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0015J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0017\u001a\u00020\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019J\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0007J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0007J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001dH\u0086\u0002J\u000e\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0000J\u000e\u0010!\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001J\u0006\u0010\"\u001a\u00020\u0007J\b\u0010#\u001a\u00020\u0016H\u0007J\u000e\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0016J\u000e\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0019J\b\u0010'\u001a\u00020\u0019H\u0016J\u0013\u0010)\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010*\u001a\u00020\u0016H\u0016R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010+8G¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b-\u0010.R\u0016\u0010$\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R.\u00102\u001a\u0004\u0018\u00010\u00192\b\u0010&\u001a\u0004\u0018\u00010\u00198\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00101\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010;\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00168G@BX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u00104R\u0011\u0010?\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b>\u00104¨\u0006E"}, d2 = {"Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "", "Landroid/content/Context;", d.X, "Landroid/util/AttributeSet;", "attrs", "Lkotlin/r2;", "onInflate", "Landroidx/navigation/NavDeepLinkRequest;", "navDeepLinkRequest", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink", "request", "matchDeepLinkExcludingChildren", "node", "addDestination", "", "nodes", "addDestinations", "", "([Landroidx/navigation/NavDestination;)V", "", "resId", "findNode", "", "route", "", "searchParents", "", "iterator", "other", "addAll", "remove", "clear", "getStartDestination", "startDestId", "setStartDestination", "startDestRoute", "toString", "", "equals", TTDownloadField.TT_HASHCODE, "Landroidx/collection/SparseArrayCompat;", "Landroidx/collection/SparseArrayCompat;", "getNodes", "()Landroidx/collection/SparseArrayCompat;", "I", "startDestIdName", "Ljava/lang/String;", "startDestinationRoute", "getStartDestinationRoute", "()Ljava/lang/String;", "setStartDestinationRoute", "(Ljava/lang/String;)V", "getStartDestinationId", "()I", "setStartDestinationId", "(I)V", "startDestinationId", "getDisplayName", "displayName", "getStartDestDisplayName", "startDestDisplayName", "Landroidx/navigation/Navigator;", "navGraphNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Companion", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 SparseArray.kt\nandroidx/collection/SparseArrayKt\n*L\n1#1,478:1\n232#2,3:479\n1603#3,9:482\n1855#3:491\n1856#3:493\n1612#3:494\n1#4:492\n1#4:495\n179#5,2:496\n1206#5,2:499\n22#6:498\n56#6,4:501\n*S KotlinDebug\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph\n*L\n59#1:479,3\n71#1:482,9\n71#1:491\n71#1:493\n71#1:494\n71#1:492\n196#1:496,2\n390#1:499,2\n388#1:498\n395#1:501,4\n*E\n"})
/* loaded from: classes2.dex */
public class NavGraph extends NavDestination implements Iterable<NavDestination>, w3.a {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final SparseArrayCompat<NavDestination> nodes;
    private int startDestId;

    @m
    private String startDestIdName;

    @m
    private String startDestinationRoute;

    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Landroidx/navigation/NavGraph$Companion;", "", "()V", "findStartDestination", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/NavGraph;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        @u3.m
        public final NavDestination findStartDestination(@l NavGraph navGraph) {
            kotlin.sequences.m l5;
            Object f12;
            l0.p(navGraph, "<this>");
            l5 = s.l(navGraph.findNode(navGraph.getStartDestinationId()), NavGraph$Companion$findStartDestination$1.INSTANCE);
            f12 = u.f1(l5);
            return (NavDestination) f12;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph(@l Navigator<? extends NavGraph> navGraphNavigator) {
        super(navGraphNavigator);
        l0.p(navGraphNavigator, "navGraphNavigator");
        this.nodes = new SparseArrayCompat<>();
    }

    @l
    @u3.m
    public static final NavDestination findStartDestination(@l NavGraph navGraph) {
        return Companion.findStartDestination(navGraph);
    }

    private final void setStartDestinationId(int i5) {
        boolean z4;
        if (i5 != getId()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (this.startDestinationRoute != null) {
                setStartDestinationRoute(null);
            }
            this.startDestId = i5;
            this.startDestIdName = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i5 + " cannot use the same id as the graph " + this).toString());
    }

    private final void setStartDestinationRoute(String str) {
        boolean S1;
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else if (!l0.g(str, getRoute())) {
            S1 = e0.S1(str);
            if (!S1) {
                hashCode = NavDestination.Companion.createRoute(str).hashCode();
            } else {
                throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
            }
        } else {
            throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
        }
        this.startDestId = hashCode;
        this.startDestinationRoute = str;
    }

    public final void addAll(@l NavGraph other) {
        l0.p(other, "other");
        Iterator<NavDestination> it = other.iterator();
        while (it.hasNext()) {
            NavDestination next = it.next();
            it.remove();
            addDestination(next);
        }
    }

    public final void addDestination(@l NavDestination node) {
        boolean z4;
        boolean z5;
        l0.p(node, "node");
        int id = node.getId();
        String route = node.getRoute();
        boolean z6 = false;
        if (id == 0 && route == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            if (getRoute() != null && !(!l0.g(route, getRoute()))) {
                throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
            }
            if (id != getId()) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                NavDestination navDestination = this.nodes.get(id);
                if (navDestination == node) {
                    return;
                }
                if (node.getParent() == null) {
                    z6 = true;
                }
                if (z6) {
                    if (navDestination != null) {
                        navDestination.setParent(null);
                    }
                    node.setParent(this);
                    this.nodes.put(node.getId(), node);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
            }
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
    }

    public final void addDestinations(@l Collection<? extends NavDestination> nodes) {
        l0.p(nodes, "nodes");
        for (NavDestination navDestination : nodes) {
            if (navDestination != null) {
                addDestination(navDestination);
            }
        }
    }

    public final void clear() {
        Iterator<NavDestination> it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @Override // androidx.navigation.NavDestination
    public boolean equals(@m Object obj) {
        kotlin.sequences.m e5;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavGraph)) {
            return false;
        }
        if (super.equals(obj)) {
            NavGraph navGraph = (NavGraph) obj;
            if (this.nodes.size() == navGraph.nodes.size() && getStartDestinationId() == navGraph.getStartDestinationId()) {
                e5 = s.e(SparseArrayKt.valueIterator(this.nodes));
                Iterator it = e5.iterator();
                while (true) {
                    if (it.hasNext()) {
                        NavDestination navDestination = (NavDestination) it.next();
                        if (!l0.g(navDestination, navGraph.nodes.get(navDestination.getId()))) {
                            z4 = false;
                            break;
                        }
                    } else {
                        z4 = true;
                        break;
                    }
                }
                if (z4) {
                    return true;
                }
            }
        }
        return false;
    }

    @m
    public final NavDestination findNode(@IdRes int i5) {
        return findNode(i5, true);
    }

    @Override // androidx.navigation.NavDestination
    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String getDisplayName() {
        return getId() != 0 ? super.getDisplayName() : "the root navigation";
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final SparseArrayCompat<NavDestination> getNodes() {
        return this.nodes;
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final String getStartDestDisplayName() {
        if (this.startDestIdName == null) {
            String str = this.startDestinationRoute;
            if (str == null) {
                str = String.valueOf(this.startDestId);
            }
            this.startDestIdName = str;
        }
        String str2 = this.startDestIdName;
        l0.m(str2);
        return str2;
    }

    @k(message = "Use getStartDestinationId instead.", replaceWith = @b1(expression = "startDestinationId", imports = {}))
    @IdRes
    public final int getStartDestination() {
        return getStartDestinationId();
    }

    @IdRes
    public final int getStartDestinationId() {
        return this.startDestId;
    }

    @m
    public final String getStartDestinationRoute() {
        return this.startDestinationRoute;
    }

    @Override // androidx.navigation.NavDestination
    public int hashCode() {
        int startDestinationId = getStartDestinationId();
        SparseArrayCompat<NavDestination> sparseArrayCompat = this.nodes;
        int size = sparseArrayCompat.size();
        for (int i5 = 0; i5 < size; i5++) {
            startDestinationId = (((startDestinationId * 31) + sparseArrayCompat.keyAt(i5)) * 31) + sparseArrayCompat.valueAt(i5).hashCode();
        }
        return startDestinationId;
    }

    @Override // java.lang.Iterable
    @l
    public final Iterator<NavDestination> iterator() {
        return new NavGraph$iterator$1(this);
    }

    @Override // androidx.navigation.NavDestination
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @m
    public NavDestination.DeepLinkMatch matchDeepLink(@l NavDeepLinkRequest navDeepLinkRequest) {
        Comparable M3;
        List N;
        Comparable M32;
        l0.p(navDeepLinkRequest, "navDeepLinkRequest");
        NavDestination.DeepLinkMatch matchDeepLink = super.matchDeepLink(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        Iterator<NavDestination> it = iterator();
        while (it.hasNext()) {
            NavDestination.DeepLinkMatch matchDeepLink2 = it.next().matchDeepLink(navDeepLinkRequest);
            if (matchDeepLink2 != null) {
                arrayList.add(matchDeepLink2);
            }
        }
        M3 = kotlin.collections.e0.M3(arrayList);
        N = kotlin.collections.w.N(matchDeepLink, (NavDestination.DeepLinkMatch) M3);
        M32 = kotlin.collections.e0.M3(N);
        return (NavDestination.DeepLinkMatch) M32;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @m
    public final NavDestination.DeepLinkMatch matchDeepLinkExcludingChildren(@l NavDeepLinkRequest request) {
        l0.p(request, "request");
        return super.matchDeepLink(request);
    }

    @Override // androidx.navigation.NavDestination
    public void onInflate(@l Context context, @l AttributeSet attrs) {
        l0.p(context, "context");
        l0.p(attrs, "attrs");
        super.onInflate(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, androidx.navigation.common.R.styleable.NavGraphNavigator);
        l0.o(obtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        setStartDestinationId(obtainAttributes.getResourceId(androidx.navigation.common.R.styleable.NavGraphNavigator_startDestination, 0));
        this.startDestIdName = NavDestination.Companion.getDisplayName(context, this.startDestId);
        r2 r2Var = r2.f19517a;
        obtainAttributes.recycle();
    }

    public final void remove(@l NavDestination node) {
        l0.p(node, "node");
        int indexOfKey = this.nodes.indexOfKey(node.getId());
        if (indexOfKey >= 0) {
            this.nodes.valueAt(indexOfKey).setParent(null);
            this.nodes.removeAt(indexOfKey);
        }
    }

    public final void setStartDestination(int i5) {
        setStartDestinationId(i5);
    }

    @Override // androidx.navigation.NavDestination
    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        NavDestination findNode = findNode(this.startDestinationRoute);
        if (findNode == null) {
            findNode = findNode(getStartDestinationId());
        }
        sb.append(" startDestination=");
        if (findNode == null) {
            String str = this.startDestinationRoute;
            if (str != null) {
                sb.append(str);
            } else {
                String str2 = this.startDestIdName;
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append("0x" + Integer.toHexString(this.startDestId));
                }
            }
        } else {
            sb.append("{");
            sb.append(findNode.toString());
            sb.append(i.f138d);
        }
        String sb2 = sb.toString();
        l0.o(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.navigation.NavDestination findNode(@p4.m java.lang.String r3) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == 0) goto Lc
            boolean r1 = kotlin.text.v.S1(r3)
            if (r1 == 0) goto La
            goto Lc
        La:
            r1 = 0
            goto Ld
        Lc:
            r1 = r0
        Ld:
            if (r1 != 0) goto L14
            androidx.navigation.NavDestination r3 = r2.findNode(r3, r0)
            goto L15
        L14:
            r3 = 0
        L15:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavGraph.findNode(java.lang.String):androidx.navigation.NavDestination");
    }

    public final void setStartDestination(@l String startDestRoute) {
        l0.p(startDestRoute, "startDestRoute");
        setStartDestinationRoute(startDestRoute);
    }

    public final void addDestinations(@l NavDestination... nodes) {
        l0.p(nodes, "nodes");
        for (NavDestination navDestination : nodes) {
            addDestination(navDestination);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @m
    public final NavDestination findNode(@IdRes int i5, boolean z4) {
        NavDestination navDestination = this.nodes.get(i5);
        if (navDestination != null) {
            return navDestination;
        }
        if (!z4 || getParent() == null) {
            return null;
        }
        NavGraph parent = getParent();
        l0.m(parent);
        return parent.findNode(i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @m
    public final NavDestination findNode(@l String route, boolean z4) {
        kotlin.sequences.m e5;
        NavDestination navDestination;
        l0.p(route, "route");
        NavDestination navDestination2 = this.nodes.get(NavDestination.Companion.createRoute(route).hashCode());
        if (navDestination2 == null) {
            e5 = s.e(SparseArrayKt.valueIterator(this.nodes));
            Iterator it = e5.iterator();
            while (true) {
                if (!it.hasNext()) {
                    navDestination = 0;
                    break;
                }
                navDestination = it.next();
                if (((NavDestination) navDestination).matchDeepLink(route) != null) {
                    break;
                }
            }
            navDestination2 = navDestination;
        }
        if (navDestination2 != null) {
            return navDestination2;
        }
        if (!z4 || getParent() == null) {
            return null;
        }
        NavGraph parent = getParent();
        l0.m(parent);
        return parent.findNode(route);
    }
}
