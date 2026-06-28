.class final Landroidx/compose/material3/TouchExplorationStateProvider_androidKt$ObserveState$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/TouchExplorationStateProvider_androidKt;->ObserveState(Landroidx/lifecycle/Lifecycle;Lv3/l;Lv3/a;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/lifecycle/Lifecycle$Event;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/material3/TouchExplorationStateProvider_androidKt$ObserveState$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/material3/TouchExplorationStateProvider_androidKt$ObserveState$1;

    invoke-direct {v0}, Landroidx/compose/material3/TouchExplorationStateProvider_androidKt$ObserveState$1;-><init>()V

    sput-object v0, Landroidx/compose/material3/TouchExplorationStateProvider_androidKt$ObserveState$1;->INSTANCE:Landroidx/compose/material3/TouchExplorationStateProvider_androidKt$ObserveState$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/lifecycle/Lifecycle$Event;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/TouchExplorationStateProvider_androidKt$ObserveState$1;->invoke(Landroidx/lifecycle/Lifecycle$Event;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/Lifecycle$Event;
        .annotation build Lp4/l;
        .end annotation
    .end param

    return-void
.end method
