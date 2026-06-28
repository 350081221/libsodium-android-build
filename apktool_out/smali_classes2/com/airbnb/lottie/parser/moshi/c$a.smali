.class public final Lcom/airbnb/lottie/parser/moshi/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/lottie/parser/moshi/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field final a:[Ljava/lang/String;

.field final b:Lokio/b1;


# direct methods
.method private constructor <init>([Ljava/lang/String;Lokio/b1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/airbnb/lottie/parser/moshi/c$a;->a:[Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/airbnb/lottie/parser/moshi/c$a;->b:Lokio/b1;

    .line 7
    .line 8
    return-void
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
.end method

.method public static varargs a([Ljava/lang/String;)Lcom/airbnb/lottie/parser/moshi/c$a;
    .locals 4

    .line 1
    :try_start_0
    array-length v0, p0

    .line 2
    new-array v0, v0, [Lokio/n;

    .line 3
    .line 4
    new-instance v1, Lokio/l;

    .line 5
    .line 6
    invoke-direct {v1}, Lokio/l;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    array-length v3, p0

    .line 11
    if-ge v2, v3, :cond_0

    .line 12
    .line 13
    aget-object v3, p0, v2

    .line 14
    .line 15
    invoke-static {v1, v3}, Lcom/airbnb/lottie/parser/moshi/c;->a(Lokio/m;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lokio/l;->readByte()B

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lokio/l;->m0()Lokio/n;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    aput-object v3, v0, v2

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v1, Lcom/airbnb/lottie/parser/moshi/c$a;

    .line 31
    .line 32
    invoke-virtual {p0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, [Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0}, Lokio/b1;->k([Lokio/n;)Lokio/b1;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-direct {v1, p0, v0}, Lcom/airbnb/lottie/parser/moshi/c$a;-><init>([Ljava/lang/String;Lokio/b1;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    return-object v1

    .line 46
    :catch_0
    move-exception p0

    .line 47
    new-instance v0, Ljava/lang/AssertionError;

    .line 48
    .line 49
    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    throw v0
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
.end method
