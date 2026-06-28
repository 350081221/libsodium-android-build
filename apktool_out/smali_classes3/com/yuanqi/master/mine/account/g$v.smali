.class final Lcom/yuanqi/master/mine/account/g$v;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/mine/account/g;->e(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "textLayoutResult",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditScreen.kt\ncom/yuanqi/master/mine/account/EditScreenKt$EditPwd$1$3$4$2$1\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,827:1\n159#2,2:828\n*S KotlinDebug\n*F\n+ 1 EditScreen.kt\ncom/yuanqi/master/mine/account/EditScreenKt$EditPwd$1$3$4$2$1\n*L\n371#1:828,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $readyToDraw:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $textStyle:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/TextStyle;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/TextStyle;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/mine/account/g$v;->$textStyle:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/yuanqi/master/mine/account/g$v;->$readyToDraw:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/text/TextLayoutResult;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/mine/account/g$v;->invoke(Landroidx/compose/ui/text/TextLayoutResult;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/text/TextLayoutResult;)V
    .locals 35
    .param p1    # Landroidx/compose/ui/text/TextLayoutResult;
        .annotation build Lp4/l;
        .end annotation
    .end param

    move-object/from16 v0, p0

    const-string v1, "textLayoutResult"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/TextLayoutResult;->getDidOverflowWidth()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, v0, Lcom/yuanqi/master/mine/account/g$v;->$textStyle:Landroidx/compose/runtime/MutableState;

    invoke-interface {v1}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroidx/compose/ui/text/TextStyle;

    const-wide/16 v4, 0x0

    iget-object v2, v0, Lcom/yuanqi/master/mine/account/g$v;->$textStyle:Landroidx/compose/runtime/MutableState;

    invoke-interface {v2}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/text/TextStyle;

    invoke-virtual {v2}, Landroidx/compose/ui/text/TextStyle;->getFontSize-XSAIIZE()J

    move-result-wide v6

    .line 4
    invoke-static {v6, v7}, Landroidx/compose/ui/unit/TextUnitKt;->checkArithmetic--R2X_6o(J)V

    .line 5
    invoke-static {v6, v7}, Landroidx/compose/ui/unit/TextUnit;->getRawType-impl(J)J

    move-result-wide v8

    invoke-static {v6, v7}, Landroidx/compose/ui/unit/TextUnit;->getValue-impl(J)F

    move-result v2

    float-to-double v6, v2

    const-wide v10, 0x3feccccccccccccdL    # 0.9

    mul-double/2addr v6, v10

    double-to-float v2, v6

    invoke-static {v8, v9, v2}, Landroidx/compose/ui/unit/TextUnitKt;->pack(JF)J

    move-result-wide v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const v33, 0xfffffd

    const/16 v34, 0x0

    .line 6
    invoke-static/range {v3 .. v34}, Landroidx/compose/ui/text/TextStyle;->copy-p1EtxEg$default(Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v2

    invoke-interface {v1, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v1, v0, Lcom/yuanqi/master/mine/account/g$v;->$readyToDraw:Landroidx/compose/runtime/MutableState;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v1, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
