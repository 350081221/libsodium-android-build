.class public final Landroidx/compose/ui/text/platform/DispatcherKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lkotlinx/coroutines/n0;",
        "FontCacheManagementDispatcher",
        "Lkotlinx/coroutines/n0;",
        "getFontCacheManagementDispatcher",
        "()Lkotlinx/coroutines/n0;",
        "ui-text_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static final FontCacheManagementDispatcher:Lkotlinx/coroutines/n0;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lkotlinx/coroutines/k1;->e()Lkotlinx/coroutines/x2;

    move-result-object v0

    sput-object v0, Landroidx/compose/ui/text/platform/DispatcherKt;->FontCacheManagementDispatcher:Lkotlinx/coroutines/n0;

    return-void
.end method

.method public static final getFontCacheManagementDispatcher()Lkotlinx/coroutines/n0;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/text/platform/DispatcherKt;->FontCacheManagementDispatcher:Lkotlinx/coroutines/n0;

    return-object v0
.end method
