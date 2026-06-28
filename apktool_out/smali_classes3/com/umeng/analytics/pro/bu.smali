.class public Lcom/umeng/analytics/pro/bu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/umeng/analytics/pro/cq;

.field private final b:Lcom/umeng/analytics/pro/dd;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/umeng/analytics/pro/ck$a;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/ck$a;-><init>()V

    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/bu;-><init>(Lcom/umeng/analytics/pro/cs;)V

    return-void
.end method

.method public constructor <init>(Lcom/umeng/analytics/pro/cs;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/umeng/analytics/pro/dd;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/dd;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/pro/bu;->b:Lcom/umeng/analytics/pro/dd;

    .line 4
    invoke-interface {p1, v0}, Lcom/umeng/analytics/pro/cs;->a(Lcom/umeng/analytics/pro/de;)Lcom/umeng/analytics/pro/cq;

    move-result-object p1

    iput-object p1, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    return-void
.end method

.method private varargs a(B[BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 22
    :try_start_0
    invoke-direct {p0, p2, p3, p4}, Lcom/umeng/analytics/pro/bu;->j([BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Lcom/umeng/analytics/pro/cl;

    move-result-object p2

    if-eqz p2, :cond_8

    const/4 p3, 0x2

    if-eq p1, p3, :cond_7

    const/4 p3, 0x3

    if-eq p1, p3, :cond_6

    const/4 p3, 0x4

    if-eq p1, p3, :cond_5

    const/4 p3, 0x6

    if-eq p1, p3, :cond_4

    const/16 p3, 0x8

    if-eq p1, p3, :cond_3

    const/16 p3, 0x64

    const/16 p4, 0xb

    if-eq p1, p3, :cond_2

    const/16 p3, 0xa

    if-eq p1, p3, :cond_1

    if-eq p1, p4, :cond_0

    goto/16 :goto_0

    .line 23
    :cond_0
    iget-byte p1, p2, Lcom/umeng/analytics/pro/cl;->b:B

    if-ne p1, p4, :cond_8

    .line 24
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->z()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->b:Lcom/umeng/analytics/pro/dd;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/dd;->e()V

    .line 26
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cq;->B()V

    return-object p1

    .line 27
    :cond_1
    :try_start_1
    iget-byte p1, p2, Lcom/umeng/analytics/pro/cl;->b:B

    if-ne p1, p3, :cond_8

    .line 28
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->x()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->b:Lcom/umeng/analytics/pro/dd;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/dd;->e()V

    .line 30
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cq;->B()V

    return-object p1

    .line 31
    :cond_2
    :try_start_2
    iget-byte p1, p2, Lcom/umeng/analytics/pro/cl;->b:B

    if-ne p1, p4, :cond_8

    .line 32
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->A()Ljava/nio/ByteBuffer;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->b:Lcom/umeng/analytics/pro/dd;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/dd;->e()V

    .line 34
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cq;->B()V

    return-object p1

    .line 35
    :cond_3
    :try_start_3
    iget-byte p1, p2, Lcom/umeng/analytics/pro/cl;->b:B

    if-ne p1, p3, :cond_8

    .line 36
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->w()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 37
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->b:Lcom/umeng/analytics/pro/dd;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/dd;->e()V

    .line 38
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cq;->B()V

    return-object p1

    .line 39
    :cond_4
    :try_start_4
    iget-byte p1, p2, Lcom/umeng/analytics/pro/cl;->b:B

    if-ne p1, p3, :cond_8

    .line 40
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->v()S

    move-result p1

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 41
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->b:Lcom/umeng/analytics/pro/dd;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/dd;->e()V

    .line 42
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cq;->B()V

    return-object p1

    .line 43
    :cond_5
    :try_start_5
    iget-byte p1, p2, Lcom/umeng/analytics/pro/cl;->b:B

    if-ne p1, p3, :cond_8

    .line 44
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->y()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 45
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->b:Lcom/umeng/analytics/pro/dd;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/dd;->e()V

    .line 46
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cq;->B()V

    return-object p1

    .line 47
    :cond_6
    :try_start_6
    iget-byte p1, p2, Lcom/umeng/analytics/pro/cl;->b:B

    if-ne p1, p3, :cond_8

    .line 48
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->u()B

    move-result p1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 49
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->b:Lcom/umeng/analytics/pro/dd;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/dd;->e()V

    .line 50
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cq;->B()V

    return-object p1

    .line 51
    :cond_7
    :try_start_7
    iget-byte p1, p2, Lcom/umeng/analytics/pro/cl;->b:B

    if-ne p1, p3, :cond_8

    .line 52
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->t()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 53
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->b:Lcom/umeng/analytics/pro/dd;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/dd;->e()V

    .line 54
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cq;->B()V

    return-object p1

    .line 55
    :cond_8
    :goto_0
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->b:Lcom/umeng/analytics/pro/dd;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/dd;->e()V

    .line 56
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->B()V

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 57
    :try_start_8
    new-instance p2, Lcom/umeng/analytics/pro/bx;

    invoke-direct {p2, p1}, Lcom/umeng/analytics/pro/bx;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 58
    :goto_1
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->b:Lcom/umeng/analytics/pro/dd;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/dd;->e()V

    .line 59
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cq;->B()V

    .line 60
    throw p1
.end method

.method private varargs j([BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Lcom/umeng/analytics/pro/cl;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bu;->b:Lcom/umeng/analytics/pro/dd;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/umeng/analytics/pro/dd;->a([B)V

    .line 4
    .line 5
    .line 6
    array-length p1, p3

    .line 7
    add-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    new-array v0, p1, [Lcom/umeng/analytics/pro/by;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    aput-object p2, v0, v1

    .line 13
    .line 14
    move p2, v1

    .line 15
    :goto_0
    array-length v2, p3

    .line 16
    if-ge p2, v2, :cond_0

    .line 17
    .line 18
    add-int/lit8 v2, p2, 0x1

    .line 19
    .line 20
    aget-object p2, p3, p2

    .line 21
    .line 22
    aput-object p2, v0, v2

    .line 23
    .line 24
    move p2, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    .line 27
    .line 28
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cq;->j()Lcom/umeng/analytics/pro/cv;

    .line 29
    .line 30
    .line 31
    const/4 p2, 0x0

    .line 32
    move-object p3, p2

    .line 33
    :cond_1
    :goto_1
    if-ge v1, p1, :cond_5

    .line 34
    .line 35
    iget-object p3, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    .line 36
    .line 37
    invoke-virtual {p3}, Lcom/umeng/analytics/pro/cq;->l()Lcom/umeng/analytics/pro/cl;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    iget-byte v2, p3, Lcom/umeng/analytics/pro/cl;->b:B

    .line 42
    .line 43
    if-eqz v2, :cond_4

    .line 44
    .line 45
    iget-short v2, p3, Lcom/umeng/analytics/pro/cl;->c:S

    .line 46
    .line 47
    aget-object v3, v0, v1

    .line 48
    .line 49
    invoke-interface {v3}, Lcom/umeng/analytics/pro/by;->a()S

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-le v2, v3, :cond_2

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    iget-short v2, p3, Lcom/umeng/analytics/pro/cl;->c:S

    .line 57
    .line 58
    aget-object v3, v0, v1

    .line 59
    .line 60
    invoke-interface {v3}, Lcom/umeng/analytics/pro/by;->a()S

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eq v2, v3, :cond_3

    .line 65
    .line 66
    iget-object v2, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    .line 67
    .line 68
    iget-byte v3, p3, Lcom/umeng/analytics/pro/cl;->b:B

    .line 69
    .line 70
    invoke-static {v2, v3}, Lcom/umeng/analytics/pro/ct;->a(Lcom/umeng/analytics/pro/cq;B)V

    .line 71
    .line 72
    .line 73
    iget-object v2, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    .line 74
    .line 75
    invoke-virtual {v2}, Lcom/umeng/analytics/pro/cq;->m()V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 80
    .line 81
    if-ge v1, p1, :cond_1

    .line 82
    .line 83
    iget-object v2, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    .line 84
    .line 85
    invoke-virtual {v2}, Lcom/umeng/analytics/pro/cq;->j()Lcom/umeng/analytics/pro/cv;

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    :goto_2
    return-object p2

    .line 90
    :cond_5
    return-object p3
.end method


# virtual methods
.method public varargs a([BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Ljava/lang/Boolean;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    const/4 v0, 0x2

    .line 21
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/umeng/analytics/pro/bu;->a(B[BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    return-object p1
.end method

.method public a(Lcom/umeng/analytics/pro/br;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 61
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/br;[B)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/br;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 8
    :try_start_0
    invoke-virtual {p2, p3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/br;[B)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->B()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 10
    :catch_0
    :try_start_1
    new-instance p1, Lcom/umeng/analytics/pro/bx;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "JVM DOES NOT SUPPORT ENCODING: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/umeng/analytics/pro/bx;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    :goto_0
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cq;->B()V

    .line 12
    throw p1
.end method

.method public a(Lcom/umeng/analytics/pro/br;[B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/umeng/analytics/pro/bu;->b:Lcom/umeng/analytics/pro/dd;

    invoke-virtual {v0, p2}, Lcom/umeng/analytics/pro/dd;->a([B)V

    .line 2
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-interface {p1, p2}, Lcom/umeng/analytics/pro/br;->read(Lcom/umeng/analytics/pro/cq;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->b:Lcom/umeng/analytics/pro/dd;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/dd;->e()V

    .line 4
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->B()V

    return-void

    :catchall_0
    move-exception p1

    .line 5
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->b:Lcom/umeng/analytics/pro/dd;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/dd;->e()V

    .line 6
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cq;->B()V

    .line 7
    throw p1
.end method

.method public varargs a(Lcom/umeng/analytics/pro/br;[BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 13
    :try_start_0
    invoke-direct {p0, p2, p3, p4}, Lcom/umeng/analytics/pro/bu;->j([BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Lcom/umeng/analytics/pro/cl;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 14
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-interface {p1, p2}, Lcom/umeng/analytics/pro/br;->read(Lcom/umeng/analytics/pro/cq;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->b:Lcom/umeng/analytics/pro/dd;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/dd;->e()V

    .line 16
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->B()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 17
    :try_start_1
    new-instance p2, Lcom/umeng/analytics/pro/bx;

    invoke-direct {p2, p1}, Lcom/umeng/analytics/pro/bx;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    :goto_0
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->b:Lcom/umeng/analytics/pro/dd;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/dd;->e()V

    .line 19
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cq;->B()V

    .line 20
    throw p1
.end method

.method public varargs b([BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Ljava/lang/Byte;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/umeng/analytics/pro/bu;->a(B[BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Byte;

    return-object p1
.end method

.method public varargs c([BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Ljava/lang/Double;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    const/4 v0, 0x4

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/umeng/analytics/pro/bu;->a(B[BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    return-object p1
.end method

.method public varargs d([BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Ljava/lang/Short;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    const/4 v0, 0x6

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/umeng/analytics/pro/bu;->a(B[BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Short;

    return-object p1
.end method

.method public varargs e([BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Ljava/lang/Integer;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    const/16 v0, 0x8

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/umeng/analytics/pro/bu;->a(B[BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    return-object p1
.end method

.method public varargs f([BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Ljava/lang/Long;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    const/16 v0, 0xa

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/umeng/analytics/pro/bu;->a(B[BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    return-object p1
.end method

.method public varargs g([BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    const/16 v0, 0xb

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/umeng/analytics/pro/bu;->a(B[BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public varargs h([BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Ljava/nio/ByteBuffer;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    const/16 v0, 0x64

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/umeng/analytics/pro/bu;->a(B[BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/nio/ByteBuffer;

    return-object p1
.end method

.method public varargs i([BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Ljava/lang/Short;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Lcom/umeng/analytics/pro/bu;->j([BLcom/umeng/analytics/pro/by;[Lcom/umeng/analytics/pro/by;)Lcom/umeng/analytics/pro/cl;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->j()Lcom/umeng/analytics/pro/cv;

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->l()Lcom/umeng/analytics/pro/cl;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-short p1, p1, Lcom/umeng/analytics/pro/cl;->c:S

    .line 19
    .line 20
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 21
    .line 22
    .line 23
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->b:Lcom/umeng/analytics/pro/dd;

    .line 25
    .line 26
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/dd;->e()V

    .line 27
    .line 28
    .line 29
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    .line 30
    .line 31
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cq;->B()V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_0
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->b:Lcom/umeng/analytics/pro/dd;

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/dd;->e()V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cq;->B()V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    return-object p1

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_0

    .line 49
    :catch_0
    move-exception p1

    .line 50
    :try_start_1
    new-instance p2, Lcom/umeng/analytics/pro/bx;

    .line 51
    .line 52
    invoke-direct {p2, p1}, Lcom/umeng/analytics/pro/bx;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    :goto_0
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->b:Lcom/umeng/analytics/pro/dd;

    .line 57
    .line 58
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/dd;->e()V

    .line 59
    .line 60
    .line 61
    iget-object p2, p0, Lcom/umeng/analytics/pro/bu;->a:Lcom/umeng/analytics/pro/cq;

    .line 62
    .line 63
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cq;->B()V

    .line 64
    .line 65
    .line 66
    throw p1
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
.end method
