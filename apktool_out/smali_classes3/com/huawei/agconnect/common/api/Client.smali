.class public Lcom/huawei/agconnect/common/api/Client;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static build(Landroid/content/Context;Ljava/util/List;)Lokhttp3/OkHttpClient;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lokhttp3/Interceptor;",
            ">;)",
            "Lokhttp3/OkHttpClient;"
        }
    .end annotation

    new-instance v0, Lcom/huawei/agconnect/credential/obs/q;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/huawei/agconnect/credential/obs/q;-><init>(Landroid/content/Context;Ljava/util/List;Z)V

    invoke-virtual {v0}, Lcom/huawei/agconnect/credential/obs/q;->a()Lokhttp3/OkHttpClient;

    move-result-object p0

    return-object p0
.end method

.method public static build(Landroid/content/Context;Ljava/util/List;Z)Lokhttp3/OkHttpClient;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lokhttp3/Interceptor;",
            ">;Z)",
            "Lokhttp3/OkHttpClient;"
        }
    .end annotation

    new-instance v0, Lcom/huawei/agconnect/credential/obs/q;

    invoke-direct {v0, p0, p1, p2}, Lcom/huawei/agconnect/credential/obs/q;-><init>(Landroid/content/Context;Ljava/util/List;Z)V

    invoke-virtual {v0}, Lcom/huawei/agconnect/credential/obs/q;->a()Lokhttp3/OkHttpClient;

    move-result-object p0

    return-object p0
.end method
