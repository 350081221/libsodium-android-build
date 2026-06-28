.class public final Landroidx/compose/material3/BottomSheetScaffoldState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
.end annotation

.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroidx/compose/material3/BottomSheetScaffoldState;",
        "",
        "bottomSheetState",
        "Landroidx/compose/material3/SheetState;",
        "snackbarHostState",
        "Landroidx/compose/material3/SnackbarHostState;",
        "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;)V",
        "getBottomSheetState",
        "()Landroidx/compose/material3/SheetState;",
        "getSnackbarHostState",
        "()Landroidx/compose/material3/SnackbarHostState;",
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


# static fields
.field public static final $stable:I


# instance fields
.field private final bottomSheetState:Landroidx/compose/material3/SheetState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final snackbarHostState:Landroidx/compose/material3/SnackbarHostState;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;)V
    .locals 0
    .param p1    # Landroidx/compose/material3/SheetState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/material3/SnackbarHostState;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/material3/BottomSheetScaffoldState;->bottomSheetState:Landroidx/compose/material3/SheetState;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/material3/BottomSheetScaffoldState;->snackbarHostState:Landroidx/compose/material3/SnackbarHostState;

    .line 7
    .line 8
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method


# virtual methods
.method public final getBottomSheetState()Landroidx/compose/material3/SheetState;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/BottomSheetScaffoldState;->bottomSheetState:Landroidx/compose/material3/SheetState;

    return-object v0
.end method

.method public final getSnackbarHostState()Landroidx/compose/material3/SnackbarHostState;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/BottomSheetScaffoldState;->snackbarHostState:Landroidx/compose/material3/SnackbarHostState;

    return-object v0
.end method
