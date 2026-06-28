.class public Lcom/huawei/secure/android/common/ssl/util/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/String; = "X509CertificateUtil"

.field public static final c:Ljava/lang/String; = "hmsrootcas.bks"

.field public static final d:Ljava/lang/String; = ""

.field public static final e:Ljava/lang/String; = "bks"

.field public static final f:Ljava/lang/String; = "052root"

.field private static final g:Ljava/lang/String; = "hmsincas.bks"

.field private static final h:Ljava/lang/String; = "huawei cbg application integration ca"


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/huawei/secure/android/common/ssl/util/l;->a:Landroid/content/Context;

    .line 5
    .line 6
    return-void
    .line 7
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public a()Ljava/security/cert/X509Certificate;
    .locals 2

    .line 1
    const-string v0, "hmsincas.bks"

    .line 2
    .line 3
    const-string v1, "huawei cbg application integration ca"

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/huawei/secure/android/common/ssl/util/l;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/security/cert/X509Certificate;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
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
    .line 22
    .line 23
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Ljava/security/cert/X509Certificate;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "bks"

    .line 3
    .line 4
    invoke-static {v1}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v2, p0, Lcom/huawei/secure/android/common/ssl/util/l;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 15
    .line 16
    .line 17
    move-result-object p1
    :try_end_0
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    :try_start_1
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 19
    .line 20
    .line 21
    const-string v2, ""

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1, p1, v2}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p2}, Ljava/security/KeyStore;->getCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    check-cast p2, Ljava/security/cert/X509Certificate;
    :try_end_1
    .catch Ljava/security/KeyStoreException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/security/cert/CertificateException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    .line 36
    move-object v0, p2

    .line 37
    goto :goto_2

    .line 38
    :catch_0
    move-exception p2

    .line 39
    goto :goto_1

    .line 40
    :catch_1
    move-exception p2

    .line 41
    goto :goto_1

    .line 42
    :catch_2
    move-exception p2

    .line 43
    goto :goto_1

    .line 44
    :catch_3
    move-exception p2

    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p2

    .line 47
    goto :goto_3

    .line 48
    :catch_4
    move-exception p2

    .line 49
    :goto_0
    move-object p1, v0

    .line 50
    goto :goto_1

    .line 51
    :catch_5
    move-exception p2

    .line 52
    goto :goto_0

    .line 53
    :catch_6
    move-exception p2

    .line 54
    goto :goto_0

    .line 55
    :catch_7
    move-exception p2

    .line 56
    goto :goto_0

    .line 57
    :goto_1
    const-string v1, "X509CertificateUtil"

    .line 58
    .line 59
    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v3, "loadBksCA: exception : "

    .line 65
    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-static {v1, p2}, Lcom/huawei/secure/android/common/ssl/util/i;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 81
    .line 82
    .line 83
    :goto_2
    invoke-static {p1}, Lcom/huawei/secure/android/common/ssl/util/h;->g(Ljava/io/InputStream;)V

    .line 84
    .line 85
    .line 86
    return-object v0

    .line 87
    :catchall_1
    move-exception p2

    .line 88
    move-object v0, p1

    .line 89
    :goto_3
    invoke-static {v0}, Lcom/huawei/secure/android/common/ssl/util/h;->g(Ljava/io/InputStream;)V

    .line 90
    .line 91
    .line 92
    throw p2
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
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
.end method

.method public c()Ljava/security/cert/X509Certificate;
    .locals 2

    .line 1
    const-string v0, "hmsrootcas.bks"

    .line 2
    .line 3
    const-string v1, "052root"

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/huawei/secure/android/common/ssl/util/l;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/security/cert/X509Certificate;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
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
    .line 22
    .line 23
.end method
