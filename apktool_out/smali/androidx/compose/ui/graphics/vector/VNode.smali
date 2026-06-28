.class public abstract Landroidx/compose/ui/graphics/vector/VNode;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001B\t\u0008\u0004\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000c\u0010\u0005\u001a\u00020\u0002*\u00020\u0004H&R0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0010@\u0010X\u0090\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c\u0082\u0001\u0003\u000f\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/vector/VNode;",
        "",
        "Lkotlin/r2;",
        "invalidate",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "draw",
        "Lkotlin/Function1;",
        "invalidateListener",
        "Lv3/l;",
        "getInvalidateListener$ui_release",
        "()Lv3/l;",
        "setInvalidateListener$ui_release",
        "(Lv3/l;)V",
        "<init>",
        "()V",
        "Landroidx/compose/ui/graphics/vector/GroupComponent;",
        "Landroidx/compose/ui/graphics/vector/PathComponent;",
        "Landroidx/compose/ui/graphics/vector/VectorComponent;",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private invalidateListener:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/graphics/vector/VNode;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/graphics/vector/VNode;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract draw(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V
    .param p1    # Landroidx/compose/ui/graphics/drawscope/DrawScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public getInvalidateListener$ui_release()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Landroidx/compose/ui/graphics/vector/VNode;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/graphics/vector/VNode;->invalidateListener:Lv3/l;

    return-object v0
.end method

.method public final invalidate()V
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/graphics/vector/VNode;->getInvalidateListener$ui_release()Lv3/l;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public setInvalidateListener$ui_release(Lv3/l;)V
    .locals 0
    .param p1    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/graphics/vector/VNode;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/graphics/vector/VNode;->invalidateListener:Lv3/l;

    return-void
.end method
