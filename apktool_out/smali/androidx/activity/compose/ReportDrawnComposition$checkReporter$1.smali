.class final synthetic Landroidx/activity/compose/ReportDrawnComposition$checkReporter$1;
.super Lkotlin/jvm/internal/h0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/compose/ReportDrawnComposition;-><init>(Landroidx/activity/FullyDrawnReporter;Lv3/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/h0;",
        "Lv3/l<",
        "Lv3/a<",
        "+",
        "Ljava/lang/Boolean;",
        ">;",
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


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const/4 v1, 0x1

    const-class v3, Landroidx/activity/compose/ReportDrawnComposition;

    const-string v4, "observeReporter"

    const-string v5, "observeReporter(Lkotlin/jvm/functions/Function0;)V"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lv3/a;

    invoke-virtual {p0, p1}, Landroidx/activity/compose/ReportDrawnComposition$checkReporter$1;->invoke(Lv3/a;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lv3/a;)V
    .locals 1
    .param p1    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lkotlin/jvm/internal/q;->receiver:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/compose/ReportDrawnComposition;

    invoke-static {v0, p1}, Landroidx/activity/compose/ReportDrawnComposition;->access$observeReporter(Landroidx/activity/compose/ReportDrawnComposition;Lv3/a;)V

    return-void
.end method
