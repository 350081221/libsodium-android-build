.class final Lcom/yuanqi/master/main/d$d;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/main/d;->a(Lcom/yuanqi/group/home/models/b;Landroidx/compose/ui/Modifier;Lcom/yuanqi/master/main/MainViewModel;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/p<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$default:I

.field final synthetic $info:Lcom/yuanqi/group/home/models/b;

.field final synthetic $mainViewModel:Lcom/yuanqi/master/main/MainViewModel;

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/home/models/b;Landroidx/compose/ui/Modifier;Lcom/yuanqi/master/main/MainViewModel;II)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/main/d$d;->$info:Lcom/yuanqi/group/home/models/b;

    iput-object p2, p0, Lcom/yuanqi/master/main/d$d;->$modifier:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lcom/yuanqi/master/main/d$d;->$mainViewModel:Lcom/yuanqi/master/main/MainViewModel;

    iput p4, p0, Lcom/yuanqi/master/main/d$d;->$$changed:I

    iput p5, p0, Lcom/yuanqi/master/main/d$d;->$$default:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/main/d$d;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 6
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/yuanqi/master/main/d$d;->$info:Lcom/yuanqi/group/home/models/b;

    iget-object v1, p0, Lcom/yuanqi/master/main/d$d;->$modifier:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lcom/yuanqi/master/main/d$d;->$mainViewModel:Lcom/yuanqi/master/main/MainViewModel;

    iget p2, p0, Lcom/yuanqi/master/main/d$d;->$$changed:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v4

    iget v5, p0, Lcom/yuanqi/master/main/d$d;->$$default:I

    move-object v3, p1

    invoke-static/range {v0 .. v5}, Lcom/yuanqi/master/main/d;->a(Lcom/yuanqi/group/home/models/b;Landroidx/compose/ui/Modifier;Lcom/yuanqi/master/main/MainViewModel;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
