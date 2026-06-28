.class public interface abstract Landroidx/compose/material/SnackbarData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H&J\u0008\u0010\u0004\u001a\u00020\u0002H&R\u0014\u0010\u0008\u001a\u00020\u00058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u000f\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/material/SnackbarData;",
        "",
        "Lkotlin/r2;",
        "performAction",
        "dismiss",
        "",
        "getMessage",
        "()Ljava/lang/String;",
        "message",
        "getActionLabel",
        "actionLabel",
        "Landroidx/compose/material/SnackbarDuration;",
        "getDuration",
        "()Landroidx/compose/material/SnackbarDuration;",
        "duration",
        "material_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract dismiss()V
.end method

.method public abstract getActionLabel()Ljava/lang/String;
    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract getDuration()Landroidx/compose/material/SnackbarDuration;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getMessage()Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract performAction()V
.end method
