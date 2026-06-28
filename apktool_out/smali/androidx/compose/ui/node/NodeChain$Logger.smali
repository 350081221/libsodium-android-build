.class public interface abstract Landroidx/compose/ui/node/NodeChain$Logger;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/node/NodeChain;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Logger"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008`\u0018\u00002\u00020\u0001J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H&J0\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H&J0\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H&J0\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H&J \u0010\u0014\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0015\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/ui/node/NodeChain$Logger;",
        "",
        "",
        "index",
        "Landroidx/compose/ui/Modifier$Element;",
        "prev",
        "next",
        "Landroidx/compose/ui/Modifier$Node;",
        "node",
        "Lkotlin/r2;",
        "linearDiffAborted",
        "oldIndex",
        "newIndex",
        "nodeUpdated",
        "nodeReused",
        "atIndex",
        "element",
        "child",
        "inserted",
        "nodeInserted",
        "nodeRemoved",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract linearDiffAborted(ILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V
    .param p2    # Landroidx/compose/ui/Modifier$Element;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/Modifier$Element;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/Modifier$Node;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract nodeInserted(IILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/Modifier$Node;)V
    .param p3    # Landroidx/compose/ui/Modifier$Element;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/Modifier$Node;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/Modifier$Node;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract nodeRemoved(ILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V
    .param p2    # Landroidx/compose/ui/Modifier$Element;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/Modifier$Node;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract nodeReused(IILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V
    .param p3    # Landroidx/compose/ui/Modifier$Element;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/Modifier$Element;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/Modifier$Node;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract nodeUpdated(IILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V
    .param p3    # Landroidx/compose/ui/Modifier$Element;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/Modifier$Element;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/Modifier$Node;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method
