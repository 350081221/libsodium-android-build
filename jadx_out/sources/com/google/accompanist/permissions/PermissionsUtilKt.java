package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.umeng.analytics.pro.bi;
import java.util.Iterator;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\f\u0010\r\u001a\u00020\f*\u00020\u000bH\u0000\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u001a\u0014\u0010\u0012\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¨\u0006\u0013"}, d2 = {"Lcom/google/accompanist/permissions/e;", "permissionState", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycleEvent", "Lkotlin/r2;", "c", "(Lcom/google/accompanist/permissions/e;Landroidx/lifecycle/Lifecycle$Event;Landroidx/compose/runtime/Composer;II)V", "", "permissions", "e", "(Ljava/util/List;Landroidx/lifecycle/Lifecycle$Event;Landroidx/compose/runtime/Composer;II)V", "Landroid/content/Context;", "Landroid/app/Activity;", bi.aJ, "", "permission", "", socket.g.f22386a, "i", "permissions_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class PermissionsUtilKt {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Lifecycle.Event $lifecycleEvent;
        final /* synthetic */ e $permissionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar, Lifecycle.Event event, int i5, int i6) {
            super(2);
            this.$permissionState = eVar;
            this.$lifecycleEvent = event;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@m Composer composer, int i5) {
            PermissionsUtilKt.c(this.$permissionState, this.$lifecycleEvent, composer, this.$$changed | 1, this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Lifecycle.Event $lifecycleEvent;
        final /* synthetic */ List<e> $permissions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<e> list, Lifecycle.Event event, int i5, int i6) {
            super(2);
            this.$permissions = list;
            this.$lifecycleEvent = event;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@m Composer composer, int i5) {
            PermissionsUtilKt.e(this.$permissions, this.$lifecycleEvent, composer, this.$$changed | 1, this.$$default);
        }
    }

    @com.google.accompanist.permissions.a
    @Composable
    public static final void c(@l final e permissionState, @m final Lifecycle.Event event, @m Composer composer, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        l0.p(permissionState, "permissionState");
        Composer startRestartGroup = composer.startRestartGroup(-899070982);
        if ((i6 & 1) != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(permissionState)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i5;
        } else {
            i7 = i5;
        }
        int i10 = i6 & 2;
        if (i10 != 0) {
            i7 |= 48;
        } else if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(event)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        if (((i7 & 91) ^ 18) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i10 != 0) {
                event = Lifecycle.Event.ON_RESUME;
            }
            startRestartGroup.startReplaceableGroup(-3686930);
            boolean changed = startRestartGroup.changed(permissionState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new LifecycleEventObserver() { // from class: com.google.accompanist.permissions.j
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                        PermissionsUtilKt.d(Lifecycle.Event.this, permissionState, lifecycleOwner, event2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) rememberedValue;
            Lifecycle lifecycle = ((LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
            l0.o(lifecycle, "LocalLifecycleOwner.current.lifecycle");
            EffectsKt.DisposableEffect(lifecycle, lifecycleEventObserver, new PermissionsUtilKt$PermissionLifecycleCheckerEffect$1(lifecycle, lifecycleEventObserver), startRestartGroup, 72);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(permissionState, event, i5, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Lifecycle.Event event, e permissionState, LifecycleOwner noName_0, Lifecycle.Event event2) {
        l0.p(permissionState, "$permissionState");
        l0.p(noName_0, "$noName_0");
        l0.p(event2, "event");
        if (event2 == event && !permissionState.e()) {
            permissionState.h();
        }
    }

    @com.google.accompanist.permissions.a
    @Composable
    public static final void e(@l final List<e> permissions, @m final Lifecycle.Event event, @m Composer composer, int i5, int i6) {
        l0.p(permissions, "permissions");
        Composer startRestartGroup = composer.startRestartGroup(-1664753418);
        if ((i6 & 2) != 0) {
            event = Lifecycle.Event.ON_RESUME;
        }
        startRestartGroup.startReplaceableGroup(-3686930);
        boolean changed = startRestartGroup.changed(permissions);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LifecycleEventObserver() { // from class: com.google.accompanist.permissions.i
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                    PermissionsUtilKt.f(Lifecycle.Event.this, permissions, lifecycleOwner, event2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) rememberedValue;
        Lifecycle lifecycle = ((LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
        l0.o(lifecycle, "LocalLifecycleOwner.current.lifecycle");
        EffectsKt.DisposableEffect(lifecycle, lifecycleEventObserver, new PermissionsUtilKt$PermissionsLifecycleCheckerEffect$1(lifecycle, lifecycleEventObserver), startRestartGroup, 72);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(permissions, event, i5, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Lifecycle.Event event, List permissions, LifecycleOwner noName_0, Lifecycle.Event event2) {
        l0.p(permissions, "$permissions");
        l0.p(noName_0, "$noName_0");
        l0.p(event2, "event");
        if (event2 == event) {
            Iterator it = permissions.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (!eVar.e()) {
                    eVar.h();
                }
            }
        }
    }

    public static final boolean g(@l Context context, @l String permission) {
        l0.p(context, "<this>");
        l0.p(permission, "permission");
        if (ContextCompat.checkSelfPermission(context, permission) == 0) {
            return true;
        }
        return false;
    }

    @l
    public static final Activity h(@l Context context) {
        l0.p(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            l0.o(context, "context.baseContext");
        }
        throw new IllegalStateException("Permissions should be called in the context of an Activity");
    }

    public static final boolean i(@l Activity activity, @l String permission) {
        l0.p(activity, "<this>");
        l0.p(permission, "permission");
        return ActivityCompat.shouldShowRequestPermissionRationale(activity, permission);
    }
}
