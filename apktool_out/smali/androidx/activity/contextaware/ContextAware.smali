.class public interface abstract Landroidx/activity/contextaware/ContextAware;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\t\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/activity/contextaware/ContextAware;",
        "",
        "Landroid/content/Context;",
        "peekAvailableContext",
        "Landroidx/activity/contextaware/OnContextAvailableListener;",
        "listener",
        "Lkotlin/r2;",
        "addOnContextAvailableListener",
        "removeOnContextAvailableListener",
        "activity_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract addOnContextAvailableListener(Landroidx/activity/contextaware/OnContextAvailableListener;)V
    .param p1    # Landroidx/activity/contextaware/OnContextAvailableListener;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract peekAvailableContext()Landroid/content/Context;
    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract removeOnContextAvailableListener(Landroidx/activity/contextaware/OnContextAvailableListener;)V
    .param p1    # Landroidx/activity/contextaware/OnContextAvailableListener;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method
