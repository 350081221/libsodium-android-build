.class public Lcom/bytedance/tools/ui/ui/c;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Landroid/view/View;

.field private b:Landroid/widget/ListView;

.field private c:Lcom/bytedance/tools/ui/a/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method

.method private b()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bytedance/tools/c/d;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "rit"

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    const-string v4, "setting_rit"

    .line 14
    .line 15
    filled-new-array {v0}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const-string v10, "rit ASC"

    .line 24
    .line 25
    invoke-static/range {v3 .. v10}, Lcom/bytedance/tools/d/d;->b(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 26
    .line 27
    .line 28
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-object v1

    .line 37
    :cond_1
    :goto_0
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    new-instance v3, Lcom/bytedance/tools/c/d;

    .line 44
    .line 45
    invoke-direct {v3}, Lcom/bytedance/tools/c/d;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    iput-object v4, v3, Lcom/bytedance/tools/c/d;->a:Ljava/lang/String;

    .line 57
    .line 58
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 63
    .line 64
    .line 65
    invoke-static {v1}, Lcom/bytedance/tools/d/j;->f(Ljava/util/List;)V

    .line 66
    .line 67
    .line 68
    return-object v1

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 73
    .line 74
    .line 75
    :cond_3
    throw v0
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget p3, Lcom/bytedance/tools/R$layout;->J:I

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lcom/bytedance/tools/ui/ui/c;->a:Landroid/view/View;

    .line 17
    .line 18
    sget p2, Lcom/bytedance/tools/R$id;->Z:I

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Landroid/widget/ListView;

    .line 25
    .line 26
    iput-object p1, p0, Lcom/bytedance/tools/ui/ui/c;->b:Landroid/widget/ListView;

    .line 27
    .line 28
    new-instance p1, Lcom/bytedance/tools/ui/a/e;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-direct {p0}, Lcom/bytedance/tools/ui/ui/c;->b()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    invoke-direct {p1, p2, p3}, Lcom/bytedance/tools/ui/a/e;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lcom/bytedance/tools/ui/ui/c;->c:Lcom/bytedance/tools/ui/a/e;

    .line 42
    .line 43
    iget-object p2, p0, Lcom/bytedance/tools/ui/ui/c;->b:Landroid/widget/ListView;

    .line 44
    .line 45
    invoke-virtual {p2, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcom/bytedance/tools/ui/ui/c;->b:Landroid/widget/ListView;

    .line 49
    .line 50
    iget-object p2, p0, Lcom/bytedance/tools/ui/ui/c;->a:Landroid/view/View;

    .line 51
    .line 52
    const p3, 0x1020004

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p1, p2}, Landroid/widget/AdapterView;->setEmptyView(Landroid/view/View;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lcom/bytedance/tools/ui/ui/c;->b:Landroid/widget/ListView;

    .line 63
    .line 64
    const/4 p2, 0x0

    .line 65
    invoke-virtual {p1, p2}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lcom/bytedance/tools/ui/ui/c;->a:Landroid/view/View;

    .line 69
    .line 70
    return-object p1
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method
