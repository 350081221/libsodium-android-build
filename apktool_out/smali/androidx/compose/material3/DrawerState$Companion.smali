.class public final Landroidx/compose/material3/DrawerState$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/material3/DrawerState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/material3/DrawerState$Companion;",
        "",
        "()V",
        "Saver",
        "Landroidx/compose/runtime/saveable/Saver;",
        "Landroidx/compose/material3/DrawerState;",
        "Landroidx/compose/material3/DrawerValue;",
        "confirmStateChange",
        "Lkotlin/Function1;",
        "",
        "material3_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/material3/DrawerState$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final Saver(Lv3/l;)Landroidx/compose/runtime/saveable/Saver;
    .locals 2
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/material3/DrawerValue;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Landroidx/compose/runtime/saveable/Saver<",
            "Landroidx/compose/material3/DrawerState;",
            "Landroidx/compose/material3/DrawerValue;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/material3/DrawerState$Companion$Saver$1;->INSTANCE:Landroidx/compose/material3/DrawerState$Companion$Saver$1;

    new-instance v1, Landroidx/compose/material3/DrawerState$Companion$Saver$2;

    invoke-direct {v1, p1}, Landroidx/compose/material3/DrawerState$Companion$Saver$2;-><init>(Lv3/l;)V

    invoke-static {v0, v1}, Landroidx/compose/runtime/saveable/SaverKt;->Saver(Lv3/p;Lv3/l;)Landroidx/compose/runtime/saveable/Saver;

    move-result-object p1

    return-object p1
.end method
