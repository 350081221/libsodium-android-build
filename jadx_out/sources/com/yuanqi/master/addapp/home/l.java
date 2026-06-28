package com.yuanqi.master.addapp.home;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavController;
import com.yuanqi.master.addapp.AddAppActivity;
import com.yuanqi.master.addapp.AddAppViewModel;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.p;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"ProcessLimitsScreen", "", "navController", "Landroidx/navigation/NavController;", "addAppViewModel", "Lcom/yuanqi/master/addapp/AddAppViewModel;", "(Landroidx/navigation/NavController;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nProcessLimitsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessLimitsScreen.kt\ncom/yuanqi/master/addapp/home/ProcessLimitsScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,57:1\n81#2,11:58\n74#3:69\n*S KotlinDebug\n*F\n+ 1 ProcessLimitsScreen.kt\ncom/yuanqi/master/addapp/home/ProcessLimitsScreenKt\n*L\n30#1:58,11\n34#1:69\n*E\n"})
/* loaded from: classes3.dex */
public final class l {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ Context $context;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.addapp.home.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0302a extends n0 implements v3.a<r2> {
            final /* synthetic */ Context $context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0302a(Context context) {
                super(0);
                this.$context = context;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Context context = this.$context;
                if (context instanceof AddAppActivity) {
                    ((AddAppActivity) context).finish();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(2);
            this.$context = context;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.m Composer composer, int i5) {
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(598392428, i5, -1, "com.yuanqi.master.addapp.home.ProcessLimitsScreen.<anonymous> (ProcessLimitsScreen.kt:37)");
            }
            com.yuanqi.master.tools.a.f("进程限制", null, new C0302a(this.$context), composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ AddAppViewModel $addAppViewModel;
        final /* synthetic */ NavController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(NavController navController, AddAppViewModel addAppViewModel, int i5, int i6) {
            super(2);
            this.$navController = navController;
            this.$addAppViewModel = addAppViewModel;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            l.a(this.$navController, this.$addAppViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@p4.l androidx.navigation.NavController r21, @p4.m com.yuanqi.master.addapp.AddAppViewModel r22, @p4.m androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.addapp.home.l.a(androidx.navigation.NavController, com.yuanqi.master.addapp.AddAppViewModel, androidx.compose.runtime.Composer, int, int):void");
    }
}
