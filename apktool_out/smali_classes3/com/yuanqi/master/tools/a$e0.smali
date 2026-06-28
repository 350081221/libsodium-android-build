.class final Lcom/yuanqi/master/tools/a$e0;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/tools/a;->o(Ljava/lang/String;JJFFFJLv3/a;Landroidx/compose/runtime/Composer;II)V
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

.field final synthetic $bgColor:J

.field final synthetic $fontSize:J

.field final synthetic $horizontalMargins:F

.field final synthetic $onClick:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $radius:F

.field final synthetic $text:Ljava/lang/String;

.field final synthetic $textColor:J

.field final synthetic $verticalMargins:F


# direct methods
.method constructor <init>(Ljava/lang/String;JJFFFJLv3/a;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JJFFFJ",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/tools/a$e0;->$text:Ljava/lang/String;

    iput-wide p2, p0, Lcom/yuanqi/master/tools/a$e0;->$bgColor:J

    iput-wide p4, p0, Lcom/yuanqi/master/tools/a$e0;->$textColor:J

    iput p6, p0, Lcom/yuanqi/master/tools/a$e0;->$radius:F

    iput p7, p0, Lcom/yuanqi/master/tools/a$e0;->$horizontalMargins:F

    iput p8, p0, Lcom/yuanqi/master/tools/a$e0;->$verticalMargins:F

    iput-wide p9, p0, Lcom/yuanqi/master/tools/a$e0;->$fontSize:J

    iput-object p11, p0, Lcom/yuanqi/master/tools/a$e0;->$onClick:Lv3/a;

    iput p12, p0, Lcom/yuanqi/master/tools/a$e0;->$$changed:I

    iput p13, p0, Lcom/yuanqi/master/tools/a$e0;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/tools/a$e0;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 15
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    move-object v0, p0

    iget-object v1, v0, Lcom/yuanqi/master/tools/a$e0;->$text:Ljava/lang/String;

    iget-wide v2, v0, Lcom/yuanqi/master/tools/a$e0;->$bgColor:J

    iget-wide v4, v0, Lcom/yuanqi/master/tools/a$e0;->$textColor:J

    iget v6, v0, Lcom/yuanqi/master/tools/a$e0;->$radius:F

    iget v7, v0, Lcom/yuanqi/master/tools/a$e0;->$horizontalMargins:F

    iget v8, v0, Lcom/yuanqi/master/tools/a$e0;->$verticalMargins:F

    iget-wide v9, v0, Lcom/yuanqi/master/tools/a$e0;->$fontSize:J

    iget-object v11, v0, Lcom/yuanqi/master/tools/a$e0;->$onClick:Lv3/a;

    iget v12, v0, Lcom/yuanqi/master/tools/a$e0;->$$changed:I

    or-int/lit8 v12, v12, 0x1

    invoke-static {v12}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v13

    iget v14, v0, Lcom/yuanqi/master/tools/a$e0;->$$default:I

    move-object/from16 v12, p1

    invoke-static/range {v1 .. v14}, Lcom/yuanqi/master/tools/a;->o(Ljava/lang/String;JJFFFJLv3/a;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
