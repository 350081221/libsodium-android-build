.class public Lcom/umeng/commonsdk/stateless/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "10.0.0.172"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/umeng/commonsdk/stateless/c;->a:Ljava/lang/String;

    .line 7
    .line 8
    const/16 v0, 0x50

    .line 9
    .line 10
    iput v0, p0, Lcom/umeng/commonsdk/stateless/c;->b:I

    .line 11
    .line 12
    iput-object p1, p0, Lcom/umeng/commonsdk/stateless/c;->c:Landroid/content/Context;

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/stateless/c;->c:Landroid/content/Context;

    const-string v1, "sl_domain_p"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->assembleStatelessURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/stateless/a;->i:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/stateless/c;->c:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "sl_domain_p"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/umeng/commonsdk/stateless/c;->c:Landroid/content/Context;

    .line 12
    .line 13
    const-string v3, "oversea_sl_domain_p"

    .line 14
    .line 15
    invoke-static {v1, v3, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->assembleStatelessURL(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lcom/umeng/commonsdk/stateless/a;->h:Ljava/lang/String;

    .line 30
    .line 31
    :cond_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->assembleStatelessURL(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lcom/umeng/commonsdk/stateless/a;->k:Ljava/lang/String;

    .line 42
    .line 43
    :cond_1
    sget-object v0, Lcom/umeng/commonsdk/stateless/a;->k:Ljava/lang/String;

    .line 44
    .line 45
    sput-object v0, Lcom/umeng/commonsdk/stateless/a;->i:Ljava/lang/String;

    .line 46
    .line 47
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->b:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->b:Ljava/lang/String;

    .line 56
    .line 57
    const-string v1, "460"

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->b:Ljava/lang/String;

    .line 66
    .line 67
    const-string v1, "461"

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    :cond_2
    sget-object v0, Lcom/umeng/commonsdk/stateless/a;->h:Ljava/lang/String;

    .line 76
    .line 77
    sput-object v0, Lcom/umeng/commonsdk/stateless/a;->i:Ljava/lang/String;

    .line 78
    .line 79
    :cond_3
    return-void
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
.method public a([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    const-string v0, "--->>> stateless: disconnect connection."

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_9

    if-nez p2, :cond_0

    goto/16 :goto_6

    .line 4
    :cond_0
    sget v3, Lcom/umeng/commonsdk/statistics/SdkVersion;->SDK_TYPE:I

    if-nez v3, :cond_1

    .line 5
    invoke-direct {p0}, Lcom/umeng/commonsdk/stateless/c;->a()V

    goto :goto_0

    .line 6
    :cond_1
    sget-object v3, Lcom/umeng/commonsdk/stateless/a;->k:Ljava/lang/String;

    sput-object v3, Lcom/umeng/commonsdk/stateless/a;->h:Ljava/lang/String;

    .line 7
    invoke-direct {p0}, Lcom/umeng/commonsdk/stateless/c;->b()V

    .line 8
    :goto_0
    sget-object v3, Lcom/umeng/commonsdk/stateless/a;->i:Ljava/lang/String;

    .line 9
    sget-object v4, Lcom/umeng/commonsdk/vchannel/a;->c:Ljava/lang/String;

    invoke-virtual {v4, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    move-object p3, v3

    .line 10
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "--->>> \u65e0\u72b6\u6001\u6536\u6570\u57df\u540d\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "MobclickRT"

    invoke-static {v4, v3}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x0

    .line 11
    :try_start_0
    new-instance v5, Ljava/net/URL;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {v5, p3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p3

    check-cast p3, Ljavax/net/ssl/HttpsURLConnection;
    :try_end_0
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    :try_start_1
    sget-object v5, Lorg/apache/http/conn/ssl/SSLSocketFactory;->STRICT_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    invoke-virtual {p3, v5}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    const-string v5, "TLS"

    .line 13
    invoke-static {v5}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v5

    .line 14
    new-instance v6, Ljava/security/SecureRandom;

    invoke-direct {v6}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v5, v3, v3, v6}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 15
    invoke-virtual {v5}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v5

    invoke-virtual {p3, v5}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    const-string v5, "X-Umeng-UTC"

    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p3, v5, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "Msg-Type"

    const-string v6, "envelope/json"

    .line 17
    invoke-virtual {p3, v5, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "Content-Type"

    .line 18
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "ut/"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, v5, p4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string p4, "SM-IMP"

    const-string v5, "1"

    .line 19
    invoke-virtual {p3, p4, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string p4, "User-Agent"

    .line 20
    invoke-static {}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getCustomAgt()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p3, p4, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p4, 0x7530

    .line 21
    invoke-virtual {p3, p4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 22
    invoke-virtual {p3, p4}, Ljava/net/URLConnection;->setReadTimeout(I)V

    const-string p4, "POST"

    .line 23
    invoke-virtual {p3, p4}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 24
    invoke-virtual {p3, v2}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 25
    invoke-virtual {p3, v2}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 26
    invoke-virtual {p3, v1}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 27
    invoke-virtual {p3}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v3

    .line 28
    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write([B)V

    .line 29
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V

    .line 30
    invoke-virtual {p3}, Ljava/net/URLConnection;->connect()V

    .line 31
    invoke-virtual {p3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p1

    const/16 p4, 0xc8

    if-ne p1, p4, :cond_3

    .line 32
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "--->>> send stateless message success : "

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p4, Lcom/umeng/commonsdk/stateless/a;->i:Ljava/lang/String;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, "/"

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move v1, v2

    .line 33
    :cond_3
    :try_start_2
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 34
    :catch_0
    :goto_2
    :try_start_3
    invoke-static {v4, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    invoke-virtual {p3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_5

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_4

    :catchall_1
    move-exception p1

    move-object p3, v3

    :goto_3
    :try_start_4
    const-string p2, "Exception,Failed to send message."

    .line 36
    invoke-static {p2, p1}, Lcom/umeng/commonsdk/statistics/common/MLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-eqz v3, :cond_4

    .line 37
    :try_start_5
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    :catch_2
    :cond_4
    if-eqz p3, :cond_6

    goto :goto_2

    :catch_3
    move-exception p1

    move-object p3, v3

    :goto_4
    :try_start_6
    const-string p2, "SSLHandshakeException, Failed to send message."

    .line 38
    invoke-static {p2, p1}, Lcom/umeng/commonsdk/statistics/common/MLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    if-eqz v3, :cond_5

    .line 39
    :try_start_7
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    :catch_4
    :cond_5
    if-eqz p3, :cond_6

    goto :goto_2

    :catchall_2
    :cond_6
    :goto_5
    return v1

    :catchall_3
    move-exception p1

    if-eqz v3, :cond_7

    :try_start_8
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5

    :catch_5
    :cond_7
    if-eqz p3, :cond_8

    .line 40
    :try_start_9
    invoke-static {v4, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    invoke-virtual {p3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 42
    :catchall_4
    :cond_8
    throw p1

    :cond_9
    :goto_6
    new-array p1, v2, [Ljava/lang/Object;

    const-string p2, "[stateless] sendMessage, envelopeByte == null || path == null "

    aput-object p2, p1, v1

    const-string p2, "walle"

    .line 43
    invoke-static {p2, p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    return v1
.end method
