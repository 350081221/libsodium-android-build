.class public interface abstract Landroidx/compose/runtime/tooling/RecomposeScopeObserver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/ExperimentalComposeRuntimeApi;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0008\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/runtime/tooling/RecomposeScopeObserver;",
        "",
        "Landroidx/compose/runtime/RecomposeScope;",
        "scope",
        "Lkotlin/r2;",
        "onBeginScopeComposition",
        "onEndScopeComposition",
        "onScopeDisposed",
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
.method public abstract onBeginScopeComposition(Landroidx/compose/runtime/RecomposeScope;)V
    .param p1    # Landroidx/compose/runtime/RecomposeScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract onEndScopeComposition(Landroidx/compose/runtime/RecomposeScope;)V
    .param p1    # Landroidx/compose/runtime/RecomposeScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract onScopeDisposed(Landroidx/compose/runtime/RecomposeScope;)V
    .param p1    # Landroidx/compose/runtime/RecomposeScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method
