.class public interface abstract Landroidx/compose/runtime/ControlledComposition;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/Composition;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00032\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0008\u0004H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0016\u0010\u000b\u001a\u00020\u00032\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H&J\u0016\u0010\r\u001a\u00020\u000c2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H&J\u0016\u0010\u000f\u001a\u00020\u00032\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\tH&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\tH&J\u0008\u0010\u0013\u001a\u00020\u000cH&J$\u0010\u0018\u001a\u00020\u00032\u001a\u0010\u0017\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u0014H\'J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\'J\u0008\u0010\u001c\u001a\u00020\u0003H&J\u0008\u0010\u001d\u001a\u00020\u0003H&J\u0008\u0010\u001e\u001a\u00020\u0003H&J\u0008\u0010\u001f\u001a\u00020\u0003H&J\u0008\u0010 \u001a\u00020\u0003H\'J5\u0010%\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010!2\u0008\u0010\"\u001a\u0004\u0018\u00010\u00002\u0006\u0010$\u001a\u00020#2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H&\u00a2\u0006\u0004\u0008%\u0010&R\u0014\u0010\'\u001a\u00020\u000c8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(R\u0014\u0010*\u001a\u00020\u000c8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010(\u0082\u0001\u0001+\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006,\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/runtime/ControlledComposition;",
        "Landroidx/compose/runtime/Composition;",
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "Landroidx/compose/runtime/Composable;",
        "content",
        "composeContent",
        "(Lv3/p;)V",
        "",
        "",
        "values",
        "recordModificationsOf",
        "",
        "observesAnyOf",
        "block",
        "prepareCompose",
        "value",
        "recordReadOf",
        "recordWriteOf",
        "recompose",
        "",
        "Lkotlin/u0;",
        "Landroidx/compose/runtime/MovableContentStateReference;",
        "references",
        "insertMovableContent",
        "Landroidx/compose/runtime/MovableContentState;",
        "state",
        "disposeUnusedMovableContent",
        "applyChanges",
        "applyLateChanges",
        "changesApplied",
        "invalidateAll",
        "verifyConsistent",
        "R",
        "to",
        "",
        "groupIndex",
        "delegateInvalidations",
        "(Landroidx/compose/runtime/ControlledComposition;ILv3/a;)Ljava/lang/Object;",
        "isComposing",
        "()Z",
        "getHasPendingChanges",
        "hasPendingChanges",
        "Landroidx/compose/runtime/CompositionImpl;",
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
.method public abstract applyChanges()V
.end method

.method public abstract applyLateChanges()V
.end method

.method public abstract changesApplied()V
.end method

.method public abstract composeContent(Lv3/p;)V
    .param p1    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract delegateInvalidations(Landroidx/compose/runtime/ControlledComposition;ILv3/a;)Ljava/lang/Object;
    .param p1    # Landroidx/compose/runtime/ControlledComposition;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/ControlledComposition;",
            "I",
            "Lv3/a<",
            "+TR;>;)TR;"
        }
    .end annotation
.end method

.method public abstract disposeUnusedMovableContent(Landroidx/compose/runtime/MovableContentState;)V
    .param p1    # Landroidx/compose/runtime/MovableContentState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/InternalComposeApi;
    .end annotation
.end method

.method public abstract getHasPendingChanges()Z
.end method

.method public abstract insertMovableContent(Ljava/util/List;)V
    .param p1    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/InternalComposeApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lkotlin/u0<",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            ">;>;)V"
        }
    .end annotation
.end method

.method public abstract invalidateAll()V
.end method

.method public abstract isComposing()Z
.end method

.method public abstract observesAnyOf(Ljava/util/Set;)Z
    .param p1    # Ljava/util/Set;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract prepareCompose(Lv3/a;)V
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

.method public abstract recompose()Z
.end method

.method public abstract recordModificationsOf(Ljava/util/Set;)V
    .param p1    # Ljava/util/Set;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract recordReadOf(Ljava/lang/Object;)V
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract recordWriteOf(Ljava/lang/Object;)V
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract verifyConsistent()V
    .annotation build Landroidx/compose/runtime/InternalComposeApi;
    .end annotation
.end method
