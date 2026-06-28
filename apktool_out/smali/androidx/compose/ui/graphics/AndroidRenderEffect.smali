.class public final Landroidx/compose/ui/graphics/AndroidRenderEffect;
.super Landroidx/compose/ui/graphics/RenderEffect;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Immutable;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0007\u001a\u00020\u0003H\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/AndroidRenderEffect;",
        "Landroidx/compose/ui/graphics/RenderEffect;",
        "androidRenderEffect",
        "Landroid/graphics/RenderEffect;",
        "(Landroid/graphics/RenderEffect;)V",
        "getAndroidRenderEffect",
        "()Landroid/graphics/RenderEffect;",
        "createRenderEffect",
        "ui-graphics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final androidRenderEffect:Landroid/graphics/RenderEffect;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/graphics/RenderEffect;)V
    .locals 1
    .param p1    # Landroid/graphics/RenderEffect;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/compose/ui/graphics/RenderEffect;-><init>(Lkotlin/jvm/internal/w;)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Landroidx/compose/ui/graphics/AndroidRenderEffect;->androidRenderEffect:Landroid/graphics/RenderEffect;

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method


# virtual methods
.method protected createRenderEffect()Landroid/graphics/RenderEffect;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/graphics/AndroidRenderEffect;->androidRenderEffect:Landroid/graphics/RenderEffect;

    return-object v0
.end method

.method public final getAndroidRenderEffect()Landroid/graphics/RenderEffect;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/graphics/AndroidRenderEffect;->androidRenderEffect:Landroid/graphics/RenderEffect;

    return-object v0
.end method
