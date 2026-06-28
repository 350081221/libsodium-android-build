.class public final Lcom/tendcloud/tenddata/as;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:[B

.field private static volatile b:I

.field private static volatile c:Ljavax/crypto/spec/IvParameterSpec;

.field private static volatile d:[B

.field private static volatile e:Ljavax/crypto/SecretKey;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    sput-object v0, Lcom/tendcloud/tenddata/as;->a:[B

    .line 5
    .line 6
    const-class v0, Landroid/util/EventLogTags;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    sget v1, Lcom/tendcloud/tenddata/as;->b:I

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lcom/tendcloud/tenddata/aw;->a()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sput v1, Lcom/tendcloud/tenddata/as;->b:I

    .line 18
    .line 19
    :cond_0
    sget-object v1, Lcom/tendcloud/tenddata/as;->c:Ljavax/crypto/spec/IvParameterSpec;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    invoke-static {}, Lcom/tendcloud/tenddata/au;->a()Ljavax/crypto/spec/IvParameterSpec;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sput-object v1, Lcom/tendcloud/tenddata/as;->c:Ljavax/crypto/spec/IvParameterSpec;

    .line 28
    .line 29
    :cond_1
    sget-object v1, Lcom/tendcloud/tenddata/as;->d:[B

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    invoke-static {}, Lcom/tendcloud/tenddata/au;->b()[B

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sput-object v1, Lcom/tendcloud/tenddata/as;->d:[B

    .line 38
    .line 39
    :cond_2
    sget-object v1, Lcom/tendcloud/tenddata/as;->e:Ljavax/crypto/SecretKey;

    .line 40
    .line 41
    if-nez v1, :cond_3

    .line 42
    .line 43
    sget v1, Lcom/tendcloud/tenddata/as;->b:I

    .line 44
    .line 45
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    sget-object v2, Lcom/tendcloud/tenddata/as;->d:[B

    .line 54
    .line 55
    invoke-static {v1, v2}, Lcom/tendcloud/tenddata/au;->a([C[B)Ljavax/crypto/SecretKey;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    sput-object v1, Lcom/tendcloud/tenddata/as;->e:Ljavax/crypto/SecretKey;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    :catchall_0
    :cond_3
    :try_start_1
    monitor-exit v0

    .line 62
    return-void

    .line 63
    :catchall_1
    move-exception v1

    .line 64
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 65
    throw v1
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

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([B)[B
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/as;->e:Ljavax/crypto/SecretKey;

    .line 2
    .line 3
    sget-object v1, Lcom/tendcloud/tenddata/as;->c:Ljavax/crypto/spec/IvParameterSpec;

    .line 4
    .line 5
    invoke-static {p0, v0, v1}, Lcom/tendcloud/tenddata/au;->a([BLjavax/crypto/SecretKey;Ljavax/crypto/spec/IvParameterSpec;)[B

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    return-object p0

    .line 10
    :catchall_0
    sget-object p0, Lcom/tendcloud/tenddata/as;->a:[B

    .line 11
    .line 12
    return-object p0
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

.method public static b([B)[B
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/as;->e:Ljavax/crypto/SecretKey;

    .line 2
    .line 3
    sget-object v1, Lcom/tendcloud/tenddata/as;->c:Ljavax/crypto/spec/IvParameterSpec;

    .line 4
    .line 5
    invoke-static {p0, v0, v1}, Lcom/tendcloud/tenddata/au;->b([BLjavax/crypto/SecretKey;Ljavax/crypto/spec/IvParameterSpec;)[B

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    return-object p0

    .line 10
    :catchall_0
    sget-object p0, Lcom/tendcloud/tenddata/as;->a:[B

    .line 11
    .line 12
    return-object p0
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
