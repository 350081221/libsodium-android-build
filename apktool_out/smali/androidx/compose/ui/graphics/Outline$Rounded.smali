.class public final Landroidx/compose/ui/graphics/Outline$Rounded;
.super Landroidx/compose/ui/graphics/Outline;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Immutable;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/graphics/Outline;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Rounded"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\u0008\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0015"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/Outline$Rounded;",
        "Landroidx/compose/ui/graphics/Outline;",
        "roundRect",
        "Landroidx/compose/ui/geometry/RoundRect;",
        "(Landroidx/compose/ui/geometry/RoundRect;)V",
        "bounds",
        "Landroidx/compose/ui/geometry/Rect;",
        "getBounds",
        "()Landroidx/compose/ui/geometry/Rect;",
        "getRoundRect",
        "()Landroidx/compose/ui/geometry/RoundRect;",
        "roundRectPath",
        "Landroidx/compose/ui/graphics/Path;",
        "getRoundRectPath$ui_graphics_release",
        "()Landroidx/compose/ui/graphics/Path;",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
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

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/Outline$Rounded\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1#2:307\n*E\n"
    }
.end annotation


# instance fields
.field private final roundRect:Landroidx/compose/ui/geometry/RoundRect;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final roundRectPath:Landroidx/compose/ui/graphics/Path;
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/ui/geometry/RoundRect;)V
    .locals 2
    .param p1    # Landroidx/compose/ui/geometry/RoundRect;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/compose/ui/graphics/Outline;-><init>(Lkotlin/jvm/internal/w;)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Landroidx/compose/ui/graphics/Outline$Rounded;->roundRect:Landroidx/compose/ui/geometry/RoundRect;

    .line 6
    .line 7
    invoke-static {p1}, Landroidx/compose/ui/graphics/OutlineKt;->access$hasSameCornerRadius(Landroidx/compose/ui/geometry/RoundRect;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static {}, Landroidx/compose/ui/graphics/AndroidPath_androidKt;->Path()Landroidx/compose/ui/graphics/Path;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0, p1}, Landroidx/compose/ui/graphics/Path;->addRoundRect(Landroidx/compose/ui/geometry/RoundRect;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iput-object v0, p0, Landroidx/compose/ui/graphics/Outline$Rounded;->roundRectPath:Landroidx/compose/ui/graphics/Path;

    .line 21
    .line 22
    return-void
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
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/graphics/Outline$Rounded;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    iget-object v1, p0, Landroidx/compose/ui/graphics/Outline$Rounded;->roundRect:Landroidx/compose/ui/geometry/RoundRect;

    .line 12
    .line 13
    check-cast p1, Landroidx/compose/ui/graphics/Outline$Rounded;

    .line 14
    .line 15
    iget-object p1, p1, Landroidx/compose/ui/graphics/Outline$Rounded;->roundRect:Landroidx/compose/ui/geometry/RoundRect;

    .line 16
    .line 17
    invoke-static {v1, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public getBounds()Landroidx/compose/ui/geometry/Rect;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/graphics/Outline$Rounded;->roundRect:Landroidx/compose/ui/geometry/RoundRect;

    invoke-static {v0}, Landroidx/compose/ui/geometry/RoundRectKt;->getBoundingRect(Landroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    return-object v0
.end method

.method public final getRoundRect()Landroidx/compose/ui/geometry/RoundRect;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/graphics/Outline$Rounded;->roundRect:Landroidx/compose/ui/geometry/RoundRect;

    return-object v0
.end method

.method public final getRoundRectPath$ui_graphics_release()Landroidx/compose/ui/graphics/Path;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/graphics/Outline$Rounded;->roundRectPath:Landroidx/compose/ui/graphics/Path;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/Outline$Rounded;->roundRect:Landroidx/compose/ui/geometry/RoundRect;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/RoundRect;->hashCode()I

    move-result v0

    return v0
.end method
