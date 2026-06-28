.class public final Landroidx/compose/runtime/saveable/MapSaverKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001ax\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00080\r\"\u0004\u0008\u0000\u0010\u00002:\u0010\n\u001a6\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008\u0003\u0012\u0008\u0008\u0004\u0012\u0004\u0008\u0008(\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00060\u0001\u00a2\u0006\u0002\u0008\t2\"\u0010\u000c\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b\u00a8\u0006\u000f"
    }
    d2 = {
        "T",
        "Lkotlin/Function2;",
        "Landroidx/compose/runtime/saveable/SaverScope;",
        "Lkotlin/v0;",
        "name",
        "value",
        "",
        "",
        "",
        "Lkotlin/u;",
        "save",
        "Lkotlin/Function1;",
        "restore",
        "Landroidx/compose/runtime/saveable/Saver;",
        "mapSaver",
        "runtime-saveable_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final mapSaver(Lv3/p;Lv3/l;)Landroidx/compose/runtime/saveable/Saver;
    .locals 1
    .param p0    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/saveable/SaverScope;",
            "-TT;+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;",
            "Lv3/l<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;+TT;>;)",
            "Landroidx/compose/runtime/saveable/Saver<",
            "TT;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/runtime/saveable/MapSaverKt$mapSaver$1;

    invoke-direct {v0, p0}, Landroidx/compose/runtime/saveable/MapSaverKt$mapSaver$1;-><init>(Lv3/p;)V

    new-instance p0, Landroidx/compose/runtime/saveable/MapSaverKt$mapSaver$2;

    invoke-direct {p0, p1}, Landroidx/compose/runtime/saveable/MapSaverKt$mapSaver$2;-><init>(Lv3/l;)V

    invoke-static {v0, p0}, Landroidx/compose/runtime/saveable/ListSaverKt;->listSaver(Lv3/p;Lv3/l;)Landroidx/compose/runtime/saveable/Saver;

    move-result-object p0

    return-object p0
.end method
