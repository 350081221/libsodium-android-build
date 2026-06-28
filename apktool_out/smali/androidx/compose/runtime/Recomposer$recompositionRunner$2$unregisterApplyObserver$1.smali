.class final Landroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/p<",
        "Ljava/util/Set<",
        "+",
        "Ljava/lang/Object;",
        ">;",
        "Landroidx/compose/runtime/snapshots/Snapshot;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u00020\u00052\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "",
        "",
        "changed",
        "Landroidx/compose/runtime/snapshots/Snapshot;",
        "<anonymous parameter 1>",
        "Lkotlin/r2;",
        "invoke",
        "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/Snapshot;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySetKt\n+ 4 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 5 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1564:1\n82#2:1565\n396#3,2:1566\n399#3:1575\n401#3:1578\n108#4,5:1568\n114#4:1574\n50#5:1573\n1855#6,2:1576\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1\n*L\n977#1:1565\n979#1:1566,2\n979#1:1575\n979#1:1578\n979#1:1568,5\n979#1:1574\n982#1:1573\n979#1:1576,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/compose/runtime/Recomposer;


# direct methods
.method constructor <init>(Landroidx/compose/runtime/Recomposer;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1;->this$0:Landroidx/compose/runtime/Recomposer;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/Set;

    check-cast p2, Landroidx/compose/runtime/snapshots/Snapshot;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1;->invoke(Ljava/util/Set;Landroidx/compose/runtime/snapshots/Snapshot;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Ljava/util/Set;Landroidx/compose/runtime/snapshots/Snapshot;)V
    .locals 7
    .param p1    # Ljava/util/Set;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/snapshots/Snapshot;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/runtime/snapshots/Snapshot;",
            ")V"
        }
    .end annotation

    .line 2
    iget-object p2, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1;->this$0:Landroidx/compose/runtime/Recomposer;

    invoke-static {p2}, Landroidx/compose/runtime/Recomposer;->access$getStateLock$p(Landroidx/compose/runtime/Recomposer;)Ljava/lang/Object;

    move-result-object p2

    iget-object v0, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1;->this$0:Landroidx/compose/runtime/Recomposer;

    .line 3
    monitor-enter p2

    .line 4
    :try_start_0
    invoke-static {v0}, Landroidx/compose/runtime/Recomposer;->access$get_state$p(Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/flow/e0;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/flow/e0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/Recomposer$State;

    sget-object v2, Landroidx/compose/runtime/Recomposer$State;->Idle:Landroidx/compose/runtime/Recomposer$State;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-ltz v1, :cond_4

    .line 5
    instance-of v1, p1, Landroidx/compose/runtime/collection/IdentityArraySet;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 6
    check-cast p1, Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 7
    invoke-virtual {p1}, Landroidx/compose/runtime/collection/IdentityArraySet;->getValues()[Ljava/lang/Object;

    move-result-object v1

    .line 8
    invoke-virtual {p1}, Landroidx/compose/runtime/collection/IdentityArraySet;->size()I

    move-result p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p1, :cond_3

    .line 9
    aget-object v4, v1, v3

    const-string v5, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    instance-of v5, v4, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    if-eqz v5, :cond_0

    .line 11
    move-object v5, v4

    check-cast v5, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    sget-object v6, Landroidx/compose/runtime/snapshots/ReaderKind;->Companion:Landroidx/compose/runtime/snapshots/ReaderKind$Companion;

    .line 12
    invoke-static {v2}, Landroidx/compose/runtime/snapshots/ReaderKind;->constructor-impl(I)I

    move-result v6

    .line 13
    invoke-virtual {v5, v6}, Landroidx/compose/runtime/snapshots/StateObjectImpl;->isReadIn-h_f27i8$runtime_release(I)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    .line 14
    :cond_0
    invoke-static {v0}, Landroidx/compose/runtime/Recomposer;->access$getSnapshotInvalidations$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/collection/IdentityArraySet;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroidx/compose/runtime/collection/IdentityArraySet;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 15
    :cond_1
    check-cast p1, Ljava/lang/Iterable;

    .line 16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 17
    instance-of v3, v1, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    if-eqz v3, :cond_2

    .line 18
    move-object v3, v1

    check-cast v3, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    sget-object v4, Landroidx/compose/runtime/snapshots/ReaderKind;->Companion:Landroidx/compose/runtime/snapshots/ReaderKind$Companion;

    .line 19
    invoke-static {v2}, Landroidx/compose/runtime/snapshots/ReaderKind;->constructor-impl(I)I

    move-result v4

    .line 20
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/snapshots/StateObjectImpl;->isReadIn-h_f27i8$runtime_release(I)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    .line 21
    :cond_2
    invoke-static {v0}, Landroidx/compose/runtime/Recomposer;->access$getSnapshotInvalidations$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/collection/IdentityArraySet;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroidx/compose/runtime/collection/IdentityArraySet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 22
    :cond_3
    invoke-static {v0}, Landroidx/compose/runtime/Recomposer;->access$deriveStateLocked(Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/p;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :cond_4
    const/4 p1, 0x0

    .line 23
    :goto_3
    monitor-exit p2

    if-eqz p1, :cond_5

    .line 24
    sget-object p2, Lkotlin/d1;->Companion:Lkotlin/d1$a;

    .line 25
    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-static {p2}, Lkotlin/d1;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlin/coroutines/d;->resumeWith(Ljava/lang/Object;)V

    :cond_5
    return-void

    :catchall_0
    move-exception p1

    .line 26
    monitor-exit p2

    throw p1
.end method
