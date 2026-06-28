.class public Lcom/huawei/agconnect/credential/obs/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/huawei/agconnect/credential/obs/h;

.field public static final b:I = 0x10

.field private static final c:Ljava/lang/String; = "KeyManager"

.field private static final d:I = 0x10

.field private static final e:I = 0x20

.field private static final f:I = 0x1388


# instance fields
.field fish:Ljava/lang/String;
    .annotation runtime Lcom/huawei/agconnect/datastore/annotation/SharedPreference;
        fileName = "com.huawei.appgallery.datastore"
        key = "fish"
    .end annotation
.end field

.field private g:Ljava/lang/String;

.field private h:Ljavax/crypto/SecretKey;

.field jerry:Ljava/lang/String;
    .annotation runtime Lcom/huawei/agconnect/datastore/annotation/SharedPreference;
        fileName = "com.huawei.agconnect.internal"
        key = "jerry"
    .end annotation
.end field

.field randmonKey:Ljava/lang/String;
    .annotation runtime Lcom/huawei/agconnect/datastore/annotation/SharedPreference;
        fileName = "com.huawei.appgallery.datastore"
        key = "key"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/agconnect/credential/obs/h;

    invoke-direct {v0}, Lcom/huawei/agconnect/credential/obs/h;-><init>()V

    sput-object v0, Lcom/huawei/agconnect/credential/obs/h;->a:Lcom/huawei/agconnect/credential/obs/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/agconnect/credential/obs/h;->g:Ljava/lang/String;

    return-void
.end method

.method private a(I)Ljava/lang/String;
    .locals 0

    div-int/lit8 p1, p1, 0x2

    invoke-static {p1}, Lcom/huawei/agconnect/common/api/RandomWrapper;->generateSecureRandom(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/huawei/secure/android/common/util/c;->b([B)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private static a(Ljava/lang/String;I)Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/huawei/secure/android/common/util/c;->c(Ljava/lang/String;)[B

    move-result-object p0

    if-eqz p0, :cond_3

    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_2

    if-gez p1, :cond_1

    aget-byte v1, p0, v0

    neg-int v2, p1

    shl-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    goto :goto_1

    :cond_1
    aget-byte v1, p0, v0

    shr-int/2addr v1, p1

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-static {p0}, Lcom/huawei/secure/android/common/util/c;->b([B)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_2
    const/4 p0, 0x0

    return-object p0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-static {p0}, Lcom/huawei/secure/android/common/util/c;->c(Ljava/lang/String;)[B

    move-result-object p0

    invoke-static {p1}, Lcom/huawei/secure/android/common/util/c;->c(Ljava/lang/String;)[B

    move-result-object p1

    if-eqz p0, :cond_2

    if-eqz p1, :cond_2

    array-length v0, p0

    array-length v1, p1

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    array-length v0, p0

    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-byte v3, p0, v2

    aget-byte v4, p1, v2

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lcom/huawei/secure/android/common/util/c;->b([B)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, -0x4

    invoke-static {p0, v0}, Lcom/huawei/agconnect/credential/obs/h;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1}, Lcom/huawei/agconnect/credential/obs/h;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x6

    invoke-static {p0, p1}, Lcom/huawei/agconnect/credential/obs/h;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p2}, Lcom/huawei/agconnect/credential/obs/h;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/SecretKey;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v1, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v1, :cond_0

    invoke-static {p0, p1, p2}, Lcom/huawei/agconnect/credential/obs/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "PBKDF2WithHmacSHA1"

    invoke-static {p1}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object p1

    new-instance p2, Ljavax/crypto/spec/PBEKeySpec;

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    invoke-static {p3}, Lcom/huawei/secure/android/common/util/c;->c(Ljava/lang/String;)[B

    move-result-object p3

    const/16 v0, 0x1388

    const/16 v1, 0x80

    invoke-direct {p2, p0, p3, v0, v1}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C[BII)V

    invoke-virtual {p1, p2}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object p0

    new-instance p1, Ljavax/crypto/spec/SecretKeySpec;

    invoke-interface {p0}, Ljava/security/Key;->getEncoded()[B

    move-result-object p0

    const-string p2, "AES"

    invoke-direct {p1, p0, p2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "invalid data for generating the key."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private a(Ljava/lang/String;)Z
    .locals 1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v0, 0x20

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private c()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/huawei/agconnect/credential/obs/i;->a()Lcom/huawei/agconnect/credential/obs/i;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/agconnect/credential/obs/i;->f(Lcom/huawei/agconnect/credential/obs/h;)V

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/h;->randmonKey:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/16 v1, 0x10

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/h;->randmonKey:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eq v0, v1, :cond_1

    :cond_0
    invoke-direct {p0, v1}, Lcom/huawei/agconnect/credential/obs/h;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/credential/obs/h;->randmonKey:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/agconnect/credential/obs/i;->a()Lcom/huawei/agconnect/credential/obs/i;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/agconnect/credential/obs/i;->b(Lcom/huawei/agconnect/credential/obs/h;)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/h;->randmonKey:Ljava/lang/String;

    return-object v0
.end method

.method private d()V
    .locals 4

    invoke-static {}, Lcom/huawei/agconnect/credential/obs/i;->a()Lcom/huawei/agconnect/credential/obs/i;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/agconnect/credential/obs/i;->h(Lcom/huawei/agconnect/credential/obs/h;)V

    invoke-static {}, Lcom/huawei/agconnect/credential/obs/i;->a()Lcom/huawei/agconnect/credential/obs/i;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/agconnect/credential/obs/i;->g(Lcom/huawei/agconnect/credential/obs/h;)V

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/h;->jerry:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/agconnect/credential/obs/h;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/h;->fish:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/agconnect/credential/obs/h;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/16 v0, 0x20

    invoke-direct {p0, v0}, Lcom/huawei/agconnect/credential/obs/h;->a(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/huawei/agconnect/credential/obs/h;->jerry:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/agconnect/credential/obs/h;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/credential/obs/h;->fish:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/agconnect/credential/obs/i;->a()Lcom/huawei/agconnect/credential/obs/i;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/agconnect/credential/obs/i;->c(Lcom/huawei/agconnect/credential/obs/h;)V

    invoke-static {}, Lcom/huawei/agconnect/credential/obs/i;->a()Lcom/huawei/agconnect/credential/obs/i;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/agconnect/credential/obs/i;->d(Lcom/huawei/agconnect/credential/obs/h;)V

    :cond_1
    :try_start_0
    invoke-static {}, Lcom/huawei/agconnect/credential/obs/x;->d()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/agconnect/credential/obs/h;->jerry:Ljava/lang/String;

    const-string v2, "767d9b01105c2acd25fb7955a5394f78"

    iget-object v3, p0, Lcom/huawei/agconnect/credential/obs/h;->fish:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/agconnect/credential/obs/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/SecretKey;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/credential/obs/h;->h:Ljavax/crypto/SecretKey;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "KeyManager"

    const-string v1, "Exception when reading the \'T&J&C&F\' for \'KeyManager\'."

    invoke-static {v0, v1}, Lcom/huawei/agconnect/common/api/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/agconnect/credential/obs/h;->h:Ljavax/crypto/SecretKey;

    :goto_0
    return-void
.end method


# virtual methods
.method public declared-synchronized a()Ljava/lang/String;
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/h;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/agconnect/credential/obs/x;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v1}, Lcom/huawei/agconnect/credential/obs/h;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/huawei/agconnect/credential/obs/g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/agconnect/credential/obs/h;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "AE6D8285"

    const/4 v2, -0x4

    invoke-static {v1, v2}, Lcom/huawei/agconnect/credential/obs/h;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "4D5480E9"

    invoke-static {v1, v2}, Lcom/huawei/agconnect/credential/obs/h;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/huawei/agconnect/credential/obs/h;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/credential/obs/h;->g:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/h;->g:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()Ljavax/crypto/SecretKey;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/h;->h:Ljavax/crypto/SecretKey;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/agconnect/credential/obs/h;->d()V

    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/h;->h:Ljavax/crypto/SecretKey;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
