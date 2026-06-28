.class public Lcom/huawei/agconnect/credential/obs/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# static fields
.field private static final a:Ljava/lang/String; = "ApiKeyInterceptor"


# instance fields
.field private b:Lcom/huawei/agconnect/AGConnectInstance;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/AGConnectInstance;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/n;->b:Lcom/huawei/agconnect/AGConnectInstance;

    return-void
.end method


# virtual methods
.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 4

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/n;->b:Lcom/huawei/agconnect/AGConnectInstance;

    invoke-virtual {v0}, Lcom/huawei/agconnect/AGConnectInstance;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/agconnect/credential/obs/n;->b:Lcom/huawei/agconnect/AGConnectInstance;

    invoke-virtual {v1}, Lcom/huawei/agconnect/AGConnectInstance;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/agconnect/common/api/PackageUtils;->getInstalledAppSign256(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/agconnect/credential/obs/n;->b:Lcom/huawei/agconnect/AGConnectInstance;

    invoke-virtual {v1}, Lcom/huawei/agconnect/AGConnectInstance;->getOptions()Lcom/huawei/agconnect/AGConnectOptions;

    move-result-object v1

    const-string v2, "/client/api_key"

    invoke-interface {v1, v2}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    const-string v2, "ApiKeyInterceptor"

    const-string v3, "no apikey or fingerPrinter"

    invoke-static {v2, v3}, Lcom/huawei/agconnect/common/api/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    move-result-object v2

    const-string v3, "x-apik"

    invoke-virtual {v2, v3, v1}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v1

    const-string v2, "x-cert-fp"

    invoke-virtual {v1, v2, v0}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    const-string v1, "client_id"

    invoke-virtual {v0, v1}, Lokhttp3/Request$Builder;->removeHeader(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    const-string v1, "Authorization"

    invoke-virtual {v0, v1}, Lokhttp3/Request$Builder;->removeHeader(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v0

    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object p1

    return-object p1
.end method
