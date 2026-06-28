.class public Lcom/huawei/secure/android/common/ssl/m;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/secure/android/common/ssl/m$a;
    }
.end annotation


# static fields
.field private static final i:Ljava/lang/String; = "m"


# instance fields
.field private a:Ljavax/net/ssl/SSLSocketFactory;

.field private b:Ljavax/net/ssl/HostnameVerifier;

.field private c:Lorg/apache/http/conn/ssl/SSLSocketFactory;

.field private d:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

.field private e:Landroid/webkit/SslErrorHandler;

.field private f:Ljava/lang/String;

.field private g:Lcom/huawei/secure/android/common/ssl/m$a;

.field private h:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/webkit/SslErrorHandler;Ljava/lang/String;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/io/IOException;,
            Ljava/security/KeyManagementException;,
            Ljava/security/KeyStoreException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 3
    invoke-virtual {p0, p1}, Lcom/huawei/secure/android/common/ssl/m;->s(Landroid/webkit/SslErrorHandler;)V

    .line 4
    invoke-virtual {p0, p2}, Lcom/huawei/secure/android/common/ssl/m;->u(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0, p3}, Lcom/huawei/secure/android/common/ssl/m;->q(Landroid/content/Context;)V

    .line 6
    new-instance p1, Lcom/huawei/secure/android/common/ssl/i;

    new-instance p2, Lcom/huawei/secure/android/common/ssl/p;

    invoke-direct {p2, p3}, Lcom/huawei/secure/android/common/ssl/p;-><init>(Landroid/content/Context;)V

    invoke-direct {p1, p2}, Lcom/huawei/secure/android/common/ssl/i;-><init>(Ljavax/net/ssl/X509TrustManager;)V

    invoke-virtual {p0, p1}, Lcom/huawei/secure/android/common/ssl/m;->t(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 7
    new-instance p1, Li2/b;

    invoke-direct {p1}, Li2/b;-><init>()V

    invoke-virtual {p0, p1}, Lcom/huawei/secure/android/common/ssl/m;->r(Ljavax/net/ssl/HostnameVerifier;)V

    .line 8
    :try_start_0
    new-instance p1, Lcom/huawei/secure/android/common/ssl/g;

    new-instance p2, Lcom/huawei/secure/android/common/ssl/p;

    invoke-direct {p2, p3}, Lcom/huawei/secure/android/common/ssl/p;-><init>(Landroid/content/Context;)V

    const/4 p3, 0x0

    invoke-direct {p1, p3, p2}, Lcom/huawei/secure/android/common/ssl/g;-><init>(Ljava/security/KeyStore;Ljavax/net/ssl/X509TrustManager;)V

    invoke-virtual {p0, p1}, Lcom/huawei/secure/android/common/ssl/m;->o(Lorg/apache/http/conn/ssl/SSLSocketFactory;)V
    :try_end_0
    .catch Ljava/security/UnrecoverableKeyException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    sget-object p2, Lcom/huawei/secure/android/common/ssl/m;->i:Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "WebViewSSLCheckThread: UnrecoverableKeyException : "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/huawei/secure/android/common/ssl/util/i;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    :goto_0
    sget-object p1, Lcom/huawei/secure/android/common/ssl/g;->j:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    invoke-virtual {p0, p1}, Lcom/huawei/secure/android/common/ssl/m;->n(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V

    return-void
.end method

.method public constructor <init>(Landroid/webkit/SslErrorHandler;Ljava/lang/String;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 11
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 12
    invoke-virtual {p0, p1}, Lcom/huawei/secure/android/common/ssl/m;->s(Landroid/webkit/SslErrorHandler;)V

    .line 13
    invoke-virtual {p0, p2}, Lcom/huawei/secure/android/common/ssl/m;->u(Ljava/lang/String;)V

    .line 14
    invoke-virtual {p0, p3}, Lcom/huawei/secure/android/common/ssl/m;->t(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 15
    invoke-virtual {p0, p4}, Lcom/huawei/secure/android/common/ssl/m;->r(Ljavax/net/ssl/HostnameVerifier;)V

    return-void
.end method

.method public constructor <init>(Landroid/webkit/SslErrorHandler;Ljava/lang/String;Lorg/apache/http/conn/ssl/SSLSocketFactory;Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 16
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 17
    invoke-virtual {p0, p1}, Lcom/huawei/secure/android/common/ssl/m;->s(Landroid/webkit/SslErrorHandler;)V

    .line 18
    invoke-virtual {p0, p2}, Lcom/huawei/secure/android/common/ssl/m;->u(Ljava/lang/String;)V

    .line 19
    invoke-virtual {p0, p3}, Lcom/huawei/secure/android/common/ssl/m;->o(Lorg/apache/http/conn/ssl/SSLSocketFactory;)V

    .line 20
    invoke-virtual {p0, p4}, Lcom/huawei/secure/android/common/ssl/m;->n(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V

    return-void
.end method

.method public constructor <init>(Landroid/webkit/SslErrorHandler;Ljava/lang/String;Lorg/apache/http/conn/ssl/SSLSocketFactory;Lorg/apache/http/conn/ssl/X509HostnameVerifier;Lcom/huawei/secure/android/common/ssl/m$a;Landroid/content/Context;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/huawei/secure/android/common/ssl/m;->e:Landroid/webkit/SslErrorHandler;

    .line 23
    iput-object p2, p0, Lcom/huawei/secure/android/common/ssl/m;->f:Ljava/lang/String;

    .line 24
    iput-object p3, p0, Lcom/huawei/secure/android/common/ssl/m;->c:Lorg/apache/http/conn/ssl/SSLSocketFactory;

    .line 25
    iput-object p4, p0, Lcom/huawei/secure/android/common/ssl/m;->d:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    .line 26
    iput-object p5, p0, Lcom/huawei/secure/android/common/ssl/m;->g:Lcom/huawei/secure/android/common/ssl/m$a;

    .line 27
    iput-object p6, p0, Lcom/huawei/secure/android/common/ssl/m;->h:Landroid/content/Context;

    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/huawei/secure/android/common/ssl/m;->i:Ljava/lang/String;

    return-object v0
.end method

.method private b()V
    .locals 3

    .line 1
    sget-object v0, Lcom/huawei/secure/android/common/ssl/m;->i:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "callbackCancel: "

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/huawei/secure/android/common/ssl/util/i;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/huawei/secure/android/common/ssl/m;->g:Lcom/huawei/secure/android/common/ssl/m$a;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/huawei/secure/android/common/ssl/m;->h:Landroid/content/Context;

    .line 13
    .line 14
    iget-object v2, p0, Lcom/huawei/secure/android/common/ssl/m;->f:Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface {v1, v0, v2}, Lcom/huawei/secure/android/common/ssl/m$a;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v1, p0, Lcom/huawei/secure/android/common/ssl/m;->e:Landroid/webkit/SslErrorHandler;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    const-string v1, "callbackCancel 2: "

    .line 25
    .line 26
    invoke-static {v0, v1}, Lcom/huawei/secure/android/common/ssl/util/i;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/huawei/secure/android/common/ssl/m;->e:Landroid/webkit/SslErrorHandler;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/webkit/SslErrorHandler;->cancel()V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
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
.end method

.method private c()V
    .locals 3

    .line 1
    sget-object v0, Lcom/huawei/secure/android/common/ssl/m;->i:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "callbackProceed: "

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/huawei/secure/android/common/ssl/util/i;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/huawei/secure/android/common/ssl/m;->g:Lcom/huawei/secure/android/common/ssl/m$a;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/huawei/secure/android/common/ssl/m;->h:Landroid/content/Context;

    .line 13
    .line 14
    iget-object v2, p0, Lcom/huawei/secure/android/common/ssl/m;->f:Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface {v0, v1, v2}, Lcom/huawei/secure/android/common/ssl/m$a;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/huawei/secure/android/common/ssl/m;->e:Landroid/webkit/SslErrorHandler;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/webkit/SslErrorHandler;->proceed()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
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
.end method

.method public static d(Landroid/webkit/SslErrorHandler;Ljava/lang/String;Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lcom/huawei/secure/android/common/ssl/m;->e(Landroid/webkit/SslErrorHandler;Ljava/lang/String;Landroid/content/Context;Lcom/huawei/secure/android/common/ssl/m$a;)V

    return-void
.end method

.method public static e(Landroid/webkit/SslErrorHandler;Ljava/lang/String;Landroid/content/Context;Lcom/huawei/secure/android/common/ssl/m$a;)V
    .locals 3

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    goto :goto_3

    .line 12
    :cond_0
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    .line 13
    .line 14
    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 15
    .line 16
    .line 17
    :try_start_0
    new-instance v1, Lcom/huawei/secure/android/common/ssl/i;

    .line 18
    .line 19
    new-instance v2, Lcom/huawei/secure/android/common/ssl/p;

    .line 20
    .line 21
    invoke-direct {v2, p2}, Lcom/huawei/secure/android/common/ssl/p;-><init>(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, v2}, Lcom/huawei/secure/android/common/ssl/i;-><init>(Ljavax/net/ssl/X509TrustManager;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p2}, Lcom/huawei/secure/android/common/ssl/i;->l(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    new-instance v2, Lcom/huawei/secure/android/common/ssl/p;

    .line 31
    .line 32
    invoke-direct {v2, p2}, Lcom/huawei/secure/android/common/ssl/p;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Lokhttp3/OkHttpClient$Builder;->sslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/OkHttpClient$Builder;

    .line 36
    .line 37
    .line 38
    new-instance v1, Li2/b;

    .line 39
    .line 40
    invoke-direct {v1}, Li2/b;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->hostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)Lokhttp3/OkHttpClient$Builder;

    .line 44
    .line 45
    .line 46
    new-instance v1, Lokhttp3/Request$Builder;

    .line 47
    .line 48
    invoke-direct {v1}, Lokhttp3/Request$Builder;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    instance-of v2, v1, Lokhttp3/Request$Builder;

    .line 56
    .line 57
    if-nez v2, :cond_1

    .line 58
    .line 59
    invoke-virtual {v1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-static {v1}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->build(Lokhttp3/Request$Builder;)Lokhttp3/Request;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    :goto_0
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->build(Lokhttp3/OkHttpClient$Builder;)Lokhttp3/OkHttpClient;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    instance-of v2, v0, Lokhttp3/OkHttpClient;

    .line 73
    .line 74
    if-nez v2, :cond_2

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    goto :goto_1

    .line 81
    :cond_2
    invoke-static {v0, v1}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->newCall(Lokhttp3/OkHttpClient;Lokhttp3/Request;)Lokhttp3/Call;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    :goto_1
    new-instance v1, Lcom/huawei/secure/android/common/ssl/m$b;

    .line 86
    .line 87
    invoke-direct {v1, p3, p2, p1, p0}, Lcom/huawei/secure/android/common/ssl/m$b;-><init>(Lcom/huawei/secure/android/common/ssl/m$a;Landroid/content/Context;Ljava/lang/String;Landroid/webkit/SslErrorHandler;)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v0, v1}, Lokhttp3/Call;->enqueue(Lokhttp3/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :catch_0
    move-exception p1

    .line 95
    sget-object p2, Lcom/huawei/secure/android/common/ssl/m;->i:Ljava/lang/String;

    .line 96
    .line 97
    new-instance p3, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string v0, "checkServerCertificateWithOK: exception : "

    .line 103
    .line 104
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {p2, p1}, Lcom/huawei/secure/android/common/ssl/util/i;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Landroid/webkit/SslErrorHandler;->cancel()V

    .line 122
    .line 123
    .line 124
    :goto_2
    return-void

    .line 125
    :cond_3
    :goto_3
    sget-object p0, Lcom/huawei/secure/android/common/ssl/m;->i:Ljava/lang/String;

    .line 126
    .line 127
    const-string p1, "checkServerCertificateWithOK: handler or url or context is null"

    .line 128
    .line 129
    invoke-static {p0, p1}, Lcom/huawei/secure/android/common/ssl/util/i;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-void
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method


# virtual methods
.method public f()Lorg/apache/http/conn/ssl/X509HostnameVerifier;
    .locals 1

    iget-object v0, p0, Lcom/huawei/secure/android/common/ssl/m;->d:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    return-object v0
.end method

.method public g()Lorg/apache/http/conn/ssl/SSLSocketFactory;
    .locals 1

    iget-object v0, p0, Lcom/huawei/secure/android/common/ssl/m;->c:Lorg/apache/http/conn/ssl/SSLSocketFactory;

    return-object v0
.end method

.method public h()Lcom/huawei/secure/android/common/ssl/m$a;
    .locals 1

    iget-object v0, p0, Lcom/huawei/secure/android/common/ssl/m;->g:Lcom/huawei/secure/android/common/ssl/m$a;

    return-object v0
.end method

.method public i()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/huawei/secure/android/common/ssl/m;->h:Landroid/content/Context;

    return-object v0
.end method

.method public j()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    iget-object v0, p0, Lcom/huawei/secure/android/common/ssl/m;->b:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method public k()Landroid/webkit/SslErrorHandler;
    .locals 1

    iget-object v0, p0, Lcom/huawei/secure/android/common/ssl/m;->e:Landroid/webkit/SslErrorHandler;

    return-object v0
.end method

.method public l()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    iget-object v0, p0, Lcom/huawei/secure/android/common/ssl/m;->a:Ljavax/net/ssl/SSLSocketFactory;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/secure/android/common/ssl/m;->f:Ljava/lang/String;

    return-object v0
.end method

.method public n(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/secure/android/common/ssl/m;->d:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    return-void
.end method

.method public o(Lorg/apache/http/conn/ssl/SSLSocketFactory;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/secure/android/common/ssl/m;->c:Lorg/apache/http/conn/ssl/SSLSocketFactory;

    return-void
.end method

.method public p(Lcom/huawei/secure/android/common/ssl/m$a;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/secure/android/common/ssl/m;->g:Lcom/huawei/secure/android/common/ssl/m$a;

    return-void
.end method

.method public q(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/secure/android/common/ssl/m;->h:Landroid/content/Context;

    return-void
.end method

.method public r(Ljavax/net/ssl/HostnameVerifier;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/secure/android/common/ssl/m;->b:Ljavax/net/ssl/HostnameVerifier;

    return-void
.end method

.method public run()V
    .locals 8

    .line 1
    invoke-super {p0}, Ljava/lang/Thread;->run()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/huawei/secure/android/common/ssl/m;->c:Lorg/apache/http/conn/ssl/SSLSocketFactory;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Lcom/huawei/secure/android/common/ssl/m;->d:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    iget-object v0, p0, Lcom/huawei/secure/android/common/ssl/m;->e:Landroid/webkit/SslErrorHandler;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lcom/huawei/secure/android/common/ssl/m;->f:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto/16 :goto_1

    .line 26
    .line 27
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/secure/android/common/ssl/m;->c:Lorg/apache/http/conn/ssl/SSLSocketFactory;

    .line 28
    .line 29
    iget-object v2, p0, Lcom/huawei/secure/android/common/ssl/m;->d:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->setHostnameVerifier(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/huawei/secure/android/common/ssl/m;->c:Lorg/apache/http/conn/ssl/SSLSocketFactory;

    .line 35
    .line 36
    instance-of v2, v0, Lcom/huawei/secure/android/common/ssl/g;

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    check-cast v0, Lcom/huawei/secure/android/common/ssl/g;

    .line 41
    .line 42
    iget-object v2, p0, Lcom/huawei/secure/android/common/ssl/m;->h:Landroid/content/Context;

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Lcom/huawei/secure/android/common/ssl/g;->n(Landroid/content/Context;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    new-instance v0, Lorg/apache/http/params/BasicHttpParams;

    .line 48
    .line 49
    invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 50
    .line 51
    .line 52
    const/16 v2, 0x7530

    .line 53
    .line 54
    invoke-static {v0, v2}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v2}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 58
    .line 59
    .line 60
    new-instance v2, Lorg/apache/http/conn/scheme/SchemeRegistry;

    .line 61
    .line 62
    invoke-direct {v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V

    .line 63
    .line 64
    .line 65
    new-instance v3, Lorg/apache/http/conn/scheme/Scheme;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    const-string v4, "https"

    .line 68
    .line 69
    :try_start_1
    iget-object v5, p0, Lcom/huawei/secure/android/common/ssl/m;->c:Lorg/apache/http/conn/ssl/SSLSocketFactory;

    .line 70
    .line 71
    const/16 v6, 0x1bb

    .line 72
    .line 73
    invoke-direct {v3, v4, v5, v6}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v3}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 77
    .line 78
    .line 79
    new-instance v3, Lorg/apache/http/conn/scheme/Scheme;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    .line 81
    const-string v4, "http"

    .line 82
    .line 83
    :try_start_2
    invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    const/16 v6, 0x50

    .line 88
    .line 89
    invoke-direct {v3, v4, v5, v6}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v3}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 93
    .line 94
    .line 95
    new-instance v3, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;

    .line 96
    .line 97
    invoke-direct {v3, v0, v2}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V

    .line 98
    .line 99
    .line 100
    new-instance v2, Lorg/apache/http/impl/client/DefaultHttpClient;

    .line 101
    .line 102
    invoke-direct {v2, v3, v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V

    .line 103
    .line 104
    .line 105
    new-instance v0, Lorg/apache/http/client/methods/HttpGet;

    .line 106
    .line 107
    invoke-direct {v0}, Lorg/apache/http/client/methods/HttpGet;-><init>()V

    .line 108
    .line 109
    .line 110
    new-instance v3, Ljava/net/URI;

    .line 111
    .line 112
    iget-object v4, p0, Lcom/huawei/secure/android/common/ssl/m;->f:Ljava/lang/String;

    .line 113
    .line 114
    invoke-direct {v3, v4}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v3}, Lorg/apache/http/client/methods/HttpGet;->setURI(Ljava/net/URI;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v2, v0}, Lcom/huawei/agconnect/apms/instrument/apacheclient/ApacheClientInstrumentation;->execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    sget-object v2, Lcom/huawei/secure/android/common/ssl/m;->i:Ljava/lang/String;

    .line 125
    .line 126
    new-instance v3, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v4, "status code is : "

    .line 132
    .line 133
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-static {v2, v0}, Lcom/huawei/secure/android/common/ssl/util/i;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 152
    .line 153
    .line 154
    invoke-static {v1}, Lcom/huawei/secure/android/common/ssl/util/h;->i(Ljava/io/Reader;)V

    .line 155
    .line 156
    .line 157
    invoke-direct {p0}, Lcom/huawei/secure/android/common/ssl/m;->c()V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :catchall_0
    move-exception v0

    .line 162
    goto :goto_0

    .line 163
    :catch_0
    move-exception v0

    .line 164
    :try_start_3
    sget-object v2, Lcom/huawei/secure/android/common/ssl/m;->i:Ljava/lang/String;

    .line 165
    .line 166
    new-instance v3, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    const-string v4, "run: exception : "

    .line 172
    .line 173
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-static {v2, v0}, Lcom/huawei/secure/android/common/ssl/util/i;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-direct {p0}, Lcom/huawei/secure/android/common/ssl/m;->b()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 191
    .line 192
    .line 193
    invoke-static {v1}, Lcom/huawei/secure/android/common/ssl/util/h;->i(Ljava/io/Reader;)V

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :goto_0
    invoke-static {v1}, Lcom/huawei/secure/android/common/ssl/util/h;->i(Ljava/io/Reader;)V

    .line 198
    .line 199
    .line 200
    throw v0

    .line 201
    :cond_2
    :goto_1
    sget-object v0, Lcom/huawei/secure/android/common/ssl/m;->i:Ljava/lang/String;

    .line 202
    .line 203
    const-string v1, "sslErrorHandler or url is null"

    .line 204
    .line 205
    invoke-static {v0, v1}, Lcom/huawei/secure/android/common/ssl/util/i;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-direct {p0}, Lcom/huawei/secure/android/common/ssl/m;->b()V

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :cond_3
    iget-object v0, p0, Lcom/huawei/secure/android/common/ssl/m;->a:Ljavax/net/ssl/SSLSocketFactory;

    .line 213
    .line 214
    if-eqz v0, :cond_8

    .line 215
    .line 216
    iget-object v0, p0, Lcom/huawei/secure/android/common/ssl/m;->b:Ljavax/net/ssl/HostnameVerifier;

    .line 217
    .line 218
    if-eqz v0, :cond_8

    .line 219
    .line 220
    :try_start_4
    new-instance v0, Ljava/net/URL;

    .line 221
    .line 222
    iget-object v2, p0, Lcom/huawei/secure/android/common/ssl/m;->f:Ljava/lang/String;

    .line 223
    .line 224
    invoke-direct {v0, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    instance-of v2, v0, Ljavax/net/ssl/HttpsURLConnection;

    .line 232
    .line 233
    if-eqz v2, :cond_4

    .line 234
    .line 235
    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 236
    .line 237
    :try_start_5
    iget-object v1, p0, Lcom/huawei/secure/android/common/ssl/m;->a:Ljavax/net/ssl/SSLSocketFactory;

    .line 238
    .line 239
    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 240
    .line 241
    .line 242
    iget-object v1, p0, Lcom/huawei/secure/android/common/ssl/m;->b:Ljavax/net/ssl/HostnameVerifier;

    .line 243
    .line 244
    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 245
    .line 246
    .line 247
    const-string v1, "GET"

    .line 248
    .line 249
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    const/16 v1, 0x2710

    .line 253
    .line 254
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 255
    .line 256
    .line 257
    const/16 v1, 0x4e20

    .line 258
    .line 259
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 263
    .line 264
    .line 265
    move-object v1, v0

    .line 266
    goto :goto_2

    .line 267
    :catch_1
    move-exception v1

    .line 268
    goto :goto_3

    .line 269
    :cond_4
    :goto_2
    if-eqz v1, :cond_5

    .line 270
    .line 271
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 272
    .line 273
    .line 274
    :cond_5
    invoke-direct {p0}, Lcom/huawei/secure/android/common/ssl/m;->c()V

    .line 275
    .line 276
    .line 277
    return-void

    .line 278
    :catchall_1
    move-exception v0

    .line 279
    move-object v7, v1

    .line 280
    move-object v1, v0

    .line 281
    move-object v0, v7

    .line 282
    goto :goto_4

    .line 283
    :catch_2
    move-exception v0

    .line 284
    move-object v7, v1

    .line 285
    move-object v1, v0

    .line 286
    move-object v0, v7

    .line 287
    :goto_3
    :try_start_6
    sget-object v2, Lcom/huawei/secure/android/common/ssl/m;->i:Ljava/lang/String;

    .line 288
    .line 289
    new-instance v3, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 292
    .line 293
    .line 294
    const-string v4, "exception : "

    .line 295
    .line 296
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    invoke-static {v2, v1}, Lcom/huawei/secure/android/common/ssl/util/i;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-direct {p0}, Lcom/huawei/secure/android/common/ssl/m;->b()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 314
    .line 315
    .line 316
    if-eqz v0, :cond_6

    .line 317
    .line 318
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 319
    .line 320
    .line 321
    :cond_6
    return-void

    .line 322
    :catchall_2
    move-exception v1

    .line 323
    :goto_4
    if-eqz v0, :cond_7

    .line 324
    .line 325
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 326
    .line 327
    .line 328
    :cond_7
    throw v1

    .line 329
    :cond_8
    invoke-direct {p0}, Lcom/huawei/secure/android/common/ssl/m;->b()V

    .line 330
    .line 331
    .line 332
    return-void
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method

.method public s(Landroid/webkit/SslErrorHandler;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/secure/android/common/ssl/m;->e:Landroid/webkit/SslErrorHandler;

    return-void
.end method

.method public t(Ljavax/net/ssl/SSLSocketFactory;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/secure/android/common/ssl/m;->a:Ljavax/net/ssl/SSLSocketFactory;

    return-void
.end method

.method public u(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/secure/android/common/ssl/m;->f:Ljava/lang/String;

    return-void
.end method
