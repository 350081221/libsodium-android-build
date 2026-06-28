.class public final Landroidx/compose/ui/graphics/AndroidPath_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\r\u0010\u0002\u001a\u00020\u0003*\u00020\u0001H\u0086\u0008\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Path",
        "Landroidx/compose/ui/graphics/Path;",
        "asAndroidPath",
        "Landroid/graphics/Path;",
        "asComposePath",
        "ui-graphics_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final Path()Landroidx/compose/ui/graphics/Path;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/ui/graphics/AndroidPath;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Landroidx/compose/ui/graphics/AndroidPath;-><init>(Landroid/graphics/Path;ILkotlin/jvm/internal/w;)V

    return-object v0
.end method

.method public static final asAndroidPath(Landroidx/compose/ui/graphics/Path;)Landroid/graphics/Path;
    .locals 1
    .param p0    # Landroidx/compose/ui/graphics/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    instance-of v0, p0, Landroidx/compose/ui/graphics/AndroidPath;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroidx/compose/ui/graphics/AndroidPath;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/AndroidPath;->getInternalPath()Landroid/graphics/Path;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string v0, "Unable to obtain android.graphics.Path"

    .line 15
    .line 16
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
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

.method public static final asComposePath(Landroid/graphics/Path;)Landroidx/compose/ui/graphics/Path;
    .locals 1
    .param p0    # Landroid/graphics/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/ui/graphics/AndroidPath;

    invoke-direct {v0, p0}, Landroidx/compose/ui/graphics/AndroidPath;-><init>(Landroid/graphics/Path;)V

    return-object v0
.end method
