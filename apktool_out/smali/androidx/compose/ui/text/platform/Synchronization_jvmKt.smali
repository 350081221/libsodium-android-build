.class public final Landroidx/compose/ui/text/platform/Synchronization_jvmKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0008\u0010\u0001\u001a\u00020\u0000H\u0000\u001a,\u0010\u0006\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00002\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004H\u0081\u0008\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/compose/ui/text/platform/SynchronizedObject;",
        "createSynchronizedObject",
        "R",
        "lock",
        "Lkotlin/Function0;",
        "block",
        "synchronized",
        "(Landroidx/compose/ui/text/platform/SynchronizedObject;Lv3/a;)Ljava/lang/Object;",
        "ui-text_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final createSynchronizedObject()Landroidx/compose/ui/text/platform/SynchronizedObject;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/ui/text/platform/SynchronizedObject;

    invoke-direct {v0}, Landroidx/compose/ui/text/platform/SynchronizedObject;-><init>()V

    return-object v0
.end method

.method public static final synchronized(Landroidx/compose/ui/text/platform/SynchronizedObject;Lv3/a;)Ljava/lang/Object;
    .locals 1
    .param p0    # Landroidx/compose/ui/text/platform/SynchronizedObject;
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
            "Landroidx/compose/ui/text/platform/SynchronizedObject;",
            "Lv3/a<",
            "+TR;>;)TR;"
        }
    .end annotation

    .annotation build Lkotlin/a1;
    .end annotation

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p1}, Lv3/a;->invoke()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Lkotlin/jvm/internal/i0;->d(I)V

    monitor-exit p0

    invoke-static {v0}, Lkotlin/jvm/internal/i0;->c(I)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {v0}, Lkotlin/jvm/internal/i0;->d(I)V

    monitor-exit p0

    invoke-static {v0}, Lkotlin/jvm/internal/i0;->c(I)V

    throw p1
.end method
