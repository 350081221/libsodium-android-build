.class public interface abstract Landroidx/compose/ui/node/ViewAdapter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008g\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&R\u0014\u0010\r\u001a\u00020\n8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u000e\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/ui/node/ViewAdapter;",
        "",
        "Landroid/view/View;",
        "view",
        "Landroid/view/ViewGroup;",
        "parent",
        "Lkotlin/r2;",
        "willInsert",
        "didInsert",
        "didUpdate",
        "",
        "getId",
        "()I",
        "id",
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
.method public abstract didInsert(Landroid/view/View;Landroid/view/ViewGroup;)V
    .param p1    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract didUpdate(Landroid/view/View;Landroid/view/ViewGroup;)V
    .param p1    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract getId()I
.end method

.method public abstract willInsert(Landroid/view/View;Landroid/view/ViewGroup;)V
    .param p1    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method
