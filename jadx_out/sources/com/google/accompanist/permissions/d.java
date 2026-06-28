package com.google.accompanist.permissions;

import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.x;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import p4.m;

@Stable
@com.google.accompanist.permissions.a
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0016J#\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\f\u0010\u0018R+\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00068V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u0010\u0010\u0018\"\u0004\b\u001d\u0010\u001eR0\u0010'\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050!\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/google/accompanist/permissions/d;", "Lcom/google/accompanist/permissions/b;", "Lkotlin/r2;", "e", "", "", "", "permissionsStatus", "j", "(Ljava/util/Map;)V", "", "Lcom/google/accompanist/permissions/e;", bi.ay, "Ljava/util/List;", "mutablePermissions", "Lcom/google/accompanist/permissions/f;", "b", "f", "()Ljava/util/List;", "permissions", "c", "Landroidx/compose/runtime/State;", "revokedPermissions", "d", "()Z", "allPermissionsGranted", "shouldShowRationale", "<set-?>", "Landroidx/compose/runtime/MutableState;", "i", "(Z)V", "permissionRequested", "Landroidx/activity/result/ActivityResultLauncher;", "", socket.g.f22386a, "Landroidx/activity/result/ActivityResultLauncher;", "()Landroidx/activity/result/ActivityResultLauncher;", bi.aJ, "(Landroidx/activity/result/ActivityResultLauncher;)V", "launcher", "<init>", "(Ljava/util/List;)V", "permissions_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class d implements com.google.accompanist.permissions.b {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final List<e> f7108a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final List<f> f7109b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private final State f7110c;

    /* renamed from: d, reason: collision with root package name */
    @l
    private final State f7111d;

    /* renamed from: e, reason: collision with root package name */
    @l
    private final State f7112e;

    /* renamed from: f, reason: collision with root package name */
    @l
    private final MutableState f7113f;

    /* renamed from: g, reason: collision with root package name */
    @m
    private ActivityResultLauncher<String[]> f7114g;

    @i0(d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    static final class a extends n0 implements v3.a<Boolean> {
        a() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            boolean z4;
            List<f> f5 = d.this.f();
            if (!(f5 instanceof Collection) || !f5.isEmpty()) {
                Iterator<T> it = f5.iterator();
                while (it.hasNext()) {
                    if (!((f) it.next()).e()) {
                        z4 = false;
                        break;
                    }
                }
            }
            z4 = true;
            return z4 || d.this.c().isEmpty();
        }
    }

    @i0(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/google/accompanist/permissions/f;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    static final class b extends n0 implements v3.a<List<? extends f>> {
        b() {
            super(0);
        }

        @Override // v3.a
        @l
        public final List<? extends f> invoke() {
            List<f> f5 = d.this.f();
            ArrayList arrayList = new ArrayList();
            for (Object obj : f5) {
                if (!((f) obj).e()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @i0(d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    static final class c extends n0 implements v3.a<Boolean> {
        c() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            List<f> f5 = d.this.f();
            if ((f5 instanceof Collection) && f5.isEmpty()) {
                return false;
            }
            Iterator<T> it = f5.iterator();
            while (it.hasNext()) {
                if (((f) it.next()).a()) {
                    return true;
                }
            }
            return false;
        }
    }

    public d(@l List<e> mutablePermissions) {
        MutableState mutableStateOf$default;
        l0.p(mutablePermissions, "mutablePermissions");
        this.f7108a = mutablePermissions;
        this.f7109b = mutablePermissions;
        this.f7110c = SnapshotStateKt.derivedStateOf(new b());
        this.f7111d = SnapshotStateKt.derivedStateOf(new a());
        this.f7112e = SnapshotStateKt.derivedStateOf(new c());
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f7113f = mutableStateOf$default;
    }

    @Override // com.google.accompanist.permissions.b
    public boolean a() {
        return ((Boolean) this.f7112e.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.accompanist.permissions.b
    public boolean b() {
        return ((Boolean) this.f7113f.getValue()).booleanValue();
    }

    @Override // com.google.accompanist.permissions.b
    @l
    public List<f> c() {
        return (List) this.f7110c.getValue();
    }

    @Override // com.google.accompanist.permissions.b
    public boolean d() {
        return ((Boolean) this.f7111d.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.accompanist.permissions.b
    public void e() {
        int Y;
        r2 r2Var;
        ActivityResultLauncher<String[]> activityResultLauncher = this.f7114g;
        if (activityResultLauncher == 0) {
            r2Var = null;
        } else {
            List<f> f5 = f();
            Y = x.Y(f5, 10);
            ArrayList arrayList = new ArrayList(Y);
            Iterator<T> it = f5.iterator();
            while (it.hasNext()) {
                arrayList.add(((f) it.next()).d());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                activityResultLauncher.launch(array);
                r2Var = r2.f19517a;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        if (r2Var != null) {
        } else {
            throw new IllegalStateException("ActivityResultLauncher cannot be null");
        }
    }

    @Override // com.google.accompanist.permissions.b
    @l
    public List<f> f() {
        return this.f7109b;
    }

    @m
    public final ActivityResultLauncher<String[]> g() {
        return this.f7114g;
    }

    public final void h(@m ActivityResultLauncher<String[]> activityResultLauncher) {
        this.f7114g = activityResultLauncher;
    }

    public void i(boolean z4) {
        this.f7113f.setValue(Boolean.valueOf(z4));
    }

    public final void j(@l Map<String, Boolean> permissionsStatus) {
        Object obj;
        Boolean bool;
        l0.p(permissionsStatus, "permissionsStatus");
        for (String str : permissionsStatus.keySet()) {
            Iterator<T> it = this.f7108a.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (l0.g(((e) obj).d(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            e eVar = (e) obj;
            if (eVar != null && (bool = permissionsStatus.get(str)) != null) {
                eVar.j(bool.booleanValue());
            }
        }
    }
}
