.class public final Landroidx/compose/runtime/SnapshotStateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "androidx/compose/runtime/SnapshotStateKt__DerivedStateKt",
        "androidx/compose/runtime/SnapshotStateKt__ProduceStateKt",
        "androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt",
        "androidx/compose/runtime/SnapshotStateKt__SnapshotMutationPolicyKt",
        "androidx/compose/runtime/SnapshotStateKt__SnapshotStateKt"
    }
    k = 0x4
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final collectAsState(Lkotlinx/coroutines/flow/i;Ljava/lang/Object;Lkotlin/coroutines/g;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
    .locals 0
    .param p0    # Lkotlinx/coroutines/flow/i;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/g;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::TR;R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/flow/i<",
            "+TT;>;TR;",
            "Lkotlin/coroutines/g;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/runtime/State<",
            "TR;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt;->collectAsState(Lkotlinx/coroutines/flow/i;Ljava/lang/Object;Lkotlin/coroutines/g;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object p0

    return-object p0
.end method

.method public static final collectAsState(Lkotlinx/coroutines/flow/t0;Lkotlin/coroutines/g;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
    .locals 0
    .param p0    # Lkotlinx/coroutines/flow/t0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lkotlin/coroutines/g;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/flow/t0<",
            "+TT;>;",
            "Lkotlin/coroutines/g;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/runtime/State<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 2
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt;->collectAsState(Lkotlinx/coroutines/flow/t0;Lkotlin/coroutines/g;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object p0

    return-object p0
.end method

.method public static final derivedStateObservers()Landroidx/compose/runtime/collection/MutableVector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/runtime/DerivedStateObserver;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt__DerivedStateKt;->derivedStateObservers()Landroidx/compose/runtime/collection/MutableVector;

    move-result-object v0

    return-object v0
.end method

.method public static final derivedStateOf(Landroidx/compose/runtime/SnapshotMutationPolicy;Lv3/a;)Landroidx/compose/runtime/State;
    .locals 0
    .param p0    # Landroidx/compose/runtime/SnapshotMutationPolicy;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/snapshots/StateFactoryMarker;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/SnapshotMutationPolicy<",
            "TT;>;",
            "Lv3/a<",
            "+TT;>;)",
            "Landroidx/compose/runtime/State<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/runtime/SnapshotStateKt__DerivedStateKt;->derivedStateOf(Landroidx/compose/runtime/SnapshotMutationPolicy;Lv3/a;)Landroidx/compose/runtime/State;

    move-result-object p0

    return-object p0
.end method

.method public static final derivedStateOf(Lv3/a;)Landroidx/compose/runtime/State;
    .locals 0
    .param p0    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/snapshots/StateFactoryMarker;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lv3/a<",
            "+TT;>;)",
            "Landroidx/compose/runtime/State<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 2
    invoke-static {p0}, Landroidx/compose/runtime/SnapshotStateKt__DerivedStateKt;->derivedStateOf(Lv3/a;)Landroidx/compose/runtime/State;

    move-result-object p0

    return-object p0
.end method

.method public static final getValue(Landroidx/compose/runtime/State;Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;
    .locals 0
    .param p0    # Landroidx/compose/runtime/State;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lkotlin/reflect/o;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/State<",
            "+TT;>;",
            "Ljava/lang/Object;",
            "Lkotlin/reflect/o<",
            "*>;)TT;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt;->getValue(Landroidx/compose/runtime/State;Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final mutableStateListOf()Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 1
    .annotation build Landroidx/compose/runtime/snapshots/StateFactoryMarker;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt;->mutableStateListOf()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v0

    return-object v0
.end method

.method public static final varargs mutableStateListOf([Ljava/lang/Object;)Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 0
    .param p0    # [Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/snapshots/StateFactoryMarker;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 2
    invoke-static {p0}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt;->mutableStateListOf([Ljava/lang/Object;)Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object p0

    return-object p0
.end method

.method public static final mutableStateMapOf()Landroidx/compose/runtime/snapshots/SnapshotStateMap;
    .locals 1
    .annotation build Landroidx/compose/runtime/snapshots/StateFactoryMarker;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Landroidx/compose/runtime/snapshots/SnapshotStateMap<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt;->mutableStateMapOf()Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    move-result-object v0

    return-object v0
.end method

.method public static final varargs mutableStateMapOf([Lkotlin/u0;)Landroidx/compose/runtime/snapshots/SnapshotStateMap;
    .locals 0
    .param p0    # [Lkotlin/u0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/snapshots/StateFactoryMarker;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">([",
            "Lkotlin/u0<",
            "+TK;+TV;>;)",
            "Landroidx/compose/runtime/snapshots/SnapshotStateMap<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 2
    invoke-static {p0}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt;->mutableStateMapOf([Lkotlin/u0;)Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    move-result-object p0

    return-object p0
.end method

.method public static final mutableStateOf(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)Landroidx/compose/runtime/MutableState;
    .locals 0
    .param p1    # Landroidx/compose/runtime/SnapshotMutationPolicy;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/snapshots/StateFactoryMarker;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Landroidx/compose/runtime/SnapshotMutationPolicy<",
            "TT;>;)",
            "Landroidx/compose/runtime/MutableState<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt;->mutableStateOf(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)Landroidx/compose/runtime/MutableState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p0

    return-object p0
.end method

.method public static final neverEqualPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Landroidx/compose/runtime/SnapshotMutationPolicy<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotMutationPolicyKt;->neverEqualPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    move-result-object v0

    return-object v0
.end method

.method public static final observeDerivedStateRecalculations(Landroidx/compose/runtime/DerivedStateObserver;Lv3/a;)V
    .locals 0
    .param p0    # Landroidx/compose/runtime/DerivedStateObserver;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/DerivedStateObserver;",
            "Lv3/a<",
            "+TR;>;)V"
        }
    .end annotation

    invoke-static {p0, p1}, Landroidx/compose/runtime/SnapshotStateKt__DerivedStateKt;->observeDerivedStateRecalculations(Landroidx/compose/runtime/DerivedStateObserver;Lv3/a;)V

    return-void
.end method

.method public static final produceState(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/ProduceStateScope<",
            "TT;>;-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Landroidx/compose/runtime/State<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static/range {p0 .. p6}, Landroidx/compose/runtime/SnapshotStateKt__ProduceStateKt;->produceState(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object p0

    return-object p0
.end method

.method public static final produceState(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/ProduceStateScope<",
            "TT;>;-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Landroidx/compose/runtime/State<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 2
    invoke-static/range {p0 .. p5}, Landroidx/compose/runtime/SnapshotStateKt__ProduceStateKt;->produceState(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object p0

    return-object p0
.end method

.method public static final produceState(Ljava/lang/Object;Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/Object;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/ProduceStateScope<",
            "TT;>;-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Landroidx/compose/runtime/State<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/runtime/SnapshotStateKt__ProduceStateKt;->produceState(Ljava/lang/Object;Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object p0

    return-object p0
.end method

.method public static final produceState(Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
    .locals 0
    .param p1    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/ProduceStateScope<",
            "TT;>;-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Landroidx/compose/runtime/State<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 4
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/runtime/SnapshotStateKt__ProduceStateKt;->produceState(Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object p0

    return-object p0
.end method

.method public static final produceState(Ljava/lang/Object;[Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
    .locals 0
    .param p1    # [Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;[",
            "Ljava/lang/Object;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/ProduceStateScope<",
            "TT;>;-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Landroidx/compose/runtime/State<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 5
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/runtime/SnapshotStateKt__ProduceStateKt;->produceState(Ljava/lang/Object;[Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object p0

    return-object p0
.end method

.method public static final referentialEqualityPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Landroidx/compose/runtime/SnapshotMutationPolicy<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotMutationPolicyKt;->referentialEqualityPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    move-result-object v0

    return-object v0
.end method

.method public static final rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
    .locals 0
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Landroidx/compose/runtime/State<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1, p2}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object p0

    return-object p0
.end method

.method public static final setValue(Landroidx/compose/runtime/MutableState;Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V
    .locals 0
    .param p0    # Landroidx/compose/runtime/MutableState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lkotlin/reflect/o;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/MutableState<",
            "TT;>;",
            "Ljava/lang/Object;",
            "Lkotlin/reflect/o<",
            "*>;TT;)V"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt;->setValue(Landroidx/compose/runtime/MutableState;Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V

    return-void
.end method

.method public static final snapshotFlow(Lv3/a;)Lkotlinx/coroutines/flow/i;
    .locals 0
    .param p0    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lv3/a<",
            "+TT;>;)",
            "Lkotlinx/coroutines/flow/i<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt;->snapshotFlow(Lv3/a;)Lkotlinx/coroutines/flow/i;

    move-result-object p0

    return-object p0
.end method

.method public static final structuralEqualityPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Landroidx/compose/runtime/SnapshotMutationPolicy<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotMutationPolicyKt;->structuralEqualityPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    move-result-object v0

    return-object v0
.end method

.method public static final toMutableStateList(Ljava/util/Collection;)Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 0
    .param p0    # Ljava/util/Collection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+TT;>;)",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt;->toMutableStateList(Ljava/util/Collection;)Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object p0

    return-object p0
.end method

.method public static final toMutableStateMap(Ljava/lang/Iterable;)Landroidx/compose/runtime/snapshots/SnapshotStateMap;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+",
            "Lkotlin/u0<",
            "+TK;+TV;>;>;)",
            "Landroidx/compose/runtime/snapshots/SnapshotStateMap<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt;->toMutableStateMap(Ljava/lang/Iterable;)Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    move-result-object p0

    return-object p0
.end method
