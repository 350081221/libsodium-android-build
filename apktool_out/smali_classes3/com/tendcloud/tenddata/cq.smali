.class public Lcom/tendcloud/tenddata/cq;
.super Ljava/util/Properties;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/cq$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/Properties;",
        "Ljava/lang/Comparable<",
        "Lcom/tendcloud/tenddata/cq;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:[B

.field private c:I

.field private d:I

.field private e:Ljava/util/zip/CRC32;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/Properties;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tendcloud/tenddata/cq;->a:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;[B)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/cq;-><init>(Ljava/lang/String;)V

    .line 5
    new-instance p1, Ljava/util/zip/CRC32;

    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    iput-object p1, p0, Lcom/tendcloud/tenddata/cq;->e:Ljava/util/zip/CRC32;

    .line 6
    invoke-virtual {p0, p2}, Lcom/tendcloud/tenddata/cq;->writeData([B)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 3
    invoke-static {}, Lcom/tendcloud/tenddata/cq;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/tendcloud/tenddata/cq;-><init>(Ljava/lang/String;[B)V

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/tendcloud/tenddata/cq;)I
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/cq;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/cq;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public a(Ljava/lang/String;)I
    .locals 0

    .line 6
    invoke-super {p0, p1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public a(Ljava/lang/String;I)I
    .locals 0

    .line 2
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public a([B)Ljava/lang/String;
    .locals 1

    .line 7
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V

    return-object v0
.end method

.method public a(Ljava/lang/String;[B)[B
    .locals 0

    .line 4
    invoke-virtual {p0, p2}, Lcom/tendcloud/tenddata/cq;->a([B)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Lcom/tendcloud/tenddata/cq;->c(Ljava/lang/String;)[B

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/cq;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)[B
    .locals 0

    .line 2
    invoke-super {p0, p1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tendcloud/tenddata/cq;->c(Ljava/lang/String;)[B

    move-result-object p1

    return-object p1
.end method

.method public c()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/cq;->b:[B

    return-object v0
.end method

.method public c(Ljava/lang/String;)[B
    .locals 0

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/tendcloud/tenddata/cq;

    invoke-virtual {p0, p1}, Lcom/tendcloud/tenddata/cq;->a(Lcom/tendcloud/tenddata/cq;)I

    move-result p1

    return p1
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/tendcloud/tenddata/cq;->c:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/tendcloud/tenddata/cq;->d:I

    return v0
.end method

.method public final writeData([B)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/cq;->e:Ljava/util/zip/CRC32;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    new-instance v0, Ljava/util/zip/CRC32;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/tendcloud/tenddata/cq;->e:Ljava/util/zip/CRC32;

    .line 14
    .line 15
    :cond_1
    array-length v0, p1

    .line 16
    new-array v0, v0, [B

    .line 17
    .line 18
    iput-object v0, p0, Lcom/tendcloud/tenddata/cq;->b:[B

    .line 19
    .line 20
    array-length v1, p1

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/tendcloud/tenddata/cq;->b:[B

    .line 26
    .line 27
    array-length p1, p1

    .line 28
    iput p1, p0, Lcom/tendcloud/tenddata/cq;->d:I

    .line 29
    .line 30
    iget-object p1, p0, Lcom/tendcloud/tenddata/cq;->e:Ljava/util/zip/CRC32;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/zip/CRC32;->reset()V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/tendcloud/tenddata/cq;->e:Ljava/util/zip/CRC32;

    .line 36
    .line 37
    iget-object v0, p0, Lcom/tendcloud/tenddata/cq;->b:[B

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Ljava/util/zip/CRC32;->update([B)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcom/tendcloud/tenddata/cq;->e:Ljava/util/zip/CRC32;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/util/zip/CRC32;->getValue()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    long-to-int p1, v0

    .line 49
    iput p1, p0, Lcom/tendcloud/tenddata/cq;->c:I

    .line 50
    .line 51
    return-void
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
.end method
