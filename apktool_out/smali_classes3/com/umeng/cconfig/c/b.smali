.class public final Lcom/umeng/cconfig/c/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/json/JSONArray;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/umeng/cconfig/c/b;->a:Ljava/lang/String;

    invoke-virtual {p2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/umeng/cconfig/c/b;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/umeng/cconfig/c/b;->a:Ljava/lang/String;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/umeng/cconfig/c/b;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/umeng/cconfig/c/b;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/umeng/cconfig/c/b;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/umeng/cconfig/c/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/umeng/cconfig/c/b;->a:Ljava/lang/String;

    const-string v2, "https://ucc.umeng.com/v1/fetch"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/umeng/cconfig/c/b;->a:Ljava/lang/String;

    const-string v3, "https://pslog.umeng.com/ablog"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    move-object v3, v2

    :goto_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/umeng/cconfig/UMRemoteConfig;->getInstance()Lcom/umeng/cconfig/UMRemoteConfig;

    move-result-object v0

    iget-object v2, p0, Lcom/umeng/cconfig/c/b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v3, v2}, Lcom/umeng/cconfig/UMRemoteConfig;->handlerMessage(ILjava/lang/Object;Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-static {}, Lcom/umeng/cconfig/UMRemoteConfig;->getInstance()Lcom/umeng/cconfig/UMRemoteConfig;

    move-result-object v0

    invoke-virtual {v0, v1, v3, v2}, Lcom/umeng/cconfig/UMRemoteConfig;->handlerMessage(ILjava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    throw v0

    :catch_0
    return-void
.end method
