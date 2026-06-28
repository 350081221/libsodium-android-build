package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.NavigatorState;
import androidx.navigation.compose.DialogNavigator;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.flow.t0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001&\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000223B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b0\u00101J \u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J*\u0010\f\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0005H\u0016J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\r0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R \u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00110,8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00064"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "", "popUpToIndex", "Landroidx/navigation/NavBackStackEntry;", "popUpTo", "", "savedState", "Lkotlin/r2;", "popWithTransition", "entry", "navigate", "Landroidx/fragment/app/DialogFragment;", "createDialogFragment", "popBackStack", "createDestination", "", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "backStackEntry", "onLaunchSingleTop", "Landroidx/navigation/NavigatorState;", "state", "onAttach", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "", "", "restoredTagsAwaitingAttach", "Ljava/util/Set;", "androidx/navigation/fragment/DialogFragmentNavigator$observer$1", "observer", "Landroidx/navigation/fragment/DialogFragmentNavigator$observer$1;", "", "transitioningFragments", "Ljava/util/Map;", "Lkotlinx/coroutines/flow/t0;", "getBackStack$navigation_fragment_release", "()Lkotlinx/coroutines/flow/t0;", "backStack", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V", "Companion", "Destination", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
@Navigator.Name(DialogNavigator.NAME)
/* loaded from: classes2.dex */
public final class DialogFragmentNavigator extends Navigator<Destination> {

    @l
    private static final Companion Companion = new Companion(null);

    @l
    private static final String TAG = "DialogFragmentNavigator";

    @l
    private final Context context;

    @l
    private final FragmentManager fragmentManager;

    @l
    private final DialogFragmentNavigator$observer$1 observer;

    @l
    private final Set<String> restoredTagsAwaitingAttach;

    @l
    private final Map<String, DialogFragment> transitioningFragments;

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigator$Companion;", "", "()V", "TAG", "", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    @NavDestination.ClassType(DialogFragment.class)
    @i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/FloatingWindow;", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "Landroid/util/AttributeSet;", "attrs", "Lkotlin/r2;", "onInflate", "", "className", "setClassName", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "_className", "Ljava/lang/String;", "getClassName", "()Ljava/lang/String;", "Landroidx/navigation/Navigator;", "fragmentNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nDialogFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogFragmentNavigator.kt\nandroidx/navigation/fragment/DialogFragmentNavigator$Destination\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,332:1\n1#2:333\n232#3,3:334\n*S KotlinDebug\n*F\n+ 1 DialogFragmentNavigator.kt\nandroidx/navigation/fragment/DialogFragmentNavigator$Destination\n*L\n298#1:334,3\n*E\n"})
    /* loaded from: classes2.dex */
    public static class Destination extends NavDestination implements FloatingWindow {

        @m
        private String _className;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(@l Navigator<? extends Destination> fragmentNavigator) {
            super(fragmentNavigator);
            l0.p(fragmentNavigator, "fragmentNavigator");
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Destination)) {
                return false;
            }
            if (super.equals(obj) && l0.g(this._className, ((Destination) obj)._className)) {
                return true;
            }
            return false;
        }

        @l
        public final String getClassName() {
            String str = this._className;
            if (str != null) {
                l0.n(str, "null cannot be cast to non-null type kotlin.String");
                return str;
            }
            throw new IllegalStateException("DialogFragment class was not set".toString());
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int i5;
            int hashCode = super.hashCode() * 31;
            String str = this._className;
            if (str != null) {
                i5 = str.hashCode();
            } else {
                i5 = 0;
            }
            return hashCode + i5;
        }

        @Override // androidx.navigation.NavDestination
        @CallSuper
        public void onInflate(@l Context context, @l AttributeSet attrs) {
            l0.p(context, "context");
            l0.p(attrs, "attrs");
            super.onInflate(context, attrs);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, R.styleable.DialogFragmentNavigator);
            l0.o(obtainAttributes, "context.resources.obtain…ntNavigator\n            )");
            String string = obtainAttributes.getString(R.styleable.DialogFragmentNavigator_android_name);
            if (string != null) {
                setClassName(string);
            }
            obtainAttributes.recycle();
        }

        @l
        public final Destination setClassName(@l String className) {
            l0.p(className, "className");
            this._className = className;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Destination(@l NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(DialogFragmentNavigator.class));
            l0.p(navigatorProvider, "navigatorProvider");
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.navigation.fragment.DialogFragmentNavigator$observer$1] */
    public DialogFragmentNavigator(@l Context context, @l FragmentManager fragmentManager) {
        l0.p(context, "context");
        l0.p(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.restoredTagsAwaitingAttach = new LinkedHashSet();
        this.observer = new LifecycleEventObserver() { // from class: androidx.navigation.fragment.DialogFragmentNavigator$observer$1

            @i0(k = 3, mv = {1, 8, 0}, xi = 48)
            /* loaded from: classes2.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@l LifecycleOwner source, @l Lifecycle.Event event) {
                NavigatorState state;
                NavigatorState state2;
                NavigatorState state3;
                NavigatorState state4;
                int i5;
                Object T2;
                Object s32;
                NavigatorState state5;
                NavigatorState state6;
                l0.p(source, "source");
                l0.p(event, "event");
                int i6 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                boolean z4 = true;
                if (i6 != 1) {
                    Object obj = null;
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 4) {
                                DialogFragment dialogFragment = (DialogFragment) source;
                                state5 = DialogFragmentNavigator.this.getState();
                                for (Object obj2 : state5.getTransitionsInProgress().getValue()) {
                                    if (l0.g(((NavBackStackEntry) obj2).getId(), dialogFragment.getTag())) {
                                        obj = obj2;
                                    }
                                }
                                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                                if (navBackStackEntry != null) {
                                    state6 = DialogFragmentNavigator.this.getState();
                                    state6.markTransitionComplete(navBackStackEntry);
                                }
                                dialogFragment.getLifecycle().removeObserver(this);
                                return;
                            }
                            return;
                        }
                        DialogFragment dialogFragment2 = (DialogFragment) source;
                        if (!dialogFragment2.requireDialog().isShowing()) {
                            state4 = DialogFragmentNavigator.this.getState();
                            List<NavBackStackEntry> value = state4.getBackStack().getValue();
                            ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    if (l0.g(listIterator.previous().getId(), dialogFragment2.getTag())) {
                                        i5 = listIterator.nextIndex();
                                        break;
                                    }
                                } else {
                                    i5 = -1;
                                    break;
                                }
                            }
                            T2 = e0.T2(value, i5);
                            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) T2;
                            s32 = e0.s3(value);
                            if (!l0.g(s32, navBackStackEntry2)) {
                                Log.i("DialogFragmentNavigator", "Dialog " + dialogFragment2 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                            }
                            if (navBackStackEntry2 != null) {
                                DialogFragmentNavigator.this.popWithTransition(i5, navBackStackEntry2, false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    DialogFragment dialogFragment3 = (DialogFragment) source;
                    state2 = DialogFragmentNavigator.this.getState();
                    for (Object obj3 : state2.getTransitionsInProgress().getValue()) {
                        if (l0.g(((NavBackStackEntry) obj3).getId(), dialogFragment3.getTag())) {
                            obj = obj3;
                        }
                    }
                    NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj;
                    if (navBackStackEntry3 != null) {
                        state3 = DialogFragmentNavigator.this.getState();
                        state3.markTransitionComplete(navBackStackEntry3);
                        return;
                    }
                    return;
                }
                DialogFragment dialogFragment4 = (DialogFragment) source;
                state = DialogFragmentNavigator.this.getState();
                List<NavBackStackEntry> value2 = state.getBackStack().getValue();
                if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                    Iterator<T> it = value2.iterator();
                    while (it.hasNext()) {
                        if (l0.g(((NavBackStackEntry) it.next()).getId(), dialogFragment4.getTag())) {
                            break;
                        }
                    }
                }
                z4 = false;
                if (!z4) {
                    dialogFragment4.dismiss();
                }
            }
        };
        this.transitioningFragments = new LinkedHashMap();
    }

    private final DialogFragment createDialogFragment(NavBackStackEntry navBackStackEntry) {
        NavDestination destination = navBackStackEntry.getDestination();
        l0.n(destination, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        Destination destination2 = (Destination) destination;
        String className = destination2.getClassName();
        if (className.charAt(0) == '.') {
            className = this.context.getPackageName() + className;
        }
        Fragment instantiate = this.fragmentManager.getFragmentFactory().instantiate(this.context.getClassLoader(), className);
        l0.o(instantiate, "fragmentManager.fragment…ader, className\n        )");
        if (DialogFragment.class.isAssignableFrom(instantiate.getClass())) {
            DialogFragment dialogFragment = (DialogFragment) instantiate;
            dialogFragment.setArguments(navBackStackEntry.getArguments());
            dialogFragment.getLifecycle().addObserver(this.observer);
            this.transitioningFragments.put(navBackStackEntry.getId(), dialogFragment);
            return dialogFragment;
        }
        throw new IllegalArgumentException(("Dialog destination " + destination2.getClassName() + " is not an instance of DialogFragment").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$1(DialogFragmentNavigator this$0, FragmentManager fragmentManager, Fragment childFragment) {
        l0.p(this$0, "this$0");
        l0.p(fragmentManager, "<anonymous parameter 0>");
        l0.p(childFragment, "childFragment");
        Set<String> set = this$0.restoredTagsAwaitingAttach;
        if (u1.a(set).remove(childFragment.getTag())) {
            childFragment.getLifecycle().addObserver(this$0.observer);
        }
        Map<String, DialogFragment> map = this$0.transitioningFragments;
        u1.k(map).remove(childFragment.getTag());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void popWithTransition(int i5, NavBackStackEntry navBackStackEntry, boolean z4) {
        Object T2;
        boolean T1;
        T2 = e0.T2(getState().getBackStack().getValue(), i5 - 1);
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) T2;
        T1 = e0.T1(getState().getTransitionsInProgress().getValue(), navBackStackEntry2);
        getState().popWithTransition(navBackStackEntry, z4);
        if (navBackStackEntry2 != null && !T1) {
            getState().markTransitionComplete(navBackStackEntry2);
        }
    }

    @l
    public final t0<List<NavBackStackEntry>> getBackStack$navigation_fragment_release() {
        return getState().getBackStack();
    }

    @Override // androidx.navigation.Navigator
    public void navigate(@l List<NavBackStackEntry> entries, @m NavOptions navOptions, @m Navigator.Extras extras) {
        l0.p(entries, "entries");
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<NavBackStackEntry> it = entries.iterator();
        while (it.hasNext()) {
            navigate(it.next());
        }
    }

    @Override // androidx.navigation.Navigator
    public void onAttach(@l NavigatorState state) {
        Lifecycle lifecycle;
        l0.p(state, "state");
        super.onAttach(state);
        for (NavBackStackEntry navBackStackEntry : state.getBackStack().getValue()) {
            DialogFragment dialogFragment = (DialogFragment) this.fragmentManager.findFragmentByTag(navBackStackEntry.getId());
            if (dialogFragment != null && (lifecycle = dialogFragment.getLifecycle()) != null) {
                lifecycle.addObserver(this.observer);
            } else {
                this.restoredTagsAwaitingAttach.add(navBackStackEntry.getId());
            }
        }
        this.fragmentManager.addFragmentOnAttachListener(new FragmentOnAttachListener() { // from class: androidx.navigation.fragment.a
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
                DialogFragmentNavigator.onAttach$lambda$1(DialogFragmentNavigator.this, fragmentManager, fragment);
            }
        });
    }

    @Override // androidx.navigation.Navigator
    public void onLaunchSingleTop(@l NavBackStackEntry backStackEntry) {
        l0.p(backStackEntry, "backStackEntry");
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        DialogFragment dialogFragment = this.transitioningFragments.get(backStackEntry.getId());
        if (dialogFragment == null) {
            Fragment findFragmentByTag = this.fragmentManager.findFragmentByTag(backStackEntry.getId());
            if (findFragmentByTag instanceof DialogFragment) {
                dialogFragment = (DialogFragment) findFragmentByTag;
            } else {
                dialogFragment = null;
            }
        }
        if (dialogFragment != null) {
            dialogFragment.getLifecycle().removeObserver(this.observer);
            dialogFragment.dismiss();
        }
        createDialogFragment(backStackEntry).show(this.fragmentManager, backStackEntry.getId());
        getState().onLaunchSingleTopWithTransition(backStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(@l NavBackStackEntry popUpTo, boolean z4) {
        List U4;
        l0.p(popUpTo, "popUpTo");
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List<NavBackStackEntry> value = getState().getBackStack().getValue();
        int indexOf = value.indexOf(popUpTo);
        U4 = e0.U4(value.subList(indexOf, value.size()));
        Iterator it = U4.iterator();
        while (it.hasNext()) {
            Fragment findFragmentByTag = this.fragmentManager.findFragmentByTag(((NavBackStackEntry) it.next()).getId());
            if (findFragmentByTag != null) {
                ((DialogFragment) findFragmentByTag).dismiss();
            }
        }
        popWithTransition(indexOf, popUpTo, z4);
    }

    @Override // androidx.navigation.Navigator
    @l
    public Destination createDestination() {
        return new Destination(this);
    }

    private final void navigate(NavBackStackEntry navBackStackEntry) {
        Object s32;
        boolean T1;
        createDialogFragment(navBackStackEntry).show(this.fragmentManager, navBackStackEntry.getId());
        s32 = e0.s3(getState().getBackStack().getValue());
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) s32;
        T1 = e0.T1(getState().getTransitionsInProgress().getValue(), navBackStackEntry2);
        getState().pushWithTransition(navBackStackEntry);
        if (navBackStackEntry2 == null || T1) {
            return;
        }
        getState().markTransitionComplete(navBackStackEntry2);
    }
}
