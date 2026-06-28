.class public Lcom/yuanqi/group/abs/percent/PercentLinearLayout$LayoutParams;
.super Landroid/widget/LinearLayout$LayoutParams;
.source "SourceFile"

# interfaces
.implements Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutParams;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuanqi/group/abs/percent/PercentLinearLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutParams"
.end annotation


# instance fields
.field private a:Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    invoke-static {p1, p2}, Landroidx/percentlayout/widget/PercentLayoutHelper;->getPercentLayoutInfo(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/yuanqi/group/abs/percent/PercentLinearLayout$LayoutParams;->a:Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-void
.end method


# virtual methods
.method public getPercentLayoutInfo()Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/abs/percent/PercentLinearLayout$LayoutParams;->a:Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;

    return-object v0
.end method

.method protected setBaseAttributes(Landroid/content/res/TypedArray;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/percentlayout/widget/PercentLayoutHelper;->fetchWidthAndHeight(Landroid/view/ViewGroup$LayoutParams;Landroid/content/res/TypedArray;II)V

    return-void
.end method
