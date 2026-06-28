.class final Lcom/yuanqi/master/tools/a$v;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/tools/a;->j(Landroidx/compose/runtime/MutableState;Ljava/lang/String;ZFZZLv3/l;Landroidx/compose/runtime/Composer;II)V
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

.field final synthetic $fillWith:F

.field final synthetic $isEnable:Z

.field final synthetic $isNumber:Z

.field final synthetic $isPwd:Z

.field final synthetic $placeholder:Ljava/lang/String;

.field final synthetic $str:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $validate:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/runtime/MutableState;Ljava/lang/String;ZFZZLv3/l;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "ZFZZ",
            "Lv3/l<",
            "-",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/tools/a$v;->$str:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/yuanqi/master/tools/a$v;->$placeholder:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/yuanqi/master/tools/a$v;->$isPwd:Z

    iput p4, p0, Lcom/yuanqi/master/tools/a$v;->$fillWith:F

    iput-boolean p5, p0, Lcom/yuanqi/master/tools/a$v;->$isNumber:Z

    iput-boolean p6, p0, Lcom/yuanqi/master/tools/a$v;->$isEnable:Z

    iput-object p7, p0, Lcom/yuanqi/master/tools/a$v;->$validate:Lv3/l;

    iput p8, p0, Lcom/yuanqi/master/tools/a$v;->$$changed:I

    iput p9, p0, Lcom/yuanqi/master/tools/a$v;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/tools/a$v;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 10
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/yuanqi/master/tools/a$v;->$str:Landroidx/compose/runtime/MutableState;

    iget-object v1, p0, Lcom/yuanqi/master/tools/a$v;->$placeholder:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/yuanqi/master/tools/a$v;->$isPwd:Z

    iget v3, p0, Lcom/yuanqi/master/tools/a$v;->$fillWith:F

    iget-boolean v4, p0, Lcom/yuanqi/master/tools/a$v;->$isNumber:Z

    iget-boolean v5, p0, Lcom/yuanqi/master/tools/a$v;->$isEnable:Z

    iget-object v6, p0, Lcom/yuanqi/master/tools/a$v;->$validate:Lv3/l;

    iget p2, p0, Lcom/yuanqi/master/tools/a$v;->$$changed:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v8

    iget v9, p0, Lcom/yuanqi/master/tools/a$v;->$$default:I

    move-object v7, p1

    invoke-static/range {v0 .. v9}, Lcom/yuanqi/master/tools/a;->j(Landroidx/compose/runtime/MutableState;Ljava/lang/String;ZFZZLv3/l;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
