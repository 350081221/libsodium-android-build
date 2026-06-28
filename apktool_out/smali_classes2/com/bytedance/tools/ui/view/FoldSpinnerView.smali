.class public Lcom/bytedance/tools/ui/view/FoldSpinnerView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private a:Landroid/view/View;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/ImageView;

.field private d:Ljava/lang/String;

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->e:Z

    .line 7
    invoke-direct {p0}, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->e()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 8
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->e:Z

    const/4 v1, 0x1

    new-array v1, v1, [I

    .line 10
    sget v2, Lcom/bytedance/tools/R$attr;->f4:I

    aput v2, v1, v0

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 11
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->d:Ljava/lang/String;

    .line 12
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 13
    invoke-direct {p0}, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->e()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2
    iput-object p2, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->d:Ljava/lang/String;

    .line 3
    iput-boolean p3, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->e:Z

    .line 4
    invoke-direct {p0}, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->e()V

    return-void
.end method

.method static synthetic c(Lcom/bytedance/tools/ui/view/FoldSpinnerView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->e:Z

    return p0
.end method

.method static synthetic d(Lcom/bytedance/tools/ui/view/FoldSpinnerView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->e:Z

    return p1
.end method

.method private e()V
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget v1, Lcom/bytedance/tools/R$layout;->X0:I

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    sget v0, Lcom/bytedance/tools/R$id;->Q4:I

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->a:Landroid/view/View;

    .line 34
    .line 35
    sget v0, Lcom/bytedance/tools/R$id;->P4:I

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Landroid/widget/TextView;

    .line 42
    .line 43
    iput-object v0, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->b:Landroid/widget/TextView;

    .line 44
    .line 45
    sget v0, Lcom/bytedance/tools/R$id;->O4:I

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroid/widget/ImageView;

    .line 52
    .line 53
    iput-object v0, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->c:Landroid/widget/ImageView;

    .line 54
    .line 55
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->a:Landroid/view/View;

    .line 56
    .line 57
    new-instance v1, Lcom/bytedance/tools/ui/view/FoldSpinnerView$a;

    .line 58
    .line 59
    invoke-direct {v1, p0}, Lcom/bytedance/tools/ui/view/FoldSpinnerView$a;-><init>(Lcom/bytedance/tools/ui/view/FoldSpinnerView;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->b:Landroid/widget/TextView;

    .line 66
    .line 67
    iget-object v1, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->d:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    return-void
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method private setChildVisible(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    :goto_0
    if-ge v1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method protected a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->c:Landroid/widget/ImageView;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->e:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget v1, Lcom/bytedance/tools/R$drawable;->x0:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget v1, Lcom/bytedance/tools/R$drawable;->u0:I

    .line 11
    .line 12
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 13
    .line 14
    .line 15
    iget-boolean v0, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->e:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const/16 v0, 0x8

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_1
    invoke-direct {p0, v0}, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->setChildVisible(I)V

    .line 24
    .line 25
    .line 26
    iget-boolean v0, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->e:Z

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->b(Z)V

    .line 29
    .line 30
    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method protected b(Z)V
    .locals 0

    return-void
.end method

.method public getTitleText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->d:Ljava/lang/String;

    return-object v0
.end method

.method public setIsFold(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->e:Z

    return-void
.end method

.method public setTitleText(Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->d:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/FoldSpinnerView;->b:Landroid/widget/TextView;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
