.class public Lcom/yuanqi/master/tools/guide/core/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Landroid/app/Activity;

.field b:Landroidx/fragment/app/Fragment;

.field c:Ljava/lang/String;

.field d:Z

.field e:Landroid/view/View;

.field f:I

.field g:Ly2/b;

.field h:Ly2/e;

.field i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yuanqi/master/tools/guide/model/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/yuanqi/master/tools/guide/core/a;->f:I

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/yuanqi/master/tools/guide/core/a;->i:Ljava/util/List;

    .line 4
    iput-object p1, p0, Lcom/yuanqi/master/tools/guide/core/a;->a:Landroid/app/Activity;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 6
    iput v0, p0, Lcom/yuanqi/master/tools/guide/core/a;->f:I

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/yuanqi/master/tools/guide/core/a;->i:Ljava/util/List;

    .line 8
    iput-object p1, p0, Lcom/yuanqi/master/tools/guide/core/a;->b:Landroidx/fragment/app/Fragment;

    .line 9
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iput-object p1, p0, Lcom/yuanqi/master/tools/guide/core/a;->a:Landroid/app/Activity;

    return-void
.end method

.method private e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/a;->c:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/a;->a:Landroid/app/Activity;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/a;->b:Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v1, "activity is null, please make sure that fragment is showing when call NewbieGuide"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :cond_1
    :goto_0
    return-void

    .line 27
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    const-string v1, "the param \'label\' is missing, please call setLabel()"

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method


# virtual methods
.method public a(Lcom/yuanqi/master/tools/guide/model/a;)Lcom/yuanqi/master/tools/guide/core/a;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/a;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b(Z)Lcom/yuanqi/master/tools/guide/core/a;
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/master/tools/guide/core/a;->d:Z

    return-object p0
.end method

.method public c(Landroid/view/View;)Lcom/yuanqi/master/tools/guide/core/a;
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/tools/guide/core/a;->e:Landroid/view/View;

    return-object p0
.end method

.method public d()Lcom/yuanqi/master/tools/guide/core/b;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/yuanqi/master/tools/guide/core/a;->e()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/yuanqi/master/tools/guide/core/b;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/yuanqi/master/tools/guide/core/b;-><init>(Lcom/yuanqi/master/tools/guide/core/a;)V

    .line 7
    .line 8
    .line 9
    return-object v0
    .line 10
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
.end method

.method public f(Ljava/lang/String;)Lcom/yuanqi/master/tools/guide/core/a;
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/tools/guide/core/a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public g(Ly2/b;)Lcom/yuanqi/master/tools/guide/core/a;
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/tools/guide/core/a;->g:Ly2/b;

    return-object p0
.end method

.method public h(Ly2/e;)Lcom/yuanqi/master/tools/guide/core/a;
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/tools/guide/core/a;->h:Ly2/e;

    return-object p0
.end method

.method public i(I)Lcom/yuanqi/master/tools/guide/core/a;
    .locals 0

    iput p1, p0, Lcom/yuanqi/master/tools/guide/core/a;->f:I

    return-object p0
.end method

.method public j()Lcom/yuanqi/master/tools/guide/core/b;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/yuanqi/master/tools/guide/core/a;->e()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/yuanqi/master/tools/guide/core/b;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/yuanqi/master/tools/guide/core/b;-><init>(Lcom/yuanqi/master/tools/guide/core/a;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/yuanqi/master/tools/guide/core/b;->p()V

    .line 10
    .line 11
    .line 12
    return-object v0
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
.end method
