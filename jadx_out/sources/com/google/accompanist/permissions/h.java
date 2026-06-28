package com.google.accompanist.permissions;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aP\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001aP\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/accompanist/permissions/f;", "permissionState", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "permissionNotGrantedContent", "permissionNotAvailableContent", "content", bi.ay, "(Lcom/google/accompanist/permissions/f;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "Lcom/google/accompanist/permissions/b;", "multiplePermissionsState", "permissionsNotGrantedContent", "permissionsNotAvailableContent", "b", "(Lcom/google/accompanist/permissions/b;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "permissions_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ p<Composer, Integer, r2> $content;
        final /* synthetic */ p<Composer, Integer, r2> $permissionNotAvailableContent;
        final /* synthetic */ p<Composer, Integer, r2> $permissionNotGrantedContent;
        final /* synthetic */ f $permissionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(f fVar, p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, int i5) {
            super(2);
            this.$permissionState = fVar;
            this.$permissionNotGrantedContent = pVar;
            this.$permissionNotAvailableContent = pVar2;
            this.$content = pVar3;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@m Composer composer, int i5) {
            h.a(this.$permissionState, this.$permissionNotGrantedContent, this.$permissionNotAvailableContent, this.$content, composer, this.$$changed | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ p<Composer, Integer, r2> $content;
        final /* synthetic */ com.google.accompanist.permissions.b $multiplePermissionsState;
        final /* synthetic */ p<Composer, Integer, r2> $permissionsNotAvailableContent;
        final /* synthetic */ p<Composer, Integer, r2> $permissionsNotGrantedContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(com.google.accompanist.permissions.b bVar, p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, int i5) {
            super(2);
            this.$multiplePermissionsState = bVar;
            this.$permissionsNotGrantedContent = pVar;
            this.$permissionsNotAvailableContent = pVar2;
            this.$content = pVar3;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@m Composer composer, int i5) {
            h.b(this.$multiplePermissionsState, this.$permissionsNotGrantedContent, this.$permissionsNotAvailableContent, this.$content, composer, this.$$changed | 1);
        }
    }

    @com.google.accompanist.permissions.a
    @Composable
    public static final void a(@l f permissionState, @l p<? super Composer, ? super Integer, r2> permissionNotGrantedContent, @l p<? super Composer, ? super Integer, r2> permissionNotAvailableContent, @l p<? super Composer, ? super Integer, r2> content, @m Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        l0.p(permissionState, "permissionState");
        l0.p(permissionNotGrantedContent, "permissionNotGrantedContent");
        l0.p(permissionNotAvailableContent, "permissionNotAvailableContent");
        l0.p(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1887264609);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(permissionState)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i6 = i10 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(permissionNotGrantedContent)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i6 |= i9;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changed(permissionNotAvailableContent)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i6 |= i8;
        }
        if ((i5 & 7168) == 0) {
            if (startRestartGroup.changed(content)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i6 |= i7;
        }
        if (((i6 & 5851) ^ 1170) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else if (permissionState.e()) {
            startRestartGroup.startReplaceableGroup(1887264886);
            content.invoke(startRestartGroup, Integer.valueOf((i6 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
        } else if (!permissionState.a() && permissionState.b()) {
            startRestartGroup.startReplaceableGroup(1887265077);
            permissionNotAvailableContent.invoke(startRestartGroup, Integer.valueOf((i6 >> 6) & 14));
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(1887265007);
            permissionNotGrantedContent.invoke(startRestartGroup, Integer.valueOf((i6 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(permissionState, permissionNotGrantedContent, permissionNotAvailableContent, content, i5));
        }
    }

    @com.google.accompanist.permissions.a
    @Composable
    public static final void b(@l com.google.accompanist.permissions.b multiplePermissionsState, @l p<? super Composer, ? super Integer, r2> permissionsNotGrantedContent, @l p<? super Composer, ? super Integer, r2> permissionsNotAvailableContent, @l p<? super Composer, ? super Integer, r2> content, @m Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        l0.p(multiplePermissionsState, "multiplePermissionsState");
        l0.p(permissionsNotGrantedContent, "permissionsNotGrantedContent");
        l0.p(permissionsNotAvailableContent, "permissionsNotAvailableContent");
        l0.p(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(2104183839);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(multiplePermissionsState)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i6 = i10 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(permissionsNotGrantedContent)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i6 |= i9;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changed(permissionsNotAvailableContent)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i6 |= i8;
        }
        if ((i5 & 7168) == 0) {
            if (startRestartGroup.changed(content)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i6 |= i7;
        }
        if (((i6 & 5851) ^ 1170) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else if (multiplePermissionsState.d()) {
            startRestartGroup.startReplaceableGroup(2104184154);
            content.invoke(startRestartGroup, Integer.valueOf((i6 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
        } else if (!multiplePermissionsState.a() && multiplePermissionsState.b()) {
            startRestartGroup.startReplaceableGroup(2104184396);
            permissionsNotAvailableContent.invoke(startRestartGroup, Integer.valueOf((i6 >> 6) & 14));
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(2104184317);
            permissionsNotGrantedContent.invoke(startRestartGroup, Integer.valueOf((i6 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(multiplePermissionsState, permissionsNotGrantedContent, permissionsNotAvailableContent, content, i5));
        }
    }
}
