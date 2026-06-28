.class public Lcom/bytedance/mtesttools/act/AdnMainActivity;
.super Lcom/bytedance/mtesttools/a/a;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation


# instance fields
.field c:Landroid/widget/ListView;

.field d:Lcom/bytedance/mtesttools/d/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bytedance/mtesttools/a/a;-><init>()V

    return-void
.end method

.method private e()V
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/mtesttools/d/c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/bytedance/mtesttools/d/c;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/bytedance/mtesttools/act/AdnMainActivity;->d:Lcom/bytedance/mtesttools/d/c;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/bytedance/mtesttools/act/AdnMainActivity;->c:Landroid/widget/ListView;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private f()V
    .locals 0

    return-void
.end method

.method private g()V
    .locals 2

    .line 1
    invoke-static {}, Lk1/h;->a()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/bytedance/mtesttools/act/AdnMainActivity;->d:Lcom/bytedance/mtesttools/d/c;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lcom/bytedance/mtesttools/d/c;->b(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
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
.end method


# virtual methods
.method protected c()I
    .locals 1

    sget v0, Lcom/bytedance/tools/R$layout;->z0:I

    return v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->startActivityTrace(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0, p1}, Lcom/bytedance/mtesttools/a/a;->onCreate(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    sget p1, Lcom/bytedance/tools/R$id;->L:I

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Landroid/widget/ListView;

    .line 22
    .line 23
    iput-object p1, p0, Lcom/bytedance/mtesttools/act/AdnMainActivity;->c:Landroid/widget/ListView;

    .line 24
    .line 25
    const-string/jumbo p1, "\u7ec4\u4ef6\u6574\u4f53\u63a5\u5165\u60c5\u51b5"

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-virtual {p0, p1, v0}, Lcom/bytedance/mtesttools/a/a;->d(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, Lcom/bytedance/mtesttools/act/AdnMainActivity;->e()V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0}, Lcom/bytedance/mtesttools/act/AdnMainActivity;->f()V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Lcom/bytedance/mtesttools/act/AdnMainActivity;->g()V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

    .line 42
    .line 43
    .line 44
    return-void
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
.end method

.method protected onRestart()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartEnd()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeEnd()V

    return-void
.end method

.method protected onStart()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartEnd()V

    return-void
.end method
