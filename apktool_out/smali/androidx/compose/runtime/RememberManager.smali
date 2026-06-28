.class public interface abstract Landroidx/compose/runtime/RememberManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH&J\u0010\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\r\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/runtime/RememberManager;",
        "",
        "Landroidx/compose/runtime/RememberObserver;",
        "instance",
        "Lkotlin/r2;",
        "remembering",
        "forgetting",
        "Lkotlin/Function0;",
        "effect",
        "sideEffect",
        "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;",
        "deactivating",
        "releasing",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract deactivating(Landroidx/compose/runtime/ComposeNodeLifecycleCallback;)V
    .param p1    # Landroidx/compose/runtime/ComposeNodeLifecycleCallback;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract forgetting(Landroidx/compose/runtime/RememberObserver;)V
    .param p1    # Landroidx/compose/runtime/RememberObserver;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract releasing(Landroidx/compose/runtime/ComposeNodeLifecycleCallback;)V
    .param p1    # Landroidx/compose/runtime/ComposeNodeLifecycleCallback;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract remembering(Landroidx/compose/runtime/RememberObserver;)V
    .param p1    # Landroidx/compose/runtime/RememberObserver;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract sideEffect(Lv3/a;)V
    .param p1    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation
.end method
