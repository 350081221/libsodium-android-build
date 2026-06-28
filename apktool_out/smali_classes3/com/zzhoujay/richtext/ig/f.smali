.class public Lcom/zzhoujay/richtext/ig/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zzhoujay/richtext/ig/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zzhoujay/richtext/ig/f$c;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "com.zzhoujay.richtext.ig.f"

.field private static b:Ljavax/net/ssl/SSLContext;

.field private static c:Ljavax/net/ssl/HostnameVerifier;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/zzhoujay/richtext/ig/f$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zzhoujay/richtext/ig/f$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zzhoujay/richtext/ig/f;->c:Ljavax/net/ssl/HostnameVerifier;

    .line 7
    .line 8
    new-instance v0, Lcom/zzhoujay/richtext/ig/f$b;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zzhoujay/richtext/ig/f$b;-><init>()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    const-string v1, "SSL"

    .line 14
    .line 15
    invoke-static {v1}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sput-object v1, Lcom/zzhoujay/richtext/ig/f;->b:Ljavax/net/ssl/SSLContext;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    new-array v2, v2, [Ljavax/net/ssl/TrustManager;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    aput-object v0, v2, v3

    .line 26
    .line 27
    new-instance v0, Ljava/security/SecureRandom;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 30
    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-virtual {v1, v3, v2, v0}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catch_0
    move-exception v0

    .line 38
    goto :goto_0

    .line 39
    :catch_1
    move-exception v0

    .line 40
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 41
    .line 42
    .line 43
    :goto_1
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic b()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    sget-object v0, Lcom/zzhoujay/richtext/ig/f;->c:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method static synthetic c()Ljavax/net/ssl/SSLContext;
    .locals 1

    sget-object v0, Lcom/zzhoujay/richtext/ig/f;->b:Ljavax/net/ssl/SSLContext;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Le3/a;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lcom/zzhoujay/richtext/ig/f$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/zzhoujay/richtext/ig/f$c;-><init>(Ljava/lang/String;Lcom/zzhoujay/richtext/ig/f$a;)V

    return-object v0
.end method
