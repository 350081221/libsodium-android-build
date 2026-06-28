.class public Lj1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Z

.field private c:Z

.field private d:Lcom/bytedance/mtesttools/b/h;

.field private e:Lcom/bytedance/mtesttools/b/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lj1/b;->c:Z

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
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
.end method


# virtual methods
.method public a()Lcom/bytedance/mtesttools/b/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lj1/b;->d:Lcom/bytedance/mtesttools/b/h;

    return-object v0
.end method

.method public a(Lcom/bytedance/mtesttools/b/a;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lj1/b;->e:Lcom/bytedance/mtesttools/b/a;

    return-void
.end method

.method public a(Lcom/bytedance/mtesttools/b/h;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lj1/b;->d:Lcom/bytedance/mtesttools/b/h;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lj1/b;->a:Ljava/lang/String;

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 3
    iput-boolean p1, p0, Lj1/b;->b:Z

    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 6
    iput-boolean p1, p0, Lj1/b;->c:Z

    return-void
.end method

.method public b()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lj1/b;->a:Ljava/lang/String;

    const-string v1, "onVideoStart"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lj1/b;->a:Ljava/lang/String;

    const-string v1, "onVideoPause"

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lj1/b;->a:Ljava/lang/String;

    const-string v1, "onVideoResume"

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lj1/b;->a:Ljava/lang/String;

    const-string v1, "onVideoCompleted"

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-boolean v0, p0, Lj1/b;->b:Z

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj1/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lcom/bytedance/mtesttools/b/a;
    .locals 1

    iget-object v0, p0, Lj1/b;->e:Lcom/bytedance/mtesttools/b/a;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lj1/b;->c:Z

    return v0
.end method
