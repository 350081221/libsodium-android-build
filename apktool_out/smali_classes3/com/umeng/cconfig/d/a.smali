.class public final Lcom/umeng/cconfig/d/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/umeng/cconfig/d/a;->a:Landroid/content/Context;

    return-void
.end method

.method private a()Z
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/umeng/cconfig/d/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/cconfig/a/b;->a(Landroid/content/Context;)Lcom/umeng/cconfig/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/umeng/cconfig/a/b;->e()Lcom/umeng/cconfig/b/d;

    move-result-object v0

    iget-object v1, v0, Lcom/umeng/cconfig/b/d;->c:Ljava/lang/String;

    const-string v2, "0"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lcom/umeng/cconfig/b/d;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/umeng/cconfig/d/a;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/umeng/cconfig/a/b;->a(Landroid/content/Context;)Lcom/umeng/cconfig/a/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/umeng/cconfig/a/b;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/umeng/cconfig/d/a;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/umeng/cconfig/a/b;->a(Landroid/content/Context;)Lcom/umeng/cconfig/a/b;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/umeng/cconfig/a/b;->b(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final run()V
    .locals 4

    :try_start_0
    invoke-static {}, Lcom/umeng/cconfig/UMRemoteConfig;->getInstance()Lcom/umeng/cconfig/UMRemoteConfig;

    move-result-object v0

    invoke-direct {p0}, Lcom/umeng/cconfig/d/a;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-virtual {v0, v3, v1, v2}, Lcom/umeng/cconfig/UMRemoteConfig;->handlerMessage(ILjava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
