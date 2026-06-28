.class final Landroidx/compose/material3/SheetState$Companion$Saver$4;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SheetState$Companion;->Saver(ZLv3/l;)Landroidx/compose/runtime/saveable/Saver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/material3/SheetValue;",
        "Landroidx/compose/material3/SheetState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/material3/SheetState;",
        "savedValue",
        "Landroidx/compose/material3/SheetValue;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $confirmValueChange:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/material3/SheetValue;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $skipPartiallyExpanded:Z


# direct methods
.method constructor <init>(ZLv3/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lv3/l<",
            "-",
            "Landroidx/compose/material3/SheetValue;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Landroidx/compose/material3/SheetState$Companion$Saver$4;->$skipPartiallyExpanded:Z

    iput-object p2, p0, Landroidx/compose/material3/SheetState$Companion$Saver$4;->$confirmValueChange:Lv3/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/material3/SheetValue;)Landroidx/compose/material3/SheetState;
    .locals 8
    .param p1    # Landroidx/compose/material3/SheetValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 2
    new-instance v7, Landroidx/compose/material3/SheetState;

    iget-boolean v1, p0, Landroidx/compose/material3/SheetState$Companion$Saver$4;->$skipPartiallyExpanded:Z

    iget-object v3, p0, Landroidx/compose/material3/SheetState$Companion$Saver$4;->$confirmValueChange:Lv3/l;

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v0, v7

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Landroidx/compose/material3/SheetState;-><init>(ZLandroidx/compose/material3/SheetValue;Lv3/l;ZILkotlin/jvm/internal/w;)V

    return-object v7
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/material3/SheetValue;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/SheetState$Companion$Saver$4;->invoke(Landroidx/compose/material3/SheetValue;)Landroidx/compose/material3/SheetState;

    move-result-object p1

    return-object p1
.end method
