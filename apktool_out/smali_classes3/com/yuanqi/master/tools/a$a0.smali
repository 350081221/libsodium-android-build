.class final Lcom/yuanqi/master/tools/a$a0;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/tools/a;->m(ILjava/lang/String;Ljava/lang/String;Lv3/p;Lv3/a;Landroidx/compose/runtime/Composer;II)V
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

.field final synthetic $clickAction:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $imageId:I

.field final synthetic $note:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $subTitle:Ljava/lang/String;

.field final synthetic $title:Ljava/lang/String;


# direct methods
.method constructor <init>(ILjava/lang/String;Ljava/lang/String;Lv3/p;Lv3/a;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;II)V"
        }
    .end annotation

    iput p1, p0, Lcom/yuanqi/master/tools/a$a0;->$imageId:I

    iput-object p2, p0, Lcom/yuanqi/master/tools/a$a0;->$title:Ljava/lang/String;

    iput-object p3, p0, Lcom/yuanqi/master/tools/a$a0;->$subTitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/yuanqi/master/tools/a$a0;->$note:Lv3/p;

    iput-object p5, p0, Lcom/yuanqi/master/tools/a$a0;->$clickAction:Lv3/a;

    iput p6, p0, Lcom/yuanqi/master/tools/a$a0;->$$changed:I

    iput p7, p0, Lcom/yuanqi/master/tools/a$a0;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/tools/a$a0;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 8
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget v0, p0, Lcom/yuanqi/master/tools/a$a0;->$imageId:I

    iget-object v1, p0, Lcom/yuanqi/master/tools/a$a0;->$title:Ljava/lang/String;

    iget-object v2, p0, Lcom/yuanqi/master/tools/a$a0;->$subTitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/yuanqi/master/tools/a$a0;->$note:Lv3/p;

    iget-object v4, p0, Lcom/yuanqi/master/tools/a$a0;->$clickAction:Lv3/a;

    iget p2, p0, Lcom/yuanqi/master/tools/a$a0;->$$changed:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v6

    iget v7, p0, Lcom/yuanqi/master/tools/a$a0;->$$default:I

    move-object v5, p1

    invoke-static/range {v0 .. v7}, Lcom/yuanqi/master/tools/a;->m(ILjava/lang/String;Ljava/lang/String;Lv3/p;Lv3/a;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
