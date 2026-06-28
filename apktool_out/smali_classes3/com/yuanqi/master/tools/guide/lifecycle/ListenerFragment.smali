.class public Lcom/yuanqi/master/tools/guide/lifecycle/ListenerFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# instance fields
.field a:Lcom/yuanqi/master/tools/guide/lifecycle/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/yuanqi/master/tools/guide/lifecycle/a;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/tools/guide/lifecycle/ListenerFragment;->a:Lcom/yuanqi/master/tools/guide/lifecycle/a;

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 2
    .line 3
    .line 4
    const-string v0, "onDestroy: "

    .line 5
    .line 6
    invoke-static {v0}, Lz2/a;->a(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/lifecycle/ListenerFragment;->a:Lcom/yuanqi/master/tools/guide/lifecycle/a;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Lcom/yuanqi/master/tools/guide/lifecycle/a;->onDestroy()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/lifecycle/ListenerFragment;->a:Lcom/yuanqi/master/tools/guide/lifecycle/a;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/yuanqi/master/tools/guide/lifecycle/a;->a()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
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

.method public onStart()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onStart()V

    .line 2
    .line 3
    .line 4
    const-string v0, "onStart: "

    .line 5
    .line 6
    invoke-static {v0}, Lz2/a;->a(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/lifecycle/ListenerFragment;->a:Lcom/yuanqi/master/tools/guide/lifecycle/a;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Lcom/yuanqi/master/tools/guide/lifecycle/a;->onStart()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onStop()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/lifecycle/ListenerFragment;->a:Lcom/yuanqi/master/tools/guide/lifecycle/a;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/yuanqi/master/tools/guide/lifecycle/a;->onStop()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
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
