package androidx.fragment.app;

import android.view.View;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\"\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J,\u0010\u000b\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004H\u0007J<\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0012\u001a\u00020\u000fH\u0007J\u001e\u0010\u0018\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J\b\u0010\u0019\u001a\u00020\u000fH\u0007R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/fragment/app/FragmentTransition;", "", "Landroidx/fragment/app/FragmentTransitionImpl;", "resolveSupportImpl", "Landroidx/collection/ArrayMap;", "", t0.b.f22420d, "findKeyForValue", "Landroid/view/View;", "namedViews", "Lkotlin/r2;", "retainValues", "Landroidx/fragment/app/Fragment;", "inFragment", "outFragment", "", "isPop", "sharedElements", "isStart", "callSharedElementStartEnd", "", "views", "", "visibility", "setViewVisibility", "supportsTransition", "PLATFORM_IMPL", "Landroidx/fragment/app/FragmentTransitionImpl;", "SUPPORT_IMPL", "<init>", "()V", "fragment_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFragmentTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentTransition.kt\nandroidx/fragment/app/FragmentTransition\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n515#2:123\n500#2,6:124\n125#3:130\n152#3,3:131\n125#3:134\n152#3,3:135\n125#3:138\n152#3,3:139\n1855#4,2:142\n*S KotlinDebug\n*F\n+ 1 FragmentTransition.kt\nandroidx/fragment/app/FragmentTransition\n*L\n50#1:123\n50#1:124,6\n53#1:130\n53#1:131,3\n98#1:134\n98#1:135,3\n99#1:138\n99#1:139,3\n113#1:142,2\n*E\n"})
/* loaded from: classes2.dex */
public final class FragmentTransition {

    @p4.l
    public static final FragmentTransition INSTANCE;

    @p4.m
    @u3.e
    public static final FragmentTransitionImpl PLATFORM_IMPL;

    @p4.m
    @u3.e
    public static final FragmentTransitionImpl SUPPORT_IMPL;

    static {
        FragmentTransition fragmentTransition = new FragmentTransition();
        INSTANCE = fragmentTransition;
        PLATFORM_IMPL = new FragmentTransitionCompat21();
        SUPPORT_IMPL = fragmentTransition.resolveSupportImpl();
    }

    private FragmentTransition() {
    }

    @u3.m
    public static final void callSharedElementStartEnd(@p4.l Fragment inFragment, @p4.l Fragment outFragment, boolean z4, @p4.l ArrayMap<String, View> sharedElements, boolean z5) {
        SharedElementCallback enterTransitionCallback;
        l0.p(inFragment, "inFragment");
        l0.p(outFragment, "outFragment");
        l0.p(sharedElements, "sharedElements");
        if (z4) {
            enterTransitionCallback = outFragment.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = inFragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it = sharedElements.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it2 = sharedElements.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getKey());
            }
            if (z5) {
                enterTransitionCallback.onSharedElementStart(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.onSharedElementEnd(arrayList2, arrayList, null);
            }
        }
    }

    @p4.m
    @u3.m
    public static final String findKeyForValue(@p4.l ArrayMap<String, String> arrayMap, @p4.l String value) {
        Object D2;
        l0.p(arrayMap, "<this>");
        l0.p(value, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : arrayMap.entrySet()) {
            if (l0.g(entry.getValue(), value)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        D2 = e0.D2(arrayList);
        return (String) D2;
    }

    private final FragmentTransitionImpl resolveSupportImpl() {
        try {
            l0.n(FragmentTransitionSupport.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (FragmentTransitionImpl) FragmentTransitionSupport.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    @u3.m
    public static final void retainValues(@p4.l ArrayMap<String, String> arrayMap, @p4.l ArrayMap<String, View> namedViews) {
        l0.p(arrayMap, "<this>");
        l0.p(namedViews, "namedViews");
        int size = arrayMap.size();
        while (true) {
            size--;
            if (-1 < size) {
                if (!namedViews.containsKey(arrayMap.valueAt(size))) {
                    arrayMap.removeAt(size);
                }
            } else {
                return;
            }
        }
    }

    @u3.m
    public static final void setViewVisibility(@p4.l List<? extends View> views, int i5) {
        l0.p(views, "views");
        Iterator<T> it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i5);
        }
    }

    @u3.m
    public static final boolean supportsTransition() {
        return (PLATFORM_IMPL == null && SUPPORT_IMPL == null) ? false : true;
    }
}
