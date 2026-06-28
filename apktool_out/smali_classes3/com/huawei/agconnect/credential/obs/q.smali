.class public Lcom/huawei/agconnect/credential/obs/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:J = 0x1388L

.field private static final b:Ljava/lang/String; = "ClientImpl"


# instance fields
.field private c:Lcom/huawei/agconnect/https/OKHttpBuilder;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lokhttp3/Interceptor;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1}, Lcom/huawei/agconnect/credential/obs/q;->a(Landroid/content/Context;)Lcom/huawei/agconnect/https/OKHttpBuilder;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/q;->c:Lcom/huawei/agconnect/https/OKHttpBuilder;

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lokhttp3/Interceptor;

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/q;->c:Lcom/huawei/agconnect/https/OKHttpBuilder;

    invoke-virtual {v0, p2}, Lcom/huawei/agconnect/https/OKHttpBuilder;->addInterceptor(Lokhttp3/Interceptor;)Lcom/huawei/agconnect/https/OKHttpBuilder;

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    iget-object p1, p0, Lcom/huawei/agconnect/credential/obs/q;->c:Lcom/huawei/agconnect/https/OKHttpBuilder;

    const-wide/16 p2, 0x1388

    invoke-virtual {p1, p2, p3}, Lcom/huawei/agconnect/https/OKHttpBuilder;->connectTimeout(J)Lcom/huawei/agconnect/https/OKHttpBuilder;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lcom/huawei/agconnect/https/OKHttpBuilder;->readTimeout(J)Lcom/huawei/agconnect/https/OKHttpBuilder;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lcom/huawei/agconnect/https/OKHttpBuilder;->writeTimeout(J)Lcom/huawei/agconnect/https/OKHttpBuilder;

    :cond_1
    return-void
.end method

.method private a(Landroid/content/Context;)Lcom/huawei/agconnect/https/OKHttpBuilder;
    .locals 4

    const-string v0, "ClientImpl"

    :try_start_0
    new-instance v1, Lcom/huawei/agconnect/https/OKHttpBuilder;

    invoke-direct {v1}, Lcom/huawei/agconnect/https/OKHttpBuilder;-><init>()V

    invoke-static {p1}, Lcom/huawei/secure/android/common/ssl/i;->e(Landroid/content/Context;)Lcom/huawei/secure/android/common/ssl/i;

    move-result-object v2

    new-instance v3, Lcom/huawei/secure/android/common/ssl/k;

    invoke-direct {v3, p1}, Lcom/huawei/secure/android/common/ssl/k;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2, v3}, Lcom/huawei/agconnect/https/OKHttpBuilder;->sslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lcom/huawei/agconnect/https/OKHttpBuilder;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/q;->c:Lcom/huawei/agconnect/https/OKHttpBuilder;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    :try_start_1
    const-string v1, "KeyManagementException"

    invoke-static {v0, v1, p1}, Lcom/huawei/agconnect/common/api/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    new-instance p1, Lcom/huawei/agconnect/https/OKHttpBuilder;

    invoke-direct {p1}, Lcom/huawei/agconnect/https/OKHttpBuilder;-><init>()V

    goto :goto_0

    :catch_1
    move-exception p1

    :try_start_2
    const-string v1, "IllegalAccessException"

    invoke-static {v0, v1, p1}, Lcom/huawei/agconnect/common/api/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    new-instance p1, Lcom/huawei/agconnect/https/OKHttpBuilder;

    invoke-direct {p1}, Lcom/huawei/agconnect/https/OKHttpBuilder;-><init>()V

    goto :goto_0

    :catch_2
    move-exception p1

    :try_start_3
    const-string v1, "KeyStoreException"

    invoke-static {v0, v1, p1}, Lcom/huawei/agconnect/common/api/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    new-instance p1, Lcom/huawei/agconnect/https/OKHttpBuilder;

    invoke-direct {p1}, Lcom/huawei/agconnect/https/OKHttpBuilder;-><init>()V

    goto :goto_0

    :catch_3
    move-exception p1

    :try_start_4
    const-string v1, "CertificateException"

    invoke-static {v0, v1, p1}, Lcom/huawei/agconnect/common/api/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    new-instance p1, Lcom/huawei/agconnect/https/OKHttpBuilder;

    invoke-direct {p1}, Lcom/huawei/agconnect/https/OKHttpBuilder;-><init>()V

    goto :goto_0

    :catch_4
    move-exception p1

    :try_start_5
    const-string v1, "NoSuchAlgorithmException"

    invoke-static {v0, v1, p1}, Lcom/huawei/agconnect/common/api/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    new-instance p1, Lcom/huawei/agconnect/https/OKHttpBuilder;

    invoke-direct {p1}, Lcom/huawei/agconnect/https/OKHttpBuilder;-><init>()V

    goto :goto_0

    :catch_5
    move-exception p1

    :try_start_6
    const-string v1, "IOException"

    invoke-static {v0, v1, p1}, Lcom/huawei/agconnect/common/api/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    new-instance p1, Lcom/huawei/agconnect/https/OKHttpBuilder;

    invoke-direct {p1}, Lcom/huawei/agconnect/https/OKHttpBuilder;-><init>()V

    :goto_0
    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/q;->c:Lcom/huawei/agconnect/https/OKHttpBuilder;

    :goto_1
    iget-object p1, p0, Lcom/huawei/agconnect/credential/obs/q;->c:Lcom/huawei/agconnect/https/OKHttpBuilder;

    return-object p1

    :goto_2
    new-instance v0, Lcom/huawei/agconnect/https/OKHttpBuilder;

    invoke-direct {v0}, Lcom/huawei/agconnect/https/OKHttpBuilder;-><init>()V

    iput-object v0, p0, Lcom/huawei/agconnect/credential/obs/q;->c:Lcom/huawei/agconnect/https/OKHttpBuilder;

    throw p1
.end method


# virtual methods
.method public a(Lokhttp3/Authenticator;)Lcom/huawei/agconnect/credential/obs/q;
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/q;->c:Lcom/huawei/agconnect/https/OKHttpBuilder;

    invoke-virtual {v0, p1}, Lcom/huawei/agconnect/https/OKHttpBuilder;->authenticator(Lokhttp3/Authenticator;)Lcom/huawei/agconnect/https/OKHttpBuilder;

    :cond_0
    return-object p0
.end method

.method public a()Lokhttp3/OkHttpClient;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/q;->c:Lcom/huawei/agconnect/https/OKHttpBuilder;

    invoke-virtual {v0}, Lcom/huawei/agconnect/https/OKHttpBuilder;->build()Lokhttp3/OkHttpClient;

    move-result-object v0

    return-object v0
.end method

.method public a(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/q;->c:Lcom/huawei/agconnect/https/OKHttpBuilder;

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/agconnect/https/OKHttpBuilder;->buildWithTimeOut(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient;

    move-result-object p1

    return-object p1
.end method
