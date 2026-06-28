package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.d0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/ViewModelLazy;", "Landroidx/lifecycle/ViewModel;", "VM", "Lkotlin/d0;", "", "isInitialized", "Lkotlin/reflect/d;", "viewModelClass", "Lkotlin/reflect/d;", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "storeProducer", "Lv3/a;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "cached", "Landroidx/lifecycle/ViewModel;", "getValue", "()Landroidx/lifecycle/ViewModel;", t0.b.f22420d, "<init>", "(Lkotlin/reflect/d;Lv3/a;Lv3/a;Lv3/a;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ViewModelLazy<VM extends ViewModel> implements d0<VM> {

    @m
    private VM cached;

    @l
    private final v3.a<CreationExtras> extrasProducer;

    @l
    private final v3.a<ViewModelProvider.Factory> factoryProducer;

    @l
    private final v3.a<ViewModelStore> storeProducer;

    @l
    private final kotlin.reflect.d<VM> viewModelClass;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras$Empty;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.ViewModelLazy$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends n0 implements v3.a<CreationExtras.Empty> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @l
        public final CreationExtras.Empty invoke() {
            return CreationExtras.Empty.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @u3.i
    public ViewModelLazy(@l kotlin.reflect.d<VM> viewModelClass, @l v3.a<? extends ViewModelStore> storeProducer, @l v3.a<? extends ViewModelProvider.Factory> factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        l0.p(viewModelClass, "viewModelClass");
        l0.p(storeProducer, "storeProducer");
        l0.p(factoryProducer, "factoryProducer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u3.i
    public ViewModelLazy(@l kotlin.reflect.d<VM> viewModelClass, @l v3.a<? extends ViewModelStore> storeProducer, @l v3.a<? extends ViewModelProvider.Factory> factoryProducer, @l v3.a<? extends CreationExtras> extrasProducer) {
        l0.p(viewModelClass, "viewModelClass");
        l0.p(storeProducer, "storeProducer");
        l0.p(factoryProducer, "factoryProducer");
        l0.p(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.extrasProducer = extrasProducer;
    }

    @Override // kotlin.d0
    public boolean isInitialized() {
        return this.cached != null;
    }

    @Override // kotlin.d0
    @l
    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new ViewModelProvider(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).get(u3.a.e(this.viewModelClass));
        this.cached = vm2;
        return vm2;
    }

    public /* synthetic */ ViewModelLazy(kotlin.reflect.d dVar, v3.a aVar, v3.a aVar2, v3.a aVar3, int i5, w wVar) {
        this(dVar, aVar, aVar2, (i5 & 8) != 0 ? AnonymousClass1.INSTANCE : aVar3);
    }
}
